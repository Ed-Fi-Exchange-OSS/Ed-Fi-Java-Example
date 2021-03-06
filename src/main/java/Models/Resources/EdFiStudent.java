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
import Models.Resources.EdFiPersonReference;
import Models.Resources.EdFiStudentIdentificationDocument;
import Models.Resources.EdFiStudentOtherName;
import Models.Resources.EdFiStudentPersonalIdentificationDocument;
import Models.Resources.EdFiStudentVisa;
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
 * EdFiStudent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public static final String SERIALIZED_NAME_PERSON_REFERENCE = "personReference";
  @SerializedName(SERIALIZED_NAME_PERSON_REFERENCE)
  private EdFiPersonReference personReference;

  public static final String SERIALIZED_NAME_BIRTH_CITY = "birthCity";
  @SerializedName(SERIALIZED_NAME_BIRTH_CITY)
  private String birthCity;

  public static final String SERIALIZED_NAME_BIRTH_COUNTRY_DESCRIPTOR = "birthCountryDescriptor";
  @SerializedName(SERIALIZED_NAME_BIRTH_COUNTRY_DESCRIPTOR)
  private String birthCountryDescriptor;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public static final String SERIALIZED_NAME_BIRTH_INTERNATIONAL_PROVINCE = "birthInternationalProvince";
  @SerializedName(SERIALIZED_NAME_BIRTH_INTERNATIONAL_PROVINCE)
  private String birthInternationalProvince;

  public static final String SERIALIZED_NAME_BIRTH_SEX_DESCRIPTOR = "birthSexDescriptor";
  @SerializedName(SERIALIZED_NAME_BIRTH_SEX_DESCRIPTOR)
  private String birthSexDescriptor;

  public static final String SERIALIZED_NAME_BIRTH_STATE_ABBREVIATION_DESCRIPTOR = "birthStateAbbreviationDescriptor";
  @SerializedName(SERIALIZED_NAME_BIRTH_STATE_ABBREVIATION_DESCRIPTOR)
  private String birthStateAbbreviationDescriptor;

  public static final String SERIALIZED_NAME_CITIZENSHIP_STATUS_DESCRIPTOR = "citizenshipStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_CITIZENSHIP_STATUS_DESCRIPTOR)
  private String citizenshipStatusDescriptor;

  public static final String SERIALIZED_NAME_DATE_ENTERED_U_S = "dateEnteredUS";
  @SerializedName(SERIALIZED_NAME_DATE_ENTERED_U_S)
  private LocalDate dateEnteredUS;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GENERATION_CODE_SUFFIX = "generationCodeSuffix";
  @SerializedName(SERIALIZED_NAME_GENERATION_CODE_SUFFIX)
  private String generationCodeSuffix;

  public static final String SERIALIZED_NAME_IDENTIFICATION_DOCUMENTS = "identificationDocuments";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_DOCUMENTS)
  private List<EdFiStudentIdentificationDocument> identificationDocuments = null;

  public static final String SERIALIZED_NAME_LAST_SURNAME = "lastSurname";
  @SerializedName(SERIALIZED_NAME_LAST_SURNAME)
  private String lastSurname;

  public static final String SERIALIZED_NAME_MAIDEN_NAME = "maidenName";
  @SerializedName(SERIALIZED_NAME_MAIDEN_NAME)
  private String maidenName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_MULTIPLE_BIRTH_STATUS = "multipleBirthStatus";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_BIRTH_STATUS)
  private Boolean multipleBirthStatus;

  public static final String SERIALIZED_NAME_OTHER_NAMES = "otherNames";
  @SerializedName(SERIALIZED_NAME_OTHER_NAMES)
  private List<EdFiStudentOtherName> otherNames = null;

  public static final String SERIALIZED_NAME_PERSONAL_IDENTIFICATION_DOCUMENTS = "personalIdentificationDocuments";
  @SerializedName(SERIALIZED_NAME_PERSONAL_IDENTIFICATION_DOCUMENTS)
  private List<EdFiStudentPersonalIdentificationDocument> personalIdentificationDocuments = null;

  public static final String SERIALIZED_NAME_PERSONAL_TITLE_PREFIX = "personalTitlePrefix";
  @SerializedName(SERIALIZED_NAME_PERSONAL_TITLE_PREFIX)
  private String personalTitlePrefix;

  public static final String SERIALIZED_NAME_VISAS = "visas";
  @SerializedName(SERIALIZED_NAME_VISAS)
  private List<EdFiStudentVisa> visas = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStudent() { 
  }

  public EdFiStudent id(String id) {
    
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


  public EdFiStudent studentUniqueId(String studentUniqueId) {
    
    this.studentUniqueId = studentUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a student.
   * @return studentUniqueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique alphanumeric code assigned to a student.")

  public String getStudentUniqueId() {
    return studentUniqueId;
  }


  public void setStudentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
  }


  public EdFiStudent personReference(EdFiPersonReference personReference) {
    
    this.personReference = personReference;
    return this;
  }

   /**
   * Get personReference
   * @return personReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiPersonReference getPersonReference() {
    return personReference;
  }


  public void setPersonReference(EdFiPersonReference personReference) {
    this.personReference = personReference;
  }


  public EdFiStudent birthCity(String birthCity) {
    
    this.birthCity = birthCity;
    return this;
  }

   /**
   * The city the student was born in.
   * @return birthCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city the student was born in.")

  public String getBirthCity() {
    return birthCity;
  }


  public void setBirthCity(String birthCity) {
    this.birthCity = birthCity;
  }


  public EdFiStudent birthCountryDescriptor(String birthCountryDescriptor) {
    
    this.birthCountryDescriptor = birthCountryDescriptor;
    return this;
  }

   /**
   * The country in which an individual is born. It is strongly recommended that entries use only ISO 3166 2-letter country codes.
   * @return birthCountryDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country in which an individual is born. It is strongly recommended that entries use only ISO 3166 2-letter country codes.")

  public String getBirthCountryDescriptor() {
    return birthCountryDescriptor;
  }


  public void setBirthCountryDescriptor(String birthCountryDescriptor) {
    this.birthCountryDescriptor = birthCountryDescriptor;
  }


  public EdFiStudent birthDate(LocalDate birthDate) {
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * The month, day, and year on which an individual was born.
   * @return birthDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year on which an individual was born.")

  public LocalDate getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public EdFiStudent birthInternationalProvince(String birthInternationalProvince) {
    
    this.birthInternationalProvince = birthInternationalProvince;
    return this;
  }

   /**
   * For students born outside of the U.S., the Province or jurisdiction in which an individual is born.
   * @return birthInternationalProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For students born outside of the U.S., the Province or jurisdiction in which an individual is born.")

  public String getBirthInternationalProvince() {
    return birthInternationalProvince;
  }


  public void setBirthInternationalProvince(String birthInternationalProvince) {
    this.birthInternationalProvince = birthInternationalProvince;
  }


  public EdFiStudent birthSexDescriptor(String birthSexDescriptor) {
    
    this.birthSexDescriptor = birthSexDescriptor;
    return this;
  }

   /**
   * A person&#39;s gender at birth.
   * @return birthSexDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A person's gender at birth.")

  public String getBirthSexDescriptor() {
    return birthSexDescriptor;
  }


  public void setBirthSexDescriptor(String birthSexDescriptor) {
    this.birthSexDescriptor = birthSexDescriptor;
  }


  public EdFiStudent birthStateAbbreviationDescriptor(String birthStateAbbreviationDescriptor) {
    
    this.birthStateAbbreviationDescriptor = birthStateAbbreviationDescriptor;
    return this;
  }

   /**
   * The abbreviation for the name of the state (within the United States) or extra-state jurisdiction in which an individual was born.
   * @return birthStateAbbreviationDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The abbreviation for the name of the state (within the United States) or extra-state jurisdiction in which an individual was born.")

  public String getBirthStateAbbreviationDescriptor() {
    return birthStateAbbreviationDescriptor;
  }


  public void setBirthStateAbbreviationDescriptor(String birthStateAbbreviationDescriptor) {
    this.birthStateAbbreviationDescriptor = birthStateAbbreviationDescriptor;
  }


  public EdFiStudent citizenshipStatusDescriptor(String citizenshipStatusDescriptor) {
    
    this.citizenshipStatusDescriptor = citizenshipStatusDescriptor;
    return this;
  }

   /**
   * An indicator of whether or not the person is a U.S. citizen.
   * @return citizenshipStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indicator of whether or not the person is a U.S. citizen.")

  public String getCitizenshipStatusDescriptor() {
    return citizenshipStatusDescriptor;
  }


  public void setCitizenshipStatusDescriptor(String citizenshipStatusDescriptor) {
    this.citizenshipStatusDescriptor = citizenshipStatusDescriptor;
  }


  public EdFiStudent dateEnteredUS(LocalDate dateEnteredUS) {
    
    this.dateEnteredUS = dateEnteredUS;
    return this;
  }

   /**
   * For students born outside of the U.S., the date the student entered the U.S.
   * @return dateEnteredUS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For students born outside of the U.S., the date the student entered the U.S.")

  public LocalDate getDateEnteredUS() {
    return dateEnteredUS;
  }


  public void setDateEnteredUS(LocalDate dateEnteredUS) {
    this.dateEnteredUS = dateEnteredUS;
  }


  public EdFiStudent firstName(String firstName) {
    
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


  public EdFiStudent generationCodeSuffix(String generationCodeSuffix) {
    
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


  public EdFiStudent identificationDocuments(List<EdFiStudentIdentificationDocument> identificationDocuments) {
    
    this.identificationDocuments = identificationDocuments;
    return this;
  }

  public EdFiStudent addIdentificationDocumentsItem(EdFiStudentIdentificationDocument identificationDocumentsItem) {
    if (this.identificationDocuments == null) {
      this.identificationDocuments = new ArrayList<EdFiStudentIdentificationDocument>();
    }
    this.identificationDocuments.add(identificationDocumentsItem);
    return this;
  }

   /**
   * An unordered collection of studentIdentificationDocuments. Describe the documentation of citizenship.
   * @return identificationDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentIdentificationDocuments. Describe the documentation of citizenship.")

  public List<EdFiStudentIdentificationDocument> getIdentificationDocuments() {
    return identificationDocuments;
  }


  public void setIdentificationDocuments(List<EdFiStudentIdentificationDocument> identificationDocuments) {
    this.identificationDocuments = identificationDocuments;
  }


  public EdFiStudent lastSurname(String lastSurname) {
    
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


  public EdFiStudent maidenName(String maidenName) {
    
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


  public EdFiStudent middleName(String middleName) {
    
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


  public EdFiStudent multipleBirthStatus(Boolean multipleBirthStatus) {
    
    this.multipleBirthStatus = multipleBirthStatus;
    return this;
  }

   /**
   * Indicator of whether the student was born with other siblings (i.e., twins, triplets, etc.)
   * @return multipleBirthStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the student was born with other siblings (i.e., twins, triplets, etc.)")

  public Boolean getMultipleBirthStatus() {
    return multipleBirthStatus;
  }


  public void setMultipleBirthStatus(Boolean multipleBirthStatus) {
    this.multipleBirthStatus = multipleBirthStatus;
  }


  public EdFiStudent otherNames(List<EdFiStudentOtherName> otherNames) {
    
    this.otherNames = otherNames;
    return this;
  }

  public EdFiStudent addOtherNamesItem(EdFiStudentOtherName otherNamesItem) {
    if (this.otherNames == null) {
      this.otherNames = new ArrayList<EdFiStudentOtherName>();
    }
    this.otherNames.add(otherNamesItem);
    return this;
  }

   /**
   * An unordered collection of studentOtherNames. Other names (e.g., alias, nickname, previous legal name) associated with a person.
   * @return otherNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentOtherNames. Other names (e.g., alias, nickname, previous legal name) associated with a person.")

  public List<EdFiStudentOtherName> getOtherNames() {
    return otherNames;
  }


  public void setOtherNames(List<EdFiStudentOtherName> otherNames) {
    this.otherNames = otherNames;
  }


  public EdFiStudent personalIdentificationDocuments(List<EdFiStudentPersonalIdentificationDocument> personalIdentificationDocuments) {
    
    this.personalIdentificationDocuments = personalIdentificationDocuments;
    return this;
  }

  public EdFiStudent addPersonalIdentificationDocumentsItem(EdFiStudentPersonalIdentificationDocument personalIdentificationDocumentsItem) {
    if (this.personalIdentificationDocuments == null) {
      this.personalIdentificationDocuments = new ArrayList<EdFiStudentPersonalIdentificationDocument>();
    }
    this.personalIdentificationDocuments.add(personalIdentificationDocumentsItem);
    return this;
  }

   /**
   * An unordered collection of studentPersonalIdentificationDocuments. The documents presented as evident to verify one&#39;s personal identity; for example: drivers license, passport, birth certificate, etc.
   * @return personalIdentificationDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentPersonalIdentificationDocuments. The documents presented as evident to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.")

  public List<EdFiStudentPersonalIdentificationDocument> getPersonalIdentificationDocuments() {
    return personalIdentificationDocuments;
  }


  public void setPersonalIdentificationDocuments(List<EdFiStudentPersonalIdentificationDocument> personalIdentificationDocuments) {
    this.personalIdentificationDocuments = personalIdentificationDocuments;
  }


  public EdFiStudent personalTitlePrefix(String personalTitlePrefix) {
    
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


  public EdFiStudent visas(List<EdFiStudentVisa> visas) {
    
    this.visas = visas;
    return this;
  }

  public EdFiStudent addVisasItem(EdFiStudentVisa visasItem) {
    if (this.visas == null) {
      this.visas = new ArrayList<EdFiStudentVisa>();
    }
    this.visas.add(visasItem);
    return this;
  }

   /**
   * An unordered collection of studentVisas. An indicator of a non-US citizen&#39;s Visa type.
   * @return visas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentVisas. An indicator of a non-US citizen's Visa type.")

  public List<EdFiStudentVisa> getVisas() {
    return visas;
  }


  public void setVisas(List<EdFiStudentVisa> visas) {
    this.visas = visas;
  }


  public EdFiStudent etag(String etag) {
    
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
    EdFiStudent edFiStudent = (EdFiStudent) o;
    return Objects.equals(this.id, edFiStudent.id) &&
        Objects.equals(this.studentUniqueId, edFiStudent.studentUniqueId) &&
        Objects.equals(this.personReference, edFiStudent.personReference) &&
        Objects.equals(this.birthCity, edFiStudent.birthCity) &&
        Objects.equals(this.birthCountryDescriptor, edFiStudent.birthCountryDescriptor) &&
        Objects.equals(this.birthDate, edFiStudent.birthDate) &&
        Objects.equals(this.birthInternationalProvince, edFiStudent.birthInternationalProvince) &&
        Objects.equals(this.birthSexDescriptor, edFiStudent.birthSexDescriptor) &&
        Objects.equals(this.birthStateAbbreviationDescriptor, edFiStudent.birthStateAbbreviationDescriptor) &&
        Objects.equals(this.citizenshipStatusDescriptor, edFiStudent.citizenshipStatusDescriptor) &&
        Objects.equals(this.dateEnteredUS, edFiStudent.dateEnteredUS) &&
        Objects.equals(this.firstName, edFiStudent.firstName) &&
        Objects.equals(this.generationCodeSuffix, edFiStudent.generationCodeSuffix) &&
        Objects.equals(this.identificationDocuments, edFiStudent.identificationDocuments) &&
        Objects.equals(this.lastSurname, edFiStudent.lastSurname) &&
        Objects.equals(this.maidenName, edFiStudent.maidenName) &&
        Objects.equals(this.middleName, edFiStudent.middleName) &&
        Objects.equals(this.multipleBirthStatus, edFiStudent.multipleBirthStatus) &&
        Objects.equals(this.otherNames, edFiStudent.otherNames) &&
        Objects.equals(this.personalIdentificationDocuments, edFiStudent.personalIdentificationDocuments) &&
        Objects.equals(this.personalTitlePrefix, edFiStudent.personalTitlePrefix) &&
        Objects.equals(this.visas, edFiStudent.visas) &&
        Objects.equals(this.etag, edFiStudent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentUniqueId, personReference, birthCity, birthCountryDescriptor, birthDate, birthInternationalProvince, birthSexDescriptor, birthStateAbbreviationDescriptor, citizenshipStatusDescriptor, dateEnteredUS, firstName, generationCodeSuffix, identificationDocuments, lastSurname, maidenName, middleName, multipleBirthStatus, otherNames, personalIdentificationDocuments, personalTitlePrefix, visas, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
    sb.append("    personReference: ").append(toIndentedString(personReference)).append("\n");
    sb.append("    birthCity: ").append(toIndentedString(birthCity)).append("\n");
    sb.append("    birthCountryDescriptor: ").append(toIndentedString(birthCountryDescriptor)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthInternationalProvince: ").append(toIndentedString(birthInternationalProvince)).append("\n");
    sb.append("    birthSexDescriptor: ").append(toIndentedString(birthSexDescriptor)).append("\n");
    sb.append("    birthStateAbbreviationDescriptor: ").append(toIndentedString(birthStateAbbreviationDescriptor)).append("\n");
    sb.append("    citizenshipStatusDescriptor: ").append(toIndentedString(citizenshipStatusDescriptor)).append("\n");
    sb.append("    dateEnteredUS: ").append(toIndentedString(dateEnteredUS)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    generationCodeSuffix: ").append(toIndentedString(generationCodeSuffix)).append("\n");
    sb.append("    identificationDocuments: ").append(toIndentedString(identificationDocuments)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    multipleBirthStatus: ").append(toIndentedString(multipleBirthStatus)).append("\n");
    sb.append("    otherNames: ").append(toIndentedString(otherNames)).append("\n");
    sb.append("    personalIdentificationDocuments: ").append(toIndentedString(personalIdentificationDocuments)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
    sb.append("    visas: ").append(toIndentedString(visas)).append("\n");
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

