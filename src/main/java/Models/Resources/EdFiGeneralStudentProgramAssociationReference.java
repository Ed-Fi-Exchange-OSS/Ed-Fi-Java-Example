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
import Models.Resources.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * EdFiGeneralStudentProgramAssociationReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiGeneralStudentProgramAssociationReference {
  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID = "educationOrganizationId";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID)
  private Integer educationOrganizationId;

  public static final String SERIALIZED_NAME_PROGRAM_EDUCATION_ORGANIZATION_ID = "programEducationOrganizationId";
  @SerializedName(SERIALIZED_NAME_PROGRAM_EDUCATION_ORGANIZATION_ID)
  private Integer programEducationOrganizationId;

  public static final String SERIALIZED_NAME_PROGRAM_NAME = "programName";
  @SerializedName(SERIALIZED_NAME_PROGRAM_NAME)
  private String programName;

  public static final String SERIALIZED_NAME_PROGRAM_TYPE_DESCRIPTOR = "programTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_PROGRAM_TYPE_DESCRIPTOR)
  private String programTypeDescriptor;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiGeneralStudentProgramAssociationReference() { 
  }

  public EdFiGeneralStudentProgramAssociationReference beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The earliest date the student is involved with the program. Typically, this is the date the student becomes eligible for the program.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The earliest date the student is involved with the program. Typically, this is the date the student becomes eligible for the program.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiGeneralStudentProgramAssociationReference educationOrganizationId(Integer educationOrganizationId) {
    
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


  public EdFiGeneralStudentProgramAssociationReference programEducationOrganizationId(Integer programEducationOrganizationId) {
    
    this.programEducationOrganizationId = programEducationOrganizationId;
    return this;
  }

   /**
   * The identifier assigned to an education organization.
   * @return programEducationOrganizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to an education organization.")

  public Integer getProgramEducationOrganizationId() {
    return programEducationOrganizationId;
  }


  public void setProgramEducationOrganizationId(Integer programEducationOrganizationId) {
    this.programEducationOrganizationId = programEducationOrganizationId;
  }


  public EdFiGeneralStudentProgramAssociationReference programName(String programName) {
    
    this.programName = programName;
    return this;
  }

   /**
   * The formal name of the Program of instruction, training, services, or benefits available through federal, state, or local agencies.
   * @return programName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The formal name of the Program of instruction, training, services, or benefits available through federal, state, or local agencies.")

  public String getProgramName() {
    return programName;
  }


  public void setProgramName(String programName) {
    this.programName = programName;
  }


  public EdFiGeneralStudentProgramAssociationReference programTypeDescriptor(String programTypeDescriptor) {
    
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


  public EdFiGeneralStudentProgramAssociationReference studentUniqueId(String studentUniqueId) {
    
    this.studentUniqueId = studentUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a student.
   * @return studentUniqueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique alphanumeric code assigned to a student.")

  public String getStudentUniqueId() {
    return studentUniqueId;
  }


  public void setStudentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
  }


  public EdFiGeneralStudentProgramAssociationReference link(Link link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getLink() {
    return link;
  }


  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiGeneralStudentProgramAssociationReference edFiGeneralStudentProgramAssociationReference = (EdFiGeneralStudentProgramAssociationReference) o;
    return Objects.equals(this.beginDate, edFiGeneralStudentProgramAssociationReference.beginDate) &&
        Objects.equals(this.educationOrganizationId, edFiGeneralStudentProgramAssociationReference.educationOrganizationId) &&
        Objects.equals(this.programEducationOrganizationId, edFiGeneralStudentProgramAssociationReference.programEducationOrganizationId) &&
        Objects.equals(this.programName, edFiGeneralStudentProgramAssociationReference.programName) &&
        Objects.equals(this.programTypeDescriptor, edFiGeneralStudentProgramAssociationReference.programTypeDescriptor) &&
        Objects.equals(this.studentUniqueId, edFiGeneralStudentProgramAssociationReference.studentUniqueId) &&
        Objects.equals(this.link, edFiGeneralStudentProgramAssociationReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, educationOrganizationId, programEducationOrganizationId, programName, programTypeDescriptor, studentUniqueId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiGeneralStudentProgramAssociationReference {\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    educationOrganizationId: ").append(toIndentedString(educationOrganizationId)).append("\n");
    sb.append("    programEducationOrganizationId: ").append(toIndentedString(programEducationOrganizationId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    programTypeDescriptor: ").append(toIndentedString(programTypeDescriptor)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
