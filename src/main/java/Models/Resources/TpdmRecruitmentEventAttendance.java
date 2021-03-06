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
import Models.Resources.TpdmRecruitmentEventAttendanceCurrentPosition;
import Models.Resources.TpdmRecruitmentEventAttendanceDisability;
import Models.Resources.TpdmRecruitmentEventAttendancePersonalIdentificationDocument;
import Models.Resources.TpdmRecruitmentEventAttendanceRace;
import Models.Resources.TpdmRecruitmentEventAttendanceRecruitmentEventAttendeeQualifications;
import Models.Resources.TpdmRecruitmentEventAttendanceTelephone;
import Models.Resources.TpdmRecruitmentEventAttendanceTouchpoint;
import Models.Resources.TpdmRecruitmentEventReference;
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
 * TpdmRecruitmentEventAttendance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmRecruitmentEventAttendance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RECRUITMENT_EVENT_ATTENDEE_IDENTIFIER = "recruitmentEventAttendeeIdentifier";
  @SerializedName(SERIALIZED_NAME_RECRUITMENT_EVENT_ATTENDEE_IDENTIFIER)
  private String recruitmentEventAttendeeIdentifier;

  public static final String SERIALIZED_NAME_RECRUITMENT_EVENT_REFERENCE = "recruitmentEventReference";
  @SerializedName(SERIALIZED_NAME_RECRUITMENT_EVENT_REFERENCE)
  private TpdmRecruitmentEventReference recruitmentEventReference;

  public static final String SERIALIZED_NAME_APPLIED = "applied";
  @SerializedName(SERIALIZED_NAME_APPLIED)
  private Boolean applied;

  public static final String SERIALIZED_NAME_CURRENT_POSITION = "currentPosition";
  @SerializedName(SERIALIZED_NAME_CURRENT_POSITION)
  private TpdmRecruitmentEventAttendanceCurrentPosition currentPosition;

  public static final String SERIALIZED_NAME_DISABILITIES = "disabilities";
  @SerializedName(SERIALIZED_NAME_DISABILITIES)
  private List<TpdmRecruitmentEventAttendanceDisability> disabilities = null;

  public static final String SERIALIZED_NAME_ELECTRONIC_MAIL_ADDRESS = "electronicMailAddress";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_MAIL_ADDRESS)
  private String electronicMailAddress;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GENDER_DESCRIPTOR = "genderDescriptor";
  @SerializedName(SERIALIZED_NAME_GENDER_DESCRIPTOR)
  private String genderDescriptor;

  public static final String SERIALIZED_NAME_GENERATION_CODE_SUFFIX = "generationCodeSuffix";
  @SerializedName(SERIALIZED_NAME_GENERATION_CODE_SUFFIX)
  private String generationCodeSuffix;

  public static final String SERIALIZED_NAME_HISPANIC_LATINO_ETHNICITY = "hispanicLatinoEthnicity";
  @SerializedName(SERIALIZED_NAME_HISPANIC_LATINO_ETHNICITY)
  private Boolean hispanicLatinoEthnicity;

  public static final String SERIALIZED_NAME_LAST_SURNAME = "lastSurname";
  @SerializedName(SERIALIZED_NAME_LAST_SURNAME)
  private String lastSurname;

  public static final String SERIALIZED_NAME_MAIDEN_NAME = "maidenName";
  @SerializedName(SERIALIZED_NAME_MAIDEN_NAME)
  private String maidenName;

  public static final String SERIALIZED_NAME_MET = "met";
  @SerializedName(SERIALIZED_NAME_MET)
  private Boolean met;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PERSONAL_IDENTIFICATION_DOCUMENTS = "personalIdentificationDocuments";
  @SerializedName(SERIALIZED_NAME_PERSONAL_IDENTIFICATION_DOCUMENTS)
  private List<TpdmRecruitmentEventAttendancePersonalIdentificationDocument> personalIdentificationDocuments = null;

  public static final String SERIALIZED_NAME_PERSONAL_TITLE_PREFIX = "personalTitlePrefix";
  @SerializedName(SERIALIZED_NAME_PERSONAL_TITLE_PREFIX)
  private String personalTitlePrefix;

  public static final String SERIALIZED_NAME_PRE_SCREENING_RATING = "preScreeningRating";
  @SerializedName(SERIALIZED_NAME_PRE_SCREENING_RATING)
  private Integer preScreeningRating;

  public static final String SERIALIZED_NAME_RACES = "races";
  @SerializedName(SERIALIZED_NAME_RACES)
  private List<TpdmRecruitmentEventAttendanceRace> races = null;

  public static final String SERIALIZED_NAME_RECRUITMENT_EVENT_ATTENDEE_QUALIFICATIONS = "recruitmentEventAttendeeQualifications";
  @SerializedName(SERIALIZED_NAME_RECRUITMENT_EVENT_ATTENDEE_QUALIFICATIONS)
  private TpdmRecruitmentEventAttendanceRecruitmentEventAttendeeQualifications recruitmentEventAttendeeQualifications;

  public static final String SERIALIZED_NAME_RECRUITMENT_EVENT_ATTENDEE_TYPE_DESCRIPTOR = "recruitmentEventAttendeeTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_RECRUITMENT_EVENT_ATTENDEE_TYPE_DESCRIPTOR)
  private String recruitmentEventAttendeeTypeDescriptor;

  public static final String SERIALIZED_NAME_REFERRAL = "referral";
  @SerializedName(SERIALIZED_NAME_REFERRAL)
  private Boolean referral;

  public static final String SERIALIZED_NAME_REFERRED_BY = "referredBy";
  @SerializedName(SERIALIZED_NAME_REFERRED_BY)
  private String referredBy;

  public static final String SERIALIZED_NAME_SEX_DESCRIPTOR = "sexDescriptor";
  @SerializedName(SERIALIZED_NAME_SEX_DESCRIPTOR)
  private String sexDescriptor;

  public static final String SERIALIZED_NAME_SOCIAL_MEDIA_NETWORK_NAME = "socialMediaNetworkName";
  @SerializedName(SERIALIZED_NAME_SOCIAL_MEDIA_NETWORK_NAME)
  private String socialMediaNetworkName;

  public static final String SERIALIZED_NAME_SOCIAL_MEDIA_USER_NAME = "socialMediaUserName";
  @SerializedName(SERIALIZED_NAME_SOCIAL_MEDIA_USER_NAME)
  private String socialMediaUserName;

  public static final String SERIALIZED_NAME_TELEPHONES = "telephones";
  @SerializedName(SERIALIZED_NAME_TELEPHONES)
  private List<TpdmRecruitmentEventAttendanceTelephone> telephones = null;

  public static final String SERIALIZED_NAME_TOUCHPOINTS = "touchpoints";
  @SerializedName(SERIALIZED_NAME_TOUCHPOINTS)
  private List<TpdmRecruitmentEventAttendanceTouchpoint> touchpoints = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmRecruitmentEventAttendance() { 
  }

  public TpdmRecruitmentEventAttendance id(String id) {
    
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


  public TpdmRecruitmentEventAttendance recruitmentEventAttendeeIdentifier(String recruitmentEventAttendeeIdentifier) {
    
    this.recruitmentEventAttendeeIdentifier = recruitmentEventAttendeeIdentifier;
    return this;
  }

   /**
   * The identifier for the attendee to a recuitment event.
   * @return recruitmentEventAttendeeIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the attendee to a recuitment event.")

  public String getRecruitmentEventAttendeeIdentifier() {
    return recruitmentEventAttendeeIdentifier;
  }


  public void setRecruitmentEventAttendeeIdentifier(String recruitmentEventAttendeeIdentifier) {
    this.recruitmentEventAttendeeIdentifier = recruitmentEventAttendeeIdentifier;
  }


  public TpdmRecruitmentEventAttendance recruitmentEventReference(TpdmRecruitmentEventReference recruitmentEventReference) {
    
    this.recruitmentEventReference = recruitmentEventReference;
    return this;
  }

   /**
   * Get recruitmentEventReference
   * @return recruitmentEventReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmRecruitmentEventReference getRecruitmentEventReference() {
    return recruitmentEventReference;
  }


  public void setRecruitmentEventReference(TpdmRecruitmentEventReference recruitmentEventReference) {
    this.recruitmentEventReference = recruitmentEventReference;
  }


  public TpdmRecruitmentEventAttendance applied(Boolean applied) {
    
    this.applied = applied;
    return this;
  }

   /**
   * Indicator of whether the prospect applied for a position.
   * @return applied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the prospect applied for a position.")

  public Boolean getApplied() {
    return applied;
  }


  public void setApplied(Boolean applied) {
    this.applied = applied;
  }


  public TpdmRecruitmentEventAttendance currentPosition(TpdmRecruitmentEventAttendanceCurrentPosition currentPosition) {
    
    this.currentPosition = currentPosition;
    return this;
  }

   /**
   * Get currentPosition
   * @return currentPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TpdmRecruitmentEventAttendanceCurrentPosition getCurrentPosition() {
    return currentPosition;
  }


  public void setCurrentPosition(TpdmRecruitmentEventAttendanceCurrentPosition currentPosition) {
    this.currentPosition = currentPosition;
  }


  public TpdmRecruitmentEventAttendance disabilities(List<TpdmRecruitmentEventAttendanceDisability> disabilities) {
    
    this.disabilities = disabilities;
    return this;
  }

  public TpdmRecruitmentEventAttendance addDisabilitiesItem(TpdmRecruitmentEventAttendanceDisability disabilitiesItem) {
    if (this.disabilities == null) {
      this.disabilities = new ArrayList<TpdmRecruitmentEventAttendanceDisability>();
    }
    this.disabilities.add(disabilitiesItem);
    return this;
  }

   /**
   * An unordered collection of recruitmentEventAttendanceDisabilities. The disability condition(s) that best describes an individual&#39;s impairment.
   * @return disabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of recruitmentEventAttendanceDisabilities. The disability condition(s) that best describes an individual's impairment.")

  public List<TpdmRecruitmentEventAttendanceDisability> getDisabilities() {
    return disabilities;
  }


  public void setDisabilities(List<TpdmRecruitmentEventAttendanceDisability> disabilities) {
    this.disabilities = disabilities;
  }


  public TpdmRecruitmentEventAttendance electronicMailAddress(String electronicMailAddress) {
    
    this.electronicMailAddress = electronicMailAddress;
    return this;
  }

   /**
   * The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the individual or organization belongs.
   * @return electronicMailAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the individual or organization belongs.")

  public String getElectronicMailAddress() {
    return electronicMailAddress;
  }


  public void setElectronicMailAddress(String electronicMailAddress) {
    this.electronicMailAddress = electronicMailAddress;
  }


  public TpdmRecruitmentEventAttendance firstName(String firstName) {
    
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


  public TpdmRecruitmentEventAttendance genderDescriptor(String genderDescriptor) {
    
    this.genderDescriptor = genderDescriptor;
    return this;
  }

   /**
   * The gender with which a person associates.
   * @return genderDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The gender with which a person associates.")

  public String getGenderDescriptor() {
    return genderDescriptor;
  }


  public void setGenderDescriptor(String genderDescriptor) {
    this.genderDescriptor = genderDescriptor;
  }


  public TpdmRecruitmentEventAttendance generationCodeSuffix(String generationCodeSuffix) {
    
    this.generationCodeSuffix = generationCodeSuffix;
    return this;
  }

   /**
   * An appendage, if any, used to denote an individual&#39;s generation in his family (e.g., Jr., Sr., III).
   * @return generationCodeSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An appendage, if any, used to denote an individual's generation in his family (e.g., Jr., Sr., III).")

  public String getGenerationCodeSuffix() {
    return generationCodeSuffix;
  }


  public void setGenerationCodeSuffix(String generationCodeSuffix) {
    this.generationCodeSuffix = generationCodeSuffix;
  }


  public TpdmRecruitmentEventAttendance hispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
    
    this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
    return this;
  }

   /**
   * An indication that the individual traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central, and South America, and other Spanish cultures, regardless of race. The term, \&quot;Spanish origin,\&quot; can be used in addition to \&quot;Hispanic or Latino\&quot;.
   * @return hispanicLatinoEthnicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication that the individual traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central, and South America, and other Spanish cultures, regardless of race. The term, \"Spanish origin,\" can be used in addition to \"Hispanic or Latino\".")

  public Boolean getHispanicLatinoEthnicity() {
    return hispanicLatinoEthnicity;
  }


  public void setHispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
    this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
  }


  public TpdmRecruitmentEventAttendance lastSurname(String lastSurname) {
    
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


  public TpdmRecruitmentEventAttendance maidenName(String maidenName) {
    
    this.maidenName = maidenName;
    return this;
  }

   /**
   * The person&#39;s maiden name.
   * @return maidenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person's maiden name.")

  public String getMaidenName() {
    return maidenName;
  }


  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }


  public TpdmRecruitmentEventAttendance met(Boolean met) {
    
    this.met = met;
    return this;
  }

   /**
   * Indicator whether the person was met by a representative of the education organization.
   * @return met
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator whether the person was met by a representative of the education organization.")

  public Boolean getMet() {
    return met;
  }


  public void setMet(Boolean met) {
    this.met = met;
  }


  public TpdmRecruitmentEventAttendance middleName(String middleName) {
    
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


  public TpdmRecruitmentEventAttendance notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Additional notes about the prospect.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional notes about the prospect.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public TpdmRecruitmentEventAttendance personalIdentificationDocuments(List<TpdmRecruitmentEventAttendancePersonalIdentificationDocument> personalIdentificationDocuments) {
    
    this.personalIdentificationDocuments = personalIdentificationDocuments;
    return this;
  }

  public TpdmRecruitmentEventAttendance addPersonalIdentificationDocumentsItem(TpdmRecruitmentEventAttendancePersonalIdentificationDocument personalIdentificationDocumentsItem) {
    if (this.personalIdentificationDocuments == null) {
      this.personalIdentificationDocuments = new ArrayList<TpdmRecruitmentEventAttendancePersonalIdentificationDocument>();
    }
    this.personalIdentificationDocuments.add(personalIdentificationDocumentsItem);
    return this;
  }

   /**
   * An unordered collection of recruitmentEventAttendancePersonalIdentificationDocuments. The documents presented as evident to verify one&#39;s personal identity; for example: drivers license, passport, birth certificate, etc.
   * @return personalIdentificationDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of recruitmentEventAttendancePersonalIdentificationDocuments. The documents presented as evident to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.")

  public List<TpdmRecruitmentEventAttendancePersonalIdentificationDocument> getPersonalIdentificationDocuments() {
    return personalIdentificationDocuments;
  }


  public void setPersonalIdentificationDocuments(List<TpdmRecruitmentEventAttendancePersonalIdentificationDocument> personalIdentificationDocuments) {
    this.personalIdentificationDocuments = personalIdentificationDocuments;
  }


  public TpdmRecruitmentEventAttendance personalTitlePrefix(String personalTitlePrefix) {
    
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


  public TpdmRecruitmentEventAttendance preScreeningRating(Integer preScreeningRating) {
    
    this.preScreeningRating = preScreeningRating;
    return this;
  }

   /**
   * The rating initially assigned to the prospect prior to an official screening.
   * @return preScreeningRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rating initially assigned to the prospect prior to an official screening.")

  public Integer getPreScreeningRating() {
    return preScreeningRating;
  }


  public void setPreScreeningRating(Integer preScreeningRating) {
    this.preScreeningRating = preScreeningRating;
  }


  public TpdmRecruitmentEventAttendance races(List<TpdmRecruitmentEventAttendanceRace> races) {
    
    this.races = races;
    return this;
  }

  public TpdmRecruitmentEventAttendance addRacesItem(TpdmRecruitmentEventAttendanceRace racesItem) {
    if (this.races == null) {
      this.races = new ArrayList<TpdmRecruitmentEventAttendanceRace>();
    }
    this.races.add(racesItem);
    return this;
  }

   /**
   * An unordered collection of recruitmentEventAttendanceRaces. The general racial category which most clearly reflects the individual&#39;s recognition of his or her community or with which the individual most identifies. The way this data element is listed, it must allow for multiple entries so that each individual can specify all appropriate races.
   * @return races
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of recruitmentEventAttendanceRaces. The general racial category which most clearly reflects the individual's recognition of his or her community or with which the individual most identifies. The way this data element is listed, it must allow for multiple entries so that each individual can specify all appropriate races.")

  public List<TpdmRecruitmentEventAttendanceRace> getRaces() {
    return races;
  }


  public void setRaces(List<TpdmRecruitmentEventAttendanceRace> races) {
    this.races = races;
  }


  public TpdmRecruitmentEventAttendance recruitmentEventAttendeeQualifications(TpdmRecruitmentEventAttendanceRecruitmentEventAttendeeQualifications recruitmentEventAttendeeQualifications) {
    
    this.recruitmentEventAttendeeQualifications = recruitmentEventAttendeeQualifications;
    return this;
  }

   /**
   * Get recruitmentEventAttendeeQualifications
   * @return recruitmentEventAttendeeQualifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TpdmRecruitmentEventAttendanceRecruitmentEventAttendeeQualifications getRecruitmentEventAttendeeQualifications() {
    return recruitmentEventAttendeeQualifications;
  }


  public void setRecruitmentEventAttendeeQualifications(TpdmRecruitmentEventAttendanceRecruitmentEventAttendeeQualifications recruitmentEventAttendeeQualifications) {
    this.recruitmentEventAttendeeQualifications = recruitmentEventAttendeeQualifications;
  }


  public TpdmRecruitmentEventAttendance recruitmentEventAttendeeTypeDescriptor(String recruitmentEventAttendeeTypeDescriptor) {
    
    this.recruitmentEventAttendeeTypeDescriptor = recruitmentEventAttendeeTypeDescriptor;
    return this;
  }

   /**
   * Reflects the type of prospect, such as EPP Applicant, Hire, or Mentor Teacher.
   * @return recruitmentEventAttendeeTypeDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reflects the type of prospect, such as EPP Applicant, Hire, or Mentor Teacher.")

  public String getRecruitmentEventAttendeeTypeDescriptor() {
    return recruitmentEventAttendeeTypeDescriptor;
  }


  public void setRecruitmentEventAttendeeTypeDescriptor(String recruitmentEventAttendeeTypeDescriptor) {
    this.recruitmentEventAttendeeTypeDescriptor = recruitmentEventAttendeeTypeDescriptor;
  }


  public TpdmRecruitmentEventAttendance referral(Boolean referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Indicator of whether the prospect was a referral.
   * @return referral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the prospect was a referral.")

  public Boolean getReferral() {
    return referral;
  }


  public void setReferral(Boolean referral) {
    this.referral = referral;
  }


  public TpdmRecruitmentEventAttendance referredBy(String referredBy) {
    
    this.referredBy = referredBy;
    return this;
  }

   /**
   * The person making the referral.
   * @return referredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person making the referral.")

  public String getReferredBy() {
    return referredBy;
  }


  public void setReferredBy(String referredBy) {
    this.referredBy = referredBy;
  }


  public TpdmRecruitmentEventAttendance sexDescriptor(String sexDescriptor) {
    
    this.sexDescriptor = sexDescriptor;
    return this;
  }

   /**
   * A person&#39;s gender.
   * @return sexDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A person's gender.")

  public String getSexDescriptor() {
    return sexDescriptor;
  }


  public void setSexDescriptor(String sexDescriptor) {
    this.sexDescriptor = sexDescriptor;
  }


  public TpdmRecruitmentEventAttendance socialMediaNetworkName(String socialMediaNetworkName) {
    
    this.socialMediaNetworkName = socialMediaNetworkName;
    return this;
  }

   /**
   * The social media network name (e.g., LinkedIn, Twitter, etc.) associated with the SocialMediaUserName.
   * @return socialMediaNetworkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The social media network name (e.g., LinkedIn, Twitter, etc.) associated with the SocialMediaUserName.")

  public String getSocialMediaNetworkName() {
    return socialMediaNetworkName;
  }


  public void setSocialMediaNetworkName(String socialMediaNetworkName) {
    this.socialMediaNetworkName = socialMediaNetworkName;
  }


  public TpdmRecruitmentEventAttendance socialMediaUserName(String socialMediaUserName) {
    
    this.socialMediaUserName = socialMediaUserName;
    return this;
  }

   /**
   * The user name of the person on social media.
   * @return socialMediaUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user name of the person on social media.")

  public String getSocialMediaUserName() {
    return socialMediaUserName;
  }


  public void setSocialMediaUserName(String socialMediaUserName) {
    this.socialMediaUserName = socialMediaUserName;
  }


  public TpdmRecruitmentEventAttendance telephones(List<TpdmRecruitmentEventAttendanceTelephone> telephones) {
    
    this.telephones = telephones;
    return this;
  }

  public TpdmRecruitmentEventAttendance addTelephonesItem(TpdmRecruitmentEventAttendanceTelephone telephonesItem) {
    if (this.telephones == null) {
      this.telephones = new ArrayList<TpdmRecruitmentEventAttendanceTelephone>();
    }
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * An unordered collection of recruitmentEventAttendanceTelephones. The 10-digit telephone number, including the area code, for the person.
   * @return telephones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of recruitmentEventAttendanceTelephones. The 10-digit telephone number, including the area code, for the person.")

  public List<TpdmRecruitmentEventAttendanceTelephone> getTelephones() {
    return telephones;
  }


  public void setTelephones(List<TpdmRecruitmentEventAttendanceTelephone> telephones) {
    this.telephones = telephones;
  }


  public TpdmRecruitmentEventAttendance touchpoints(List<TpdmRecruitmentEventAttendanceTouchpoint> touchpoints) {
    
    this.touchpoints = touchpoints;
    return this;
  }

  public TpdmRecruitmentEventAttendance addTouchpointsItem(TpdmRecruitmentEventAttendanceTouchpoint touchpointsItem) {
    if (this.touchpoints == null) {
      this.touchpoints = new ArrayList<TpdmRecruitmentEventAttendanceTouchpoint>();
    }
    this.touchpoints.add(touchpointsItem);
    return this;
  }

   /**
   * An unordered collection of recruitmentEventAttendanceTouchpoints. Content associated with different touchpoints with the prospect.
   * @return touchpoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of recruitmentEventAttendanceTouchpoints. Content associated with different touchpoints with the prospect.")

  public List<TpdmRecruitmentEventAttendanceTouchpoint> getTouchpoints() {
    return touchpoints;
  }


  public void setTouchpoints(List<TpdmRecruitmentEventAttendanceTouchpoint> touchpoints) {
    this.touchpoints = touchpoints;
  }


  public TpdmRecruitmentEventAttendance etag(String etag) {
    
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
    TpdmRecruitmentEventAttendance tpdmRecruitmentEventAttendance = (TpdmRecruitmentEventAttendance) o;
    return Objects.equals(this.id, tpdmRecruitmentEventAttendance.id) &&
        Objects.equals(this.recruitmentEventAttendeeIdentifier, tpdmRecruitmentEventAttendance.recruitmentEventAttendeeIdentifier) &&
        Objects.equals(this.recruitmentEventReference, tpdmRecruitmentEventAttendance.recruitmentEventReference) &&
        Objects.equals(this.applied, tpdmRecruitmentEventAttendance.applied) &&
        Objects.equals(this.currentPosition, tpdmRecruitmentEventAttendance.currentPosition) &&
        Objects.equals(this.disabilities, tpdmRecruitmentEventAttendance.disabilities) &&
        Objects.equals(this.electronicMailAddress, tpdmRecruitmentEventAttendance.electronicMailAddress) &&
        Objects.equals(this.firstName, tpdmRecruitmentEventAttendance.firstName) &&
        Objects.equals(this.genderDescriptor, tpdmRecruitmentEventAttendance.genderDescriptor) &&
        Objects.equals(this.generationCodeSuffix, tpdmRecruitmentEventAttendance.generationCodeSuffix) &&
        Objects.equals(this.hispanicLatinoEthnicity, tpdmRecruitmentEventAttendance.hispanicLatinoEthnicity) &&
        Objects.equals(this.lastSurname, tpdmRecruitmentEventAttendance.lastSurname) &&
        Objects.equals(this.maidenName, tpdmRecruitmentEventAttendance.maidenName) &&
        Objects.equals(this.met, tpdmRecruitmentEventAttendance.met) &&
        Objects.equals(this.middleName, tpdmRecruitmentEventAttendance.middleName) &&
        Objects.equals(this.notes, tpdmRecruitmentEventAttendance.notes) &&
        Objects.equals(this.personalIdentificationDocuments, tpdmRecruitmentEventAttendance.personalIdentificationDocuments) &&
        Objects.equals(this.personalTitlePrefix, tpdmRecruitmentEventAttendance.personalTitlePrefix) &&
        Objects.equals(this.preScreeningRating, tpdmRecruitmentEventAttendance.preScreeningRating) &&
        Objects.equals(this.races, tpdmRecruitmentEventAttendance.races) &&
        Objects.equals(this.recruitmentEventAttendeeQualifications, tpdmRecruitmentEventAttendance.recruitmentEventAttendeeQualifications) &&
        Objects.equals(this.recruitmentEventAttendeeTypeDescriptor, tpdmRecruitmentEventAttendance.recruitmentEventAttendeeTypeDescriptor) &&
        Objects.equals(this.referral, tpdmRecruitmentEventAttendance.referral) &&
        Objects.equals(this.referredBy, tpdmRecruitmentEventAttendance.referredBy) &&
        Objects.equals(this.sexDescriptor, tpdmRecruitmentEventAttendance.sexDescriptor) &&
        Objects.equals(this.socialMediaNetworkName, tpdmRecruitmentEventAttendance.socialMediaNetworkName) &&
        Objects.equals(this.socialMediaUserName, tpdmRecruitmentEventAttendance.socialMediaUserName) &&
        Objects.equals(this.telephones, tpdmRecruitmentEventAttendance.telephones) &&
        Objects.equals(this.touchpoints, tpdmRecruitmentEventAttendance.touchpoints) &&
        Objects.equals(this.etag, tpdmRecruitmentEventAttendance.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recruitmentEventAttendeeIdentifier, recruitmentEventReference, applied, currentPosition, disabilities, electronicMailAddress, firstName, genderDescriptor, generationCodeSuffix, hispanicLatinoEthnicity, lastSurname, maidenName, met, middleName, notes, personalIdentificationDocuments, personalTitlePrefix, preScreeningRating, races, recruitmentEventAttendeeQualifications, recruitmentEventAttendeeTypeDescriptor, referral, referredBy, sexDescriptor, socialMediaNetworkName, socialMediaUserName, telephones, touchpoints, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmRecruitmentEventAttendance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recruitmentEventAttendeeIdentifier: ").append(toIndentedString(recruitmentEventAttendeeIdentifier)).append("\n");
    sb.append("    recruitmentEventReference: ").append(toIndentedString(recruitmentEventReference)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    currentPosition: ").append(toIndentedString(currentPosition)).append("\n");
    sb.append("    disabilities: ").append(toIndentedString(disabilities)).append("\n");
    sb.append("    electronicMailAddress: ").append(toIndentedString(electronicMailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    genderDescriptor: ").append(toIndentedString(genderDescriptor)).append("\n");
    sb.append("    generationCodeSuffix: ").append(toIndentedString(generationCodeSuffix)).append("\n");
    sb.append("    hispanicLatinoEthnicity: ").append(toIndentedString(hispanicLatinoEthnicity)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    met: ").append(toIndentedString(met)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    personalIdentificationDocuments: ").append(toIndentedString(personalIdentificationDocuments)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
    sb.append("    preScreeningRating: ").append(toIndentedString(preScreeningRating)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    recruitmentEventAttendeeQualifications: ").append(toIndentedString(recruitmentEventAttendeeQualifications)).append("\n");
    sb.append("    recruitmentEventAttendeeTypeDescriptor: ").append(toIndentedString(recruitmentEventAttendeeTypeDescriptor)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
    sb.append("    referredBy: ").append(toIndentedString(referredBy)).append("\n");
    sb.append("    sexDescriptor: ").append(toIndentedString(sexDescriptor)).append("\n");
    sb.append("    socialMediaNetworkName: ").append(toIndentedString(socialMediaNetworkName)).append("\n");
    sb.append("    socialMediaUserName: ").append(toIndentedString(socialMediaUserName)).append("\n");
    sb.append("    telephones: ").append(toIndentedString(telephones)).append("\n");
    sb.append("    touchpoints: ").append(toIndentedString(touchpoints)).append("\n");
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

