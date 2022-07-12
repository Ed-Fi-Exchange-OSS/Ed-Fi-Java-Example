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
import Models.Resources.EdFiEducationOrganizationReference;
import Models.Resources.EdFiOpenStaffPositionAcademicSubject;
import Models.Resources.EdFiOpenStaffPositionInstructionalGradeLevel;
import Models.Resources.OpenStaffPositionExtensions;
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
 * EdFiOpenStaffPosition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiOpenStaffPosition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REQUISITION_NUMBER = "requisitionNumber";
  @SerializedName(SERIALIZED_NAME_REQUISITION_NUMBER)
  private String requisitionNumber;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE = "educationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference educationOrganizationReference;

  public static final String SERIALIZED_NAME_ACADEMIC_SUBJECTS = "academicSubjects";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUBJECTS)
  private List<EdFiOpenStaffPositionAcademicSubject> academicSubjects = null;

  public static final String SERIALIZED_NAME_DATE_POSTED = "datePosted";
  @SerializedName(SERIALIZED_NAME_DATE_POSTED)
  private LocalDate datePosted;

  public static final String SERIALIZED_NAME_DATE_POSTING_REMOVED = "datePostingRemoved";
  @SerializedName(SERIALIZED_NAME_DATE_POSTING_REMOVED)
  private LocalDate datePostingRemoved;

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS_DESCRIPTOR = "employmentStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS_DESCRIPTOR)
  private String employmentStatusDescriptor;

  public static final String SERIALIZED_NAME_INSTRUCTIONAL_GRADE_LEVELS = "instructionalGradeLevels";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONAL_GRADE_LEVELS)
  private List<EdFiOpenStaffPositionInstructionalGradeLevel> instructionalGradeLevels = null;

  public static final String SERIALIZED_NAME_POSITION_TITLE = "positionTitle";
  @SerializedName(SERIALIZED_NAME_POSITION_TITLE)
  private String positionTitle;

  public static final String SERIALIZED_NAME_POSTING_RESULT_DESCRIPTOR = "postingResultDescriptor";
  @SerializedName(SERIALIZED_NAME_POSTING_RESULT_DESCRIPTOR)
  private String postingResultDescriptor;

  public static final String SERIALIZED_NAME_PROGRAM_ASSIGNMENT_DESCRIPTOR = "programAssignmentDescriptor";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ASSIGNMENT_DESCRIPTOR)
  private String programAssignmentDescriptor;

  public static final String SERIALIZED_NAME_STAFF_CLASSIFICATION_DESCRIPTOR = "staffClassificationDescriptor";
  @SerializedName(SERIALIZED_NAME_STAFF_CLASSIFICATION_DESCRIPTOR)
  private String staffClassificationDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public static final String SERIALIZED_NAME_EXT = "_ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private OpenStaffPositionExtensions ext;

  public EdFiOpenStaffPosition() { 
  }

  public EdFiOpenStaffPosition id(String id) {
    
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


  public EdFiOpenStaffPosition requisitionNumber(String requisitionNumber) {
    
    this.requisitionNumber = requisitionNumber;
    return this;
  }

   /**
   * The number or identifier assigned to an open staff position, typically a requisition number assigned by Human Resources.
   * @return requisitionNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number or identifier assigned to an open staff position, typically a requisition number assigned by Human Resources.")

  public String getRequisitionNumber() {
    return requisitionNumber;
  }


  public void setRequisitionNumber(String requisitionNumber) {
    this.requisitionNumber = requisitionNumber;
  }


  public EdFiOpenStaffPosition educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }


  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }


  public EdFiOpenStaffPosition academicSubjects(List<EdFiOpenStaffPositionAcademicSubject> academicSubjects) {
    
    this.academicSubjects = academicSubjects;
    return this;
  }

  public EdFiOpenStaffPosition addAcademicSubjectsItem(EdFiOpenStaffPositionAcademicSubject academicSubjectsItem) {
    if (this.academicSubjects == null) {
      this.academicSubjects = new ArrayList<EdFiOpenStaffPositionAcademicSubject>();
    }
    this.academicSubjects.add(academicSubjectsItem);
    return this;
  }

   /**
   * An unordered collection of openStaffPositionAcademicSubjects. The teaching field required for the OpenStaffPosition, for example English/Language Arts, Reading, Mathematics, Science, Social Sciences, etc.
   * @return academicSubjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of openStaffPositionAcademicSubjects. The teaching field required for the OpenStaffPosition, for example English/Language Arts, Reading, Mathematics, Science, Social Sciences, etc.")

  public List<EdFiOpenStaffPositionAcademicSubject> getAcademicSubjects() {
    return academicSubjects;
  }


  public void setAcademicSubjects(List<EdFiOpenStaffPositionAcademicSubject> academicSubjects) {
    this.academicSubjects = academicSubjects;
  }


  public EdFiOpenStaffPosition datePosted(LocalDate datePosted) {
    
    this.datePosted = datePosted;
    return this;
  }

   /**
   * Date the OpenStaffPosition was posted.
   * @return datePosted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date the OpenStaffPosition was posted.")

  public LocalDate getDatePosted() {
    return datePosted;
  }


  public void setDatePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
  }


  public EdFiOpenStaffPosition datePostingRemoved(LocalDate datePostingRemoved) {
    
    this.datePostingRemoved = datePostingRemoved;
    return this;
  }

   /**
   * The date the posting was removed or filled.
   * @return datePostingRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the posting was removed or filled.")

  public LocalDate getDatePostingRemoved() {
    return datePostingRemoved;
  }


  public void setDatePostingRemoved(LocalDate datePostingRemoved) {
    this.datePostingRemoved = datePostingRemoved;
  }


  public EdFiOpenStaffPosition employmentStatusDescriptor(String employmentStatusDescriptor) {
    
    this.employmentStatusDescriptor = employmentStatusDescriptor;
    return this;
  }

   /**
   * Reflects the type of employment or contract desired for the position; for example:         Probationary         Contractual         Substitute/temporary         Tenured or permanent         Volunteer/no contract         ...
   * @return employmentStatusDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Reflects the type of employment or contract desired for the position; for example:         Probationary         Contractual         Substitute/temporary         Tenured or permanent         Volunteer/no contract         ...")

  public String getEmploymentStatusDescriptor() {
    return employmentStatusDescriptor;
  }


  public void setEmploymentStatusDescriptor(String employmentStatusDescriptor) {
    this.employmentStatusDescriptor = employmentStatusDescriptor;
  }


  public EdFiOpenStaffPosition instructionalGradeLevels(List<EdFiOpenStaffPositionInstructionalGradeLevel> instructionalGradeLevels) {
    
    this.instructionalGradeLevels = instructionalGradeLevels;
    return this;
  }

  public EdFiOpenStaffPosition addInstructionalGradeLevelsItem(EdFiOpenStaffPositionInstructionalGradeLevel instructionalGradeLevelsItem) {
    if (this.instructionalGradeLevels == null) {
      this.instructionalGradeLevels = new ArrayList<EdFiOpenStaffPositionInstructionalGradeLevel>();
    }
    this.instructionalGradeLevels.add(instructionalGradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of openStaffPositionInstructionalGradeLevels. The set of grade levels for which the position&#39;s assignment is responsible.
   * @return instructionalGradeLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of openStaffPositionInstructionalGradeLevels. The set of grade levels for which the position's assignment is responsible.")

  public List<EdFiOpenStaffPositionInstructionalGradeLevel> getInstructionalGradeLevels() {
    return instructionalGradeLevels;
  }


  public void setInstructionalGradeLevels(List<EdFiOpenStaffPositionInstructionalGradeLevel> instructionalGradeLevels) {
    this.instructionalGradeLevels = instructionalGradeLevels;
  }


  public EdFiOpenStaffPosition positionTitle(String positionTitle) {
    
    this.positionTitle = positionTitle;
    return this;
  }

   /**
   * The descriptive name of an individual&#39;s position.
   * @return positionTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptive name of an individual's position.")

  public String getPositionTitle() {
    return positionTitle;
  }


  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }


  public EdFiOpenStaffPosition postingResultDescriptor(String postingResultDescriptor) {
    
    this.postingResultDescriptor = postingResultDescriptor;
    return this;
  }

   /**
   * Indication of whether the OpenStaffPosition was filled or retired without filling.
   * @return postingResultDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indication of whether the OpenStaffPosition was filled or retired without filling.")

  public String getPostingResultDescriptor() {
    return postingResultDescriptor;
  }


  public void setPostingResultDescriptor(String postingResultDescriptor) {
    this.postingResultDescriptor = postingResultDescriptor;
  }


  public EdFiOpenStaffPosition programAssignmentDescriptor(String programAssignmentDescriptor) {
    
    this.programAssignmentDescriptor = programAssignmentDescriptor;
    return this;
  }

   /**
   * The name of the program for which the OpenStaffPosition will be assigned; for example:         Regular education         Title I-Academic         Title I-Non-Academic         Special Education&#39;         Bilingual/English as a Second Language.
   * @return programAssignmentDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the program for which the OpenStaffPosition will be assigned; for example:         Regular education         Title I-Academic         Title I-Non-Academic         Special Education'         Bilingual/English as a Second Language.")

  public String getProgramAssignmentDescriptor() {
    return programAssignmentDescriptor;
  }


  public void setProgramAssignmentDescriptor(String programAssignmentDescriptor) {
    this.programAssignmentDescriptor = programAssignmentDescriptor;
  }


  public EdFiOpenStaffPosition staffClassificationDescriptor(String staffClassificationDescriptor) {
    
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


  public EdFiOpenStaffPosition etag(String etag) {
    
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


  public EdFiOpenStaffPosition ext(OpenStaffPositionExtensions ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenStaffPositionExtensions getExt() {
    return ext;
  }


  public void setExt(OpenStaffPositionExtensions ext) {
    this.ext = ext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiOpenStaffPosition edFiOpenStaffPosition = (EdFiOpenStaffPosition) o;
    return Objects.equals(this.id, edFiOpenStaffPosition.id) &&
        Objects.equals(this.requisitionNumber, edFiOpenStaffPosition.requisitionNumber) &&
        Objects.equals(this.educationOrganizationReference, edFiOpenStaffPosition.educationOrganizationReference) &&
        Objects.equals(this.academicSubjects, edFiOpenStaffPosition.academicSubjects) &&
        Objects.equals(this.datePosted, edFiOpenStaffPosition.datePosted) &&
        Objects.equals(this.datePostingRemoved, edFiOpenStaffPosition.datePostingRemoved) &&
        Objects.equals(this.employmentStatusDescriptor, edFiOpenStaffPosition.employmentStatusDescriptor) &&
        Objects.equals(this.instructionalGradeLevels, edFiOpenStaffPosition.instructionalGradeLevels) &&
        Objects.equals(this.positionTitle, edFiOpenStaffPosition.positionTitle) &&
        Objects.equals(this.postingResultDescriptor, edFiOpenStaffPosition.postingResultDescriptor) &&
        Objects.equals(this.programAssignmentDescriptor, edFiOpenStaffPosition.programAssignmentDescriptor) &&
        Objects.equals(this.staffClassificationDescriptor, edFiOpenStaffPosition.staffClassificationDescriptor) &&
        Objects.equals(this.etag, edFiOpenStaffPosition.etag) &&
        Objects.equals(this.ext, edFiOpenStaffPosition.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requisitionNumber, educationOrganizationReference, academicSubjects, datePosted, datePostingRemoved, employmentStatusDescriptor, instructionalGradeLevels, positionTitle, postingResultDescriptor, programAssignmentDescriptor, staffClassificationDescriptor, etag, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiOpenStaffPosition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requisitionNumber: ").append(toIndentedString(requisitionNumber)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    academicSubjects: ").append(toIndentedString(academicSubjects)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    datePostingRemoved: ").append(toIndentedString(datePostingRemoved)).append("\n");
    sb.append("    employmentStatusDescriptor: ").append(toIndentedString(employmentStatusDescriptor)).append("\n");
    sb.append("    instructionalGradeLevels: ").append(toIndentedString(instructionalGradeLevels)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    postingResultDescriptor: ").append(toIndentedString(postingResultDescriptor)).append("\n");
    sb.append("    programAssignmentDescriptor: ").append(toIndentedString(programAssignmentDescriptor)).append("\n");
    sb.append("    staffClassificationDescriptor: ").append(toIndentedString(staffClassificationDescriptor)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
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

