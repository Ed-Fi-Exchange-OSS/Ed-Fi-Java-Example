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
import Models.Resources.EdFiAssessmentReference;
import Models.Resources.EdFiAssessmentScoreRangeLearningStandardLearningStandard;
import Models.Resources.EdFiObjectiveAssessmentReference;
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
 * EdFiAssessmentScoreRangeLearningStandard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiAssessmentScoreRangeLearningStandard {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LEARNING_STANDARDS = "learningStandards";
  @SerializedName(SERIALIZED_NAME_LEARNING_STANDARDS)
  private List<EdFiAssessmentScoreRangeLearningStandardLearningStandard> learningStandards = new ArrayList<EdFiAssessmentScoreRangeLearningStandardLearningStandard>();

  public static final String SERIALIZED_NAME_SCORE_RANGE_ID = "scoreRangeId";
  @SerializedName(SERIALIZED_NAME_SCORE_RANGE_ID)
  private String scoreRangeId;

  public static final String SERIALIZED_NAME_ASSESSMENT_REFERENCE = "assessmentReference";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_REFERENCE)
  private EdFiAssessmentReference assessmentReference;

  public static final String SERIALIZED_NAME_OBJECTIVE_ASSESSMENT_REFERENCE = "objectiveAssessmentReference";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_ASSESSMENT_REFERENCE)
  private EdFiObjectiveAssessmentReference objectiveAssessmentReference;

  public static final String SERIALIZED_NAME_ASSESSMENT_REPORTING_METHOD_DESCRIPTOR = "assessmentReportingMethodDescriptor";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_REPORTING_METHOD_DESCRIPTOR)
  private String assessmentReportingMethodDescriptor;

  public static final String SERIALIZED_NAME_MAXIMUM_SCORE = "maximumScore";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_SCORE)
  private String maximumScore;

  public static final String SERIALIZED_NAME_MINIMUM_SCORE = "minimumScore";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SCORE)
  private String minimumScore;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiAssessmentScoreRangeLearningStandard() { 
  }

  public EdFiAssessmentScoreRangeLearningStandard id(String id) {
    
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


  public EdFiAssessmentScoreRangeLearningStandard learningStandards(List<EdFiAssessmentScoreRangeLearningStandardLearningStandard> learningStandards) {
    
    this.learningStandards = learningStandards;
    return this;
  }

  public EdFiAssessmentScoreRangeLearningStandard addLearningStandardsItem(EdFiAssessmentScoreRangeLearningStandardLearningStandard learningStandardsItem) {
    this.learningStandards.add(learningStandardsItem);
    return this;
  }

   /**
   * An unordered collection of assessmentScoreRangeLearningStandardLearningStandards. LearningStandard associated with the score range.
   * @return learningStandards
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An unordered collection of assessmentScoreRangeLearningStandardLearningStandards. LearningStandard associated with the score range.")

  public List<EdFiAssessmentScoreRangeLearningStandardLearningStandard> getLearningStandards() {
    return learningStandards;
  }


  public void setLearningStandards(List<EdFiAssessmentScoreRangeLearningStandardLearningStandard> learningStandards) {
    this.learningStandards = learningStandards;
  }


  public EdFiAssessmentScoreRangeLearningStandard scoreRangeId(String scoreRangeId) {
    
    this.scoreRangeId = scoreRangeId;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to the score range associated with one or more learning standards.
   * @return scoreRangeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique number or alphanumeric code assigned to the score range associated with one or more learning standards.")

  public String getScoreRangeId() {
    return scoreRangeId;
  }


  public void setScoreRangeId(String scoreRangeId) {
    this.scoreRangeId = scoreRangeId;
  }


  public EdFiAssessmentScoreRangeLearningStandard assessmentReference(EdFiAssessmentReference assessmentReference) {
    
    this.assessmentReference = assessmentReference;
    return this;
  }

   /**
   * Get assessmentReference
   * @return assessmentReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiAssessmentReference getAssessmentReference() {
    return assessmentReference;
  }


  public void setAssessmentReference(EdFiAssessmentReference assessmentReference) {
    this.assessmentReference = assessmentReference;
  }


  public EdFiAssessmentScoreRangeLearningStandard objectiveAssessmentReference(EdFiObjectiveAssessmentReference objectiveAssessmentReference) {
    
    this.objectiveAssessmentReference = objectiveAssessmentReference;
    return this;
  }

   /**
   * Get objectiveAssessmentReference
   * @return objectiveAssessmentReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiObjectiveAssessmentReference getObjectiveAssessmentReference() {
    return objectiveAssessmentReference;
  }


  public void setObjectiveAssessmentReference(EdFiObjectiveAssessmentReference objectiveAssessmentReference) {
    this.objectiveAssessmentReference = objectiveAssessmentReference;
  }


  public EdFiAssessmentScoreRangeLearningStandard assessmentReportingMethodDescriptor(String assessmentReportingMethodDescriptor) {
    
    this.assessmentReportingMethodDescriptor = assessmentReportingMethodDescriptor;
    return this;
  }

   /**
   * The assessment reporting method defined (e.g., scale score, RIT scale score) associated with the referenced learning standard(s).
   * @return assessmentReportingMethodDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The assessment reporting method defined (e.g., scale score, RIT scale score) associated with the referenced learning standard(s).")

  public String getAssessmentReportingMethodDescriptor() {
    return assessmentReportingMethodDescriptor;
  }


  public void setAssessmentReportingMethodDescriptor(String assessmentReportingMethodDescriptor) {
    this.assessmentReportingMethodDescriptor = assessmentReportingMethodDescriptor;
  }


  public EdFiAssessmentScoreRangeLearningStandard maximumScore(String maximumScore) {
    
    this.maximumScore = maximumScore;
    return this;
  }

   /**
   * The maximum score in the score range.
   * @return maximumScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum score in the score range.")

  public String getMaximumScore() {
    return maximumScore;
  }


  public void setMaximumScore(String maximumScore) {
    this.maximumScore = maximumScore;
  }


  public EdFiAssessmentScoreRangeLearningStandard minimumScore(String minimumScore) {
    
    this.minimumScore = minimumScore;
    return this;
  }

   /**
   * The minimum score in the score range.
   * @return minimumScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The minimum score in the score range.")

  public String getMinimumScore() {
    return minimumScore;
  }


  public void setMinimumScore(String minimumScore) {
    this.minimumScore = minimumScore;
  }


  public EdFiAssessmentScoreRangeLearningStandard etag(String etag) {
    
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
    EdFiAssessmentScoreRangeLearningStandard edFiAssessmentScoreRangeLearningStandard = (EdFiAssessmentScoreRangeLearningStandard) o;
    return Objects.equals(this.id, edFiAssessmentScoreRangeLearningStandard.id) &&
        Objects.equals(this.learningStandards, edFiAssessmentScoreRangeLearningStandard.learningStandards) &&
        Objects.equals(this.scoreRangeId, edFiAssessmentScoreRangeLearningStandard.scoreRangeId) &&
        Objects.equals(this.assessmentReference, edFiAssessmentScoreRangeLearningStandard.assessmentReference) &&
        Objects.equals(this.objectiveAssessmentReference, edFiAssessmentScoreRangeLearningStandard.objectiveAssessmentReference) &&
        Objects.equals(this.assessmentReportingMethodDescriptor, edFiAssessmentScoreRangeLearningStandard.assessmentReportingMethodDescriptor) &&
        Objects.equals(this.maximumScore, edFiAssessmentScoreRangeLearningStandard.maximumScore) &&
        Objects.equals(this.minimumScore, edFiAssessmentScoreRangeLearningStandard.minimumScore) &&
        Objects.equals(this.etag, edFiAssessmentScoreRangeLearningStandard.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, learningStandards, scoreRangeId, assessmentReference, objectiveAssessmentReference, assessmentReportingMethodDescriptor, maximumScore, minimumScore, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiAssessmentScoreRangeLearningStandard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    learningStandards: ").append(toIndentedString(learningStandards)).append("\n");
    sb.append("    scoreRangeId: ").append(toIndentedString(scoreRangeId)).append("\n");
    sb.append("    assessmentReference: ").append(toIndentedString(assessmentReference)).append("\n");
    sb.append("    objectiveAssessmentReference: ").append(toIndentedString(objectiveAssessmentReference)).append("\n");
    sb.append("    assessmentReportingMethodDescriptor: ").append(toIndentedString(assessmentReportingMethodDescriptor)).append("\n");
    sb.append("    maximumScore: ").append(toIndentedString(maximumScore)).append("\n");
    sb.append("    minimumScore: ").append(toIndentedString(minimumScore)).append("\n");
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
