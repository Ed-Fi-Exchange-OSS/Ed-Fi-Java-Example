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
import Models.Resources.EdFiSchoolYearTypeReference;
import Models.Resources.EdFiSessionReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiSurvey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiSurvey {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_SURVEY_IDENTIFIER = "surveyIdentifier";
  @SerializedName(SERIALIZED_NAME_SURVEY_IDENTIFIER)
  private String surveyIdentifier;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE = "educationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference educationOrganizationReference;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE = "schoolYearTypeReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE)
  private EdFiSchoolYearTypeReference schoolYearTypeReference;

  public static final String SERIALIZED_NAME_SESSION_REFERENCE = "sessionReference";
  @SerializedName(SERIALIZED_NAME_SESSION_REFERENCE)
  private EdFiSessionReference sessionReference;

  public static final String SERIALIZED_NAME_NUMBER_ADMINISTERED = "numberAdministered";
  @SerializedName(SERIALIZED_NAME_NUMBER_ADMINISTERED)
  private Integer numberAdministered;

  public static final String SERIALIZED_NAME_SURVEY_CATEGORY_DESCRIPTOR = "surveyCategoryDescriptor";
  @SerializedName(SERIALIZED_NAME_SURVEY_CATEGORY_DESCRIPTOR)
  private String surveyCategoryDescriptor;

  public static final String SERIALIZED_NAME_SURVEY_TITLE = "surveyTitle";
  @SerializedName(SERIALIZED_NAME_SURVEY_TITLE)
  private String surveyTitle;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiSurvey() { 
  }

  public EdFiSurvey id(String id) {
    
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


  public EdFiSurvey namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the Survey.
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace for the Survey.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public EdFiSurvey surveyIdentifier(String surveyIdentifier) {
    
    this.surveyIdentifier = surveyIdentifier;
    return this;
  }

   /**
   * The unique survey identifier from the survey tool.
   * @return surveyIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique survey identifier from the survey tool.")

  public String getSurveyIdentifier() {
    return surveyIdentifier;
  }


  public void setSurveyIdentifier(String surveyIdentifier) {
    this.surveyIdentifier = surveyIdentifier;
  }


  public EdFiSurvey educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }


  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }


  public EdFiSurvey schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSchoolYearTypeReference getSchoolYearTypeReference() {
    return schoolYearTypeReference;
  }


  public void setSchoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
  }


  public EdFiSurvey sessionReference(EdFiSessionReference sessionReference) {
    
    this.sessionReference = sessionReference;
    return this;
  }

   /**
   * Get sessionReference
   * @return sessionReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiSessionReference getSessionReference() {
    return sessionReference;
  }


  public void setSessionReference(EdFiSessionReference sessionReference) {
    this.sessionReference = sessionReference;
  }


  public EdFiSurvey numberAdministered(Integer numberAdministered) {
    
    this.numberAdministered = numberAdministered;
    return this;
  }

   /**
   * Number of persons to whom this survey was administered.
   * @return numberAdministered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of persons to whom this survey was administered.")

  public Integer getNumberAdministered() {
    return numberAdministered;
  }


  public void setNumberAdministered(Integer numberAdministered) {
    this.numberAdministered = numberAdministered;
  }


  public EdFiSurvey surveyCategoryDescriptor(String surveyCategoryDescriptor) {
    
    this.surveyCategoryDescriptor = surveyCategoryDescriptor;
    return this;
  }

   /**
   * The category or type of survey.
   * @return surveyCategoryDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category or type of survey.")

  public String getSurveyCategoryDescriptor() {
    return surveyCategoryDescriptor;
  }


  public void setSurveyCategoryDescriptor(String surveyCategoryDescriptor) {
    this.surveyCategoryDescriptor = surveyCategoryDescriptor;
  }


  public EdFiSurvey surveyTitle(String surveyTitle) {
    
    this.surveyTitle = surveyTitle;
    return this;
  }

   /**
   * The title of the survey.
   * @return surveyTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The title of the survey.")

  public String getSurveyTitle() {
    return surveyTitle;
  }


  public void setSurveyTitle(String surveyTitle) {
    this.surveyTitle = surveyTitle;
  }


  public EdFiSurvey etag(String etag) {
    
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
    EdFiSurvey edFiSurvey = (EdFiSurvey) o;
    return Objects.equals(this.id, edFiSurvey.id) &&
        Objects.equals(this.namespace, edFiSurvey.namespace) &&
        Objects.equals(this.surveyIdentifier, edFiSurvey.surveyIdentifier) &&
        Objects.equals(this.educationOrganizationReference, edFiSurvey.educationOrganizationReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiSurvey.schoolYearTypeReference) &&
        Objects.equals(this.sessionReference, edFiSurvey.sessionReference) &&
        Objects.equals(this.numberAdministered, edFiSurvey.numberAdministered) &&
        Objects.equals(this.surveyCategoryDescriptor, edFiSurvey.surveyCategoryDescriptor) &&
        Objects.equals(this.surveyTitle, edFiSurvey.surveyTitle) &&
        Objects.equals(this.etag, edFiSurvey.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, surveyIdentifier, educationOrganizationReference, schoolYearTypeReference, sessionReference, numberAdministered, surveyCategoryDescriptor, surveyTitle, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiSurvey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    surveyIdentifier: ").append(toIndentedString(surveyIdentifier)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    sessionReference: ").append(toIndentedString(sessionReference)).append("\n");
    sb.append("    numberAdministered: ").append(toIndentedString(numberAdministered)).append("\n");
    sb.append("    surveyCategoryDescriptor: ").append(toIndentedString(surveyCategoryDescriptor)).append("\n");
    sb.append("    surveyTitle: ").append(toIndentedString(surveyTitle)).append("\n");
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
