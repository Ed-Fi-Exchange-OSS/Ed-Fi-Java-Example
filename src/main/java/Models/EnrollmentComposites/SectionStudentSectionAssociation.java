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
import org.threeten.bp.LocalDate;

/**
 * SectionStudentSectionAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:13.622-05:00[America/Mexico_City]")
public class SectionStudentSectionAssociation {
  public static final String SERIALIZED_NAME_ENROLLMENT_BEGIN_DATE = "enrollmentBeginDate";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_BEGIN_DATE)
  private LocalDate enrollmentBeginDate;

  public static final String SERIALIZED_NAME_ENROLLMENT_END_DATE = "enrollmentEndDate";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_END_DATE)
  private LocalDate enrollmentEndDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public SectionStudentSectionAssociation() { 
  }

  public SectionStudentSectionAssociation enrollmentBeginDate(LocalDate enrollmentBeginDate) {
    
    this.enrollmentBeginDate = enrollmentBeginDate;
    return this;
  }

   /**
   * Month, day, and year of the Student&#39;s entry or assignment to the Section.
   * @return enrollmentBeginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Month, day, and year of the Student's entry or assignment to the Section.")

  public LocalDate getEnrollmentBeginDate() {
    return enrollmentBeginDate;
  }


  public void setEnrollmentBeginDate(LocalDate enrollmentBeginDate) {
    this.enrollmentBeginDate = enrollmentBeginDate;
  }


  public SectionStudentSectionAssociation enrollmentEndDate(LocalDate enrollmentEndDate) {
    
    this.enrollmentEndDate = enrollmentEndDate;
    return this;
  }

   /**
   * Month, day, and year of the withdrawal or exit of the Student from the Section.
   * @return enrollmentEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Month, day, and year of the withdrawal or exit of the Student from the Section.")

  public LocalDate getEnrollmentEndDate() {
    return enrollmentEndDate;
  }


  public void setEnrollmentEndDate(LocalDate enrollmentEndDate) {
    this.enrollmentEndDate = enrollmentEndDate;
  }


  public SectionStudentSectionAssociation id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SectionStudentSectionAssociation studentUniqueId(String studentUniqueId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionStudentSectionAssociation sectionStudentSectionAssociation = (SectionStudentSectionAssociation) o;
    return Objects.equals(this.enrollmentBeginDate, sectionStudentSectionAssociation.enrollmentBeginDate) &&
        Objects.equals(this.enrollmentEndDate, sectionStudentSectionAssociation.enrollmentEndDate) &&
        Objects.equals(this.id, sectionStudentSectionAssociation.id) &&
        Objects.equals(this.studentUniqueId, sectionStudentSectionAssociation.studentUniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollmentBeginDate, enrollmentEndDate, id, studentUniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionStudentSectionAssociation {\n");
    sb.append("    enrollmentBeginDate: ").append(toIndentedString(enrollmentBeginDate)).append("\n");
    sb.append("    enrollmentEndDate: ").append(toIndentedString(enrollmentEndDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
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
