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
import Models.Resources.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiSurveyQuestionReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiSurveyQuestionReference {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_QUESTION_CODE = "questionCode";
  @SerializedName(SERIALIZED_NAME_QUESTION_CODE)
  private String questionCode;

  public static final String SERIALIZED_NAME_SURVEY_IDENTIFIER = "surveyIdentifier";
  @SerializedName(SERIALIZED_NAME_SURVEY_IDENTIFIER)
  private String surveyIdentifier;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiSurveyQuestionReference() { 
  }

  public EdFiSurveyQuestionReference namespace(String namespace) {
    
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


  public EdFiSurveyQuestionReference questionCode(String questionCode) {
    
    this.questionCode = questionCode;
    return this;
  }

   /**
   * The identifying code for the question, unique for the survey.
   * @return questionCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifying code for the question, unique for the survey.")

  public String getQuestionCode() {
    return questionCode;
  }


  public void setQuestionCode(String questionCode) {
    this.questionCode = questionCode;
  }


  public EdFiSurveyQuestionReference surveyIdentifier(String surveyIdentifier) {
    
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


  public EdFiSurveyQuestionReference link(Link link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getLink() {
    return link;
  }


  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiSurveyQuestionReference edFiSurveyQuestionReference = (EdFiSurveyQuestionReference) o;
    return Objects.equals(this.namespace, edFiSurveyQuestionReference.namespace) &&
        Objects.equals(this.questionCode, edFiSurveyQuestionReference.questionCode) &&
        Objects.equals(this.surveyIdentifier, edFiSurveyQuestionReference.surveyIdentifier) &&
        Objects.equals(this.link, edFiSurveyQuestionReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, questionCode, surveyIdentifier, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiSurveyQuestionReference {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    questionCode: ").append(toIndentedString(questionCode)).append("\n");
    sb.append("    surveyIdentifier: ").append(toIndentedString(surveyIdentifier)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

