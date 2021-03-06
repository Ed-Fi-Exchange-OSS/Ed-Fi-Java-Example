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
import Models.Resources.EdFiBellScheduleClassPeriod;
import Models.Resources.EdFiBellScheduleDate;
import Models.Resources.EdFiBellScheduleGradeLevel;
import Models.Resources.EdFiSchoolReference;
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
 * EdFiBellSchedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiBellSchedule {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BELL_SCHEDULE_NAME = "bellScheduleName";
  @SerializedName(SERIALIZED_NAME_BELL_SCHEDULE_NAME)
  private String bellScheduleName;

  public static final String SERIALIZED_NAME_CLASS_PERIODS = "classPeriods";
  @SerializedName(SERIALIZED_NAME_CLASS_PERIODS)
  private List<EdFiBellScheduleClassPeriod> classPeriods = new ArrayList<EdFiBellScheduleClassPeriod>();

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

  public static final String SERIALIZED_NAME_ALTERNATE_DAY_NAME = "alternateDayName";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_DAY_NAME)
  private String alternateDayName;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private List<EdFiBellScheduleDate> dates = null;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_GRADE_LEVELS = "gradeLevels";
  @SerializedName(SERIALIZED_NAME_GRADE_LEVELS)
  private List<EdFiBellScheduleGradeLevel> gradeLevels = null;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TOTAL_INSTRUCTIONAL_TIME = "totalInstructionalTime";
  @SerializedName(SERIALIZED_NAME_TOTAL_INSTRUCTIONAL_TIME)
  private Integer totalInstructionalTime;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiBellSchedule() { 
  }

  public EdFiBellSchedule id(String id) {
    
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


  public EdFiBellSchedule bellScheduleName(String bellScheduleName) {
    
    this.bellScheduleName = bellScheduleName;
    return this;
  }

   /**
   * Name or title of the BellSchedule.
   * @return bellScheduleName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name or title of the BellSchedule.")

  public String getBellScheduleName() {
    return bellScheduleName;
  }


  public void setBellScheduleName(String bellScheduleName) {
    this.bellScheduleName = bellScheduleName;
  }


  public EdFiBellSchedule classPeriods(List<EdFiBellScheduleClassPeriod> classPeriods) {
    
    this.classPeriods = classPeriods;
    return this;
  }

  public EdFiBellSchedule addClassPeriodsItem(EdFiBellScheduleClassPeriod classPeriodsItem) {
    this.classPeriods.add(classPeriodsItem);
    return this;
  }

   /**
   * An unordered collection of bellScheduleClassPeriods. The class periods that compose this BellSchedule.
   * @return classPeriods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An unordered collection of bellScheduleClassPeriods. The class periods that compose this BellSchedule.")

  public List<EdFiBellScheduleClassPeriod> getClassPeriods() {
    return classPeriods;
  }


  public void setClassPeriods(List<EdFiBellScheduleClassPeriod> classPeriods) {
    this.classPeriods = classPeriods;
  }


  public EdFiBellSchedule schoolReference(EdFiSchoolReference schoolReference) {
    
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


  public EdFiBellSchedule alternateDayName(String alternateDayName) {
    
    this.alternateDayName = alternateDayName;
    return this;
  }

   /**
   * An alternate name for the day (e.g., Red, Blue).
   * @return alternateDayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An alternate name for the day (e.g., Red, Blue).")

  public String getAlternateDayName() {
    return alternateDayName;
  }


  public void setAlternateDayName(String alternateDayName) {
    this.alternateDayName = alternateDayName;
  }


  public EdFiBellSchedule dates(List<EdFiBellScheduleDate> dates) {
    
    this.dates = dates;
    return this;
  }

  public EdFiBellSchedule addDatesItem(EdFiBellScheduleDate datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<EdFiBellScheduleDate>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * An unordered collection of bellScheduleDates. The dates for which the BellSchedule applies.
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of bellScheduleDates. The dates for which the BellSchedule applies.")

  public List<EdFiBellScheduleDate> getDates() {
    return dates;
  }


  public void setDates(List<EdFiBellScheduleDate> dates) {
    this.dates = dates;
  }


  public EdFiBellSchedule endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * An indication of the time of day the bell schedule ends.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of the time of day the bell schedule ends.")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public EdFiBellSchedule gradeLevels(List<EdFiBellScheduleGradeLevel> gradeLevels) {
    
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiBellSchedule addGradeLevelsItem(EdFiBellScheduleGradeLevel gradeLevelsItem) {
    if (this.gradeLevels == null) {
      this.gradeLevels = new ArrayList<EdFiBellScheduleGradeLevel>();
    }
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of bellScheduleGradeLevels. The grade levels the particular BellSchedule applies to.
   * @return gradeLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of bellScheduleGradeLevels. The grade levels the particular BellSchedule applies to.")

  public List<EdFiBellScheduleGradeLevel> getGradeLevels() {
    return gradeLevels;
  }


  public void setGradeLevels(List<EdFiBellScheduleGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }


  public EdFiBellSchedule startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * An indication of the time of day the bell schedule begins.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of the time of day the bell schedule begins.")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public EdFiBellSchedule totalInstructionalTime(Integer totalInstructionalTime) {
    
    this.totalInstructionalTime = totalInstructionalTime;
    return this;
  }

   /**
   * The total instructional time in minutes per day for the bell schedule.
   * @return totalInstructionalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total instructional time in minutes per day for the bell schedule.")

  public Integer getTotalInstructionalTime() {
    return totalInstructionalTime;
  }


  public void setTotalInstructionalTime(Integer totalInstructionalTime) {
    this.totalInstructionalTime = totalInstructionalTime;
  }


  public EdFiBellSchedule etag(String etag) {
    
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
    EdFiBellSchedule edFiBellSchedule = (EdFiBellSchedule) o;
    return Objects.equals(this.id, edFiBellSchedule.id) &&
        Objects.equals(this.bellScheduleName, edFiBellSchedule.bellScheduleName) &&
        Objects.equals(this.classPeriods, edFiBellSchedule.classPeriods) &&
        Objects.equals(this.schoolReference, edFiBellSchedule.schoolReference) &&
        Objects.equals(this.alternateDayName, edFiBellSchedule.alternateDayName) &&
        Objects.equals(this.dates, edFiBellSchedule.dates) &&
        Objects.equals(this.endTime, edFiBellSchedule.endTime) &&
        Objects.equals(this.gradeLevels, edFiBellSchedule.gradeLevels) &&
        Objects.equals(this.startTime, edFiBellSchedule.startTime) &&
        Objects.equals(this.totalInstructionalTime, edFiBellSchedule.totalInstructionalTime) &&
        Objects.equals(this.etag, edFiBellSchedule.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bellScheduleName, classPeriods, schoolReference, alternateDayName, dates, endTime, gradeLevels, startTime, totalInstructionalTime, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiBellSchedule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bellScheduleName: ").append(toIndentedString(bellScheduleName)).append("\n");
    sb.append("    classPeriods: ").append(toIndentedString(classPeriods)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    alternateDayName: ").append(toIndentedString(alternateDayName)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    gradeLevels: ").append(toIndentedString(gradeLevels)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalInstructionalTime: ").append(toIndentedString(totalInstructionalTime)).append("\n");
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

