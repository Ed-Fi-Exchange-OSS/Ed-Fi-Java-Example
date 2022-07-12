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
import Models.Resources.EdFiInterventionAppropriateGradeLevel;
import Models.Resources.EdFiInterventionAppropriateSex;
import Models.Resources.EdFiInterventionDiagnosis;
import Models.Resources.EdFiInterventionEducationContent;
import Models.Resources.EdFiInterventionInterventionPrescription;
import Models.Resources.EdFiInterventionLearningResourceMetadataURI;
import Models.Resources.EdFiInterventionMeetingTime;
import Models.Resources.EdFiInterventionPopulationServed;
import Models.Resources.EdFiInterventionStaff;
import Models.Resources.EdFiInterventionURI;
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
 * EdFiIntervention
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiIntervention {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERVENTION_IDENTIFICATION_CODE = "interventionIdentificationCode";
  @SerializedName(SERIALIZED_NAME_INTERVENTION_IDENTIFICATION_CODE)
  private String interventionIdentificationCode;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE = "educationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference educationOrganizationReference;

  public static final String SERIALIZED_NAME_APPROPRIATE_GRADE_LEVELS = "appropriateGradeLevels";
  @SerializedName(SERIALIZED_NAME_APPROPRIATE_GRADE_LEVELS)
  private List<EdFiInterventionAppropriateGradeLevel> appropriateGradeLevels = null;

  public static final String SERIALIZED_NAME_APPROPRIATE_SEXES = "appropriateSexes";
  @SerializedName(SERIALIZED_NAME_APPROPRIATE_SEXES)
  private List<EdFiInterventionAppropriateSex> appropriateSexes = null;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_DELIVERY_METHOD_DESCRIPTOR = "deliveryMethodDescriptor";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHOD_DESCRIPTOR)
  private String deliveryMethodDescriptor;

  public static final String SERIALIZED_NAME_DIAGNOSES = "diagnoses";
  @SerializedName(SERIALIZED_NAME_DIAGNOSES)
  private List<EdFiInterventionDiagnosis> diagnoses = null;

  public static final String SERIALIZED_NAME_EDUCATION_CONTENTS = "educationContents";
  @SerializedName(SERIALIZED_NAME_EDUCATION_CONTENTS)
  private List<EdFiInterventionEducationContent> educationContents = null;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_INTERVENTION_CLASS_DESCRIPTOR = "interventionClassDescriptor";
  @SerializedName(SERIALIZED_NAME_INTERVENTION_CLASS_DESCRIPTOR)
  private String interventionClassDescriptor;

  public static final String SERIALIZED_NAME_INTERVENTION_PRESCRIPTIONS = "interventionPrescriptions";
  @SerializedName(SERIALIZED_NAME_INTERVENTION_PRESCRIPTIONS)
  private List<EdFiInterventionInterventionPrescription> interventionPrescriptions = null;

  public static final String SERIALIZED_NAME_LEARNING_RESOURCE_METADATA_U_R_IS = "learningResourceMetadataURIs";
  @SerializedName(SERIALIZED_NAME_LEARNING_RESOURCE_METADATA_U_R_IS)
  private List<EdFiInterventionLearningResourceMetadataURI> learningResourceMetadataURIs = null;

  public static final String SERIALIZED_NAME_MAX_DOSAGE = "maxDosage";
  @SerializedName(SERIALIZED_NAME_MAX_DOSAGE)
  private Integer maxDosage;

  public static final String SERIALIZED_NAME_MEETING_TIMES = "meetingTimes";
  @SerializedName(SERIALIZED_NAME_MEETING_TIMES)
  private List<EdFiInterventionMeetingTime> meetingTimes = null;

  public static final String SERIALIZED_NAME_MIN_DOSAGE = "minDosage";
  @SerializedName(SERIALIZED_NAME_MIN_DOSAGE)
  private Integer minDosage;

  public static final String SERIALIZED_NAME_POPULATION_SERVEDS = "populationServeds";
  @SerializedName(SERIALIZED_NAME_POPULATION_SERVEDS)
  private List<EdFiInterventionPopulationServed> populationServeds = null;

  public static final String SERIALIZED_NAME_STAFFS = "staffs";
  @SerializedName(SERIALIZED_NAME_STAFFS)
  private List<EdFiInterventionStaff> staffs = null;

  public static final String SERIALIZED_NAME_URIS = "uris";
  @SerializedName(SERIALIZED_NAME_URIS)
  private List<EdFiInterventionURI> uris = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiIntervention() { 
  }

  public EdFiIntervention id(String id) {
    
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


  public EdFiIntervention interventionIdentificationCode(String interventionIdentificationCode) {
    
    this.interventionIdentificationCode = interventionIdentificationCode;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to an intervention.
   * @return interventionIdentificationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique number or alphanumeric code assigned to an intervention.")

  public String getInterventionIdentificationCode() {
    return interventionIdentificationCode;
  }


  public void setInterventionIdentificationCode(String interventionIdentificationCode) {
    this.interventionIdentificationCode = interventionIdentificationCode;
  }


  public EdFiIntervention educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
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


  public EdFiIntervention appropriateGradeLevels(List<EdFiInterventionAppropriateGradeLevel> appropriateGradeLevels) {
    
    this.appropriateGradeLevels = appropriateGradeLevels;
    return this;
  }

  public EdFiIntervention addAppropriateGradeLevelsItem(EdFiInterventionAppropriateGradeLevel appropriateGradeLevelsItem) {
    if (this.appropriateGradeLevels == null) {
      this.appropriateGradeLevels = new ArrayList<EdFiInterventionAppropriateGradeLevel>();
    }
    this.appropriateGradeLevels.add(appropriateGradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of interventionAppropriateGradeLevels. Grade levels for the Intervention-if omitted, considered generally applicable.
   * @return appropriateGradeLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionAppropriateGradeLevels. Grade levels for the Intervention-if omitted, considered generally applicable.")

  public List<EdFiInterventionAppropriateGradeLevel> getAppropriateGradeLevels() {
    return appropriateGradeLevels;
  }


  public void setAppropriateGradeLevels(List<EdFiInterventionAppropriateGradeLevel> appropriateGradeLevels) {
    this.appropriateGradeLevels = appropriateGradeLevels;
  }


  public EdFiIntervention appropriateSexes(List<EdFiInterventionAppropriateSex> appropriateSexes) {
    
    this.appropriateSexes = appropriateSexes;
    return this;
  }

  public EdFiIntervention addAppropriateSexesItem(EdFiInterventionAppropriateSex appropriateSexesItem) {
    if (this.appropriateSexes == null) {
      this.appropriateSexes = new ArrayList<EdFiInterventionAppropriateSex>();
    }
    this.appropriateSexes.add(appropriateSexesItem);
    return this;
  }

   /**
   * An unordered collection of interventionAppropriateSexes. Sexes for the Intervention. If omitted, considered generally applicable.
   * @return appropriateSexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionAppropriateSexes. Sexes for the Intervention. If omitted, considered generally applicable.")

  public List<EdFiInterventionAppropriateSex> getAppropriateSexes() {
    return appropriateSexes;
  }


  public void setAppropriateSexes(List<EdFiInterventionAppropriateSex> appropriateSexes) {
    this.appropriateSexes = appropriateSexes;
  }


  public EdFiIntervention beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The start date for the intervention implementation.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start date for the intervention implementation.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiIntervention deliveryMethodDescriptor(String deliveryMethodDescriptor) {
    
    this.deliveryMethodDescriptor = deliveryMethodDescriptor;
    return this;
  }

   /**
   * The way in which an intervention was implemented: individual, small group, whole class, or whole school.
   * @return deliveryMethodDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The way in which an intervention was implemented: individual, small group, whole class, or whole school.")

  public String getDeliveryMethodDescriptor() {
    return deliveryMethodDescriptor;
  }


  public void setDeliveryMethodDescriptor(String deliveryMethodDescriptor) {
    this.deliveryMethodDescriptor = deliveryMethodDescriptor;
  }


  public EdFiIntervention diagnoses(List<EdFiInterventionDiagnosis> diagnoses) {
    
    this.diagnoses = diagnoses;
    return this;
  }

  public EdFiIntervention addDiagnosesItem(EdFiInterventionDiagnosis diagnosesItem) {
    if (this.diagnoses == null) {
      this.diagnoses = new ArrayList<EdFiInterventionDiagnosis>();
    }
    this.diagnoses.add(diagnosesItem);
    return this;
  }

   /**
   * An unordered collection of interventionDiagnoses. Targeted purpose of the Intervention (e.g., attendance issue, dropout risk).
   * @return diagnoses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionDiagnoses. Targeted purpose of the Intervention (e.g., attendance issue, dropout risk).")

  public List<EdFiInterventionDiagnosis> getDiagnoses() {
    return diagnoses;
  }


  public void setDiagnoses(List<EdFiInterventionDiagnosis> diagnoses) {
    this.diagnoses = diagnoses;
  }


  public EdFiIntervention educationContents(List<EdFiInterventionEducationContent> educationContents) {
    
    this.educationContents = educationContents;
    return this;
  }

  public EdFiIntervention addEducationContentsItem(EdFiInterventionEducationContent educationContentsItem) {
    if (this.educationContents == null) {
      this.educationContents = new ArrayList<EdFiInterventionEducationContent>();
    }
    this.educationContents.add(educationContentsItem);
    return this;
  }

   /**
   * An unordered collection of interventionEducationContents. Relates the education content source to the education content.
   * @return educationContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionEducationContents. Relates the education content source to the education content.")

  public List<EdFiInterventionEducationContent> getEducationContents() {
    return educationContents;
  }


  public void setEducationContents(List<EdFiInterventionEducationContent> educationContents) {
    this.educationContents = educationContents;
  }


  public EdFiIntervention endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the intervention implementation.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date for the intervention implementation.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiIntervention interventionClassDescriptor(String interventionClassDescriptor) {
    
    this.interventionClassDescriptor = interventionClassDescriptor;
    return this;
  }

   /**
   * The way in which an intervention is used: curriculum, supplement, or practice.
   * @return interventionClassDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The way in which an intervention is used: curriculum, supplement, or practice.")

  public String getInterventionClassDescriptor() {
    return interventionClassDescriptor;
  }


  public void setInterventionClassDescriptor(String interventionClassDescriptor) {
    this.interventionClassDescriptor = interventionClassDescriptor;
  }


  public EdFiIntervention interventionPrescriptions(List<EdFiInterventionInterventionPrescription> interventionPrescriptions) {
    
    this.interventionPrescriptions = interventionPrescriptions;
    return this;
  }

  public EdFiIntervention addInterventionPrescriptionsItem(EdFiInterventionInterventionPrescription interventionPrescriptionsItem) {
    if (this.interventionPrescriptions == null) {
      this.interventionPrescriptions = new ArrayList<EdFiInterventionInterventionPrescription>();
    }
    this.interventionPrescriptions.add(interventionPrescriptionsItem);
    return this;
  }

   /**
   * An unordered collection of interventionInterventionPrescriptions. The reference to the intervention prescription being followed in this intervention implementation.
   * @return interventionPrescriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionInterventionPrescriptions. The reference to the intervention prescription being followed in this intervention implementation.")

  public List<EdFiInterventionInterventionPrescription> getInterventionPrescriptions() {
    return interventionPrescriptions;
  }


  public void setInterventionPrescriptions(List<EdFiInterventionInterventionPrescription> interventionPrescriptions) {
    this.interventionPrescriptions = interventionPrescriptions;
  }


  public EdFiIntervention learningResourceMetadataURIs(List<EdFiInterventionLearningResourceMetadataURI> learningResourceMetadataURIs) {
    
    this.learningResourceMetadataURIs = learningResourceMetadataURIs;
    return this;
  }

  public EdFiIntervention addLearningResourceMetadataURIsItem(EdFiInterventionLearningResourceMetadataURI learningResourceMetadataURIsItem) {
    if (this.learningResourceMetadataURIs == null) {
      this.learningResourceMetadataURIs = new ArrayList<EdFiInterventionLearningResourceMetadataURI>();
    }
    this.learningResourceMetadataURIs.add(learningResourceMetadataURIsItem);
    return this;
  }

   /**
   * An unordered collection of interventionLearningResourceMetadataURIs. The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.
   * @return learningResourceMetadataURIs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionLearningResourceMetadataURIs. The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.")

  public List<EdFiInterventionLearningResourceMetadataURI> getLearningResourceMetadataURIs() {
    return learningResourceMetadataURIs;
  }


  public void setLearningResourceMetadataURIs(List<EdFiInterventionLearningResourceMetadataURI> learningResourceMetadataURIs) {
    this.learningResourceMetadataURIs = learningResourceMetadataURIs;
  }


  public EdFiIntervention maxDosage(Integer maxDosage) {
    
    this.maxDosage = maxDosage;
    return this;
  }

   /**
   * The maximum duration of time in minutes that may be assigned for the intervention.
   * @return maxDosage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum duration of time in minutes that may be assigned for the intervention.")

  public Integer getMaxDosage() {
    return maxDosage;
  }


  public void setMaxDosage(Integer maxDosage) {
    this.maxDosage = maxDosage;
  }


  public EdFiIntervention meetingTimes(List<EdFiInterventionMeetingTime> meetingTimes) {
    
    this.meetingTimes = meetingTimes;
    return this;
  }

  public EdFiIntervention addMeetingTimesItem(EdFiInterventionMeetingTime meetingTimesItem) {
    if (this.meetingTimes == null) {
      this.meetingTimes = new ArrayList<EdFiInterventionMeetingTime>();
    }
    this.meetingTimes.add(meetingTimesItem);
    return this;
  }

   /**
   * An unordered collection of interventionMeetingTimes. The times at which this intervention is scheduled to meet.
   * @return meetingTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionMeetingTimes. The times at which this intervention is scheduled to meet.")

  public List<EdFiInterventionMeetingTime> getMeetingTimes() {
    return meetingTimes;
  }


  public void setMeetingTimes(List<EdFiInterventionMeetingTime> meetingTimes) {
    this.meetingTimes = meetingTimes;
  }


  public EdFiIntervention minDosage(Integer minDosage) {
    
    this.minDosage = minDosage;
    return this;
  }

   /**
   * The minimum duration of time in minutes that may be assigned for the intervention.
   * @return minDosage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum duration of time in minutes that may be assigned for the intervention.")

  public Integer getMinDosage() {
    return minDosage;
  }


  public void setMinDosage(Integer minDosage) {
    this.minDosage = minDosage;
  }


  public EdFiIntervention populationServeds(List<EdFiInterventionPopulationServed> populationServeds) {
    
    this.populationServeds = populationServeds;
    return this;
  }

  public EdFiIntervention addPopulationServedsItem(EdFiInterventionPopulationServed populationServedsItem) {
    if (this.populationServeds == null) {
      this.populationServeds = new ArrayList<EdFiInterventionPopulationServed>();
    }
    this.populationServeds.add(populationServedsItem);
    return this;
  }

   /**
   * An unordered collection of interventionPopulationServeds. A subset of students that are the focus of the Intervention.
   * @return populationServeds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionPopulationServeds. A subset of students that are the focus of the Intervention.")

  public List<EdFiInterventionPopulationServed> getPopulationServeds() {
    return populationServeds;
  }


  public void setPopulationServeds(List<EdFiInterventionPopulationServed> populationServeds) {
    this.populationServeds = populationServeds;
  }


  public EdFiIntervention staffs(List<EdFiInterventionStaff> staffs) {
    
    this.staffs = staffs;
    return this;
  }

  public EdFiIntervention addStaffsItem(EdFiInterventionStaff staffsItem) {
    if (this.staffs == null) {
      this.staffs = new ArrayList<EdFiInterventionStaff>();
    }
    this.staffs.add(staffsItem);
    return this;
  }

   /**
   * An unordered collection of interventionStaffs. Relates the staff member associated with the Intervention.
   * @return staffs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionStaffs. Relates the staff member associated with the Intervention.")

  public List<EdFiInterventionStaff> getStaffs() {
    return staffs;
  }


  public void setStaffs(List<EdFiInterventionStaff> staffs) {
    this.staffs = staffs;
  }


  public EdFiIntervention uris(List<EdFiInterventionURI> uris) {
    
    this.uris = uris;
    return this;
  }

  public EdFiIntervention addUrisItem(EdFiInterventionURI urisItem) {
    if (this.uris == null) {
      this.uris = new ArrayList<EdFiInterventionURI>();
    }
    this.uris.add(urisItem);
    return this;
  }

   /**
   * An unordered collection of interventionURIs. The URI (typical a URL) pointing to an education content item.
   * @return uris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of interventionURIs. The URI (typical a URL) pointing to an education content item.")

  public List<EdFiInterventionURI> getUris() {
    return uris;
  }


  public void setUris(List<EdFiInterventionURI> uris) {
    this.uris = uris;
  }


  public EdFiIntervention etag(String etag) {
    
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
    EdFiIntervention edFiIntervention = (EdFiIntervention) o;
    return Objects.equals(this.id, edFiIntervention.id) &&
        Objects.equals(this.interventionIdentificationCode, edFiIntervention.interventionIdentificationCode) &&
        Objects.equals(this.educationOrganizationReference, edFiIntervention.educationOrganizationReference) &&
        Objects.equals(this.appropriateGradeLevels, edFiIntervention.appropriateGradeLevels) &&
        Objects.equals(this.appropriateSexes, edFiIntervention.appropriateSexes) &&
        Objects.equals(this.beginDate, edFiIntervention.beginDate) &&
        Objects.equals(this.deliveryMethodDescriptor, edFiIntervention.deliveryMethodDescriptor) &&
        Objects.equals(this.diagnoses, edFiIntervention.diagnoses) &&
        Objects.equals(this.educationContents, edFiIntervention.educationContents) &&
        Objects.equals(this.endDate, edFiIntervention.endDate) &&
        Objects.equals(this.interventionClassDescriptor, edFiIntervention.interventionClassDescriptor) &&
        Objects.equals(this.interventionPrescriptions, edFiIntervention.interventionPrescriptions) &&
        Objects.equals(this.learningResourceMetadataURIs, edFiIntervention.learningResourceMetadataURIs) &&
        Objects.equals(this.maxDosage, edFiIntervention.maxDosage) &&
        Objects.equals(this.meetingTimes, edFiIntervention.meetingTimes) &&
        Objects.equals(this.minDosage, edFiIntervention.minDosage) &&
        Objects.equals(this.populationServeds, edFiIntervention.populationServeds) &&
        Objects.equals(this.staffs, edFiIntervention.staffs) &&
        Objects.equals(this.uris, edFiIntervention.uris) &&
        Objects.equals(this.etag, edFiIntervention.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, interventionIdentificationCode, educationOrganizationReference, appropriateGradeLevels, appropriateSexes, beginDate, deliveryMethodDescriptor, diagnoses, educationContents, endDate, interventionClassDescriptor, interventionPrescriptions, learningResourceMetadataURIs, maxDosage, meetingTimes, minDosage, populationServeds, staffs, uris, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiIntervention {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interventionIdentificationCode: ").append(toIndentedString(interventionIdentificationCode)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    appropriateGradeLevels: ").append(toIndentedString(appropriateGradeLevels)).append("\n");
    sb.append("    appropriateSexes: ").append(toIndentedString(appropriateSexes)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    deliveryMethodDescriptor: ").append(toIndentedString(deliveryMethodDescriptor)).append("\n");
    sb.append("    diagnoses: ").append(toIndentedString(diagnoses)).append("\n");
    sb.append("    educationContents: ").append(toIndentedString(educationContents)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    interventionClassDescriptor: ").append(toIndentedString(interventionClassDescriptor)).append("\n");
    sb.append("    interventionPrescriptions: ").append(toIndentedString(interventionPrescriptions)).append("\n");
    sb.append("    learningResourceMetadataURIs: ").append(toIndentedString(learningResourceMetadataURIs)).append("\n");
    sb.append("    maxDosage: ").append(toIndentedString(maxDosage)).append("\n");
    sb.append("    meetingTimes: ").append(toIndentedString(meetingTimes)).append("\n");
    sb.append("    minDosage: ").append(toIndentedString(minDosage)).append("\n");
    sb.append("    populationServeds: ").append(toIndentedString(populationServeds)).append("\n");
    sb.append("    staffs: ").append(toIndentedString(staffs)).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
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
