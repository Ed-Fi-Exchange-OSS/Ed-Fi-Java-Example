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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiStaffOtherName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStaffOtherName {
  public static final String SERIALIZED_NAME_OTHER_NAME_TYPE_DESCRIPTOR = "otherNameTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_OTHER_NAME_TYPE_DESCRIPTOR)
  private String otherNameTypeDescriptor;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GENERATION_CODE_SUFFIX = "generationCodeSuffix";
  @SerializedName(SERIALIZED_NAME_GENERATION_CODE_SUFFIX)
  private String generationCodeSuffix;

  public static final String SERIALIZED_NAME_LAST_SURNAME = "lastSurname";
  @SerializedName(SERIALIZED_NAME_LAST_SURNAME)
  private String lastSurname;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_PERSONAL_TITLE_PREFIX = "personalTitlePrefix";
  @SerializedName(SERIALIZED_NAME_PERSONAL_TITLE_PREFIX)
  private String personalTitlePrefix;

  public EdFiStaffOtherName() { 
  }

  public EdFiStaffOtherName otherNameTypeDescriptor(String otherNameTypeDescriptor) {
    
    this.otherNameTypeDescriptor = otherNameTypeDescriptor;
    return this;
  }

   /**
   * The types of alternate names for a person.
   * @return otherNameTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The types of alternate names for a person.")

  public String getOtherNameTypeDescriptor() {
    return otherNameTypeDescriptor;
  }


  public void setOtherNameTypeDescriptor(String otherNameTypeDescriptor) {
    this.otherNameTypeDescriptor = otherNameTypeDescriptor;
  }


  public EdFiStaffOtherName firstName(String firstName) {
    
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


  public EdFiStaffOtherName generationCodeSuffix(String generationCodeSuffix) {
    
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


  public EdFiStaffOtherName lastSurname(String lastSurname) {
    
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


  public EdFiStaffOtherName middleName(String middleName) {
    
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


  public EdFiStaffOtherName personalTitlePrefix(String personalTitlePrefix) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStaffOtherName edFiStaffOtherName = (EdFiStaffOtherName) o;
    return Objects.equals(this.otherNameTypeDescriptor, edFiStaffOtherName.otherNameTypeDescriptor) &&
        Objects.equals(this.firstName, edFiStaffOtherName.firstName) &&
        Objects.equals(this.generationCodeSuffix, edFiStaffOtherName.generationCodeSuffix) &&
        Objects.equals(this.lastSurname, edFiStaffOtherName.lastSurname) &&
        Objects.equals(this.middleName, edFiStaffOtherName.middleName) &&
        Objects.equals(this.personalTitlePrefix, edFiStaffOtherName.personalTitlePrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherNameTypeDescriptor, firstName, generationCodeSuffix, lastSurname, middleName, personalTitlePrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffOtherName {\n");
    sb.append("    otherNameTypeDescriptor: ").append(toIndentedString(otherNameTypeDescriptor)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    generationCodeSuffix: ").append(toIndentedString(generationCodeSuffix)).append("\n");
    sb.append("    lastSurname: ").append(toIndentedString(lastSurname)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    personalTitlePrefix: ").append(toIndentedString(personalTitlePrefix)).append("\n");
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

