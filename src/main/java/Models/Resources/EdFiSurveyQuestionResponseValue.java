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
 * EdFiSurveyQuestionResponseValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiSurveyQuestionResponseValue {
  public static final String SERIALIZED_NAME_SURVEY_QUESTION_RESPONSE_VALUE_IDENTIFIER = "surveyQuestionResponseValueIdentifier";
  @SerializedName(SERIALIZED_NAME_SURVEY_QUESTION_RESPONSE_VALUE_IDENTIFIER)
  private Integer surveyQuestionResponseValueIdentifier;

  public static final String SERIALIZED_NAME_NUMERIC_RESPONSE = "numericResponse";
  @SerializedName(SERIALIZED_NAME_NUMERIC_RESPONSE)
  private Integer numericResponse;

  public static final String SERIALIZED_NAME_TEXT_RESPONSE = "textResponse";
  @SerializedName(SERIALIZED_NAME_TEXT_RESPONSE)
  private String textResponse;

  public EdFiSurveyQuestionResponseValue() { 
  }

  public EdFiSurveyQuestionResponseValue surveyQuestionResponseValueIdentifier(Integer surveyQuestionResponseValueIdentifier) {
    
    this.surveyQuestionResponseValueIdentifier = surveyQuestionResponseValueIdentifier;
    return this;
  }

   /**
   * Primary key for the response value; a unique, usually sequential numeric value for a collection of responses, or potentially the value of NumericResponse for a single response.
   * @return surveyQuestionResponseValueIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Primary key for the response value; a unique, usually sequential numeric value for a collection of responses, or potentially the value of NumericResponse for a single response.")

  public Integer getSurveyQuestionResponseValueIdentifier() {
    return surveyQuestionResponseValueIdentifier;
  }


  public void setSurveyQuestionResponseValueIdentifier(Integer surveyQuestionResponseValueIdentifier) {
    this.surveyQuestionResponseValueIdentifier = surveyQuestionResponseValueIdentifier;
  }


  public EdFiSurveyQuestionResponseValue numericResponse(Integer numericResponse) {
    
    this.numericResponse = numericResponse;
    return this;
  }

   /**
   * A numeric response to the question.
   * @return numericResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A numeric response to the question.")

  public Integer getNumericResponse() {
    return numericResponse;
  }


  public void setNumericResponse(Integer numericResponse) {
    this.numericResponse = numericResponse;
  }


  public EdFiSurveyQuestionResponseValue textResponse(String textResponse) {
    
    this.textResponse = textResponse;
    return this;
  }

   /**
   * A text response to the question.
   * @return textResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A text response to the question.")

  public String getTextResponse() {
    return textResponse;
  }


  public void setTextResponse(String textResponse) {
    this.textResponse = textResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiSurveyQuestionResponseValue edFiSurveyQuestionResponseValue = (EdFiSurveyQuestionResponseValue) o;
    return Objects.equals(this.surveyQuestionResponseValueIdentifier, edFiSurveyQuestionResponseValue.surveyQuestionResponseValueIdentifier) &&
        Objects.equals(this.numericResponse, edFiSurveyQuestionResponseValue.numericResponse) &&
        Objects.equals(this.textResponse, edFiSurveyQuestionResponseValue.textResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyQuestionResponseValueIdentifier, numericResponse, textResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiSurveyQuestionResponseValue {\n");
    sb.append("    surveyQuestionResponseValueIdentifier: ").append(toIndentedString(surveyQuestionResponseValueIdentifier)).append("\n");
    sb.append("    numericResponse: ").append(toIndentedString(numericResponse)).append("\n");
    sb.append("    textResponse: ").append(toIndentedString(textResponse)).append("\n");
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

