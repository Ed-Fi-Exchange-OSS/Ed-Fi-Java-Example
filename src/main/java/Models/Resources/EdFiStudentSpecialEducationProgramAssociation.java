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
import Models.Resources.EdFiStudentSpecialEducationProgramAssociationDisability;
import Models.Resources.EdFiStudentSpecialEducationProgramAssociationServiceProvider;
import Models.Resources.EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService;
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
 * EdFiStudentSpecialEducationProgramAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentSpecialEducationProgramAssociation {
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

  public static final String SERIALIZED_NAME_DISABILITIES = "disabilities";
  @SerializedName(SERIALIZED_NAME_DISABILITIES)
  private List<EdFiStudentSpecialEducationProgramAssociationDisability> disabilities = null;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_IDEA_ELIGIBILITY = "ideaEligibility";
  @SerializedName(SERIALIZED_NAME_IDEA_ELIGIBILITY)
  private Boolean ideaEligibility;

  public static final String SERIALIZED_NAME_IEP_BEGIN_DATE = "iepBeginDate";
  @SerializedName(SERIALIZED_NAME_IEP_BEGIN_DATE)
  private LocalDate iepBeginDate;

  public static final String SERIALIZED_NAME_IEP_END_DATE = "iepEndDate";
  @SerializedName(SERIALIZED_NAME_IEP_END_DATE)
  private LocalDate iepEndDate;

  public static final String SERIALIZED_NAME_IEP_REVIEW_DATE = "iepReviewDate";
  @SerializedName(SERIALIZED_NAME_IEP_REVIEW_DATE)
  private LocalDate iepReviewDate;

  public static final String SERIALIZED_NAME_LAST_EVALUATION_DATE = "lastEvaluationDate";
  @SerializedName(SERIALIZED_NAME_LAST_EVALUATION_DATE)
  private LocalDate lastEvaluationDate;

  public static final String SERIALIZED_NAME_MEDICALLY_FRAGILE = "medicallyFragile";
  @SerializedName(SERIALIZED_NAME_MEDICALLY_FRAGILE)
  private Boolean medicallyFragile;

  public static final String SERIALIZED_NAME_MULTIPLY_DISABLED = "multiplyDisabled";
  @SerializedName(SERIALIZED_NAME_MULTIPLY_DISABLED)
  private Boolean multiplyDisabled;

  public static final String SERIALIZED_NAME_PARTICIPATION_STATUS = "participationStatus";
  @SerializedName(SERIALIZED_NAME_PARTICIPATION_STATUS)
  private EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus;

  public static final String SERIALIZED_NAME_PROGRAM_PARTICIPATION_STATUSES = "programParticipationStatuses";
  @SerializedName(SERIALIZED_NAME_PROGRAM_PARTICIPATION_STATUSES)
  private List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses = null;

  public static final String SERIALIZED_NAME_REASON_EXITED_DESCRIPTOR = "reasonExitedDescriptor";
  @SerializedName(SERIALIZED_NAME_REASON_EXITED_DESCRIPTOR)
  private String reasonExitedDescriptor;

  public static final String SERIALIZED_NAME_SCHOOL_HOURS_PER_WEEK = "schoolHoursPerWeek";
  @SerializedName(SERIALIZED_NAME_SCHOOL_HOURS_PER_WEEK)
  private Double schoolHoursPerWeek;

  public static final String SERIALIZED_NAME_SERVED_OUTSIDE_OF_REGULAR_SESSION = "servedOutsideOfRegularSession";
  @SerializedName(SERIALIZED_NAME_SERVED_OUTSIDE_OF_REGULAR_SESSION)
  private Boolean servedOutsideOfRegularSession;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDERS = "serviceProviders";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDERS)
  private List<EdFiStudentSpecialEducationProgramAssociationServiceProvider> serviceProviders = null;

  public static final String SERIALIZED_NAME_SPECIAL_EDUCATION_HOURS_PER_WEEK = "specialEducationHoursPerWeek";
  @SerializedName(SERIALIZED_NAME_SPECIAL_EDUCATION_HOURS_PER_WEEK)
  private Double specialEducationHoursPerWeek;

  public static final String SERIALIZED_NAME_SPECIAL_EDUCATION_PROGRAM_SERVICES = "specialEducationProgramServices";
  @SerializedName(SERIALIZED_NAME_SPECIAL_EDUCATION_PROGRAM_SERVICES)
  private List<EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService> specialEducationProgramServices = null;

  public static final String SERIALIZED_NAME_SPECIAL_EDUCATION_SETTING_DESCRIPTOR = "specialEducationSettingDescriptor";
  @SerializedName(SERIALIZED_NAME_SPECIAL_EDUCATION_SETTING_DESCRIPTOR)
  private String specialEducationSettingDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStudentSpecialEducationProgramAssociation() { 
  }

  public EdFiStudentSpecialEducationProgramAssociation id(String id) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation beginDate(LocalDate beginDate) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation programReference(EdFiProgramReference programReference) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation studentReference(EdFiStudentReference studentReference) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation disabilities(List<EdFiStudentSpecialEducationProgramAssociationDisability> disabilities) {
    
    this.disabilities = disabilities;
    return this;
  }

  public EdFiStudentSpecialEducationProgramAssociation addDisabilitiesItem(EdFiStudentSpecialEducationProgramAssociationDisability disabilitiesItem) {
    if (this.disabilities == null) {
      this.disabilities = new ArrayList<EdFiStudentSpecialEducationProgramAssociationDisability>();
    }
    this.disabilities.add(disabilitiesItem);
    return this;
  }

   /**
   * An unordered collection of studentSpecialEducationProgramAssociationDisabilities. The disability condition(s) that best describes an individual&#39;s impairment, as related to special education services received.
   * @return disabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentSpecialEducationProgramAssociationDisabilities. The disability condition(s) that best describes an individual's impairment, as related to special education services received.")

  public List<EdFiStudentSpecialEducationProgramAssociationDisability> getDisabilities() {
    return disabilities;
  }


  public void setDisabilities(List<EdFiStudentSpecialEducationProgramAssociationDisability> disabilities) {
    this.disabilities = disabilities;
  }


  public EdFiStudentSpecialEducationProgramAssociation endDate(LocalDate endDate) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation ideaEligibility(Boolean ideaEligibility) {
    
    this.ideaEligibility = ideaEligibility;
    return this;
  }

   /**
   * Indicator of the eligibility of the student to receive special education services according to the Individuals with Disabilities Education Act (IDEA).
   * @return ideaEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of the eligibility of the student to receive special education services according to the Individuals with Disabilities Education Act (IDEA).")

  public Boolean getIdeaEligibility() {
    return ideaEligibility;
  }


  public void setIdeaEligibility(Boolean ideaEligibility) {
    this.ideaEligibility = ideaEligibility;
  }


  public EdFiStudentSpecialEducationProgramAssociation iepBeginDate(LocalDate iepBeginDate) {
    
    this.iepBeginDate = iepBeginDate;
    return this;
  }

   /**
   * The effective date of the most recent IEP.
   * @return iepBeginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The effective date of the most recent IEP.")

  public LocalDate getIepBeginDate() {
    return iepBeginDate;
  }


  public void setIepBeginDate(LocalDate iepBeginDate) {
    this.iepBeginDate = iepBeginDate;
  }


  public EdFiStudentSpecialEducationProgramAssociation iepEndDate(LocalDate iepEndDate) {
    
    this.iepEndDate = iepEndDate;
    return this;
  }

   /**
   * The end date of the most recent IEP.
   * @return iepEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of the most recent IEP.")

  public LocalDate getIepEndDate() {
    return iepEndDate;
  }


  public void setIepEndDate(LocalDate iepEndDate) {
    this.iepEndDate = iepEndDate;
  }


  public EdFiStudentSpecialEducationProgramAssociation iepReviewDate(LocalDate iepReviewDate) {
    
    this.iepReviewDate = iepReviewDate;
    return this;
  }

   /**
   * The date of the last IEP review.
   * @return iepReviewDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the last IEP review.")

  public LocalDate getIepReviewDate() {
    return iepReviewDate;
  }


  public void setIepReviewDate(LocalDate iepReviewDate) {
    this.iepReviewDate = iepReviewDate;
  }


  public EdFiStudentSpecialEducationProgramAssociation lastEvaluationDate(LocalDate lastEvaluationDate) {
    
    this.lastEvaluationDate = lastEvaluationDate;
    return this;
  }

   /**
   * The date of the last special education evaluation.
   * @return lastEvaluationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the last special education evaluation.")

  public LocalDate getLastEvaluationDate() {
    return lastEvaluationDate;
  }


  public void setLastEvaluationDate(LocalDate lastEvaluationDate) {
    this.lastEvaluationDate = lastEvaluationDate;
  }


  public EdFiStudentSpecialEducationProgramAssociation medicallyFragile(Boolean medicallyFragile) {
    
    this.medicallyFragile = medicallyFragile;
    return this;
  }

   /**
   * Indicates whether the Student receiving special education and related services is:         1) in the age range of birth to 22 years, and         2) has a serious, ongoing illness or a chronic condition that has lasted or is anticipated to last at least 12 or more months or has required at least one month of hospitalization, and that requires daily, ongoing medical treatments and monitoring by appropriately trained personnel which may include parents or other family members, and         3) requires the routine use of medical device or of assistive technology to compensate for the loss of usefulness of a body function needed to participate in activities of daily living, and         4) lives with ongoing threat to his or her continued well-being.         Aligns with federal requirements.
   * @return medicallyFragile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Student receiving special education and related services is:         1) in the age range of birth to 22 years, and         2) has a serious, ongoing illness or a chronic condition that has lasted or is anticipated to last at least 12 or more months or has required at least one month of hospitalization, and that requires daily, ongoing medical treatments and monitoring by appropriately trained personnel which may include parents or other family members, and         3) requires the routine use of medical device or of assistive technology to compensate for the loss of usefulness of a body function needed to participate in activities of daily living, and         4) lives with ongoing threat to his or her continued well-being.         Aligns with federal requirements.")

  public Boolean getMedicallyFragile() {
    return medicallyFragile;
  }


  public void setMedicallyFragile(Boolean medicallyFragile) {
    this.medicallyFragile = medicallyFragile;
  }


  public EdFiStudentSpecialEducationProgramAssociation multiplyDisabled(Boolean multiplyDisabled) {
    
    this.multiplyDisabled = multiplyDisabled;
    return this;
  }

   /**
   * Indicates whether the Student receiving special education and related services has been designated as multiply disabled by the admission, review, and dismissal committee as aligned with federal requirements.
   * @return multiplyDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the Student receiving special education and related services has been designated as multiply disabled by the admission, review, and dismissal committee as aligned with federal requirements.")

  public Boolean getMultiplyDisabled() {
    return multiplyDisabled;
  }


  public void setMultiplyDisabled(Boolean multiplyDisabled) {
    this.multiplyDisabled = multiplyDisabled;
  }


  public EdFiStudentSpecialEducationProgramAssociation participationStatus(EdFiGeneralStudentProgramAssociationParticipationStatus participationStatus) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation programParticipationStatuses(List<EdFiGeneralStudentProgramAssociationProgramParticipationStatus> programParticipationStatuses) {
    
    this.programParticipationStatuses = programParticipationStatuses;
    return this;
  }

  public EdFiStudentSpecialEducationProgramAssociation addProgramParticipationStatusesItem(EdFiGeneralStudentProgramAssociationProgramParticipationStatus programParticipationStatusesItem) {
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


  public EdFiStudentSpecialEducationProgramAssociation reasonExitedDescriptor(String reasonExitedDescriptor) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation schoolHoursPerWeek(Double schoolHoursPerWeek) {
    
    this.schoolHoursPerWeek = schoolHoursPerWeek;
    return this;
  }

   /**
   * Indicate the total number of hours of instructional time per week for the school that the student attends.
   * @return schoolHoursPerWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicate the total number of hours of instructional time per week for the school that the student attends.")

  public Double getSchoolHoursPerWeek() {
    return schoolHoursPerWeek;
  }


  public void setSchoolHoursPerWeek(Double schoolHoursPerWeek) {
    this.schoolHoursPerWeek = schoolHoursPerWeek;
  }


  public EdFiStudentSpecialEducationProgramAssociation servedOutsideOfRegularSession(Boolean servedOutsideOfRegularSession) {
    
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


  public EdFiStudentSpecialEducationProgramAssociation serviceProviders(List<EdFiStudentSpecialEducationProgramAssociationServiceProvider> serviceProviders) {
    
    this.serviceProviders = serviceProviders;
    return this;
  }

  public EdFiStudentSpecialEducationProgramAssociation addServiceProvidersItem(EdFiStudentSpecialEducationProgramAssociationServiceProvider serviceProvidersItem) {
    if (this.serviceProviders == null) {
      this.serviceProviders = new ArrayList<EdFiStudentSpecialEducationProgramAssociationServiceProvider>();
    }
    this.serviceProviders.add(serviceProvidersItem);
    return this;
  }

   /**
   * An unordered collection of studentSpecialEducationProgramAssociationServiceProviders. The Staff providing special education services to the Student.
   * @return serviceProviders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentSpecialEducationProgramAssociationServiceProviders. The Staff providing special education services to the Student.")

  public List<EdFiStudentSpecialEducationProgramAssociationServiceProvider> getServiceProviders() {
    return serviceProviders;
  }


  public void setServiceProviders(List<EdFiStudentSpecialEducationProgramAssociationServiceProvider> serviceProviders) {
    this.serviceProviders = serviceProviders;
  }


  public EdFiStudentSpecialEducationProgramAssociation specialEducationHoursPerWeek(Double specialEducationHoursPerWeek) {
    
    this.specialEducationHoursPerWeek = specialEducationHoursPerWeek;
    return this;
  }

   /**
   * The number of hours per week for special education instruction and therapy.
   * @return specialEducationHoursPerWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of hours per week for special education instruction and therapy.")

  public Double getSpecialEducationHoursPerWeek() {
    return specialEducationHoursPerWeek;
  }


  public void setSpecialEducationHoursPerWeek(Double specialEducationHoursPerWeek) {
    this.specialEducationHoursPerWeek = specialEducationHoursPerWeek;
  }


  public EdFiStudentSpecialEducationProgramAssociation specialEducationProgramServices(List<EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService> specialEducationProgramServices) {
    
    this.specialEducationProgramServices = specialEducationProgramServices;
    return this;
  }

  public EdFiStudentSpecialEducationProgramAssociation addSpecialEducationProgramServicesItem(EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService specialEducationProgramServicesItem) {
    if (this.specialEducationProgramServices == null) {
      this.specialEducationProgramServices = new ArrayList<EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService>();
    }
    this.specialEducationProgramServices.add(specialEducationProgramServicesItem);
    return this;
  }

   /**
   * An unordered collection of studentSpecialEducationProgramAssociationSpecialEducationProgramServices. Indicates the Service(s) being provided to the Student by the Special Education Program.
   * @return specialEducationProgramServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentSpecialEducationProgramAssociationSpecialEducationProgramServices. Indicates the Service(s) being provided to the Student by the Special Education Program.")

  public List<EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService> getSpecialEducationProgramServices() {
    return specialEducationProgramServices;
  }


  public void setSpecialEducationProgramServices(List<EdFiStudentSpecialEducationProgramAssociationSpecialEducationProgramService> specialEducationProgramServices) {
    this.specialEducationProgramServices = specialEducationProgramServices;
  }


  public EdFiStudentSpecialEducationProgramAssociation specialEducationSettingDescriptor(String specialEducationSettingDescriptor) {
    
    this.specialEducationSettingDescriptor = specialEducationSettingDescriptor;
    return this;
  }

   /**
   * The major instructional setting (more than 50 percent of a student&#39;s special education program).
   * @return specialEducationSettingDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The major instructional setting (more than 50 percent of a student's special education program).")

  public String getSpecialEducationSettingDescriptor() {
    return specialEducationSettingDescriptor;
  }


  public void setSpecialEducationSettingDescriptor(String specialEducationSettingDescriptor) {
    this.specialEducationSettingDescriptor = specialEducationSettingDescriptor;
  }


  public EdFiStudentSpecialEducationProgramAssociation etag(String etag) {
    
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
    EdFiStudentSpecialEducationProgramAssociation edFiStudentSpecialEducationProgramAssociation = (EdFiStudentSpecialEducationProgramAssociation) o;
    return Objects.equals(this.id, edFiStudentSpecialEducationProgramAssociation.id) &&
        Objects.equals(this.beginDate, edFiStudentSpecialEducationProgramAssociation.beginDate) &&
        Objects.equals(this.educationOrganizationReference, edFiStudentSpecialEducationProgramAssociation.educationOrganizationReference) &&
        Objects.equals(this.programReference, edFiStudentSpecialEducationProgramAssociation.programReference) &&
        Objects.equals(this.studentReference, edFiStudentSpecialEducationProgramAssociation.studentReference) &&
        Objects.equals(this.disabilities, edFiStudentSpecialEducationProgramAssociation.disabilities) &&
        Objects.equals(this.endDate, edFiStudentSpecialEducationProgramAssociation.endDate) &&
        Objects.equals(this.ideaEligibility, edFiStudentSpecialEducationProgramAssociation.ideaEligibility) &&
        Objects.equals(this.iepBeginDate, edFiStudentSpecialEducationProgramAssociation.iepBeginDate) &&
        Objects.equals(this.iepEndDate, edFiStudentSpecialEducationProgramAssociation.iepEndDate) &&
        Objects.equals(this.iepReviewDate, edFiStudentSpecialEducationProgramAssociation.iepReviewDate) &&
        Objects.equals(this.lastEvaluationDate, edFiStudentSpecialEducationProgramAssociation.lastEvaluationDate) &&
        Objects.equals(this.medicallyFragile, edFiStudentSpecialEducationProgramAssociation.medicallyFragile) &&
        Objects.equals(this.multiplyDisabled, edFiStudentSpecialEducationProgramAssociation.multiplyDisabled) &&
        Objects.equals(this.participationStatus, edFiStudentSpecialEducationProgramAssociation.participationStatus) &&
        Objects.equals(this.programParticipationStatuses, edFiStudentSpecialEducationProgramAssociation.programParticipationStatuses) &&
        Objects.equals(this.reasonExitedDescriptor, edFiStudentSpecialEducationProgramAssociation.reasonExitedDescriptor) &&
        Objects.equals(this.schoolHoursPerWeek, edFiStudentSpecialEducationProgramAssociation.schoolHoursPerWeek) &&
        Objects.equals(this.servedOutsideOfRegularSession, edFiStudentSpecialEducationProgramAssociation.servedOutsideOfRegularSession) &&
        Objects.equals(this.serviceProviders, edFiStudentSpecialEducationProgramAssociation.serviceProviders) &&
        Objects.equals(this.specialEducationHoursPerWeek, edFiStudentSpecialEducationProgramAssociation.specialEducationHoursPerWeek) &&
        Objects.equals(this.specialEducationProgramServices, edFiStudentSpecialEducationProgramAssociation.specialEducationProgramServices) &&
        Objects.equals(this.specialEducationSettingDescriptor, edFiStudentSpecialEducationProgramAssociation.specialEducationSettingDescriptor) &&
        Objects.equals(this.etag, edFiStudentSpecialEducationProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, educationOrganizationReference, programReference, studentReference, disabilities, endDate, ideaEligibility, iepBeginDate, iepEndDate, iepReviewDate, lastEvaluationDate, medicallyFragile, multiplyDisabled, participationStatus, programParticipationStatuses, reasonExitedDescriptor, schoolHoursPerWeek, servedOutsideOfRegularSession, serviceProviders, specialEducationHoursPerWeek, specialEducationProgramServices, specialEducationSettingDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentSpecialEducationProgramAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    programReference: ").append(toIndentedString(programReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    disabilities: ").append(toIndentedString(disabilities)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    ideaEligibility: ").append(toIndentedString(ideaEligibility)).append("\n");
    sb.append("    iepBeginDate: ").append(toIndentedString(iepBeginDate)).append("\n");
    sb.append("    iepEndDate: ").append(toIndentedString(iepEndDate)).append("\n");
    sb.append("    iepReviewDate: ").append(toIndentedString(iepReviewDate)).append("\n");
    sb.append("    lastEvaluationDate: ").append(toIndentedString(lastEvaluationDate)).append("\n");
    sb.append("    medicallyFragile: ").append(toIndentedString(medicallyFragile)).append("\n");
    sb.append("    multiplyDisabled: ").append(toIndentedString(multiplyDisabled)).append("\n");
    sb.append("    participationStatus: ").append(toIndentedString(participationStatus)).append("\n");
    sb.append("    programParticipationStatuses: ").append(toIndentedString(programParticipationStatuses)).append("\n");
    sb.append("    reasonExitedDescriptor: ").append(toIndentedString(reasonExitedDescriptor)).append("\n");
    sb.append("    schoolHoursPerWeek: ").append(toIndentedString(schoolHoursPerWeek)).append("\n");
    sb.append("    servedOutsideOfRegularSession: ").append(toIndentedString(servedOutsideOfRegularSession)).append("\n");
    sb.append("    serviceProviders: ").append(toIndentedString(serviceProviders)).append("\n");
    sb.append("    specialEducationHoursPerWeek: ").append(toIndentedString(specialEducationHoursPerWeek)).append("\n");
    sb.append("    specialEducationProgramServices: ").append(toIndentedString(specialEducationProgramServices)).append("\n");
    sb.append("    specialEducationSettingDescriptor: ").append(toIndentedString(specialEducationSettingDescriptor)).append("\n");
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

