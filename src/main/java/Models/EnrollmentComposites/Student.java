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
import Models.EnrollmentComposites.StudentStudentEducationOrganizationAssociation;
import Models.EnrollmentComposites.StudentStudentSchoolAssociation;
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
 * Student
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:13.622-05:00[America/Mexico_City]")
public class Student {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_SURNAME = "lastSurname";
  @SerializedName(SERIALIZED_NAME_LAST_SURNAME)
  private String lastSurname;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_PERSONAL_TITLE_PREFIX = "personalTitlePrefix";
  @SerializedName(SERIALIZED_NAME_PERSONAL_TITLE_PREFIX)
  private String personalTitlePrefix;

  public static final String SERIALIZED_NAME_STUDENT_DEMOGRAPHICS = "studentDemographics";
  @SerializedName(SERIALIZED_NAME_STUDENT_DEMOGRAPHICS)
  private List<StudentStudentEducationOrganizationAssociation> studentDemographics = null;

  public static final String SERIALIZED_NAME_STUDENT_SCHOOL_ENROLLMENTS = "studentSchoolEnrollments";
  @SerializedName(SERIALIZED_NAME_STUDENT_SCHOOL_ENROLLMENTS)
  private List<StudentStudentSchoolAssociation> studentSchoolEnrollments = null;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public Student() { 
  }

  public Student id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Student birthDate(LocalDate birthDate) {
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * The month, day, and year on which an individual was born.
   * @return birthDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year on which an individual was born.")

  public LocalDate getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public Student firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * A name given to an individual at birth, baptism, or during another naming ceremony, or through legal change.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A name given to an individual at birth, baptism, or during another naming ceremony, or through legal change.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Student lastSurname(String lastSurname) {
    
    this.lastSurname = lastSurname;
    return this;
  }

   /**
   * The name borne in common by members of a family.
   * @return lastSurname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name borne in common by members of a family.")

  public String getLastSurname() {
    return lastSurname;
  }


  public void setLastSurname(String lastSurname) {
    this.lastSurname = lastSurname;
  }


  public Student middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * A secondary name given to an individual at birth, baptism, or during another naming ceremony.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A secondary name given to an individual at birth, baptism, or during another naming ceremony.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public Student personalTitlePrefix(String personalTitlePrefix) {
    
    this.personalTitlePrefix = personalTitlePrefix;
    return this;
  }

   /**
   * A prefix used to denote the title, degree, position, or seniority of the person.
   * @return personalTitlePrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A prefix used to denote the title, degree, position, or seniority of the person.")

  public String getPersonalTitlePrefix() {
    return personalTitlePrefix;
  }


  public void setPersonalTitlePrefix(String personalTitlePrefix) {
    this.personalTitlePrefix = personalTitlePrefix;
  }


  public Student studentDemographics(List<StudentStudentEducationOrganizationAssociation> studentDemographics) {
    
    this.studentDemographics = studentDemographics;
    return this;
  }

  public Student addStudentDemographicsItem(StudentStudentEducationOrganizationAssociation studentDemographicsItem) {
    if (this.studentDemographics == null) {
      this.studentDemographics = new ArrayList<StudentStudentEducationOrganizationAssociation>();
    }
    this.studentDemographics.add(studentDemographicsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociations. 
   * @return studentDemographics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentEducationOrganizationAssociations. ")

  public List<StudentStudentEducationOrganizationAssociation> getStudentDemographics() {
    return studentDemographics;
  }


  public void setStudentDemographics(List<StudentStudentEducationOrganizationAssociation> studentDemographics) {
    this.studentDemographics = studentDemographics;
  }


  public Student studentSchoolEnrollments(List<StudentStudentSchoolAssociation> studentSchoolEnrollments) {
    
    this.studentSchoolEnrollments = studentSchoolEnrollments;
    return this;
  }

  public Student addStudentSchoolEnrollmentsItem(StudentStudentSchoolAssociation studentSchoolEnrollmentsItem) {
    if (this.studentSchoolEnrollments == null) {
      this.studentSchoolEnrollments = new ArrayList<StudentStudentSchoolAssociation>();
    }
    this.studentSchoolEnrollments.add(studentSchoolEnrollmentsItem);
    return this;
  }

   /**
   * An unordered collection of studentSchoolAssociations. 
   * @return studentSchoolEnrollments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentSchoolAssociations. ")

  public List<StudentStudentSchoolAssociation> getStudentSchoolEnrollments() {
    return studentSchoolEnrollments;
  }


  public void setStudentSchoolEnrollments(List<StudentStudentSchoolAssociation> studentSchoolEnrollments) {
    this.studentSchoolEnrollments = studentSchoolEnrollments;
  }


  public Student studentUniqueId(String studentUniqueId) {
    
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


  public Student etag(String etag) {
    
    this.etag = etag;
    return this;
  }

   /**
   * A unique system-generated value that identifies the version of the resource.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique system-generated value that identifies the version of the resource.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.birthDate, student.birthDate) &&
        Objects.equals(this.firstName, student.firstName) &&
        Objects.equals(this.lastSurname, student.lastSurname) &&
        Objects.equals(this.middleName, student.middleName) &&
        Objects.equals(this.personalTitlePrefix, student.personalTitlePrefix) &&
        Objects.equals(this.studentDemographics, student.studentDemographics) &&
        Objects.equals(this.studentSchoolEnrollments, student.studentSchoolEnrollments) &&
        Objects.equals(this.studentUniqueId, student.studentUniqueId) &&
        Objects.equals(this.etag, student.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, birthDate, firstName, lastSurname, middleName, personalTitlePrefix, studentDemographics, studentSchoolEnrollments, studentUniqueId, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
    sb.append("    studentDemographics: ").append(toIndentedString(studentDemographics)).append("\n");
    sb.append("    studentSchoolEnrollments: ").append(toIndentedString(studentSchoolEnrollments)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

