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
import Models.Resources.EdFiOpenStaffPositionReference;
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
 * TpdmOpenStaffPositionEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmOpenStaffPositionEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EVENT_DATE = "eventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private LocalDate eventDate;

  public static final String SERIALIZED_NAME_OPEN_STAFF_POSITION_EVENT_TYPE_DESCRIPTOR = "openStaffPositionEventTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_OPEN_STAFF_POSITION_EVENT_TYPE_DESCRIPTOR)
  private String openStaffPositionEventTypeDescriptor;

  public static final String SERIALIZED_NAME_OPEN_STAFF_POSITION_REFERENCE = "openStaffPositionReference";
  @SerializedName(SERIALIZED_NAME_OPEN_STAFF_POSITION_REFERENCE)
  private EdFiOpenStaffPositionReference openStaffPositionReference;

  public static final String SERIALIZED_NAME_OPEN_STAFF_POSITION_EVENT_STATUS_DESCRIPTOR = "openStaffPositionEventStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_OPEN_STAFF_POSITION_EVENT_STATUS_DESCRIPTOR)
  private String openStaffPositionEventStatusDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmOpenStaffPositionEvent() { 
  }

  public TpdmOpenStaffPositionEvent id(String id) {
    
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


  public TpdmOpenStaffPositionEvent eventDate(LocalDate eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Date of the open staff position event.
   * @return eventDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of the open staff position event.")

  public LocalDate getEventDate() {
    return eventDate;
  }


  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }


  public TpdmOpenStaffPositionEvent openStaffPositionEventTypeDescriptor(String openStaffPositionEventTypeDescriptor) {
    
    this.openStaffPositionEventTypeDescriptor = openStaffPositionEventTypeDescriptor;
    return this;
  }

   /**
   * Reflects milestones like vacancy approved, vacancy posted, date onboarded, processing date, orientation date, etc.
   * @return openStaffPositionEventTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Reflects milestones like vacancy approved, vacancy posted, date onboarded, processing date, orientation date, etc.")

  public String getOpenStaffPositionEventTypeDescriptor() {
    return openStaffPositionEventTypeDescriptor;
  }


  public void setOpenStaffPositionEventTypeDescriptor(String openStaffPositionEventTypeDescriptor) {
    this.openStaffPositionEventTypeDescriptor = openStaffPositionEventTypeDescriptor;
  }


  public TpdmOpenStaffPositionEvent openStaffPositionReference(EdFiOpenStaffPositionReference openStaffPositionReference) {
    
    this.openStaffPositionReference = openStaffPositionReference;
    return this;
  }

   /**
   * Get openStaffPositionReference
   * @return openStaffPositionReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiOpenStaffPositionReference getOpenStaffPositionReference() {
    return openStaffPositionReference;
  }


  public void setOpenStaffPositionReference(EdFiOpenStaffPositionReference openStaffPositionReference) {
    this.openStaffPositionReference = openStaffPositionReference;
  }


  public TpdmOpenStaffPositionEvent openStaffPositionEventStatusDescriptor(String openStaffPositionEventStatusDescriptor) {
    
    this.openStaffPositionEventStatusDescriptor = openStaffPositionEventStatusDescriptor;
    return this;
  }

   /**
   * Reflects the status of the milestone (e.g., pending, completed, cancelled).
   * @return openStaffPositionEventStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reflects the status of the milestone (e.g., pending, completed, cancelled).")

  public String getOpenStaffPositionEventStatusDescriptor() {
    return openStaffPositionEventStatusDescriptor;
  }


  public void setOpenStaffPositionEventStatusDescriptor(String openStaffPositionEventStatusDescriptor) {
    this.openStaffPositionEventStatusDescriptor = openStaffPositionEventStatusDescriptor;
  }


  public TpdmOpenStaffPositionEvent etag(String etag) {
    
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
    TpdmOpenStaffPositionEvent tpdmOpenStaffPositionEvent = (TpdmOpenStaffPositionEvent) o;
    return Objects.equals(this.id, tpdmOpenStaffPositionEvent.id) &&
        Objects.equals(this.eventDate, tpdmOpenStaffPositionEvent.eventDate) &&
        Objects.equals(this.openStaffPositionEventTypeDescriptor, tpdmOpenStaffPositionEvent.openStaffPositionEventTypeDescriptor) &&
        Objects.equals(this.openStaffPositionReference, tpdmOpenStaffPositionEvent.openStaffPositionReference) &&
        Objects.equals(this.openStaffPositionEventStatusDescriptor, tpdmOpenStaffPositionEvent.openStaffPositionEventStatusDescriptor) &&
        Objects.equals(this.etag, tpdmOpenStaffPositionEvent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventDate, openStaffPositionEventTypeDescriptor, openStaffPositionReference, openStaffPositionEventStatusDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmOpenStaffPositionEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    openStaffPositionEventTypeDescriptor: ").append(toIndentedString(openStaffPositionEventTypeDescriptor)).append("\n");
    sb.append("    openStaffPositionReference: ").append(toIndentedString(openStaffPositionReference)).append("\n");
    sb.append("    openStaffPositionEventStatusDescriptor: ").append(toIndentedString(openStaffPositionEventStatusDescriptor)).append("\n");
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
