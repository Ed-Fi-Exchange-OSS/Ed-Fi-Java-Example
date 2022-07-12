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


package Models.EnrollmentComposites;

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
 * StaffStaffEducationOrganizationAssignmentAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:13.622-05:00[America/Mexico_City]")
public class StaffStaffEducationOrganizationAssignmentAssociation {
  public static final String SERIALIZED_NAME_STAFF_CLASSIFICATION_DESCRIPTOR = "staffClassificationDescriptor";
  @SerializedName(SERIALIZED_NAME_STAFF_CLASSIFICATION_DESCRIPTOR)
  private String staffClassificationDescriptor;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_TYPE = "educationOrganizationType";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_TYPE)
  private String educationOrganizationType;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID = "educationOrganizationId";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID)
  private Integer educationOrganizationId;

  public StaffStaffEducationOrganizationAssignmentAssociation() { 
  }

  public StaffStaffEducationOrganizationAssignmentAssociation staffClassificationDescriptor(String staffClassificationDescriptor) {
    
    this.staffClassificationDescriptor = staffClassificationDescriptor;
    return this;
  }

   /**
   * The titles of employment, official status, or rank of education staff.
   * @return staffClassificationDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The titles of employment, official status, or rank of education staff.")

  public String getStaffClassificationDescriptor() {
    return staffClassificationDescriptor;
  }


  public void setStaffClassificationDescriptor(String staffClassificationDescriptor) {
    this.staffClassificationDescriptor = staffClassificationDescriptor;
  }


  public StaffStaffEducationOrganizationAssignmentAssociation educationOrganizationType(String educationOrganizationType) {
    
    this.educationOrganizationType = educationOrganizationType;
    return this;
  }

   /**
   * 
   * @return educationOrganizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEducationOrganizationType() {
    return educationOrganizationType;
  }


  public void setEducationOrganizationType(String educationOrganizationType) {
    this.educationOrganizationType = educationOrganizationType;
  }


  public StaffStaffEducationOrganizationAssignmentAssociation educationOrganizationId(Integer educationOrganizationId) {
    
    this.educationOrganizationId = educationOrganizationId;
    return this;
  }

   /**
   * The identifier assigned to an education organization.
   * @return educationOrganizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to an education organization.")

  public Integer getEducationOrganizationId() {
    return educationOrganizationId;
  }


  public void setEducationOrganizationId(Integer educationOrganizationId) {
    this.educationOrganizationId = educationOrganizationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffStaffEducationOrganizationAssignmentAssociation staffStaffEducationOrganizationAssignmentAssociation = (StaffStaffEducationOrganizationAssignmentAssociation) o;
    return Objects.equals(this.staffClassificationDescriptor, staffStaffEducationOrganizationAssignmentAssociation.staffClassificationDescriptor) &&
        Objects.equals(this.educationOrganizationType, staffStaffEducationOrganizationAssignmentAssociation.educationOrganizationType) &&
        Objects.equals(this.educationOrganizationId, staffStaffEducationOrganizationAssignmentAssociation.educationOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffClassificationDescriptor, educationOrganizationType, educationOrganizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffStaffEducationOrganizationAssignmentAssociation {\n");
    sb.append("    staffClassificationDescriptor: ").append(toIndentedString(staffClassificationDescriptor)).append("\n");
    sb.append("    educationOrganizationType: ").append(toIndentedString(educationOrganizationType)).append("\n");
    sb.append("    educationOrganizationId: ").append(toIndentedString(educationOrganizationId)).append("\n");
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

