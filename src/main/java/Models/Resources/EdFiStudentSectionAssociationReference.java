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
 * EdFiStudentSectionAssociationReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentSectionAssociationReference {
  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_LOCAL_COURSE_CODE = "localCourseCode";
  @SerializedName(SERIALIZED_NAME_LOCAL_COURSE_CODE)
  private String localCourseCode;

  public static final String SERIALIZED_NAME_SCHOOL_ID = "schoolId";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ID)
  private Integer schoolId;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR = "schoolYear";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR)
  private Integer schoolYear;

  public static final String SERIALIZED_NAME_SECTION_IDENTIFIER = "sectionIdentifier";
  @SerializedName(SERIALIZED_NAME_SECTION_IDENTIFIER)
  private String sectionIdentifier;

  public static final String SERIALIZED_NAME_SESSION_NAME = "sessionName";
  @SerializedName(SERIALIZED_NAME_SESSION_NAME)
  private String sessionName;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiStudentSectionAssociationReference() { 
  }

  public EdFiStudentSectionAssociationReference beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Month, day, and year of the Student&#39;s entry or assignment to the Section.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Month, day, and year of the Student's entry or assignment to the Section.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiStudentSectionAssociationReference localCourseCode(String localCourseCode) {
    
    this.localCourseCode = localCourseCode;
    return this;
  }

   /**
   * The local code assigned by the School that identifies the course offering provided for the instruction of students.
   * @return localCourseCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The local code assigned by the School that identifies the course offering provided for the instruction of students.")

  public String getLocalCourseCode() {
    return localCourseCode;
  }


  public void setLocalCourseCode(String localCourseCode) {
    this.localCourseCode = localCourseCode;
  }


  public EdFiStudentSectionAssociationReference schoolId(Integer schoolId) {
    
    this.schoolId = schoolId;
    return this;
  }

   /**
   * The identifier assigned to a school.
   * @return schoolId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to a school.")

  public Integer getSchoolId() {
    return schoolId;
  }


  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }


  public EdFiStudentSectionAssociationReference schoolYear(Integer schoolYear) {
    
    this.schoolYear = schoolYear;
    return this;
  }

   /**
   * The identifier for the school year.
   * @return schoolYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the school year.")

  public Integer getSchoolYear() {
    return schoolYear;
  }


  public void setSchoolYear(Integer schoolYear) {
    this.schoolYear = schoolYear;
  }


  public EdFiStudentSectionAssociationReference sectionIdentifier(String sectionIdentifier) {
    
    this.sectionIdentifier = sectionIdentifier;
    return this;
  }

   /**
   * The local identifier assigned to a section.
   * @return sectionIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The local identifier assigned to a section.")

  public String getSectionIdentifier() {
    return sectionIdentifier;
  }


  public void setSectionIdentifier(String sectionIdentifier) {
    this.sectionIdentifier = sectionIdentifier;
  }


  public EdFiStudentSectionAssociationReference sessionName(String sessionName) {
    
    this.sessionName = sessionName;
    return this;
  }

   /**
   * The identifier for the calendar for the academic session (e.g., 2010/11, 2011 Summer).
   * @return sessionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the calendar for the academic session (e.g., 2010/11, 2011 Summer).")

  public String getSessionName() {
    return sessionName;
  }


  public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }


  public EdFiStudentSectionAssociationReference studentUniqueId(String studentUniqueId) {
    
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


  public EdFiStudentSectionAssociationReference link(Link link) {
    
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
    EdFiStudentSectionAssociationReference edFiStudentSectionAssociationReference = (EdFiStudentSectionAssociationReference) o;
    return Objects.equals(this.beginDate, edFiStudentSectionAssociationReference.beginDate) &&
        Objects.equals(this.localCourseCode, edFiStudentSectionAssociationReference.localCourseCode) &&
        Objects.equals(this.schoolId, edFiStudentSectionAssociationReference.schoolId) &&
        Objects.equals(this.schoolYear, edFiStudentSectionAssociationReference.schoolYear) &&
        Objects.equals(this.sectionIdentifier, edFiStudentSectionAssociationReference.sectionIdentifier) &&
        Objects.equals(this.sessionName, edFiStudentSectionAssociationReference.sessionName) &&
        Objects.equals(this.studentUniqueId, edFiStudentSectionAssociationReference.studentUniqueId) &&
        Objects.equals(this.link, edFiStudentSectionAssociationReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, localCourseCode, schoolId, schoolYear, sectionIdentifier, sessionName, studentUniqueId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentSectionAssociationReference {\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    localCourseCode: ").append(toIndentedString(localCourseCode)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    schoolYear: ").append(toIndentedString(schoolYear)).append("\n");
    sb.append("    sectionIdentifier: ").append(toIndentedString(sectionIdentifier)).append("\n");
    sb.append("    sessionName: ").append(toIndentedString(sessionName)).append("\n");
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

