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
import Models.Resources.EdFiCalendarDateCalendarEvent;
import Models.Resources.EdFiCalendarReference;
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
import org.threeten.bp.LocalDate;

/**
 * EdFiCalendarDate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiCalendarDate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CALENDAR_EVENTS = "calendarEvents";
  @SerializedName(SERIALIZED_NAME_CALENDAR_EVENTS)
  private List<EdFiCalendarDateCalendarEvent> calendarEvents = new ArrayList<EdFiCalendarDateCalendarEvent>();

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_CALENDAR_REFERENCE = "calendarReference";
  @SerializedName(SERIALIZED_NAME_CALENDAR_REFERENCE)
  private EdFiCalendarReference calendarReference;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiCalendarDate() { 
  }

  public EdFiCalendarDate id(String id) {
    
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


  public EdFiCalendarDate calendarEvents(List<EdFiCalendarDateCalendarEvent> calendarEvents) {
    
    this.calendarEvents = calendarEvents;
    return this;
  }

  public EdFiCalendarDate addCalendarEventsItem(EdFiCalendarDateCalendarEvent calendarEventsItem) {
    this.calendarEvents.add(calendarEventsItem);
    return this;
  }

   /**
   * An unordered collection of calendarDateCalendarEvents. The type of scheduled or unscheduled event for the day.
   * @return calendarEvents
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An unordered collection of calendarDateCalendarEvents. The type of scheduled or unscheduled event for the day.")

  public List<EdFiCalendarDateCalendarEvent> getCalendarEvents() {
    return calendarEvents;
  }


  public void setCalendarEvents(List<EdFiCalendarDateCalendarEvent> calendarEvents) {
    this.calendarEvents = calendarEvents;
  }


  public EdFiCalendarDate date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * The month, day, and year of the CalendarEvent.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year of the CalendarEvent.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public EdFiCalendarDate calendarReference(EdFiCalendarReference calendarReference) {
    
    this.calendarReference = calendarReference;
    return this;
  }

   /**
   * Get calendarReference
   * @return calendarReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiCalendarReference getCalendarReference() {
    return calendarReference;
  }


  public void setCalendarReference(EdFiCalendarReference calendarReference) {
    this.calendarReference = calendarReference;
  }


  public EdFiCalendarDate etag(String etag) {
    
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
    EdFiCalendarDate edFiCalendarDate = (EdFiCalendarDate) o;
    return Objects.equals(this.id, edFiCalendarDate.id) &&
        Objects.equals(this.calendarEvents, edFiCalendarDate.calendarEvents) &&
        Objects.equals(this.date, edFiCalendarDate.date) &&
        Objects.equals(this.calendarReference, edFiCalendarDate.calendarReference) &&
        Objects.equals(this.etag, edFiCalendarDate.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, calendarEvents, date, calendarReference, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCalendarDate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    calendarEvents: ").append(toIndentedString(calendarEvents)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    calendarReference: ").append(toIndentedString(calendarReference)).append("\n");
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

