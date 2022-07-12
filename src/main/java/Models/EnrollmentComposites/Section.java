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
import Models.EnrollmentComposites.SectionLocation;
import Models.EnrollmentComposites.SectionSectionClassPeriod;
import Models.EnrollmentComposites.SectionSession;
import Models.EnrollmentComposites.SectionStaffSectionAssociation;
import Models.EnrollmentComposites.SectionStudentSectionAssociation;
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
 * Section
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:13.622-05:00[America/Mexico_City]")
public class Section {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_COURSE_CODE = "localCourseCode";
  @SerializedName(SERIALIZED_NAME_LOCAL_COURSE_CODE)
  private String localCourseCode;

  public static final String SERIALIZED_NAME_SECTION_IDENTIFIER = "sectionIdentifier";
  @SerializedName(SERIALIZED_NAME_SECTION_IDENTIFIER)
  private String sectionIdentifier;

  public static final String SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR = "academicSubjectDescriptor";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR)
  private String academicSubjectDescriptor;

  public static final String SERIALIZED_NAME_AVAILABLE_CREDITS = "availableCredits";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CREDITS)
  private Double availableCredits;

  public static final String SERIALIZED_NAME_CLASS_PERIODS = "classPeriods";
  @SerializedName(SERIALIZED_NAME_CLASS_PERIODS)
  private List<SectionSectionClassPeriod> classPeriods = null;

  public static final String SERIALIZED_NAME_EDUCATIONAL_ENVIRONMENT_DESCRIPTOR = "educationalEnvironmentDescriptor";
  @SerializedName(SERIALIZED_NAME_EDUCATIONAL_ENVIRONMENT_DESCRIPTOR)
  private String educationalEnvironmentDescriptor;

  public static final String SERIALIZED_NAME_LOCAL_COURSE_TITLE = "localCourseTitle";
  @SerializedName(SERIALIZED_NAME_LOCAL_COURSE_TITLE)
  private String localCourseTitle;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SectionLocation location;

  public static final String SERIALIZED_NAME_SEQUENCE_OF_COURSE = "sequenceOfCourse";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_OF_COURSE)
  private Integer sequenceOfCourse;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private SectionSession session;

  public static final String SERIALIZED_NAME_STAFF = "staff";
  @SerializedName(SERIALIZED_NAME_STAFF)
  private List<SectionStaffSectionAssociation> staff = null;

  public static final String SERIALIZED_NAME_STUDENTS = "students";
  @SerializedName(SERIALIZED_NAME_STUDENTS)
  private List<SectionStudentSectionAssociation> students = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public Section() { 
  }

  public Section id(String id) {
    
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


  public Section localCourseCode(String localCourseCode) {
    
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


  public Section sectionIdentifier(String sectionIdentifier) {
    
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


  public Section academicSubjectDescriptor(String academicSubjectDescriptor) {
    
    this.academicSubjectDescriptor = academicSubjectDescriptor;
    return this;
  }

   /**
   * The intended major subject area of the course.
   * @return academicSubjectDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The intended major subject area of the course.")

  public String getAcademicSubjectDescriptor() {
    return academicSubjectDescriptor;
  }


  public void setAcademicSubjectDescriptor(String academicSubjectDescriptor) {
    this.academicSubjectDescriptor = academicSubjectDescriptor;
  }


  public Section availableCredits(Double availableCredits) {
    
    this.availableCredits = availableCredits;
    return this;
  }

   /**
   * The value of credits or units of value awarded for the completion of a course.
   * @return availableCredits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of credits or units of value awarded for the completion of a course.")

  public Double getAvailableCredits() {
    return availableCredits;
  }


  public void setAvailableCredits(Double availableCredits) {
    this.availableCredits = availableCredits;
  }


  public Section classPeriods(List<SectionSectionClassPeriod> classPeriods) {
    
    this.classPeriods = classPeriods;
    return this;
  }

  public Section addClassPeriodsItem(SectionSectionClassPeriod classPeriodsItem) {
    if (this.classPeriods == null) {
      this.classPeriods = new ArrayList<SectionSectionClassPeriod>();
    }
    this.classPeriods.add(classPeriodsItem);
    return this;
  }

   /**
   * An unordered collection of sectionClassPeriods. 
   * @return classPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of sectionClassPeriods. ")

  public List<SectionSectionClassPeriod> getClassPeriods() {
    return classPeriods;
  }


  public void setClassPeriods(List<SectionSectionClassPeriod> classPeriods) {
    this.classPeriods = classPeriods;
  }


  public Section educationalEnvironmentDescriptor(String educationalEnvironmentDescriptor) {
    
    this.educationalEnvironmentDescriptor = educationalEnvironmentDescriptor;
    return this;
  }

   /**
   * The setting in which a child receives education and related services; for example:         Center-based instruction         Home-based instruction         Hospital class         Mainstream         Residential care and treatment facility         ...
   * @return educationalEnvironmentDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The setting in which a child receives education and related services; for example:         Center-based instruction         Home-based instruction         Hospital class         Mainstream         Residential care and treatment facility         ...")

  public String getEducationalEnvironmentDescriptor() {
    return educationalEnvironmentDescriptor;
  }


  public void setEducationalEnvironmentDescriptor(String educationalEnvironmentDescriptor) {
    this.educationalEnvironmentDescriptor = educationalEnvironmentDescriptor;
  }


  public Section localCourseTitle(String localCourseTitle) {
    
    this.localCourseTitle = localCourseTitle;
    return this;
  }

   /**
   * The descriptive name given to a course of study offered in the school, if different from the CourseTitle.
   * @return localCourseTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptive name given to a course of study offered in the school, if different from the CourseTitle.")

  public String getLocalCourseTitle() {
    return localCourseTitle;
  }


  public void setLocalCourseTitle(String localCourseTitle) {
    this.localCourseTitle = localCourseTitle;
  }


  public Section location(SectionLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SectionLocation getLocation() {
    return location;
  }


  public void setLocation(SectionLocation location) {
    this.location = location;
  }


  public Section sequenceOfCourse(Integer sequenceOfCourse) {
    
    this.sequenceOfCourse = sequenceOfCourse;
    return this;
  }

   /**
   * When a section is part of a sequence of parts for a course, the number of the sequence. If the course has only one part, the value of this section attribute should be 1.
   * @return sequenceOfCourse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When a section is part of a sequence of parts for a course, the number of the sequence. If the course has only one part, the value of this section attribute should be 1.")

  public Integer getSequenceOfCourse() {
    return sequenceOfCourse;
  }


  public void setSequenceOfCourse(Integer sequenceOfCourse) {
    this.sequenceOfCourse = sequenceOfCourse;
  }


  public Section session(SectionSession session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SectionSession getSession() {
    return session;
  }


  public void setSession(SectionSession session) {
    this.session = session;
  }


  public Section staff(List<SectionStaffSectionAssociation> staff) {
    
    this.staff = staff;
    return this;
  }

  public Section addStaffItem(SectionStaffSectionAssociation staffItem) {
    if (this.staff == null) {
      this.staff = new ArrayList<SectionStaffSectionAssociation>();
    }
    this.staff.add(staffItem);
    return this;
  }

   /**
   * An unordered collection of staffSectionAssociations. 
   * @return staff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffSectionAssociations. ")

  public List<SectionStaffSectionAssociation> getStaff() {
    return staff;
  }


  public void setStaff(List<SectionStaffSectionAssociation> staff) {
    this.staff = staff;
  }


  public Section students(List<SectionStudentSectionAssociation> students) {
    
    this.students = students;
    return this;
  }

  public Section addStudentsItem(SectionStudentSectionAssociation studentsItem) {
    if (this.students == null) {
      this.students = new ArrayList<SectionStudentSectionAssociation>();
    }
    this.students.add(studentsItem);
    return this;
  }

   /**
   * An unordered collection of studentSectionAssociations. 
   * @return students
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentSectionAssociations. ")

  public List<SectionStudentSectionAssociation> getStudents() {
    return students;
  }


  public void setStudents(List<SectionStudentSectionAssociation> students) {
    this.students = students;
  }


  public Section etag(String etag) {
    
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
    Section section = (Section) o;
    return Objects.equals(this.id, section.id) &&
        Objects.equals(this.localCourseCode, section.localCourseCode) &&
        Objects.equals(this.sectionIdentifier, section.sectionIdentifier) &&
        Objects.equals(this.academicSubjectDescriptor, section.academicSubjectDescriptor) &&
        Objects.equals(this.availableCredits, section.availableCredits) &&
        Objects.equals(this.classPeriods, section.classPeriods) &&
        Objects.equals(this.educationalEnvironmentDescriptor, section.educationalEnvironmentDescriptor) &&
        Objects.equals(this.localCourseTitle, section.localCourseTitle) &&
        Objects.equals(this.location, section.location) &&
        Objects.equals(this.sequenceOfCourse, section.sequenceOfCourse) &&
        Objects.equals(this.session, section.session) &&
        Objects.equals(this.staff, section.staff) &&
        Objects.equals(this.students, section.students) &&
        Objects.equals(this.etag, section.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, localCourseCode, sectionIdentifier, academicSubjectDescriptor, availableCredits, classPeriods, educationalEnvironmentDescriptor, localCourseTitle, location, sequenceOfCourse, session, staff, students, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCourseCode: ").append(toIndentedString(localCourseCode)).append("\n");
    sb.append("    sectionIdentifier: ").append(toIndentedString(sectionIdentifier)).append("\n");
    sb.append("    academicSubjectDescriptor: ").append(toIndentedString(academicSubjectDescriptor)).append("\n");
    sb.append("    availableCredits: ").append(toIndentedString(availableCredits)).append("\n");
    sb.append("    classPeriods: ").append(toIndentedString(classPeriods)).append("\n");
    sb.append("    educationalEnvironmentDescriptor: ").append(toIndentedString(educationalEnvironmentDescriptor)).append("\n");
    sb.append("    localCourseTitle: ").append(toIndentedString(localCourseTitle)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    sequenceOfCourse: ").append(toIndentedString(sequenceOfCourse)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
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

