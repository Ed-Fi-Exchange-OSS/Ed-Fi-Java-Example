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
 * EdFiAcademicWeek
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiAcademicWeek {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WEEK_IDENTIFIER = "weekIdentifier";
  @SerializedName(SERIALIZED_NAME_WEEK_IDENTIFIER)
  private String weekIdentifier;

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

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

  public EdFiAcademicWeek() { 
  }

  public EdFiAcademicWeek id(String id) {
    
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


  public EdFiAcademicWeek weekIdentifier(String weekIdentifier) {
    
    this.weekIdentifier = weekIdentifier;
    return this;
  }

   /**
   * The school label for the week.
   * @return weekIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The school label for the week.")

  public String getWeekIdentifier() {
    return weekIdentifier;
  }


  public void setWeekIdentifier(String weekIdentifier) {
    this.weekIdentifier = weekIdentifier;
  }


  public EdFiAcademicWeek schoolReference(EdFiSchoolReference schoolReference) {
    
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


  public EdFiAcademicWeek beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The start date for the academic week.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start date for the academic week.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiAcademicWeek endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the academic week.
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The end date for the academic week.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiAcademicWeek totalInstructionalDays(Integer totalInstructionalDays) {
    
    this.totalInstructionalDays = totalInstructionalDays;
    return this;
  }

   /**
   * The total instructional days during the academic week.
   * @return totalInstructionalDays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total instructional days during the academic week.")

  public Integer getTotalInstructionalDays() {
    return totalInstructionalDays;
  }


  public void setTotalInstructionalDays(Integer totalInstructionalDays) {
    this.totalInstructionalDays = totalInstructionalDays;
  }


  public EdFiAcademicWeek etag(String etag) {
    
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
    EdFiAcademicWeek edFiAcademicWeek = (EdFiAcademicWeek) o;
    return Objects.equals(this.id, edFiAcademicWeek.id) &&
        Objects.equals(this.weekIdentifier, edFiAcademicWeek.weekIdentifier) &&
        Objects.equals(this.schoolReference, edFiAcademicWeek.schoolReference) &&
        Objects.equals(this.beginDate, edFiAcademicWeek.beginDate) &&
        Objects.equals(this.endDate, edFiAcademicWeek.endDate) &&
        Objects.equals(this.totalInstructionalDays, edFiAcademicWeek.totalInstructionalDays) &&
        Objects.equals(this.etag, edFiAcademicWeek.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekIdentifier, schoolReference, beginDate, endDate, totalInstructionalDays, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiAcademicWeek {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekIdentifier: ").append(toIndentedString(weekIdentifier)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
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

