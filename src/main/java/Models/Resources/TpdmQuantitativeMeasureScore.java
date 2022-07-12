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
import Models.Resources.TpdmEvaluationElementRatingReference;
import Models.Resources.TpdmQuantitativeMeasureReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TpdmQuantitativeMeasureScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmQuantitativeMeasureScore {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EVALUATION_ELEMENT_RATING_REFERENCE = "evaluationElementRatingReference";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ELEMENT_RATING_REFERENCE)
  private TpdmEvaluationElementRatingReference evaluationElementRatingReference;

  public static final String SERIALIZED_NAME_QUANTITATIVE_MEASURE_REFERENCE = "quantitativeMeasureReference";
  @SerializedName(SERIALIZED_NAME_QUANTITATIVE_MEASURE_REFERENCE)
  private TpdmQuantitativeMeasureReference quantitativeMeasureReference;

  public static final String SERIALIZED_NAME_SCORE_VALUE = "scoreValue";
  @SerializedName(SERIALIZED_NAME_SCORE_VALUE)
  private Double scoreValue;

  public static final String SERIALIZED_NAME_STANDARD_ERROR = "standardError";
  @SerializedName(SERIALIZED_NAME_STANDARD_ERROR)
  private Double standardError;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmQuantitativeMeasureScore() { 
  }

  public TpdmQuantitativeMeasureScore id(String id) {
    
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


  public TpdmQuantitativeMeasureScore evaluationElementRatingReference(TpdmEvaluationElementRatingReference evaluationElementRatingReference) {
    
    this.evaluationElementRatingReference = evaluationElementRatingReference;
    return this;
  }

   /**
   * Get evaluationElementRatingReference
   * @return evaluationElementRatingReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmEvaluationElementRatingReference getEvaluationElementRatingReference() {
    return evaluationElementRatingReference;
  }


  public void setEvaluationElementRatingReference(TpdmEvaluationElementRatingReference evaluationElementRatingReference) {
    this.evaluationElementRatingReference = evaluationElementRatingReference;
  }


  public TpdmQuantitativeMeasureScore quantitativeMeasureReference(TpdmQuantitativeMeasureReference quantitativeMeasureReference) {
    
    this.quantitativeMeasureReference = quantitativeMeasureReference;
    return this;
  }

   /**
   * Get quantitativeMeasureReference
   * @return quantitativeMeasureReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmQuantitativeMeasureReference getQuantitativeMeasureReference() {
    return quantitativeMeasureReference;
  }


  public void setQuantitativeMeasureReference(TpdmQuantitativeMeasureReference quantitativeMeasureReference) {
    this.quantitativeMeasureReference = quantitativeMeasureReference;
  }


  public TpdmQuantitativeMeasureScore scoreValue(Double scoreValue) {
    
    this.scoreValue = scoreValue;
    return this;
  }

   /**
   * The score value for the quantitive measure.
   * @return scoreValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The score value for the quantitive measure.")

  public Double getScoreValue() {
    return scoreValue;
  }


  public void setScoreValue(Double scoreValue) {
    this.scoreValue = scoreValue;
  }


  public TpdmQuantitativeMeasureScore standardError(Double standardError) {
    
    this.standardError = standardError;
    return this;
  }

   /**
   * The standard error for the quantitative measure.
   * @return standardError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The standard error for the quantitative measure.")

  public Double getStandardError() {
    return standardError;
  }


  public void setStandardError(Double standardError) {
    this.standardError = standardError;
  }


  public TpdmQuantitativeMeasureScore etag(String etag) {
    
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
    TpdmQuantitativeMeasureScore tpdmQuantitativeMeasureScore = (TpdmQuantitativeMeasureScore) o;
    return Objects.equals(this.id, tpdmQuantitativeMeasureScore.id) &&
        Objects.equals(this.evaluationElementRatingReference, tpdmQuantitativeMeasureScore.evaluationElementRatingReference) &&
        Objects.equals(this.quantitativeMeasureReference, tpdmQuantitativeMeasureScore.quantitativeMeasureReference) &&
        Objects.equals(this.scoreValue, tpdmQuantitativeMeasureScore.scoreValue) &&
        Objects.equals(this.standardError, tpdmQuantitativeMeasureScore.standardError) &&
        Objects.equals(this.etag, tpdmQuantitativeMeasureScore.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, evaluationElementRatingReference, quantitativeMeasureReference, scoreValue, standardError, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmQuantitativeMeasureScore {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    evaluationElementRatingReference: ").append(toIndentedString(evaluationElementRatingReference)).append("\n");
    sb.append("    quantitativeMeasureReference: ").append(toIndentedString(quantitativeMeasureReference)).append("\n");
    sb.append("    scoreValue: ").append(toIndentedString(scoreValue)).append("\n");
    sb.append("    standardError: ").append(toIndentedString(standardError)).append("\n");
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

