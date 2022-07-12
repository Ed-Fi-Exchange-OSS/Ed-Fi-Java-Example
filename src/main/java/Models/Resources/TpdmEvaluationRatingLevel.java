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
 * TpdmEvaluationRatingLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmEvaluationRatingLevel {
  public static final String SERIALIZED_NAME_EVALUATION_RATING_LEVEL_DESCRIPTOR = "evaluationRatingLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_EVALUATION_RATING_LEVEL_DESCRIPTOR)
  private String evaluationRatingLevelDescriptor;

  public static final String SERIALIZED_NAME_MAX_RATING = "maxRating";
  @SerializedName(SERIALIZED_NAME_MAX_RATING)
  private Double maxRating;

  public static final String SERIALIZED_NAME_MIN_RATING = "minRating";
  @SerializedName(SERIALIZED_NAME_MIN_RATING)
  private Double minRating;

  public TpdmEvaluationRatingLevel() { 
  }

  public TpdmEvaluationRatingLevel evaluationRatingLevelDescriptor(String evaluationRatingLevelDescriptor) {
    
    this.evaluationRatingLevelDescriptor = evaluationRatingLevelDescriptor;
    return this;
  }

   /**
   * The title for a level of rating or evaluation band (e.g., Excellent, Acceptable, Needs Improvement, Unacceptable).
   * @return evaluationRatingLevelDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The title for a level of rating or evaluation band (e.g., Excellent, Acceptable, Needs Improvement, Unacceptable).")

  public String getEvaluationRatingLevelDescriptor() {
    return evaluationRatingLevelDescriptor;
  }


  public void setEvaluationRatingLevelDescriptor(String evaluationRatingLevelDescriptor) {
    this.evaluationRatingLevelDescriptor = evaluationRatingLevelDescriptor;
  }


  public TpdmEvaluationRatingLevel maxRating(Double maxRating) {
    
    this.maxRating = maxRating;
    return this;
  }

   /**
   * The maximum numerical rating or score to achieve the evaluation rating level.
   * @return maxRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum numerical rating or score to achieve the evaluation rating level.")

  public Double getMaxRating() {
    return maxRating;
  }


  public void setMaxRating(Double maxRating) {
    this.maxRating = maxRating;
  }


  public TpdmEvaluationRatingLevel minRating(Double minRating) {
    
    this.minRating = minRating;
    return this;
  }

   /**
   * The minimum numerical rating or score to achieve the evaluation rating level.
   * @return minRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum numerical rating or score to achieve the evaluation rating level.")

  public Double getMinRating() {
    return minRating;
  }


  public void setMinRating(Double minRating) {
    this.minRating = minRating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmEvaluationRatingLevel tpdmEvaluationRatingLevel = (TpdmEvaluationRatingLevel) o;
    return Objects.equals(this.evaluationRatingLevelDescriptor, tpdmEvaluationRatingLevel.evaluationRatingLevelDescriptor) &&
        Objects.equals(this.maxRating, tpdmEvaluationRatingLevel.maxRating) &&
        Objects.equals(this.minRating, tpdmEvaluationRatingLevel.minRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationRatingLevelDescriptor, maxRating, minRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmEvaluationRatingLevel {\n");
    sb.append("    evaluationRatingLevelDescriptor: ").append(toIndentedString(evaluationRatingLevelDescriptor)).append("\n");
    sb.append("    maxRating: ").append(toIndentedString(maxRating)).append("\n");
    sb.append("    minRating: ").append(toIndentedString(minRating)).append("\n");
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

