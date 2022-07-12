/*
 * Ed-Fi Operational Data Store API
 * The Ed-Fi ODS / API enables applications to read and write education data stored in an Ed-Fi ODS through a secure REST interface.  ***  > *Note: Consumers of ODS / API information should sanitize all data for display and storage. The ODS / API provides reasonable safeguards against cross-site scripting attacks and other malicious content, but the platform does not and cannot guarantee that the data it contains is free of all potentially harmful content.*  *** 
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Models.Resources;

import java.util.Objects;
import java.util.Arrays;
import Models.Resources.EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EdFiStudentEducationOrganizationAssociationStudentCharacteristic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentEducationOrganizationAssociationStudentCharacteristic {
  public static final String SERIALIZED_NAME_STUDENT_CHARACTERISTIC_DESCRIPTOR = "studentCharacteristicDescriptor";
  @SerializedName(SERIALIZED_NAME_STUDENT_CHARACTERISTIC_DESCRIPTOR)
  private String studentCharacteristicDescriptor;

  public static final String SERIALIZED_NAME_DESIGNATED_BY = "designatedBy";
  @SerializedName(SERIALIZED_NAME_DESIGNATED_BY)
  private String designatedBy;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod> periods = null;

  public EdFiStudentEducationOrganizationAssociationStudentCharacteristic() { 
  }

  public EdFiStudentEducationOrganizationAssociationStudentCharacteristic studentCharacteristicDescriptor(String studentCharacteristicDescriptor) {
    
    this.studentCharacteristicDescriptor = studentCharacteristicDescriptor;
    return this;
  }

   /**
   * The characteristic designated for the Student.
   * @return studentCharacteristicDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The characteristic designated for the Student.")

  public String getStudentCharacteristicDescriptor() {
    return studentCharacteristicDescriptor;
  }


  public void setStudentCharacteristicDescriptor(String studentCharacteristicDescriptor) {
    this.studentCharacteristicDescriptor = studentCharacteristicDescriptor;
  }


  public EdFiStudentEducationOrganizationAssociationStudentCharacteristic designatedBy(String designatedBy) {
    
    this.designatedBy = designatedBy;
    return this;
  }

   /**
   * The person, organization, or department that designated the characteristic.
   * @return designatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person, organization, or department that designated the characteristic.")

  public String getDesignatedBy() {
    return designatedBy;
  }


  public void setDesignatedBy(String designatedBy) {
    this.designatedBy = designatedBy;
  }


  public EdFiStudentEducationOrganizationAssociationStudentCharacteristic periods(List<EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod> periods) {
    
    this.periods = periods;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociationStudentCharacteristic addPeriodsItem(EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationStudentCharacteristicPeriods. The time periods for which characteristic was effective.
   * @return periods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentEducationOrganizationAssociationStudentCharacteristicPeriods. The time periods for which characteristic was effective.")

  public List<EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod> getPeriods() {
    return periods;
  }


  public void setPeriods(List<EdFiStudentEducationOrganizationAssociationStudentCharacteristicPeriod> periods) {
    this.periods = periods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentEducationOrganizationAssociationStudentCharacteristic edFiStudentEducationOrganizationAssociationStudentCharacteristic = (EdFiStudentEducationOrganizationAssociationStudentCharacteristic) o;
    return Objects.equals(this.studentCharacteristicDescriptor, edFiStudentEducationOrganizationAssociationStudentCharacteristic.studentCharacteristicDescriptor) &&
        Objects.equals(this.designatedBy, edFiStudentEducationOrganizationAssociationStudentCharacteristic.designatedBy) &&
        Objects.equals(this.periods, edFiStudentEducationOrganizationAssociationStudentCharacteristic.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentCharacteristicDescriptor, designatedBy, periods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationStudentCharacteristic {\n");
    sb.append("    studentCharacteristicDescriptor: ").append(toIndentedString(studentCharacteristicDescriptor)).append("\n");
    sb.append("    designatedBy: ").append(toIndentedString(designatedBy)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

