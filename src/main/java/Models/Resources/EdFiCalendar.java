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
import Models.Resources.EdFiCalendarGradeLevel;
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
import java.util.ArrayList;
import java.util.List;

/**
 * EdFiCalendar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiCalendar {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CALENDAR_CODE = "calendarCode";
  @SerializedName(SERIALIZED_NAME_CALENDAR_CODE)
  private String calendarCode;

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE = "schoolYearTypeReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE)
  private EdFiSchoolYearTypeReference schoolYearTypeReference;

  public static final String SERIALIZED_NAME_CALENDAR_TYPE_DESCRIPTOR = "calendarTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_CALENDAR_TYPE_DESCRIPTOR)
  private String calendarTypeDescriptor;

  public static final String SERIALIZED_NAME_GRADE_LEVELS = "gradeLevels";
  @SerializedName(SERIALIZED_NAME_GRADE_LEVELS)
  private List<EdFiCalendarGradeLevel> gradeLevels = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiCalendar() { 
  }

  public EdFiCalendar id(String id) {
    
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


  public EdFiCalendar calendarCode(String calendarCode) {
    
    this.calendarCode = calendarCode;
    return this;
  }

   /**
   * The identifier for the Calendar.
   * @return calendarCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the Calendar.")

  public String getCalendarCode() {
    return calendarCode;
  }


  public void setCalendarCode(String calendarCode) {
    this.calendarCode = calendarCode;
  }


  public EdFiCalendar schoolReference(EdFiSchoolReference schoolReference) {
    
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


  public EdFiCalendar schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    
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


  public EdFiCalendar calendarTypeDescriptor(String calendarTypeDescriptor) {
    
    this.calendarTypeDescriptor = calendarTypeDescriptor;
    return this;
  }

   /**
   * Indicates the type of Calendar.
   * @return calendarTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates the type of Calendar.")

  public String getCalendarTypeDescriptor() {
    return calendarTypeDescriptor;
  }


  public void setCalendarTypeDescriptor(String calendarTypeDescriptor) {
    this.calendarTypeDescriptor = calendarTypeDescriptor;
  }


  public EdFiCalendar gradeLevels(List<EdFiCalendarGradeLevel> gradeLevels) {
    
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiCalendar addGradeLevelsItem(EdFiCalendarGradeLevel gradeLevelsItem) {
    if (this.gradeLevels == null) {
      this.gradeLevels = new ArrayList<EdFiCalendarGradeLevel>();
    }
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of calendarGradeLevels. Indicates the GradeLevel associated with the Calendar.
   * @return gradeLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of calendarGradeLevels. Indicates the GradeLevel associated with the Calendar.")

  public List<EdFiCalendarGradeLevel> getGradeLevels() {
    return gradeLevels;
  }


  public void setGradeLevels(List<EdFiCalendarGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }


  public EdFiCalendar etag(String etag) {
    
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
    EdFiCalendar edFiCalendar = (EdFiCalendar) o;
    return Objects.equals(this.id, edFiCalendar.id) &&
        Objects.equals(this.calendarCode, edFiCalendar.calendarCode) &&
        Objects.equals(this.schoolReference, edFiCalendar.schoolReference) &&
        Objects.equals(this.schoolYearTypeReference, edFiCalendar.schoolYearTypeReference) &&
        Objects.equals(this.calendarTypeDescriptor, edFiCalendar.calendarTypeDescriptor) &&
        Objects.equals(this.gradeLevels, edFiCalendar.gradeLevels) &&
        Objects.equals(this.etag, edFiCalendar.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, calendarCode, schoolReference, schoolYearTypeReference, calendarTypeDescriptor, gradeLevels, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCalendar {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    calendarCode: ").append(toIndentedString(calendarCode)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
    sb.append("    calendarTypeDescriptor: ").append(toIndentedString(calendarTypeDescriptor)).append("\n");
    sb.append("    gradeLevels: ").append(toIndentedString(gradeLevels)).append("\n");
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

