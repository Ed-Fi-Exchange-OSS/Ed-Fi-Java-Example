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
import Models.Resources.TpdmEvaluationObjectiveRatingResult;
import Models.Resources.TpdmEvaluationObjectiveReference;
import Models.Resources.TpdmEvaluationRatingReference;
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
 * TpdmEvaluationObjectiveRating
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmEvaluationObjectiveRating {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EVALUATION_OBJECTIVE_REFERENCE = "evaluationObjectiveReference";
  @SerializedName(SERIALIZED_NAME_EVALUATION_OBJECTIVE_REFERENCE)
  private TpdmEvaluationObjectiveReference evaluationObjectiveReference;

  public static final String SERIALIZED_NAME_EVALUATION_RATING_REFERENCE = "evaluationRatingReference";
  @SerializedName(SERIALIZED_NAME_EVALUATION_RATING_REFERENCE)
  private TpdmEvaluationRatingReference evaluationRatingReference;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_OBJECTIVE_RATING_LEVEL_DESCRIPTOR = "objectiveRatingLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_RATING_LEVEL_DESCRIPTOR)
  private String objectiveRatingLevelDescriptor;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<TpdmEvaluationObjectiveRatingResult> results = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmEvaluationObjectiveRating() { 
  }

  public TpdmEvaluationObjectiveRating id(String id) {
    
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


  public TpdmEvaluationObjectiveRating evaluationObjectiveReference(TpdmEvaluationObjectiveReference evaluationObjectiveReference) {
    
    this.evaluationObjectiveReference = evaluationObjectiveReference;
    return this;
  }

   /**
   * Get evaluationObjectiveReference
   * @return evaluationObjectiveReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmEvaluationObjectiveReference getEvaluationObjectiveReference() {
    return evaluationObjectiveReference;
  }


  public void setEvaluationObjectiveReference(TpdmEvaluationObjectiveReference evaluationObjectiveReference) {
    this.evaluationObjectiveReference = evaluationObjectiveReference;
  }


  public TpdmEvaluationObjectiveRating evaluationRatingReference(TpdmEvaluationRatingReference evaluationRatingReference) {
    
    this.evaluationRatingReference = evaluationRatingReference;
    return this;
  }

   /**
   * Get evaluationRatingReference
   * @return evaluationRatingReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmEvaluationRatingReference getEvaluationRatingReference() {
    return evaluationRatingReference;
  }


  public void setEvaluationRatingReference(TpdmEvaluationRatingReference evaluationRatingReference) {
    this.evaluationRatingReference = evaluationRatingReference;
  }


  public TpdmEvaluationObjectiveRating comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Any comments about the performance evaluation to be captured.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any comments about the performance evaluation to be captured.")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public TpdmEvaluationObjectiveRating objectiveRatingLevelDescriptor(String objectiveRatingLevelDescriptor) {
    
    this.objectiveRatingLevelDescriptor = objectiveRatingLevelDescriptor;
    return this;
  }

   /**
   * The rating level achieved based upon the rating or score.
   * @return objectiveRatingLevelDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rating level achieved based upon the rating or score.")

  public String getObjectiveRatingLevelDescriptor() {
    return objectiveRatingLevelDescriptor;
  }


  public void setObjectiveRatingLevelDescriptor(String objectiveRatingLevelDescriptor) {
    this.objectiveRatingLevelDescriptor = objectiveRatingLevelDescriptor;
  }


  public TpdmEvaluationObjectiveRating results(List<TpdmEvaluationObjectiveRatingResult> results) {
    
    this.results = results;
    return this;
  }

  public TpdmEvaluationObjectiveRating addResultsItem(TpdmEvaluationObjectiveRatingResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<TpdmEvaluationObjectiveRatingResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * An unordered collection of evaluationObjectiveRatingResults. The numerical summary rating or score for the evaluation Objective.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of evaluationObjectiveRatingResults. The numerical summary rating or score for the evaluation Objective.")

  public List<TpdmEvaluationObjectiveRatingResult> getResults() {
    return results;
  }


  public void setResults(List<TpdmEvaluationObjectiveRatingResult> results) {
    this.results = results;
  }


  public TpdmEvaluationObjectiveRating etag(String etag) {
    
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
    TpdmEvaluationObjectiveRating tpdmEvaluationObjectiveRating = (TpdmEvaluationObjectiveRating) o;
    return Objects.equals(this.id, tpdmEvaluationObjectiveRating.id) &&
        Objects.equals(this.evaluationObjectiveReference, tpdmEvaluationObjectiveRating.evaluationObjectiveReference) &&
        Objects.equals(this.evaluationRatingReference, tpdmEvaluationObjectiveRating.evaluationRatingReference) &&
        Objects.equals(this.comments, tpdmEvaluationObjectiveRating.comments) &&
        Objects.equals(this.objectiveRatingLevelDescriptor, tpdmEvaluationObjectiveRating.objectiveRatingLevelDescriptor) &&
        Objects.equals(this.results, tpdmEvaluationObjectiveRating.results) &&
        Objects.equals(this.etag, tpdmEvaluationObjectiveRating.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, evaluationObjectiveReference, evaluationRatingReference, comments, objectiveRatingLevelDescriptor, results, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmEvaluationObjectiveRating {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    evaluationObjectiveReference: ").append(toIndentedString(evaluationObjectiveReference)).append("\n");
    sb.append("    evaluationRatingReference: ").append(toIndentedString(evaluationRatingReference)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    objectiveRatingLevelDescriptor: ").append(toIndentedString(objectiveRatingLevelDescriptor)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
