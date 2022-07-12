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
import Models.Resources.EdFiSurveyResponseReference;
import Models.Resources.EdFiSurveySectionReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiSurveySectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiSurveySectionResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SURVEY_RESPONSE_REFERENCE = "surveyResponseReference";
  @SerializedName(SERIALIZED_NAME_SURVEY_RESPONSE_REFERENCE)
  private EdFiSurveyResponseReference surveyResponseReference;

  public static final String SERIALIZED_NAME_SURVEY_SECTION_REFERENCE = "surveySectionReference";
  @SerializedName(SERIALIZED_NAME_SURVEY_SECTION_REFERENCE)
  private EdFiSurveySectionReference surveySectionReference;

  public static final String SERIALIZED_NAME_SECTION_RATING = "sectionRating";
  @SerializedName(SERIALIZED_NAME_SECTION_RATING)
  private Double sectionRating;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiSurveySectionResponse() { 
  }

  public EdFiSurveySectionResponse id(String id) {
    
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


  public EdFiSurveySectionResponse surveyResponseReference(EdFiSurveyResponseReference surveyResponseReference) {
    
    this.surveyResponseReference = surveyResponseReference;
    return this;
  }

   /**
   * Get surveyResponseReference
   * @return surveyResponseReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSurveyResponseReference getSurveyResponseReference() {
    return surveyResponseReference;
  }


  public void setSurveyResponseReference(EdFiSurveyResponseReference surveyResponseReference) {
    this.surveyResponseReference = surveyResponseReference;
  }


  public EdFiSurveySectionResponse surveySectionReference(EdFiSurveySectionReference surveySectionReference) {
    
    this.surveySectionReference = surveySectionReference;
    return this;
  }

   /**
   * Get surveySectionReference
   * @return surveySectionReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSurveySectionReference getSurveySectionReference() {
    return surveySectionReference;
  }


  public void setSurveySectionReference(EdFiSurveySectionReference surveySectionReference) {
    this.surveySectionReference = surveySectionReference;
  }


  public EdFiSurveySectionResponse sectionRating(Double sectionRating) {
    
    this.sectionRating = sectionRating;
    return this;
  }

   /**
   * Numeric rating computed from the survey responses for the section.
   * @return sectionRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeric rating computed from the survey responses for the section.")

  public Double getSectionRating() {
    return sectionRating;
  }


  public void setSectionRating(Double sectionRating) {
    this.sectionRating = sectionRating;
  }


  public EdFiSurveySectionResponse etag(String etag) {
    
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
    EdFiSurveySectionResponse edFiSurveySectionResponse = (EdFiSurveySectionResponse) o;
    return Objects.equals(this.id, edFiSurveySectionResponse.id) &&
        Objects.equals(this.surveyResponseReference, edFiSurveySectionResponse.surveyResponseReference) &&
        Objects.equals(this.surveySectionReference, edFiSurveySectionResponse.surveySectionReference) &&
        Objects.equals(this.sectionRating, edFiSurveySectionResponse.sectionRating) &&
        Objects.equals(this.etag, edFiSurveySectionResponse.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, surveyResponseReference, surveySectionReference, sectionRating, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiSurveySectionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surveyResponseReference: ").append(toIndentedString(surveyResponseReference)).append("\n");
    sb.append("    surveySectionReference: ").append(toIndentedString(surveySectionReference)).append("\n");
    sb.append("    sectionRating: ").append(toIndentedString(sectionRating)).append("\n");
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

