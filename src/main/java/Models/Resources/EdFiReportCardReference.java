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

/**
 * EdFiReportCardReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiReportCardReference {
  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID = "educationOrganizationId";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID)
  private Integer educationOrganizationId;

  public static final String SERIALIZED_NAME_GRADING_PERIOD_DESCRIPTOR = "gradingPeriodDescriptor";
  @SerializedName(SERIALIZED_NAME_GRADING_PERIOD_DESCRIPTOR)
  private String gradingPeriodDescriptor;

  public static final String SERIALIZED_NAME_GRADING_PERIOD_SCHOOL_ID = "gradingPeriodSchoolId";
  @SerializedName(SERIALIZED_NAME_GRADING_PERIOD_SCHOOL_ID)
  private Integer gradingPeriodSchoolId;

  public static final String SERIALIZED_NAME_GRADING_PERIOD_SCHOOL_YEAR = "gradingPeriodSchoolYear";
  @SerializedName(SERIALIZED_NAME_GRADING_PERIOD_SCHOOL_YEAR)
  private Integer gradingPeriodSchoolYear;

  public static final String SERIALIZED_NAME_GRADING_PERIOD_SEQUENCE = "gradingPeriodSequence";
  @SerializedName(SERIALIZED_NAME_GRADING_PERIOD_SEQUENCE)
  private Integer gradingPeriodSequence;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiReportCardReference() { 
  }

  public EdFiReportCardReference educationOrganizationId(Integer educationOrganizationId) {
    
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


  public EdFiReportCardReference gradingPeriodDescriptor(String gradingPeriodDescriptor) {
    
    this.gradingPeriodDescriptor = gradingPeriodDescriptor;
    return this;
  }

   /**
   * The name of the period for which grades are reported.
   * @return gradingPeriodDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the period for which grades are reported.")

  public String getGradingPeriodDescriptor() {
    return gradingPeriodDescriptor;
  }


  public void setGradingPeriodDescriptor(String gradingPeriodDescriptor) {
    this.gradingPeriodDescriptor = gradingPeriodDescriptor;
  }


  public EdFiReportCardReference gradingPeriodSchoolId(Integer gradingPeriodSchoolId) {
    
    this.gradingPeriodSchoolId = gradingPeriodSchoolId;
    return this;
  }

   /**
   * The identifier assigned to a school.
   * @return gradingPeriodSchoolId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to a school.")

  public Integer getGradingPeriodSchoolId() {
    return gradingPeriodSchoolId;
  }


  public void setGradingPeriodSchoolId(Integer gradingPeriodSchoolId) {
    this.gradingPeriodSchoolId = gradingPeriodSchoolId;
  }


  public EdFiReportCardReference gradingPeriodSchoolYear(Integer gradingPeriodSchoolYear) {
    
    this.gradingPeriodSchoolYear = gradingPeriodSchoolYear;
    return this;
  }

   /**
   * The identifier for the grading period school year.
   * @return gradingPeriodSchoolYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the grading period school year.")

  public Integer getGradingPeriodSchoolYear() {
    return gradingPeriodSchoolYear;
  }


  public void setGradingPeriodSchoolYear(Integer gradingPeriodSchoolYear) {
    this.gradingPeriodSchoolYear = gradingPeriodSchoolYear;
  }


  public EdFiReportCardReference gradingPeriodSequence(Integer gradingPeriodSequence) {
    
    this.gradingPeriodSequence = gradingPeriodSequence;
    return this;
  }

   /**
   * The sequential order of this period relative to other periods.
   * @return gradingPeriodSequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sequential order of this period relative to other periods.")

  public Integer getGradingPeriodSequence() {
    return gradingPeriodSequence;
  }


  public void setGradingPeriodSequence(Integer gradingPeriodSequence) {
    this.gradingPeriodSequence = gradingPeriodSequence;
  }


  public EdFiReportCardReference studentUniqueId(String studentUniqueId) {
    
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


  public EdFiReportCardReference link(Link link) {
    
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
    EdFiReportCardReference edFiReportCardReference = (EdFiReportCardReference) o;
    return Objects.equals(this.educationOrganizationId, edFiReportCardReference.educationOrganizationId) &&
        Objects.equals(this.gradingPeriodDescriptor, edFiReportCardReference.gradingPeriodDescriptor) &&
        Objects.equals(this.gradingPeriodSchoolId, edFiReportCardReference.gradingPeriodSchoolId) &&
        Objects.equals(this.gradingPeriodSchoolYear, edFiReportCardReference.gradingPeriodSchoolYear) &&
        Objects.equals(this.gradingPeriodSequence, edFiReportCardReference.gradingPeriodSequence) &&
        Objects.equals(this.studentUniqueId, edFiReportCardReference.studentUniqueId) &&
        Objects.equals(this.link, edFiReportCardReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(educationOrganizationId, gradingPeriodDescriptor, gradingPeriodSchoolId, gradingPeriodSchoolYear, gradingPeriodSequence, studentUniqueId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiReportCardReference {\n");
    sb.append("    educationOrganizationId: ").append(toIndentedString(educationOrganizationId)).append("\n");
    sb.append("    gradingPeriodDescriptor: ").append(toIndentedString(gradingPeriodDescriptor)).append("\n");
    sb.append("    gradingPeriodSchoolId: ").append(toIndentedString(gradingPeriodSchoolId)).append("\n");
    sb.append("    gradingPeriodSchoolYear: ").append(toIndentedString(gradingPeriodSchoolYear)).append("\n");
    sb.append("    gradingPeriodSequence: ").append(toIndentedString(gradingPeriodSequence)).append("\n");
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

