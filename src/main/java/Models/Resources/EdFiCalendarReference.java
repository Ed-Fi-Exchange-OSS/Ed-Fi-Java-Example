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
import Models.Resources.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiCalendarReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiCalendarReference {
  public static final String SERIALIZED_NAME_CALENDAR_CODE = "calendarCode";
  @SerializedName(SERIALIZED_NAME_CALENDAR_CODE)
  private String calendarCode;

  public static final String SERIALIZED_NAME_SCHOOL_ID = "schoolId";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ID)
  private Integer schoolId;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR = "schoolYear";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR)
  private Integer schoolYear;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiCalendarReference() { 
  }

  public EdFiCalendarReference calendarCode(String calendarCode) {
    
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


  public EdFiCalendarReference schoolId(Integer schoolId) {
    
    this.schoolId = schoolId;
    return this;
  }

   /**
   * The identifier assigned to a school.
   * @return schoolId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to a school.")

  public Integer getSchoolId() {
    return schoolId;
  }


  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }


  public EdFiCalendarReference schoolYear(Integer schoolYear) {
    
    this.schoolYear = schoolYear;
    return this;
  }

   /**
   * The identifier for the school year associated with the Calendar.
   * @return schoolYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the school year associated with the Calendar.")

  public Integer getSchoolYear() {
    return schoolYear;
  }


  public void setSchoolYear(Integer schoolYear) {
    this.schoolYear = schoolYear;
  }


  public EdFiCalendarReference link(Link link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getLink() {
    return link;
  }


  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiCalendarReference edFiCalendarReference = (EdFiCalendarReference) o;
    return Objects.equals(this.calendarCode, edFiCalendarReference.calendarCode) &&
        Objects.equals(this.schoolId, edFiCalendarReference.schoolId) &&
        Objects.equals(this.schoolYear, edFiCalendarReference.schoolYear) &&
        Objects.equals(this.link, edFiCalendarReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarCode, schoolId, schoolYear, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCalendarReference {\n");
    sb.append("    calendarCode: ").append(toIndentedString(calendarCode)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    schoolYear: ").append(toIndentedString(schoolYear)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
