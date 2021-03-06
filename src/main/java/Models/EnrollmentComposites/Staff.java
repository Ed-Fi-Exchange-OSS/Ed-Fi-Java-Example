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
import Models.EnrollmentComposites.StaffStaffEducationOrganizationAssignmentAssociation;
import Models.EnrollmentComposites.StaffStaffElectronicMail;
import Models.EnrollmentComposites.StaffStaffIdentificationCode;
import Models.EnrollmentComposites.StaffStaffLanguage;
import Models.EnrollmentComposites.StaffStaffRace;
import Models.EnrollmentComposites.StaffStaffTelephone;
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
 * Staff
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:13.622-05:00[America/Mexico_City]")
public class Staff {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_ASSIGNMENTS = "educationOrganizationAssignments";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_ASSIGNMENTS)
  private List<StaffStaffEducationOrganizationAssignmentAssociation> educationOrganizationAssignments = null;

  public static final String SERIALIZED_NAME_ELECTRONIC_MAILS = "electronicMails";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_MAILS)
  private List<StaffStaffElectronicMail> electronicMails = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_HISPANIC_LATINO_ETHNICITY = "hispanicLatinoEthnicity";
  @SerializedName(SERIALIZED_NAME_HISPANIC_LATINO_ETHNICITY)
  private Boolean hispanicLatinoEthnicity;

  public static final String SERIALIZED_NAME_IDENTIFICATION_CODES = "identificationCodes";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_CODES)
  private List<StaffStaffIdentificationCode> identificationCodes = null;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<StaffStaffLanguage> languages = null;

  public static final String SERIALIZED_NAME_LAST_SURNAME = "lastSurname";
  @SerializedName(SERIALIZED_NAME_LAST_SURNAME)
  private String lastSurname;

  public static final String SERIALIZED_NAME_LOGIN_ID = "loginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private String loginId;

  public static final String SERIALIZED_NAME_PERSONAL_TITLE_PREFIX = "personalTitlePrefix";
  @SerializedName(SERIALIZED_NAME_PERSONAL_TITLE_PREFIX)
  private String personalTitlePrefix;

  public static final String SERIALIZED_NAME_RACES = "races";
  @SerializedName(SERIALIZED_NAME_RACES)
  private List<StaffStaffRace> races = null;

  public static final String SERIALIZED_NAME_SEX_DESCRIPTOR = "sexDescriptor";
  @SerializedName(SERIALIZED_NAME_SEX_DESCRIPTOR)
  private String sexDescriptor;

  public static final String SERIALIZED_NAME_STAFF_UNIQUE_ID = "staffUniqueId";
  @SerializedName(SERIALIZED_NAME_STAFF_UNIQUE_ID)
  private String staffUniqueId;

  public static final String SERIALIZED_NAME_TELEPHONES = "telephones";
  @SerializedName(SERIALIZED_NAME_TELEPHONES)
  private List<StaffStaffTelephone> telephones = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public Staff() { 
  }

  public Staff id(String id) {
    
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


  public Staff educationOrganizationAssignments(List<StaffStaffEducationOrganizationAssignmentAssociation> educationOrganizationAssignments) {
    
    this.educationOrganizationAssignments = educationOrganizationAssignments;
    return this;
  }

  public Staff addEducationOrganizationAssignmentsItem(StaffStaffEducationOrganizationAssignmentAssociation educationOrganizationAssignmentsItem) {
    if (this.educationOrganizationAssignments == null) {
      this.educationOrganizationAssignments = new ArrayList<StaffStaffEducationOrganizationAssignmentAssociation>();
    }
    this.educationOrganizationAssignments.add(educationOrganizationAssignmentsItem);
    return this;
  }

   /**
   * An unordered collection of staffEducationOrganizationAssignmentAssociations. 
   * @return educationOrganizationAssignments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffEducationOrganizationAssignmentAssociations. ")

  public List<StaffStaffEducationOrganizationAssignmentAssociation> getEducationOrganizationAssignments() {
    return educationOrganizationAssignments;
  }


  public void setEducationOrganizationAssignments(List<StaffStaffEducationOrganizationAssignmentAssociation> educationOrganizationAssignments) {
    this.educationOrganizationAssignments = educationOrganizationAssignments;
  }


  public Staff electronicMails(List<StaffStaffElectronicMail> electronicMails) {
    
    this.electronicMails = electronicMails;
    return this;
  }

  public Staff addElectronicMailsItem(StaffStaffElectronicMail electronicMailsItem) {
    if (this.electronicMails == null) {
      this.electronicMails = new ArrayList<StaffStaffElectronicMail>();
    }
    this.electronicMails.add(electronicMailsItem);
    return this;
  }

   /**
   * An unordered collection of staffElectronicMails. 
   * @return electronicMails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffElectronicMails. ")

  public List<StaffStaffElectronicMail> getElectronicMails() {
    return electronicMails;
  }


  public void setElectronicMails(List<StaffStaffElectronicMail> electronicMails) {
    this.electronicMails = electronicMails;
  }


  public Staff firstName(String firstName) {
    
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


  public Staff hispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
    
    this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
    return this;
  }

   /**
   * An indication that the individual traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central, and South America, and other Spanish cultures, regardless of race. The term, \&quot;Spanish origin,\&quot; can be used in addition to \&quot;Hispanic or Latino.\&quot;
   * @return hispanicLatinoEthnicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication that the individual traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central, and South America, and other Spanish cultures, regardless of race. The term, \"Spanish origin,\" can be used in addition to \"Hispanic or Latino.\"")

  public Boolean getHispanicLatinoEthnicity() {
    return hispanicLatinoEthnicity;
  }


  public void setHispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
    this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
  }


  public Staff identificationCodes(List<StaffStaffIdentificationCode> identificationCodes) {
    
    this.identificationCodes = identificationCodes;
    return this;
  }

  public Staff addIdentificationCodesItem(StaffStaffIdentificationCode identificationCodesItem) {
    if (this.identificationCodes == null) {
      this.identificationCodes = new ArrayList<StaffStaffIdentificationCode>();
    }
    this.identificationCodes.add(identificationCodesItem);
    return this;
  }

   /**
   * An unordered collection of staffIdentificationCodes. 
   * @return identificationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffIdentificationCodes. ")

  public List<StaffStaffIdentificationCode> getIdentificationCodes() {
    return identificationCodes;
  }


  public void setIdentificationCodes(List<StaffStaffIdentificationCode> identificationCodes) {
    this.identificationCodes = identificationCodes;
  }


  public Staff languages(List<StaffStaffLanguage> languages) {
    
    this.languages = languages;
    return this;
  }

  public Staff addLanguagesItem(StaffStaffLanguage languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<StaffStaffLanguage>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * An unordered collection of staffLanguages. 
   * @return languages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffLanguages. ")

  public List<StaffStaffLanguage> getLanguages() {
    return languages;
  }


  public void setLanguages(List<StaffStaffLanguage> languages) {
    this.languages = languages;
  }


  public Staff lastSurname(String lastSurname) {
    
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


  public Staff loginId(String loginId) {
    
    this.loginId = loginId;
    return this;
  }

   /**
   * The login ID for the user; used for security access control interface.
   * @return loginId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The login ID for the user; used for security access control interface.")

  public String getLoginId() {
    return loginId;
  }


  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public Staff personalTitlePrefix(String personalTitlePrefix) {
    
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


  public Staff races(List<StaffStaffRace> races) {
    
    this.races = races;
    return this;
  }

  public Staff addRacesItem(StaffStaffRace racesItem) {
    if (this.races == null) {
      this.races = new ArrayList<StaffStaffRace>();
    }
    this.races.add(racesItem);
    return this;
  }

   /**
   * An unordered collection of staffRaces. 
   * @return races
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffRaces. ")

  public List<StaffStaffRace> getRaces() {
    return races;
  }


  public void setRaces(List<StaffStaffRace> races) {
    this.races = races;
  }


  public Staff sexDescriptor(String sexDescriptor) {
    
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


  public Staff staffUniqueId(String staffUniqueId) {
    
    this.staffUniqueId = staffUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a staff.
   * @return staffUniqueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique alphanumeric code assigned to a staff.")

  public String getStaffUniqueId() {
    return staffUniqueId;
  }


  public void setStaffUniqueId(String staffUniqueId) {
    this.staffUniqueId = staffUniqueId;
  }


  public Staff telephones(List<StaffStaffTelephone> telephones) {
    
    this.telephones = telephones;
    return this;
  }

  public Staff addTelephonesItem(StaffStaffTelephone telephonesItem) {
    if (this.telephones == null) {
      this.telephones = new ArrayList<StaffStaffTelephone>();
    }
    this.telephones.add(telephonesItem);
    return this;
  }

   /**
   * An unordered collection of staffTelephones. 
   * @return telephones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffTelephones. ")

  public List<StaffStaffTelephone> getTelephones() {
    return telephones;
  }


  public void setTelephones(List<StaffStaffTelephone> telephones) {
    this.telephones = telephones;
  }


  public Staff etag(String etag) {
    
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
    Staff staff = (Staff) o;
    return Objects.equals(this.id, staff.id) &&
        Objects.equals(this.educationOrganizationAssignments, staff.educationOrganizationAssignments) &&
        Objects.equals(this.electronicMails, staff.electronicMails) &&
        Objects.equals(this.firstName, staff.firstName) &&
        Objects.equals(this.hispanicLatinoEthnicity, staff.hispanicLatinoEthnicity) &&
        Objects.equals(this.identificationCodes, staff.identificationCodes) &&
        Objects.equals(this.languages, staff.languages) &&
        Objects.equals(this.lastSurname, staff.lastSurname) &&
        Objects.equals(this.loginId, staff.loginId) &&
        Objects.equals(this.personalTitlePrefix, staff.personalTitlePrefix) &&
        Objects.equals(this.races, staff.races) &&
        Objects.equals(this.sexDescriptor, staff.sexDescriptor) &&
        Objects.equals(this.staffUniqueId, staff.staffUniqueId) &&
        Objects.equals(this.telephones, staff.telephones) &&
        Objects.equals(this.etag, staff.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, educationOrganizationAssignments, electronicMails, firstName, hispanicLatinoEthnicity, identificationCodes, languages, lastSurname, loginId, personalTitlePrefix, races, sexDescriptor, staffUniqueId, telephones, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Staff {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    educationOrganizationAssignments: ").append(toIndentedString(educationOrganizationAssignments)).append("\n");
    sb.append("    electronicMails: ").append(toIndentedString(electronicMails)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hispanicLatinoEthnicity: ").append(toIndentedString(hispanicLatinoEthnicity)).append("\n");
    sb.append("    identificationCodes: ").append(toIndentedString(identificationCodes)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
    sb.append("    races: ").append(toIndentedString(races)).append("\n");
    sb.append("    sexDescriptor: ").append(toIndentedString(sexDescriptor)).append("\n");
    sb.append("    staffUniqueId: ").append(toIndentedString(staffUniqueId)).append("\n");
    sb.append("    telephones: ").append(toIndentedString(telephones)).append("\n");
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

