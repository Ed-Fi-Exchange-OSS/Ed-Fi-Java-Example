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
import Models.Resources.EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic;
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
import org.threeten.bp.LocalDate;

/**
 * EdFiStudentEducationOrganizationAssociationProgramParticipation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentEducationOrganizationAssociationProgramParticipation {
  public static final String SERIALIZED_NAME_PROGRAM_TYPE_DESCRIPTOR = "programTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_PROGRAM_TYPE_DESCRIPTOR)
  private String programTypeDescriptor;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_DESIGNATED_BY = "designatedBy";
  @SerializedName(SERIALIZED_NAME_DESIGNATED_BY)
  private String designatedBy;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PROGRAM_CHARACTERISTICS = "programCharacteristics";
  @SerializedName(SERIALIZED_NAME_PROGRAM_CHARACTERISTICS)
  private List<EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic> programCharacteristics = null;

  public EdFiStudentEducationOrganizationAssociationProgramParticipation() { 
  }

  public EdFiStudentEducationOrganizationAssociationProgramParticipation programTypeDescriptor(String programTypeDescriptor) {
    
    this.programTypeDescriptor = programTypeDescriptor;
    return this;
  }

   /**
   * The type of program.
   * @return programTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of program.")

  public String getProgramTypeDescriptor() {
    return programTypeDescriptor;
  }


  public void setProgramTypeDescriptor(String programTypeDescriptor) {
    this.programTypeDescriptor = programTypeDescriptor;
  }


  public EdFiStudentEducationOrganizationAssociationProgramParticipation beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The date the Student was associated with the Program or service.
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the Student was associated with the Program or service.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiStudentEducationOrganizationAssociationProgramParticipation designatedBy(String designatedBy) {
    
    this.designatedBy = designatedBy;
    return this;
  }

   /**
   * The person, organization, or department that designated the program association.
   * @return designatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person, organization, or department that designated the program association.")

  public String getDesignatedBy() {
    return designatedBy;
  }


  public void setDesignatedBy(String designatedBy) {
    this.designatedBy = designatedBy;
  }


  public EdFiStudentEducationOrganizationAssociationProgramParticipation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the Program participation ended.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the Program participation ended.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiStudentEducationOrganizationAssociationProgramParticipation programCharacteristics(List<EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic> programCharacteristics) {
    
    this.programCharacteristics = programCharacteristics;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociationProgramParticipation addProgramCharacteristicsItem(EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic programCharacteristicsItem) {
    if (this.programCharacteristics == null) {
      this.programCharacteristics = new ArrayList<EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic>();
    }
    this.programCharacteristics.add(programCharacteristicsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationProgramParticipationProgramCharacteristics. Reflects important characteristics of the Program, such as categories or particular indications.
   * @return programCharacteristics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentEducationOrganizationAssociationProgramParticipationProgramCharacteristics. Reflects important characteristics of the Program, such as categories or particular indications.")

  public List<EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic> getProgramCharacteristics() {
    return programCharacteristics;
  }


  public void setProgramCharacteristics(List<EdFiStudentEducationOrganizationAssociationProgramParticipationProgramCharacteristic> programCharacteristics) {
    this.programCharacteristics = programCharacteristics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentEducationOrganizationAssociationProgramParticipation edFiStudentEducationOrganizationAssociationProgramParticipation = (EdFiStudentEducationOrganizationAssociationProgramParticipation) o;
    return Objects.equals(this.programTypeDescriptor, edFiStudentEducationOrganizationAssociationProgramParticipation.programTypeDescriptor) &&
        Objects.equals(this.beginDate, edFiStudentEducationOrganizationAssociationProgramParticipation.beginDate) &&
        Objects.equals(this.designatedBy, edFiStudentEducationOrganizationAssociationProgramParticipation.designatedBy) &&
        Objects.equals(this.endDate, edFiStudentEducationOrganizationAssociationProgramParticipation.endDate) &&
        Objects.equals(this.programCharacteristics, edFiStudentEducationOrganizationAssociationProgramParticipation.programCharacteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programTypeDescriptor, beginDate, designatedBy, endDate, programCharacteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationProgramParticipation {\n");
    sb.append("    programTypeDescriptor: ").append(toIndentedString(programTypeDescriptor)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    designatedBy: ").append(toIndentedString(designatedBy)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    programCharacteristics: ").append(toIndentedString(programCharacteristics)).append("\n");
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

