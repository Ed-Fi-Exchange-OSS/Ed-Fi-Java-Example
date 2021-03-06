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
import Models.Resources.EdFiGeneralStudentProgramAssociationParticipationStatus;
import Models.Resources.EdFiGeneralStudentProgramAssociationProgramParticipationStatus;
import Models.Resources.EdFiProgramReference;
import Models.Resources.EdFiStudentReference;
import Models.Resources.EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService;
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
 * EdFiStudentSchoolFoodServiceProgramAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentSchoolFoodServiceProgramAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE = "educationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference educationOrganizationReference;

  public static final String SERIALIZED_NAME_PROGRAM_REFERENCE = "programReference";
  @SerializedName(SERIALIZED_NAME_PROGRAM_REFERENCE)
  private EdFiProgramReference programReference;

  public static final String SERIALIZED_NAME_STUDENT_REFERENCE = "studentReference";
  @SerializedName(SERIALIZED_NAME_STUDENT_REFERENCE)
  private EdFiStudentReference studentReference;

  public static final String SERIALIZED_NAME_DIRECT_CERTIFICATION = "directCertification";
  @SerializedName(SERIALIZED_NAME_DIRECT_CERTIFICATION)
  private Boolean directCertification;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PARTICIPATION_STATUS = "participationStatus";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION_STATUS)
  private EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus;

  public static final String SERIALIZED_NAME_PROGRAM_PARTICIPATION_STATUSES = "programParticipationStatuses";
  @SerializedName(SERIALIZED_NAME_PROGRAM_PARTICIPATION_STATUSES)
  private List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses = null;

  public static final String SERIALIZED_NAME_REASON_EXITED_DESCRIPTOR = "reasonExitedDescriptor";
  @SerializedName(SERIALIZED_NAME_REASON_EXITED_DESCRIPTOR)
  private String reasonExitedDescriptor;

  public static final String SERIALIZED_NAME_SCHOOL_FOOD_SERVICE_PROGRAM_SERVICES = "schoolFoodServiceProgramServices";
  @SerializedName(SERIALIZED_NAME_SCHOOL_FOOD_SERVICE_PROGRAM_SERVICES)
  private List<EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService> schoolFoodServiceProgramServices = null;

  public static final String SERIALIZED_NAME_SERVED_OUTSIDE_OF_REGULAR_SESSION = "servedOutsideOfRegularSession";
  @SerializedName(SERIALIZED_NAME_SERVED_OUTSIDE_OF_REGULAR_SESSION)
  private Boolean servedOutsideOfRegularSession;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStudentSchoolFoodServiceProgramAssociation() { 
  }

  public EdFiStudentSchoolFoodServiceProgramAssociation id(String id) {
    
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


  public EdFiStudentSchoolFoodServiceProgramAssociation beginDate(LocalDate beginDate) {
    
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


  public EdFiStudentSchoolFoodServiceProgramAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
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


  public EdFiStudentSchoolFoodServiceProgramAssociation programReference(EdFiProgramReference programReference) {
    
    this.programReference = programReference;
    return this;
  }

   /**
   * Get programReference
   * @return programReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiProgramReference getProgramReference() {
    return programReference;
  }


  public void setProgramReference(EdFiProgramReference programReference) {
    this.programReference = programReference;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation studentReference(EdFiStudentReference studentReference) {
    
    this.studentReference = studentReference;
    return this;
  }

   /**
   * Get studentReference
   * @return studentReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiStudentReference getStudentReference() {
    return studentReference;
  }


  public void setStudentReference(EdFiStudentReference studentReference) {
    this.studentReference = studentReference;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation directCertification(Boolean directCertification) {
    
    this.directCertification = directCertification;
    return this;
  }

   /**
   * Indicates that the student&#39;s National School Lunch Program (NSLP) eligibility has been determined through direct certification.
   * @return directCertification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the student's National School Lunch Program (NSLP) eligibility has been determined through direct certification.")

  public Boolean getDirectCertification() {
    return directCertification;
  }


  public void setDirectCertification(Boolean directCertification) {
    this.directCertification = directCertification;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The month, day, and year on which the Student exited the Program or stopped receiving services.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month, day, and year on which the Student exited the Program or stopped receiving services.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation participationStatus(EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus) {
    
    this.participationStatus = participationStatus;
    return this;
  }

   /**
   * Get participationStatus
   * @return participationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiGeneralStudentProgramAssociationParticipationStatus getParticipationStatus() {
    return participationStatus;
  }


  public void setParticipationStatus(EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus) {
    this.participationStatus = participationStatus;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation programParticipationStatuses(List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses) {
    
    this.programParticipationStatuses = programParticipationStatuses;
    return this;
  }

  public EdFiStudentSchoolFoodServiceProgramAssociation addProgramParticipationStatusesItem(EdFiGeneralStudentProgramAssociationProgramParticipationStatus programParticipationStatusesItem) {
    if (this.programParticipationStatuses == null) {
      this.programParticipationStatuses = new ArrayList<EdFiGeneralStudentProgramAssociationProgramParticipationStatus>();
    }
    this.programParticipationStatuses.add(programParticipationStatusesItem);
    return this;
  }

   /**
   * An unordered collection of generalStudentProgramAssociationProgramParticipationStatuses. The status of the student&#39;s program participation.
   * @return programParticipationStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of generalStudentProgramAssociationProgramParticipationStatuses. The status of the student's program participation.")

  public List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> getProgramParticipationStatuses() {
    return programParticipationStatuses;
  }


  public void setProgramParticipationStatuses(List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses) {
    this.programParticipationStatuses = programParticipationStatuses;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation reasonExitedDescriptor(String reasonExitedDescriptor) {
    
    this.reasonExitedDescriptor = reasonExitedDescriptor;
    return this;
  }

   /**
   * The reason the child left the Program within a school or district.
   * @return reasonExitedDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason the child left the Program within a school or district.")

  public String getReasonExitedDescriptor() {
    return reasonExitedDescriptor;
  }


  public void setReasonExitedDescriptor(String reasonExitedDescriptor) {
    this.reasonExitedDescriptor = reasonExitedDescriptor;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation schoolFoodServiceProgramServices(List<EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService> schoolFoodServiceProgramServices) {
    
    this.schoolFoodServiceProgramServices = schoolFoodServiceProgramServices;
    return this;
  }

  public EdFiStudentSchoolFoodServiceProgramAssociation addSchoolFoodServiceProgramServicesItem(EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService schoolFoodServiceProgramServicesItem) {
    if (this.schoolFoodServiceProgramServices == null) {
      this.schoolFoodServiceProgramServices = new ArrayList<EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService>();
    }
    this.schoolFoodServiceProgramServices.add(schoolFoodServiceProgramServicesItem);
    return this;
  }

   /**
   * An unordered collection of studentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramServices. Indicates the service(s) being provided to the Student by the School Food Service Program.
   * @return schoolFoodServiceProgramServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramServices. Indicates the service(s) being provided to the Student by the School Food Service Program.")

  public List<EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService> getSchoolFoodServiceProgramServices() {
    return schoolFoodServiceProgramServices;
  }


  public void setSchoolFoodServiceProgramServices(List<EdFiStudentSchoolFoodServiceProgramAssociationSchoolFoodServiceProgramService> schoolFoodServiceProgramServices) {
    this.schoolFoodServiceProgramServices = schoolFoodServiceProgramServices;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation servedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    
    this.servedOutsideOfRegularSession = servedOutsideOfRegularSession;
    return this;
  }

   /**
   * Indicates whether the Student received services during the summer session or between sessions.
   * @return servedOutsideOfRegularSession
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Student received services during the summer session or between sessions.")

  public Boolean getServedOutsideOfRegularSession() {
    return servedOutsideOfRegularSession;
  }


  public void setServedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    this.servedOutsideOfRegularSession = servedOutsideOfRegularSession;
  }


  public EdFiStudentSchoolFoodServiceProgramAssociation etag(String etag) {
    
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
    EdFiStudentSchoolFoodServiceProgramAssociation edFiStudentSchoolFoodServiceProgramAssociation = (EdFiStudentSchoolFoodServiceProgramAssociation) o;
    return Objects.equals(this.id, edFiStudentSchoolFoodServiceProgramAssociation.id) &&
        Objects.equals(this.beginDate, edFiStudentSchoolFoodServiceProgramAssociation.beginDate) &&
        Objects.equals(this.educationOrganizationReference, edFiStudentSchoolFoodServiceProgramAssociation.educationOrganizationReference) &&
        Objects.equals(this.programReference, edFiStudentSchoolFoodServiceProgramAssociation.programReference) &&
        Objects.equals(this.studentReference, edFiStudentSchoolFoodServiceProgramAssociation.studentReference) &&
        Objects.equals(this.directCertification, edFiStudentSchoolFoodServiceProgramAssociation.directCertification) &&
        Objects.equals(this.endDate, edFiStudentSchoolFoodServiceProgramAssociation.endDate) &&
        Objects.equals(this.participationStatus, edFiStudentSchoolFoodServiceProgramAssociation.participationStatus) &&
        Objects.equals(this.programParticipationStatuses, edFiStudentSchoolFoodServiceProgramAssociation.programParticipationStatuses) &&
        Objects.equals(this.reasonExitedDescriptor, edFiStudentSchoolFoodServiceProgramAssociation.reasonExitedDescriptor) &&
        Objects.equals(this.schoolFoodServiceProgramServices, edFiStudentSchoolFoodServiceProgramAssociation.schoolFoodServiceProgramServices) &&
        Objects.equals(this.servedOutsideOfRegularSession, edFiStudentSchoolFoodServiceProgramAssociation.servedOutsideOfRegularSession) &&
        Objects.equals(this.etag, edFiStudentSchoolFoodServiceProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, educationOrganizationReference, programReference, studentReference, directCertification, endDate, participationStatus, programParticipationStatuses, reasonExitedDescriptor, schoolFoodServiceProgramServices, servedOutsideOfRegularSession, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentSchoolFoodServiceProgramAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    programReference: ").append(toIndentedString(programReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    directCertification: ").append(toIndentedString(directCertification)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    participationStatus: ").append(toIndentedString(participationStatus)).append("\n");
    sb.append("    programParticipationStatuses: ").append(toIndentedString(programParticipationStatuses)).append("\n");
    sb.append("    reasonExitedDescriptor: ").append(toIndentedString(reasonExitedDescriptor)).append("\n");
    sb.append("    schoolFoodServiceProgramServices: ").append(toIndentedString(schoolFoodServiceProgramServices)).append("\n");
    sb.append("    servedOutsideOfRegularSession: ").append(toIndentedString(servedOutsideOfRegularSession)).append("\n");
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

