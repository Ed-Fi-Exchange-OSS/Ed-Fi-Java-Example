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
 * EdFiGraduationPlanRequiredAssessmentPerformanceLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiGraduationPlanRequiredAssessmentPerformanceLevel {
  public static final String SERIALIZED_NAME_ASSESSMENT_REPORTING_METHOD_DESCRIPTOR = "assessmentReportingMethodDescriptor";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_REPORTING_METHOD_DESCRIPTOR)
  private String assessmentReportingMethodDescriptor;

  public static final String SERIALIZED_NAME_PERFORMANCE_LEVEL_DESCRIPTOR = "performanceLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_LEVEL_DESCRIPTOR)
  private String performanceLevelDescriptor;

  public static final String SERIALIZED_NAME_RESULT_DATATYPE_TYPE_DESCRIPTOR = "resultDatatypeTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_RESULT_DATATYPE_TYPE_DESCRIPTOR)
  private String resultDatatypeTypeDescriptor;

  public static final String SERIALIZED_NAME_MAXIMUM_SCORE = "maximumScore";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_SCORE)
  private String maximumScore;

  public static final String SERIALIZED_NAME_MINIMUM_SCORE = "minimumScore";
  @SerializedName(SERIALIZED_NAME_MINIMUM_SCORE)
  private String minimumScore;

  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel() { 
  }

  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel assessmentReportingMethodDescriptor(String assessmentReportingMethodDescriptor) {
    
    this.assessmentReportingMethodDescriptor = assessmentReportingMethodDescriptor;
    return this;
  }

   /**
   * The method that the instructor of the class uses to report the performance and achievement of all students. It may be a qualitative method such as individualized teacher comments or a quantitative method such as a letter or numerical grade. In some cases, more than one type of reporting method may be used.
   * @return assessmentReportingMethodDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The method that the instructor of the class uses to report the performance and achievement of all students. It may be a qualitative method such as individualized teacher comments or a quantitative method such as a letter or numerical grade. In some cases, more than one type of reporting method may be used.")

  public String getAssessmentReportingMethodDescriptor() {
    return assessmentReportingMethodDescriptor;
  }


  public void setAssessmentReportingMethodDescriptor(String assessmentReportingMethodDescriptor) {
    this.assessmentReportingMethodDescriptor = assessmentReportingMethodDescriptor;
  }


  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel performanceLevelDescriptor(String performanceLevelDescriptor) {
    
    this.performanceLevelDescriptor = performanceLevelDescriptor;
    return this;
  }

   /**
   * The performance level(s) defined for the assessment.
   * @return performanceLevelDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The performance level(s) defined for the assessment.")

  public String getPerformanceLevelDescriptor() {
    return performanceLevelDescriptor;
  }


  public void setPerformanceLevelDescriptor(String performanceLevelDescriptor) {
    this.performanceLevelDescriptor = performanceLevelDescriptor;
  }


  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel resultDatatypeTypeDescriptor(String resultDatatypeTypeDescriptor) {
    
    this.resultDatatypeTypeDescriptor = resultDatatypeTypeDescriptor;
    return this;
  }

   /**
   * The datatype of the result. The results can be expressed as a number, percentile, range, level, etc.
   * @return resultDatatypeTypeDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datatype of the result. The results can be expressed as a number, percentile, range, level, etc.")

  public String getResultDatatypeTypeDescriptor() {
    return resultDatatypeTypeDescriptor;
  }


  public void setResultDatatypeTypeDescriptor(String resultDatatypeTypeDescriptor) {
    this.resultDatatypeTypeDescriptor = resultDatatypeTypeDescriptor;
  }


  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel maximumScore(String maximumScore) {
    
    this.maximumScore = maximumScore;
    return this;
  }

   /**
   * The maximum score to make the indicated level of performance.
   * @return maximumScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum score to make the indicated level of performance.")

  public String getMaximumScore() {
    return maximumScore;
  }


  public void setMaximumScore(String maximumScore) {
    this.maximumScore = maximumScore;
  }


  public EdFiGraduationPlanRequiredAssessmentPerformanceLevel minimumScore(String minimumScore) {
    
    this.minimumScore = minimumScore;
    return this;
  }

   /**
   * The minimum score required to make the indicated level of performance.
   * @return minimumScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum score required to make the indicated level of performance.")

  public String getMinimumScore() {
    return minimumScore;
  }


  public void setMinimumScore(String minimumScore) {
    this.minimumScore = minimumScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiGraduationPlanRequiredAssessmentPerformanceLevel edFiGraduationPlanRequiredAssessmentPerformanceLevel = (EdFiGraduationPlanRequiredAssessmentPerformanceLevel) o;
    return Objects.equals(this.assessmentReportingMethodDescriptor, edFiGraduationPlanRequiredAssessmentPerformanceLevel.assessmentReportingMethodDescriptor) &&
        Objects.equals(this.performanceLevelDescriptor, edFiGraduationPlanRequiredAssessmentPerformanceLevel.performanceLevelDescriptor) &&
        Objects.equals(this.resultDatatypeTypeDescriptor, edFiGraduationPlanRequiredAssessmentPerformanceLevel.resultDatatypeTypeDescriptor) &&
        Objects.equals(this.maximumScore, edFiGraduationPlanRequiredAssessmentPerformanceLevel.maximumScore) &&
        Objects.equals(this.minimumScore, edFiGraduationPlanRequiredAssessmentPerformanceLevel.minimumScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentReportingMethodDescriptor, performanceLevelDescriptor, resultDatatypeTypeDescriptor, maximumScore, minimumScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiGraduationPlanRequiredAssessmentPerformanceLevel {\n");
    sb.append("    assessmentReportingMethodDescriptor: ").append(toIndentedString(assessmentReportingMethodDescriptor)).append("\n");
    sb.append("    performanceLevelDescriptor: ").append(toIndentedString(performanceLevelDescriptor)).append("\n");
    sb.append("    resultDatatypeTypeDescriptor: ").append(toIndentedString(resultDatatypeTypeDescriptor)).append("\n");
    sb.append("    maximumScore: ").append(toIndentedString(maximumScore)).append("\n");
    sb.append("    minimumScore: ").append(toIndentedString(minimumScore)).append("\n");
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

