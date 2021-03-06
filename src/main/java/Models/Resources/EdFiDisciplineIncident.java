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
import Models.Resources.EdFiDisciplineIncidentBehavior;
import Models.Resources.EdFiDisciplineIncidentExternalParticipant;
import Models.Resources.EdFiDisciplineIncidentWeapon;
import Models.Resources.EdFiSchoolReference;
import Models.Resources.EdFiStaffReference;
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
 * EdFiDisciplineIncident
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiDisciplineIncident {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INCIDENT_IDENTIFIER = "incidentIdentifier";
  @SerializedName(SERIALIZED_NAME_INCIDENT_IDENTIFIER)
  private String incidentIdentifier;

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

  public static final String SERIALIZED_NAME_STAFF_REFERENCE = "staffReference";
  @SerializedName(SERIALIZED_NAME_STAFF_REFERENCE)
  private EdFiStaffReference staffReference;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<EdFiDisciplineIncidentBehavior> behaviors = null;

  public static final String SERIALIZED_NAME_CASE_NUMBER = "caseNumber";
  @SerializedName(SERIALIZED_NAME_CASE_NUMBER)
  private String caseNumber;

  public static final String SERIALIZED_NAME_EXTERNAL_PARTICIPANTS = "externalParticipants";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_PARTICIPANTS)
  private List<EdFiDisciplineIncidentExternalParticipant> externalParticipants = null;

  public static final String SERIALIZED_NAME_INCIDENT_COST = "incidentCost";
  @SerializedName(SERIALIZED_NAME_INCIDENT_COST)
  private Double incidentCost;

  public static final String SERIALIZED_NAME_INCIDENT_DATE = "incidentDate";
  @SerializedName(SERIALIZED_NAME_INCIDENT_DATE)
  private LocalDate incidentDate;

  public static final String SERIALIZED_NAME_INCIDENT_DESCRIPTION = "incidentDescription";
  @SerializedName(SERIALIZED_NAME_INCIDENT_DESCRIPTION)
  private String incidentDescription;

  public static final String SERIALIZED_NAME_INCIDENT_LOCATION_DESCRIPTOR = "incidentLocationDescriptor";
  @SerializedName(SERIALIZED_NAME_INCIDENT_LOCATION_DESCRIPTOR)
  private String incidentLocationDescriptor;

  public static final String SERIALIZED_NAME_INCIDENT_TIME = "incidentTime";
  @SerializedName(SERIALIZED_NAME_INCIDENT_TIME)
  private String incidentTime;

  public static final String SERIALIZED_NAME_REPORTED_TO_LAW_ENFORCEMENT = "reportedToLawEnforcement";
  @SerializedName(SERIALIZED_NAME_REPORTED_TO_LAW_ENFORCEMENT)
  private Boolean reportedToLawEnforcement;

  public static final String SERIALIZED_NAME_REPORTER_DESCRIPTION_DESCRIPTOR = "reporterDescriptionDescriptor";
  @SerializedName(SERIALIZED_NAME_REPORTER_DESCRIPTION_DESCRIPTOR)
  private String reporterDescriptionDescriptor;

  public static final String SERIALIZED_NAME_REPORTER_NAME = "reporterName";
  @SerializedName(SERIALIZED_NAME_REPORTER_NAME)
  private String reporterName;

  public static final String SERIALIZED_NAME_WEAPONS = "weapons";
  @SerializedName(SERIALIZED_NAME_WEAPONS)
  private List<EdFiDisciplineIncidentWeapon> weapons = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiDisciplineIncident() { 
  }

  public EdFiDisciplineIncident id(String id) {
    
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


  public EdFiDisciplineIncident incidentIdentifier(String incidentIdentifier) {
    
    this.incidentIdentifier = incidentIdentifier;
    return this;
  }

   /**
   * A locally assigned unique identifier (within the school or school district) to identify each specific DisciplineIncident or occurrence. The same identifier should be used to document the entire DisciplineIncident even if it included multiple offenses and multiple offenders.
   * @return incidentIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A locally assigned unique identifier (within the school or school district) to identify each specific DisciplineIncident or occurrence. The same identifier should be used to document the entire DisciplineIncident even if it included multiple offenses and multiple offenders.")

  public String getIncidentIdentifier() {
    return incidentIdentifier;
  }


  public void setIncidentIdentifier(String incidentIdentifier) {
    this.incidentIdentifier = incidentIdentifier;
  }


  public EdFiDisciplineIncident schoolReference(EdFiSchoolReference schoolReference) {
    
    this.schoolReference = schoolReference;
    return this;
  }

   /**
   * Get schoolReference
   * @return schoolReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSchoolReference getSchoolReference() {
    return schoolReference;
  }


  public void setSchoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
  }


  public EdFiDisciplineIncident staffReference(EdFiStaffReference staffReference) {
    
    this.staffReference = staffReference;
    return this;
  }

   /**
   * Get staffReference
   * @return staffReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiStaffReference getStaffReference() {
    return staffReference;
  }


  public void setStaffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
  }


  public EdFiDisciplineIncident behaviors(List<EdFiDisciplineIncidentBehavior> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public EdFiDisciplineIncident addBehaviorsItem(EdFiDisciplineIncidentBehavior behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<EdFiDisciplineIncidentBehavior>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * An unordered collection of disciplineIncidentBehaviors. Describes behavior by category and provides a detailed description.
   * @return behaviors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of disciplineIncidentBehaviors. Describes behavior by category and provides a detailed description.")

  public List<EdFiDisciplineIncidentBehavior> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<EdFiDisciplineIncidentBehavior> behaviors) {
    this.behaviors = behaviors;
  }


  public EdFiDisciplineIncident caseNumber(String caseNumber) {
    
    this.caseNumber = caseNumber;
    return this;
  }

   /**
   * The case number assigned to the DisciplineIncident by law enforcement or other organization.
   * @return caseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The case number assigned to the DisciplineIncident by law enforcement or other organization.")

  public String getCaseNumber() {
    return caseNumber;
  }


  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }


  public EdFiDisciplineIncident externalParticipants(List<EdFiDisciplineIncidentExternalParticipant> externalParticipants) {
    
    this.externalParticipants = externalParticipants;
    return this;
  }

  public EdFiDisciplineIncident addExternalParticipantsItem(EdFiDisciplineIncidentExternalParticipant externalParticipantsItem) {
    if (this.externalParticipants == null) {
      this.externalParticipants = new ArrayList<EdFiDisciplineIncidentExternalParticipant>();
    }
    this.externalParticipants.add(externalParticipantsItem);
    return this;
  }

   /**
   * An unordered collection of disciplineIncidentExternalParticipants. Information on an individual involved in the Discipline Incident.
   * @return externalParticipants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of disciplineIncidentExternalParticipants. Information on an individual involved in the Discipline Incident.")

  public List<EdFiDisciplineIncidentExternalParticipant> getExternalParticipants() {
    return externalParticipants;
  }


  public void setExternalParticipants(List<EdFiDisciplineIncidentExternalParticipant> externalParticipants) {
    this.externalParticipants = externalParticipants;
  }


  public EdFiDisciplineIncident incidentCost(Double incidentCost) {
    
    this.incidentCost = incidentCost;
    return this;
  }

   /**
   * The value of any quantifiable monetary loss directly resulting from the DisciplineIncident. Examples include the value of repairs necessitated by vandalism of a school facility, or the value of personnel resources used for repairs or consumed by the incident.
   * @return incidentCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of any quantifiable monetary loss directly resulting from the DisciplineIncident. Examples include the value of repairs necessitated by vandalism of a school facility, or the value of personnel resources used for repairs or consumed by the incident.")

  public Double getIncidentCost() {
    return incidentCost;
  }


  public void setIncidentCost(Double incidentCost) {
    this.incidentCost = incidentCost;
  }


  public EdFiDisciplineIncident incidentDate(LocalDate incidentDate) {
    
    this.incidentDate = incidentDate;
    return this;
  }

   /**
   * The month, day, and year on which the DisciplineIncident occurred.
   * @return incidentDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year on which the DisciplineIncident occurred.")

  public LocalDate getIncidentDate() {
    return incidentDate;
  }


  public void setIncidentDate(LocalDate incidentDate) {
    this.incidentDate = incidentDate;
  }


  public EdFiDisciplineIncident incidentDescription(String incidentDescription) {
    
    this.incidentDescription = incidentDescription;
    return this;
  }

   /**
   * The description for an incident.
   * @return incidentDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description for an incident.")

  public String getIncidentDescription() {
    return incidentDescription;
  }


  public void setIncidentDescription(String incidentDescription) {
    this.incidentDescription = incidentDescription;
  }


  public EdFiDisciplineIncident incidentLocationDescriptor(String incidentLocationDescriptor) {
    
    this.incidentLocationDescriptor = incidentLocationDescriptor;
    return this;
  }

   /**
   * Identifies where the DisciplineIncident occurred and whether or not it occurred on school, for example:         On school         Administrative offices area         Cafeteria area         Classroom         Hallway or stairs         ...
   * @return incidentLocationDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies where the DisciplineIncident occurred and whether or not it occurred on school, for example:         On school         Administrative offices area         Cafeteria area         Classroom         Hallway or stairs         ...")

  public String getIncidentLocationDescriptor() {
    return incidentLocationDescriptor;
  }


  public void setIncidentLocationDescriptor(String incidentLocationDescriptor) {
    this.incidentLocationDescriptor = incidentLocationDescriptor;
  }


  public EdFiDisciplineIncident incidentTime(String incidentTime) {
    
    this.incidentTime = incidentTime;
    return this;
  }

   /**
   * An indication of the time of day the incident took place.
   * @return incidentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of the time of day the incident took place.")

  public String getIncidentTime() {
    return incidentTime;
  }


  public void setIncidentTime(String incidentTime) {
    this.incidentTime = incidentTime;
  }


  public EdFiDisciplineIncident reportedToLawEnforcement(Boolean reportedToLawEnforcement) {
    
    this.reportedToLawEnforcement = reportedToLawEnforcement;
    return this;
  }

   /**
   * Indicator of whether the incident was reported to law enforcement.
   * @return reportedToLawEnforcement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the incident was reported to law enforcement.")

  public Boolean getReportedToLawEnforcement() {
    return reportedToLawEnforcement;
  }


  public void setReportedToLawEnforcement(Boolean reportedToLawEnforcement) {
    this.reportedToLawEnforcement = reportedToLawEnforcement;
  }


  public EdFiDisciplineIncident reporterDescriptionDescriptor(String reporterDescriptionDescriptor) {
    
    this.reporterDescriptionDescriptor = reporterDescriptionDescriptor;
    return this;
  }

   /**
   * Information on the type of individual who reported the DisciplineIncident. When known and/or if useful, use a more specific option code (e.g., \&quot;Counselor\&quot; rather than \&quot;Professional Staff\&quot;); for example:         Student         Parent/guardian         Law enforcement officer         Nonschool personnel         Representative of visiting school         ...
   * @return reporterDescriptionDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information on the type of individual who reported the DisciplineIncident. When known and/or if useful, use a more specific option code (e.g., \"Counselor\" rather than \"Professional Staff\"); for example:         Student         Parent/guardian         Law enforcement officer         Nonschool personnel         Representative of visiting school         ...")

  public String getReporterDescriptionDescriptor() {
    return reporterDescriptionDescriptor;
  }


  public void setReporterDescriptionDescriptor(String reporterDescriptionDescriptor) {
    this.reporterDescriptionDescriptor = reporterDescriptionDescriptor;
  }


  public EdFiDisciplineIncident reporterName(String reporterName) {
    
    this.reporterName = reporterName;
    return this;
  }

   /**
   * Identifies the reporter of the DisciplineIncident by name.
   * @return reporterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the reporter of the DisciplineIncident by name.")

  public String getReporterName() {
    return reporterName;
  }


  public void setReporterName(String reporterName) {
    this.reporterName = reporterName;
  }


  public EdFiDisciplineIncident weapons(List<EdFiDisciplineIncidentWeapon> weapons) {
    
    this.weapons = weapons;
    return this;
  }

  public EdFiDisciplineIncident addWeaponsItem(EdFiDisciplineIncidentWeapon weaponsItem) {
    if (this.weapons == null) {
      this.weapons = new ArrayList<EdFiDisciplineIncidentWeapon>();
    }
    this.weapons.add(weaponsItem);
    return this;
  }

   /**
   * An unordered collection of disciplineIncidentWeapons. Identifies the type of weapon used during an incident. The Federal Gun-Free Schools Act requires states to report the number of students expelled for bringing firearms to school by type of firearm.
   * @return weapons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of disciplineIncidentWeapons. Identifies the type of weapon used during an incident. The Federal Gun-Free Schools Act requires states to report the number of students expelled for bringing firearms to school by type of firearm.")

  public List<EdFiDisciplineIncidentWeapon> getWeapons() {
    return weapons;
  }


  public void setWeapons(List<EdFiDisciplineIncidentWeapon> weapons) {
    this.weapons = weapons;
  }


  public EdFiDisciplineIncident etag(String etag) {
    
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
    EdFiDisciplineIncident edFiDisciplineIncident = (EdFiDisciplineIncident) o;
    return Objects.equals(this.id, edFiDisciplineIncident.id) &&
        Objects.equals(this.incidentIdentifier, edFiDisciplineIncident.incidentIdentifier) &&
        Objects.equals(this.schoolReference, edFiDisciplineIncident.schoolReference) &&
        Objects.equals(this.staffReference, edFiDisciplineIncident.staffReference) &&
        Objects.equals(this.behaviors, edFiDisciplineIncident.behaviors) &&
        Objects.equals(this.caseNumber, edFiDisciplineIncident.caseNumber) &&
        Objects.equals(this.externalParticipants, edFiDisciplineIncident.externalParticipants) &&
        Objects.equals(this.incidentCost, edFiDisciplineIncident.incidentCost) &&
        Objects.equals(this.incidentDate, edFiDisciplineIncident.incidentDate) &&
        Objects.equals(this.incidentDescription, edFiDisciplineIncident.incidentDescription) &&
        Objects.equals(this.incidentLocationDescriptor, edFiDisciplineIncident.incidentLocationDescriptor) &&
        Objects.equals(this.incidentTime, edFiDisciplineIncident.incidentTime) &&
        Objects.equals(this.reportedToLawEnforcement, edFiDisciplineIncident.reportedToLawEnforcement) &&
        Objects.equals(this.reporterDescriptionDescriptor, edFiDisciplineIncident.reporterDescriptionDescriptor) &&
        Objects.equals(this.reporterName, edFiDisciplineIncident.reporterName) &&
        Objects.equals(this.weapons, edFiDisciplineIncident.weapons) &&
        Objects.equals(this.etag, edFiDisciplineIncident.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, incidentIdentifier, schoolReference, staffReference, behaviors, caseNumber, externalParticipants, incidentCost, incidentDate, incidentDescription, incidentLocationDescriptor, incidentTime, reportedToLawEnforcement, reporterDescriptionDescriptor, reporterName, weapons, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiDisciplineIncident {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incidentIdentifier: ").append(toIndentedString(incidentIdentifier)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    externalParticipants: ").append(toIndentedString(externalParticipants)).append("\n");
    sb.append("    incidentCost: ").append(toIndentedString(incidentCost)).append("\n");
    sb.append("    incidentDate: ").append(toIndentedString(incidentDate)).append("\n");
    sb.append("    incidentDescription: ").append(toIndentedString(incidentDescription)).append("\n");
    sb.append("    incidentLocationDescriptor: ").append(toIndentedString(incidentLocationDescriptor)).append("\n");
    sb.append("    incidentTime: ").append(toIndentedString(incidentTime)).append("\n");
    sb.append("    reportedToLawEnforcement: ").append(toIndentedString(reportedToLawEnforcement)).append("\n");
    sb.append("    reporterDescriptionDescriptor: ").append(toIndentedString(reporterDescriptionDescriptor)).append("\n");
    sb.append("    reporterName: ").append(toIndentedString(reporterName)).append("\n");
    sb.append("    weapons: ").append(toIndentedString(weapons)).append("\n");
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

