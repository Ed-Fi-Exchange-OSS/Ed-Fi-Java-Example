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
import Models.Resources.TpdmPerformanceEvaluationRatingResult;
import Models.Resources.TpdmPerformanceEvaluationRatingReviewer;
import Models.Resources.TpdmPerformanceEvaluationReference;
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
 * TpdmPerformanceEvaluationRating
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmPerformanceEvaluationRating {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PERFORMANCE_EVALUATION_REFERENCE = "performanceEvaluationReference";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_EVALUATION_REFERENCE)
  private TpdmPerformanceEvaluationReference performanceEvaluationReference;

  public static final String SERIALIZED_NAME_PERSON_REFERENCE = "personReference";
  @SerializedName(SERIALIZED_NAME_PERSON_REFERENCE)
  private EdFiPersonReference personReference;

  public static final String SERIALIZED_NAME_ACTUAL_DATE = "actualDate";
  @SerializedName(SERIALIZED_NAME_ACTUAL_DATE)
  private LocalDate actualDate;

  public static final String SERIALIZED_NAME_ACTUAL_DURATION = "actualDuration";
  @SerializedName(SERIALIZED_NAME_ACTUAL_DURATION)
  private Integer actualDuration;

  public static final String SERIALIZED_NAME_ACTUAL_TIME = "actualTime";
  @SerializedName(SERIALIZED_NAME_ACTUAL_TIME)
  private String actualTime;

  public static final String SERIALIZED_NAME_ANNOUNCED = "announced";
  @SerializedName(SERIALIZED_NAME_ANNOUNCED)
  private Boolean announced;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_COTEACHING_STYLE_OBSERVED_DESCRIPTOR = "coteachingStyleObservedDescriptor";
  @SerializedName(SERIALIZED_NAME_COTEACHING_STYLE_OBSERVED_DESCRIPTOR)
  private String coteachingStyleObservedDescriptor;

  public static final String SERIALIZED_NAME_PERFORMANCE_EVALUATION_RATING_LEVEL_DESCRIPTOR = "performanceEvaluationRatingLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_EVALUATION_RATING_LEVEL_DESCRIPTOR)
  private String performanceEvaluationRatingLevelDescriptor;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<TpdmPerformanceEvaluationRatingResult> results = null;

  public static final String SERIALIZED_NAME_REVIEWERS = "reviewers";
  @SerializedName(SERIALIZED_NAME_REVIEWERS)
  private List<TpdmPerformanceEvaluationRatingReviewer> reviewers = null;

  public static final String SERIALIZED_NAME_SCHEDULE_DATE = "scheduleDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DATE)
  private LocalDate scheduleDate;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmPerformanceEvaluationRating() { 
  }

  public TpdmPerformanceEvaluationRating id(String id) {
    
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


  public TpdmPerformanceEvaluationRating performanceEvaluationReference(TpdmPerformanceEvaluationReference performanceEvaluationReference) {
    
    this.performanceEvaluationReference = performanceEvaluationReference;
    return this;
  }

   /**
   * Get performanceEvaluationReference
   * @return performanceEvaluationReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmPerformanceEvaluationReference getPerformanceEvaluationReference() {
    return performanceEvaluationReference;
  }


  public void setPerformanceEvaluationReference(TpdmPerformanceEvaluationReference performanceEvaluationReference) {
    this.performanceEvaluationReference = performanceEvaluationReference;
  }


  public TpdmPerformanceEvaluationRating personReference(EdFiPersonReference personReference) {
    
    this.personReference = personReference;
    return this;
  }

   /**
   * Get personReference
   * @return personReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiPersonReference getPersonReference() {
    return personReference;
  }


  public void setPersonReference(EdFiPersonReference personReference) {
    this.personReference = personReference;
  }


  public TpdmPerformanceEvaluationRating actualDate(LocalDate actualDate) {
    
    this.actualDate = actualDate;
    return this;
  }

   /**
   * The month, day, and year on which the performance evaluation was conducted.
   * @return actualDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year on which the performance evaluation was conducted.")

  public LocalDate getActualDate() {
    return actualDate;
  }


  public void setActualDate(LocalDate actualDate) {
    this.actualDate = actualDate;
  }


  public TpdmPerformanceEvaluationRating actualDuration(Integer actualDuration) {
    
    this.actualDuration = actualDuration;
    return this;
  }

   /**
   * The actual or estimated number of clock minutes during which the performance evaluation was conducted.
   * @return actualDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual or estimated number of clock minutes during which the performance evaluation was conducted.")

  public Integer getActualDuration() {
    return actualDuration;
  }


  public void setActualDuration(Integer actualDuration) {
    this.actualDuration = actualDuration;
  }


  public TpdmPerformanceEvaluationRating actualTime(String actualTime) {
    
    this.actualTime = actualTime;
    return this;
  }

   /**
   * An indication of the the time at which the performance evaluation was conducted.
   * @return actualTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of the the time at which the performance evaluation was conducted.")

  public String getActualTime() {
    return actualTime;
  }


  public void setActualTime(String actualTime) {
    this.actualTime = actualTime;
  }


  public TpdmPerformanceEvaluationRating announced(Boolean announced) {
    
    this.announced = announced;
    return this;
  }

   /**
   * An indicator of whether the performance evaluation was announced or not.
   * @return announced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indicator of whether the performance evaluation was announced or not.")

  public Boolean getAnnounced() {
    return announced;
  }


  public void setAnnounced(Boolean announced) {
    this.announced = announced;
  }


  public TpdmPerformanceEvaluationRating comments(String comments) {
    
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


  public TpdmPerformanceEvaluationRating coteachingStyleObservedDescriptor(String coteachingStyleObservedDescriptor) {
    
    this.coteachingStyleObservedDescriptor = coteachingStyleObservedDescriptor;
    return this;
  }

   /**
   * A type of co-teaching observed as part of the performance evaluation.
   * @return coteachingStyleObservedDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A type of co-teaching observed as part of the performance evaluation.")

  public String getCoteachingStyleObservedDescriptor() {
    return coteachingStyleObservedDescriptor;
  }


  public void setCoteachingStyleObservedDescriptor(String coteachingStyleObservedDescriptor) {
    this.coteachingStyleObservedDescriptor = coteachingStyleObservedDescriptor;
  }


  public TpdmPerformanceEvaluationRating performanceEvaluationRatingLevelDescriptor(String performanceEvaluationRatingLevelDescriptor) {
    
    this.performanceEvaluationRatingLevelDescriptor = performanceEvaluationRatingLevelDescriptor;
    return this;
  }

   /**
   * The rating level achieved based upon the rating or score.
   * @return performanceEvaluationRatingLevelDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rating level achieved based upon the rating or score.")

  public String getPerformanceEvaluationRatingLevelDescriptor() {
    return performanceEvaluationRatingLevelDescriptor;
  }


  public void setPerformanceEvaluationRatingLevelDescriptor(String performanceEvaluationRatingLevelDescriptor) {
    this.performanceEvaluationRatingLevelDescriptor = performanceEvaluationRatingLevelDescriptor;
  }


  public TpdmPerformanceEvaluationRating results(List<TpdmPerformanceEvaluationRatingResult> results) {
    
    this.results = results;
    return this;
  }

  public TpdmPerformanceEvaluationRating addResultsItem(TpdmPerformanceEvaluationRatingResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<TpdmPerformanceEvaluationRatingResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * An unordered collection of performanceEvaluationRatingResults. The numerical summary rating or score for the performance evaluation.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of performanceEvaluationRatingResults. The numerical summary rating or score for the performance evaluation.")

  public List<TpdmPerformanceEvaluationRatingResult> getResults() {
    return results;
  }


  public void setResults(List<TpdmPerformanceEvaluationRatingResult> results) {
    this.results = results;
  }


  public TpdmPerformanceEvaluationRating reviewers(List<TpdmPerformanceEvaluationRatingReviewer> reviewers) {
    
    this.reviewers = reviewers;
    return this;
  }

  public TpdmPerformanceEvaluationRating addReviewersItem(TpdmPerformanceEvaluationRatingReviewer reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<TpdmPerformanceEvaluationRatingReviewer>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * An unordered collection of performanceEvaluationRatingReviewers. The person(s) that conducted the performance evaluation.
   * @return reviewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of performanceEvaluationRatingReviewers. The person(s) that conducted the performance evaluation.")

  public List<TpdmPerformanceEvaluationRatingReviewer> getReviewers() {
    return reviewers;
  }


  public void setReviewers(List<TpdmPerformanceEvaluationRatingReviewer> reviewers) {
    this.reviewers = reviewers;
  }


  public TpdmPerformanceEvaluationRating scheduleDate(LocalDate scheduleDate) {
    
    this.scheduleDate = scheduleDate;
    return this;
  }

   /**
   * The month, day, and year on which the performance evaluation was to be conducted.
   * @return scheduleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month, day, and year on which the performance evaluation was to be conducted.")

  public LocalDate getScheduleDate() {
    return scheduleDate;
  }


  public void setScheduleDate(LocalDate scheduleDate) {
    this.scheduleDate = scheduleDate;
  }


  public TpdmPerformanceEvaluationRating etag(String etag) {
    
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
    TpdmPerformanceEvaluationRating tpdmPerformanceEvaluationRating = (TpdmPerformanceEvaluationRating) o;
    return Objects.equals(this.id, tpdmPerformanceEvaluationRating.id) &&
        Objects.equals(this.performanceEvaluationReference, tpdmPerformanceEvaluationRating.performanceEvaluationReference) &&
        Objects.equals(this.personReference, tpdmPerformanceEvaluationRating.personReference) &&
        Objects.equals(this.actualDate, tpdmPerformanceEvaluationRating.actualDate) &&
        Objects.equals(this.actualDuration, tpdmPerformanceEvaluationRating.actualDuration) &&
        Objects.equals(this.actualTime, tpdmPerformanceEvaluationRating.actualTime) &&
        Objects.equals(this.announced, tpdmPerformanceEvaluationRating.announced) &&
        Objects.equals(this.comments, tpdmPerformanceEvaluationRating.comments) &&
        Objects.equals(this.coteachingStyleObservedDescriptor, tpdmPerformanceEvaluationRating.coteachingStyleObservedDescriptor) &&
        Objects.equals(this.performanceEvaluationRatingLevelDescriptor, tpdmPerformanceEvaluationRating.performanceEvaluationRatingLevelDescriptor) &&
        Objects.equals(this.results, tpdmPerformanceEvaluationRating.results) &&
        Objects.equals(this.reviewers, tpdmPerformanceEvaluationRating.reviewers) &&
        Objects.equals(this.scheduleDate, tpdmPerformanceEvaluationRating.scheduleDate) &&
        Objects.equals(this.etag, tpdmPerformanceEvaluationRating.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, performanceEvaluationReference, personReference, actualDate, actualDuration, actualTime, announced, comments, coteachingStyleObservedDescriptor, performanceEvaluationRatingLevelDescriptor, results, reviewers, scheduleDate, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmPerformanceEvaluationRating {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    performanceEvaluationReference: ").append(toIndentedString(performanceEvaluationReference)).append("\n");
    sb.append("    personReference: ").append(toIndentedString(personReference)).append("\n");
    sb.append("    actualDate: ").append(toIndentedString(actualDate)).append("\n");
    sb.append("    actualDuration: ").append(toIndentedString(actualDuration)).append("\n");
    sb.append("    actualTime: ").append(toIndentedString(actualTime)).append("\n");
    sb.append("    announced: ").append(toIndentedString(announced)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    coteachingStyleObservedDescriptor: ").append(toIndentedString(coteachingStyleObservedDescriptor)).append("\n");
    sb.append("    performanceEvaluationRatingLevelDescriptor: ").append(toIndentedString(performanceEvaluationRatingLevelDescriptor)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
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

