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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiStaffIdentificationCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStaffIdentificationCode {
  public static final String SERIALIZED_NAME_STAFF_IDENTIFICATION_SYSTEM_DESCRIPTOR = "staffIdentificationSystemDescriptor";
  @SerializedName(SERIALIZED_NAME_STAFF_IDENTIFICATION_SYSTEM_DESCRIPTOR)
  private String staffIdentificationSystemDescriptor;

  public static final String SERIALIZED_NAME_ASSIGNING_ORGANIZATION_IDENTIFICATION_CODE = "assigningOrganizationIdentificationCode";
  @SerializedName(SERIALIZED_NAME_ASSIGNING_ORGANIZATION_IDENTIFICATION_CODE)
  private String assigningOrganizationIdentificationCode;

  public static final String SERIALIZED_NAME_IDENTIFICATION_CODE = "identificationCode";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_CODE)
  private String identificationCode;

  public EdFiStaffIdentificationCode() { 
  }

  public EdFiStaffIdentificationCode staffIdentificationSystemDescriptor(String staffIdentificationSystemDescriptor) {
    
    this.staffIdentificationSystemDescriptor = staffIdentificationSystemDescriptor;
    return this;
  }

   /**
   * A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a staff member.
   * @return staffIdentificationSystemDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a staff member.")

  public String getStaffIdentificationSystemDescriptor() {
    return staffIdentificationSystemDescriptor;
  }


  public void setStaffIdentificationSystemDescriptor(String staffIdentificationSystemDescriptor) {
    this.staffIdentificationSystemDescriptor = staffIdentificationSystemDescriptor;
  }


  public EdFiStaffIdentificationCode assigningOrganizationIdentificationCode(String assigningOrganizationIdentificationCode) {
    
    this.assigningOrganizationIdentificationCode = assigningOrganizationIdentificationCode;
    return this;
  }

   /**
   * The organization code or name assigning the staff Identification Code.
   * @return assigningOrganizationIdentificationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization code or name assigning the staff Identification Code.")

  public String getAssigningOrganizationIdentificationCode() {
    return assigningOrganizationIdentificationCode;
  }


  public void setAssigningOrganizationIdentificationCode(String assigningOrganizationIdentificationCode) {
    this.assigningOrganizationIdentificationCode = assigningOrganizationIdentificationCode;
  }


  public EdFiStaffIdentificationCode identificationCode(String identificationCode) {
    
    this.identificationCode = identificationCode;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to a staff member by a school, school system, a state, or other agency or entity.
   * @return identificationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique number or alphanumeric code assigned to a staff member by a school, school system, a state, or other agency or entity.")

  public String getIdentificationCode() {
    return identificationCode;
  }


  public void setIdentificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStaffIdentificationCode edFiStaffIdentificationCode = (EdFiStaffIdentificationCode) o;
    return Objects.equals(this.staffIdentificationSystemDescriptor, edFiStaffIdentificationCode.staffIdentificationSystemDescriptor) &&
        Objects.equals(this.assigningOrganizationIdentificationCode, edFiStaffIdentificationCode.assigningOrganizationIdentificationCode) &&
        Objects.equals(this.identificationCode, edFiStaffIdentificationCode.identificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffIdentificationSystemDescriptor, assigningOrganizationIdentificationCode, identificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffIdentificationCode {\n");
    sb.append("    staffIdentificationSystemDescriptor: ").append(toIndentedString(staffIdentificationSystemDescriptor)).append("\n");
    sb.append("    assigningOrganizationIdentificationCode: ").append(toIndentedString(assigningOrganizationIdentificationCode)).append("\n");
    sb.append("    identificationCode: ").append(toIndentedString(identificationCode)).append("\n");
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

