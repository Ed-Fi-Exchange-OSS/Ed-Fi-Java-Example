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
import Models.Resources.EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService;
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
 * EdFiStudentNeglectedOrDelinquentProgramAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentNeglectedOrDelinquentProgramAssociation {
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

  public static final String SERIALIZED_NAME_ELA_PROGRESS_LEVEL_DESCRIPTOR = "elaProgressLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_ELA_PROGRESS_LEVEL_DESCRIPTOR)
  private String elaProgressLevelDescriptor;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_MATHEMATICS_PROGRESS_LEVEL_DESCRIPTOR = "mathematicsProgressLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_MATHEMATICS_PROGRESS_LEVEL_DESCRIPTOR)
  private String mathematicsProgressLevelDescriptor;

  public static final String SERIALIZED_NAME_NEGLECTED_OR_DELINQUENT_PROGRAM_DESCRIPTOR = "neglectedOrDelinquentProgramDescriptor";
  @SerializedName(SERIALIZED_NAME_NEGLECTED_OR_DELINQUENT_PROGRAM_DESCRIPTOR)
  private String neglectedOrDelinquentProgramDescriptor;

  public static final String SERIALIZED_NAME_NEGLECTED_OR_DELINQUENT_PROGRAM_SERVICES = "neglectedOrDelinquentProgramServices";
  @SerializedName(SERIALIZED_NAME_NEGLECTED_OR_DELINQUENT_PROGRAM_SERVICES)
  private List<EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService> neglectedOrDelinquentProgramServices = null;

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

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStudentNeglectedOrDelinquentProgramAssociation() { 
  }

  public EdFiStudentNeglectedOrDelinquentProgramAssociation id(String id) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation beginDate(LocalDate beginDate) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation programReference(EdFiProgramReference programReference) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation studentReference(EdFiStudentReference studentReference) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation elaProgressLevelDescriptor(String elaProgressLevelDescriptor) {
    
    this.elaProgressLevelDescriptor = elaProgressLevelDescriptor;
    return this;
  }

   /**
   * The progress measured from pre- to post- test for ELA.
   * @return elaProgressLevelDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The progress measured from pre- to post- test for ELA.")

  public String getElaProgressLevelDescriptor() {
    return elaProgressLevelDescriptor;
  }


  public void setElaProgressLevelDescriptor(String elaProgressLevelDescriptor) {
    this.elaProgressLevelDescriptor = elaProgressLevelDescriptor;
  }


  public EdFiStudentNeglectedOrDelinquentProgramAssociation endDate(LocalDate endDate) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation mathematicsProgressLevelDescriptor(String mathematicsProgressLevelDescriptor) {
    
    this.mathematicsProgressLevelDescriptor = mathematicsProgressLevelDescriptor;
    return this;
  }

   /**
   * The progress measured from pre- to post-test for Mathematics.
   * @return mathematicsProgressLevelDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The progress measured from pre- to post-test for Mathematics.")

  public String getMathematicsProgressLevelDescriptor() {
    return mathematicsProgressLevelDescriptor;
  }


  public void setMathematicsProgressLevelDescriptor(String mathematicsProgressLevelDescriptor) {
    this.mathematicsProgressLevelDescriptor = mathematicsProgressLevelDescriptor;
  }


  public EdFiStudentNeglectedOrDelinquentProgramAssociation neglectedOrDelinquentProgramDescriptor(String neglectedOrDelinquentProgramDescriptor) {
    
    this.neglectedOrDelinquentProgramDescriptor = neglectedOrDelinquentProgramDescriptor;
    return this;
  }

   /**
   * The type of program under ESEA Title I, Part D, Subpart 1 (state programs) or Subpart 2 (LEA).
   * @return neglectedOrDelinquentProgramDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of program under ESEA Title I, Part D, Subpart 1 (state programs) or Subpart 2 (LEA).")

  public String getNeglectedOrDelinquentProgramDescriptor() {
    return neglectedOrDelinquentProgramDescriptor;
  }


  public void setNeglectedOrDelinquentProgramDescriptor(String neglectedOrDelinquentProgramDescriptor) {
    this.neglectedOrDelinquentProgramDescriptor = neglectedOrDelinquentProgramDescriptor;
  }


  public EdFiStudentNeglectedOrDelinquentProgramAssociation neglectedOrDelinquentProgramServices(List<EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService> neglectedOrDelinquentProgramServices) {
    
    this.neglectedOrDelinquentProgramServices = neglectedOrDelinquentProgramServices;
    return this;
  }

  public EdFiStudentNeglectedOrDelinquentProgramAssociation addNeglectedOrDelinquentProgramServicesItem(EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService neglectedOrDelinquentProgramServicesItem) {
    if (this.neglectedOrDelinquentProgramServices == null) {
      this.neglectedOrDelinquentProgramServices = new ArrayList<EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService>();
    }
    this.neglectedOrDelinquentProgramServices.add(neglectedOrDelinquentProgramServicesItem);
    return this;
  }

   /**
   * An unordered collection of studentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramServices. Indicates the service(s) being provided to the Student by the Neglected or Delinquent Program.
   * @return neglectedOrDelinquentProgramServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramServices. Indicates the service(s) being provided to the Student by the Neglected or Delinquent Program.")

  public List<EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService> getNeglectedOrDelinquentProgramServices() {
    return neglectedOrDelinquentProgramServices;
  }


  public void setNeglectedOrDelinquentProgramServices(List<EdFiStudentNeglectedOrDelinquentProgramAssociationNeglectedOrDelinquentProgramService> neglectedOrDelinquentProgramServices) {
    this.neglectedOrDelinquentProgramServices = neglectedOrDelinquentProgramServices;
  }


  public EdFiStudentNeglectedOrDelinquentProgramAssociation participationStatus(EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation programParticipationStatuses(List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses) {
    
    this.programParticipationStatuses = programParticipationStatuses;
    return this;
  }

  public EdFiStudentNeglectedOrDelinquentProgramAssociation addProgramParticipationStatusesItem(EdFiGeneralStudentProgramAssociationProgramParticipationStatus programParticipationStatusesItem) {
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation reasonExitedDescriptor(String reasonExitedDescriptor) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation servedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    
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


  public EdFiStudentNeglectedOrDelinquentProgramAssociation etag(String etag) {
    
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
    EdFiStudentNeglectedOrDelinquentProgramAssociation edFiStudentNeglectedOrDelinquentProgramAssociation = (EdFiStudentNeglectedOrDelinquentProgramAssociation) o;
    return Objects.equals(this.id, edFiStudentNeglectedOrDelinquentProgramAssociation.id) &&
        Objects.equals(this.beginDate, edFiStudentNeglectedOrDelinquentProgramAssociation.beginDate) &&
        Objects.equals(this.educationOrganizationReference, edFiStudentNeglectedOrDelinquentProgramAssociation.educationOrganizationReference) &&
        Objects.equals(this.programReference, edFiStudentNeglectedOrDelinquentProgramAssociation.programReference) &&
        Objects.equals(this.studentReference, edFiStudentNeglectedOrDelinquentProgramAssociation.studentReference) &&
        Objects.equals(this.elaProgressLevelDescriptor, edFiStudentNeglectedOrDelinquentProgramAssociation.elaProgressLevelDescriptor) &&
        Objects.equals(this.endDate, edFiStudentNeglectedOrDelinquentProgramAssociation.endDate) &&
        Objects.equals(this.mathematicsProgressLevelDescriptor, edFiStudentNeglectedOrDelinquentProgramAssociation.mathematicsProgressLevelDescriptor) &&
        Objects.equals(this.neglectedOrDelinquentProgramDescriptor, edFiStudentNeglectedOrDelinquentProgramAssociation.neglectedOrDelinquentProgramDescriptor) &&
        Objects.equals(this.neglectedOrDelinquentProgramServices, edFiStudentNeglectedOrDelinquentProgramAssociation.neglectedOrDelinquentProgramServices) &&
        Objects.equals(this.participationStatus, edFiStudentNeglectedOrDelinquentProgramAssociation.participationStatus) &&
        Objects.equals(this.programParticipationStatuses, edFiStudentNeglectedOrDelinquentProgramAssociation.programParticipationStatuses) &&
        Objects.equals(this.reasonExitedDescriptor, edFiStudentNeglectedOrDelinquentProgramAssociation.reasonExitedDescriptor) &&
        Objects.equals(this.servedOutsideOfRegularSession, edFiStudentNeglectedOrDelinquentProgramAssociation.servedOutsideOfRegularSession) &&
        Objects.equals(this.etag, edFiStudentNeglectedOrDelinquentProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, educationOrganizationReference, programReference, studentReference, elaProgressLevelDescriptor, endDate, mathematicsProgressLevelDescriptor, neglectedOrDelinquentProgramDescriptor, neglectedOrDelinquentProgramServices, participationStatus, programParticipationStatuses, reasonExitedDescriptor, servedOutsideOfRegularSession, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentNeglectedOrDelinquentProgramAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    programReference: ").append(toIndentedString(programReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    elaProgressLevelDescriptor: ").append(toIndentedString(elaProgressLevelDescriptor)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    mathematicsProgressLevelDescriptor: ").append(toIndentedString(mathematicsProgressLevelDescriptor)).append("\n");
    sb.append("    neglectedOrDelinquentProgramDescriptor: ").append(toIndentedString(neglectedOrDelinquentProgramDescriptor)).append("\n");
    sb.append("    neglectedOrDelinquentProgramServices: ").append(toIndentedString(neglectedOrDelinquentProgramServices)).append("\n");
    sb.append("    participationStatus: ").append(toIndentedString(participationStatus)).append("\n");
    sb.append("    programParticipationStatuses: ").append(toIndentedString(programParticipationStatuses)).append("\n");
    sb.append("    reasonExitedDescriptor: ").append(toIndentedString(reasonExitedDescriptor)).append("\n");
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

