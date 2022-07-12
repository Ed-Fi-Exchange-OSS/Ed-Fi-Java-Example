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
import Models.Resources.EdFiSchoolReference;
import Models.Resources.EdFiSchoolYearTypeReference;
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
 * EdFiGradingPeriod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiGradingPeriod {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GRADING_PERIOD_DESCRIPTOR = "gradingPeriodDescriptor";
  @SerializedName(SERIALIZED_NAME_GRADING_PERIOD_DESCRIPTOR)
  private String gradingPeriodDescriptor;

  public static final String SERIALIZED_NAME_PERIOD_SEQUENCE = "periodSequence";
  @SerializedName(SERIALIZED_NAME_PERIOD_SEQUENCE)
  private Integer periodSequence;

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE = "schoolYearTypeReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE)
  private EdFiSchoolYearTypeReference schoolYearTypeReference;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_TOTAL_INSTRUCTIONAL_DAYS = "totalInstructionalDays";
  @SerializedName(SERIALIZED_NAME_TOTAL_INSTRUCTIONAL_DAYS)
  private Integer totalInstructionalDays;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiGradingPeriod() { 
  }

  public EdFiGradingPeriod id(String id) {
    
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


  public EdFiGradingPeriod gradingPeriodDescriptor(String gradingPeriodDescriptor) {
    
    this.gradingPeriodDescriptor = gradingPeriodDescriptor;
    return this;
  }

   /**
   * The name of the period for which grades are reported.
   * @return gradingPeriodDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the period for which grades are reported.")

  public String getGradingPeriodDescriptor() {
    return gradingPeriodDescriptor;
  }


  public void setGradingPeriodDescriptor(String gradingPeriodDescriptor) {
    this.gradingPeriodDescriptor = gradingPeriodDescriptor;
  }


  public EdFiGradingPeriod periodSequence(Integer periodSequence) {
    
    this.periodSequence = periodSequence;
    return this;
  }

   /**
   * The sequential order of this period relative to other periods.
   * @return periodSequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sequential order of this period relative to other periods.")

  public Integer getPeriodSequence() {
    return periodSequence;
  }


  public void setPeriodSequence(Integer periodSequence) {
    this.periodSequence = periodSequence;
  }


  public EdFiGradingPeriod schoolReference(EdFiSchoolReference schoolReference) {
    
    this.schoolReference = schoolReference;
    return this;
  }

   /**
   * Get schoolReference
   * @return schoolReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSchoolReference getSchoolReference() {
    return schoolReference;
  }


  public void setSchoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
  }


  public EdFiGradingPeriod schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSchoolYearTypeReference getSchoolYearTypeReference() {
    return schoolYearTypeReference;
  }


  public void setSchoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
  }


  public EdFiGradingPeriod beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Month, day, and year of the first day of the GradingPeriod.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Month, day, and year of the first day of the GradingPeriod.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiGradingPeriod endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Month, day, and year of the last day of the GradingPeriod.
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Month, day, and year of the last day of the GradingPeriod.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiGradingPeriod totalInstructionalDays(Integer totalInstructionalDays) {
    
    this.totalInstructionalDays = totalInstructionalDays;
    return this;
  }

   /**
   * Total days available for educational instruction during the GradingPeriod.
   * @return totalInstructionalDays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total days available for educational instruction during the GradingPeriod.")

  public Integer getTotalInstructionalDays() {
    return totalInstructionalDays;
  }


  public void setTotalInstructionalDays(Integer totalInstructionalDays) {
    this.totalInstructionalDays = totalInstructionalDays;
  }


  public EdFiGradingPeriod etag(String etag) {
    
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
    EdFiGradingPeriod edFiGradingPeriod = (EdFiGradingPeriod) o;
    return Objects.equals(this.id, edFiGradingPeriod.id) &&
        Objects.equals(this.gradingPeriodDescriptor, edFiGradingPeriod.gradingPeriodDescriptor) &&
        Objects.equals(this.periodSequence, edFiGradingPeriod.periodSequence) &&
        Objects.equals(this.schoolReference, edFiGradingPeriod.schoolReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiGradingPeriod.schoolYearTypeReference) &&
        Objects.equals(this.beginDate, edFiGradingPeriod.beginDate) &&
        Objects.equals(this.endDate, edFiGradingPeriod.endDate) &&
        Objects.equals(this.totalInstructionalDays, edFiGradingPeriod.totalInstructionalDays) &&
        Objects.equals(this.etag, edFiGradingPeriod.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gradingPeriodDescriptor, periodSequence, schoolReference, schoolYearTypeReference, beginDate, endDate, totalInstructionalDays, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiGradingPeriod {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gradingPeriodDescriptor: ").append(toIndentedString(gradingPeriodDescriptor)).append("\n");
    sb.append("    periodSequence: ").append(toIndentedString(periodSequence)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    totalInstructionalDays: ").append(toIndentedString(totalInstructionalDays)).append("\n");
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

