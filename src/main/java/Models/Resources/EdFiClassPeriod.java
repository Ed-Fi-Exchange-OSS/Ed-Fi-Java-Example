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
import Models.Resources.EdFiClassPeriodMeetingTime;
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
 * EdFiClassPeriod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiClassPeriod {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CLASS_PERIOD_NAME = "classPeriodName";
  @SerializedName(SERIALIZED_NAME_CLASS_PERIOD_NAME)
  private String classPeriodName;

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

  public static final String SERIALIZED_NAME_MEETING_TIMES = "meetingTimes";
  @SerializedName(SERIALIZED_NAME_MEETING_TIMES)
  private List<EdFiClassPeriodMeetingTime> meetingTimes = null;

  public static final String SERIALIZED_NAME_OFFICIAL_ATTENDANCE_PERIOD = "officialAttendancePeriod";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_ATTENDANCE_PERIOD)
  private Boolean officialAttendancePeriod;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiClassPeriod() { 
  }

  public EdFiClassPeriod id(String id) {
    
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


  public EdFiClassPeriod classPeriodName(String classPeriodName) {
    
    this.classPeriodName = classPeriodName;
    return this;
  }

   /**
   * An indication of the portion of a typical daily session in which students receive instruction in a specified subject (e.g., morning, sixth period, block period, or AB schedules).
   * @return classPeriodName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An indication of the portion of a typical daily session in which students receive instruction in a specified subject (e.g., morning, sixth period, block period, or AB schedules).")

  public String getClassPeriodName() {
    return classPeriodName;
  }


  public void setClassPeriodName(String classPeriodName) {
    this.classPeriodName = classPeriodName;
  }


  public EdFiClassPeriod schoolReference(EdFiSchoolReference schoolReference) {
    
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


  public EdFiClassPeriod meetingTimes(List<EdFiClassPeriodMeetingTime> meetingTimes) {
    
    this.meetingTimes = meetingTimes;
    return this;
  }

  public EdFiClassPeriod addMeetingTimesItem(EdFiClassPeriodMeetingTime meetingTimesItem) {
    if (this.meetingTimes == null) {
      this.meetingTimes = new ArrayList<EdFiClassPeriodMeetingTime>();
    }
    this.meetingTimes.add(meetingTimesItem);
    return this;
  }

   /**
   * An unordered collection of classPeriodMeetingTimes. The meeting time(s) for a class period.
   * @return meetingTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of classPeriodMeetingTimes. The meeting time(s) for a class period.")

  public List<EdFiClassPeriodMeetingTime> getMeetingTimes() {
    return meetingTimes;
  }


  public void setMeetingTimes(List<EdFiClassPeriodMeetingTime> meetingTimes) {
    this.meetingTimes = meetingTimes;
  }


  public EdFiClassPeriod officialAttendancePeriod(Boolean officialAttendancePeriod) {
    
    this.officialAttendancePeriod = officialAttendancePeriod;
    return this;
  }

   /**
   * Indicator of whether this class period is used for official daily attendance. Alternatively, official daily attendance may be tied to a Section.
   * @return officialAttendancePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether this class period is used for official daily attendance. Alternatively, official daily attendance may be tied to a Section.")

  public Boolean getOfficialAttendancePeriod() {
    return officialAttendancePeriod;
  }


  public void setOfficialAttendancePeriod(Boolean officialAttendancePeriod) {
    this.officialAttendancePeriod = officialAttendancePeriod;
  }


  public EdFiClassPeriod etag(String etag) {
    
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
    EdFiClassPeriod edFiClassPeriod = (EdFiClassPeriod) o;
    return Objects.equals(this.id, edFiClassPeriod.id) &&
        Objects.equals(this.classPeriodName, edFiClassPeriod.classPeriodName) &&
        Objects.equals(this.schoolReference, edFiClassPeriod.schoolReference) &&
        Objects.equals(this.meetingTimes, edFiClassPeriod.meetingTimes) &&
        Objects.equals(this.officialAttendancePeriod, edFiClassPeriod.officialAttendancePeriod) &&
        Objects.equals(this.etag, edFiClassPeriod.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, classPeriodName, schoolReference, meetingTimes, officialAttendancePeriod, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiClassPeriod {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classPeriodName: ").append(toIndentedString(classPeriodName)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    meetingTimes: ").append(toIndentedString(meetingTimes)).append("\n");
    sb.append("    officialAttendancePeriod: ").append(toIndentedString(officialAttendancePeriod)).append("\n");
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

