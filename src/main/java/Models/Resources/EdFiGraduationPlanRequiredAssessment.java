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
import Models.Resources.EdFiGraduationPlanRequiredAssessmentPerformanceLevel;
import Models.Resources.EdFiGraduationPlanRequiredAssessmentScore;
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
 * EdFiGraduationPlanRequiredAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiGraduationPlanRequiredAssessment {
  public static final String SERIALIZED_NAME_ASSESSMENT_REFERENCE = "assessmentReference";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_REFERENCE)
  private EdFiAssessmentReference assessmentReference;

  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private List<EdFiGraduationPlanRequiredAssessmentScore> scores = null;

  public static final String SERIALIZED_NAME_PERFORMANCE_LEVEL = "performanceLevel";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_LEVEL)
  private EdFiGraduationPlanRequiredAssessmentPerformanceLevel performanceLevel;

  public EdFiGraduationPlanRequiredAssessment() { 
  }

  public EdFiGraduationPlanRequiredAssessment assessmentReference(EdFiAssessmentReference assessmentReference) {
    
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


  public EdFiGraduationPlanRequiredAssessment scores(List<EdFiGraduationPlanRequiredAssessmentScore> scores) {
    
    this.scores = scores;
    return this;
  }

  public EdFiGraduationPlanRequiredAssessment addScoresItem(EdFiGraduationPlanRequiredAssessmentScore scoresItem) {
    if (this.scores == null) {
      this.scores = new ArrayList<EdFiGraduationPlanRequiredAssessmentScore>();
    }
    this.scores.add(scoresItem);
    return this;
  }

   /**
   * An unordered collection of graduationPlanRequiredAssessmentScores. Score required to be met or exceeded.
   * @return scores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of graduationPlanRequiredAssessmentScores. Score required to be met or exceeded.")

  public List<EdFiGraduationPlanRequiredAssessmentScore> getScores() {
    return scores;
  }


  public void setScores(List<EdFiGraduationPlanRequiredAssessmentScore> scores) {
    this.scores = scores;
  }


  public EdFiGraduationPlanRequiredAssessment performanceLevel(EdFiGraduationPlanRequiredAssessmentPerformanceLevel performanceLevel) {
    
    this.performanceLevel = performanceLevel;
    return this;
  }

   /**
   * Get performanceLevel
   * @return performanceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel getPerformanceLevel() {
    return performanceLevel;
  }


  public void setPerformanceLevel(EdFiGraduationPlanRequiredAssessmentPerformanceLevel performanceLevel) {
    this.performanceLevel = performanceLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiGraduationPlanRequiredAssessment edFiGraduationPlanRequiredAssessment = (EdFiGraduationPlanRequiredAssessment) o;
    return Objects.equals(this.assessmentReference, edFiGraduationPlanRequiredAssessment.assessmentReference) &&
        Objects.equals(this.scores, edFiGraduationPlanRequiredAssessment.scores) &&
        Objects.equals(this.performanceLevel, edFiGraduationPlanRequiredAssessment.performanceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentReference, scores, performanceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiGraduationPlanRequiredAssessment {\n");
    sb.append("    assessmentReference: ").append(toIndentedString(assessmentReference)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    performanceLevel: ").append(toIndentedString(performanceLevel)).append("\n");
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

