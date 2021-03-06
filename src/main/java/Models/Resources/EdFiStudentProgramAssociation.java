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
import Models.Resources.EdFiStudentProgramAssociationService;
import Models.Resources.EdFiStudentReference;
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
 * EdFiStudentProgramAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentProgramAssociation {
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

  public static final String SERIALIZED_NAME_SERVED_OUTSIDE_OF_REGULAR_SESSION = "servedOutsideOfRegularSession";
  @SerializedName(SERIALIZED_NAME_SERVED_OUTSIDE_OF_REGULAR_SESSION)
  private Boolean servedOutsideOfRegularSession;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<EdFiStudentProgramAssociationService> services = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStudentProgramAssociation() { 
  }

  public EdFiStudentProgramAssociation id(String id) {
    
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


  public EdFiStudentProgramAssociation beginDate(LocalDate beginDate) {
    
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


  public EdFiStudentProgramAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
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


  public EdFiStudentProgramAssociation programReference(EdFiProgramReference programReference) {
    
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


  public EdFiStudentProgramAssociation studentReference(EdFiStudentReference studentReference) {
    
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


  public EdFiStudentProgramAssociation endDate(LocalDate endDate) {
    
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


  public EdFiStudentProgramAssociation participationStatus(EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus) {
    
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


  public EdFiStudentProgramAssociation programParticipationStatuses(List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses) {
    
    this.programParticipationStatuses = programParticipationStatuses;
    return this;
  }

  public EdFiStudentProgramAssociation addProgramParticipationStatusesItem(EdFiGeneralStudentProgramAssociationProgramParticipationStatus programParticipationStatusesItem) {
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


  public EdFiStudentProgramAssociation reasonExitedDescriptor(String reasonExitedDescriptor) {
    
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


  public EdFiStudentProgramAssociation servedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    
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


  public EdFiStudentProgramAssociation services(List<EdFiStudentProgramAssociationService> services) {
    
    this.services = services;
    return this;
  }

  public EdFiStudentProgramAssociation addServicesItem(EdFiStudentProgramAssociationService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<EdFiStudentProgramAssociationService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * An unordered collection of studentProgramAssociationServices. Indicates the Service(s) being provided to the Student by the Program.
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentProgramAssociationServices. Indicates the Service(s) being provided to the Student by the Program.")

  public List<EdFiStudentProgramAssociationService> getServices() {
    return services;
  }


  public void setServices(List<EdFiStudentProgramAssociationService> services) {
    this.services = services;
  }


  public EdFiStudentProgramAssociation etag(String etag) {
    
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
    EdFiStudentProgramAssociation edFiStudentProgramAssociation = (EdFiStudentProgramAssociation) o;
    return Objects.equals(this.id, edFiStudentProgramAssociation.id) &&
        Objects.equals(this.beginDate, edFiStudentProgramAssociation.beginDate) &&
        Objects.equals(this.educationOrganizationReference, edFiStudentProgramAssociation.educationOrganizationReference) &&
        Objects.equals(this.programReference, edFiStudentProgramAssociation.programReference) &&
        Objects.equals(this.studentReference, edFiStudentProgramAssociation.studentReference) &&
        Objects.equals(this.endDate, edFiStudentProgramAssociation.endDate) &&
        Objects.equals(this.participationStatus, edFiStudentProgramAssociation.participationStatus) &&
        Objects.equals(this.programParticipationStatuses, edFiStudentProgramAssociation.programParticipationStatuses) &&
        Objects.equals(this.reasonExitedDescriptor, edFiStudentProgramAssociation.reasonExitedDescriptor) &&
        Objects.equals(this.servedOutsideOfRegularSession, edFiStudentProgramAssociation.servedOutsideOfRegularSession) &&
        Objects.equals(this.services, edFiStudentProgramAssociation.services) &&
        Objects.equals(this.etag, edFiStudentProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, educationOrganizationReference, programReference, studentReference, endDate, participationStatus, programParticipationStatuses, reasonExitedDescriptor, servedOutsideOfRegularSession, services, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentProgramAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    programReference: ").append(toIndentedString(programReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    participationStatus: ").append(toIndentedString(participationStatus)).append("\n");
    sb.append("    programParticipationStatuses: ").append(toIndentedString(programParticipationStatuses)).append("\n");
    sb.append("    reasonExitedDescriptor: ").append(toIndentedString(reasonExitedDescriptor)).append("\n");
    sb.append("    servedOutsideOfRegularSession: ").append(toIndentedString(servedOutsideOfRegularSession)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

