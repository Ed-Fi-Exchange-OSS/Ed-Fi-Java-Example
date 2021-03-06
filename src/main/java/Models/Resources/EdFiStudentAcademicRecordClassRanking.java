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
import org.threeten.bp.LocalDate;

/**
 * EdFiStudentAcademicRecordClassRanking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentAcademicRecordClassRanking {
  public static final String SERIALIZED_NAME_CLASS_RANK = "classRank";
  @SerializedName(SERIALIZED_NAME_CLASS_RANK)
  private Integer classRank;

  public static final String SERIALIZED_NAME_CLASS_RANKING_DATE = "classRankingDate";
  @SerializedName(SERIALIZED_NAME_CLASS_RANKING_DATE)
  private LocalDate classRankingDate;

  public static final String SERIALIZED_NAME_PERCENTAGE_RANKING = "percentageRanking";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_RANKING)
  private Integer percentageRanking;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER_IN_CLASS = "totalNumberInClass";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_IN_CLASS)
  private Integer totalNumberInClass;

  public EdFiStudentAcademicRecordClassRanking() { 
  }

  public EdFiStudentAcademicRecordClassRanking classRank(Integer classRank) {
    
    this.classRank = classRank;
    return this;
  }

   /**
   * The academic rank of a student in relation to his or her graduating class (e.g., 1st, 2nd, 3rd).
   * @return classRank
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The academic rank of a student in relation to his or her graduating class (e.g., 1st, 2nd, 3rd).")

  public Integer getClassRank() {
    return classRank;
  }


  public void setClassRank(Integer classRank) {
    this.classRank = classRank;
  }


  public EdFiStudentAcademicRecordClassRanking classRankingDate(LocalDate classRankingDate) {
    
    this.classRankingDate = classRankingDate;
    return this;
  }

   /**
   * Date class ranking was determined.
   * @return classRankingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date class ranking was determined.")

  public LocalDate getClassRankingDate() {
    return classRankingDate;
  }


  public void setClassRankingDate(LocalDate classRankingDate) {
    this.classRankingDate = classRankingDate;
  }


  public EdFiStudentAcademicRecordClassRanking percentageRanking(Integer percentageRanking) {
    
    this.percentageRanking = percentageRanking;
    return this;
  }

   /**
   * The academic percentage rank of a student in relation to his or her graduating class (e.g., 95%, 80%, 50%).
   * @return percentageRanking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The academic percentage rank of a student in relation to his or her graduating class (e.g., 95%, 80%, 50%).")

  public Integer getPercentageRanking() {
    return percentageRanking;
  }


  public void setPercentageRanking(Integer percentageRanking) {
    this.percentageRanking = percentageRanking;
  }


  public EdFiStudentAcademicRecordClassRanking totalNumberInClass(Integer totalNumberInClass) {
    
    this.totalNumberInClass = totalNumberInClass;
    return this;
  }

   /**
   * The total number of students in the student&#39;s graduating class.
   * @return totalNumberInClass
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total number of students in the student's graduating class.")

  public Integer getTotalNumberInClass() {
    return totalNumberInClass;
  }


  public void setTotalNumberInClass(Integer totalNumberInClass) {
    this.totalNumberInClass = totalNumberInClass;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentAcademicRecordClassRanking edFiStudentAcademicRecordClassRanking = (EdFiStudentAcademicRecordClassRanking) o;
    return Objects.equals(this.classRank, edFiStudentAcademicRecordClassRanking.classRank) &&
        Objects.equals(this.classRankingDate, edFiStudentAcademicRecordClassRanking.classRankingDate) &&
        Objects.equals(this.percentageRanking, edFiStudentAcademicRecordClassRanking.percentageRanking) &&
        Objects.equals(this.totalNumberInClass, edFiStudentAcademicRecordClassRanking.totalNumberInClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classRank, classRankingDate, percentageRanking, totalNumberInClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentAcademicRecordClassRanking {\n");
    sb.append("    classRank: ").append(toIndentedString(classRank)).append("\n");
    sb.append("    classRankingDate: ").append(toIndentedString(classRankingDate)).append("\n");
    sb.append("    percentageRanking: ").append(toIndentedString(percentageRanking)).append("\n");
    sb.append("    totalNumberInClass: ").append(toIndentedString(totalNumberInClass)).append("\n");
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

