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
import Models.Resources.EdFiPostSecondaryInstitutionReference;
import Models.Resources.EdFiStudentReference;
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
 * EdFiPostSecondaryEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiPostSecondaryEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EVENT_DATE = "eventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private LocalDate eventDate;

  public static final String SERIALIZED_NAME_POST_SECONDARY_EVENT_CATEGORY_DESCRIPTOR = "postSecondaryEventCategoryDescriptor";
  @SerializedName(SERIALIZED_NAME_POST_SECONDARY_EVENT_CATEGORY_DESCRIPTOR)
  private String postSecondaryEventCategoryDescriptor;

  public static final String SERIALIZED_NAME_POST_SECONDARY_INSTITUTION_REFERENCE = "postSecondaryInstitutionReference";
  @SerializedName(SERIALIZED_NAME_POST_SECONDARY_INSTITUTION_REFERENCE)
  private EdFiPostSecondaryInstitutionReference postSecondaryInstitutionReference;

  public static final String SERIALIZED_NAME_STUDENT_REFERENCE = "studentReference";
  @SerializedName(SERIALIZED_NAME_STUDENT_REFERENCE)
  private EdFiStudentReference studentReference;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiPostSecondaryEvent() { 
  }

  public EdFiPostSecondaryEvent id(String id) {
    
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


  public EdFiPostSecondaryEvent eventDate(LocalDate eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The date the event occurred or was recorded.
   * @return eventDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date the event occurred or was recorded.")

  public LocalDate getEventDate() {
    return eventDate;
  }


  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }


  public EdFiPostSecondaryEvent postSecondaryEventCategoryDescriptor(String postSecondaryEventCategoryDescriptor) {
    
    this.postSecondaryEventCategoryDescriptor = postSecondaryEventCategoryDescriptor;
    return this;
  }

   /**
   * The PostSecondaryEvent that is logged (e.g., FAFSA application, college application, college acceptance).
   * @return postSecondaryEventCategoryDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The PostSecondaryEvent that is logged (e.g., FAFSA application, college application, college acceptance).")

  public String getPostSecondaryEventCategoryDescriptor() {
    return postSecondaryEventCategoryDescriptor;
  }


  public void setPostSecondaryEventCategoryDescriptor(String postSecondaryEventCategoryDescriptor) {
    this.postSecondaryEventCategoryDescriptor = postSecondaryEventCategoryDescriptor;
  }


  public EdFiPostSecondaryEvent postSecondaryInstitutionReference(EdFiPostSecondaryInstitutionReference postSecondaryInstitutionReference) {
    
    this.postSecondaryInstitutionReference = postSecondaryInstitutionReference;
    return this;
  }

   /**
   * Get postSecondaryInstitutionReference
   * @return postSecondaryInstitutionReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiPostSecondaryInstitutionReference getPostSecondaryInstitutionReference() {
    return postSecondaryInstitutionReference;
  }


  public void setPostSecondaryInstitutionReference(EdFiPostSecondaryInstitutionReference postSecondaryInstitutionReference) {
    this.postSecondaryInstitutionReference = postSecondaryInstitutionReference;
  }


  public EdFiPostSecondaryEvent studentReference(EdFiStudentReference studentReference) {
    
    this.studentReference = studentReference;
    return this;
  }

   /**
   * Get studentReference
   * @return studentReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiStudentReference getStudentReference() {
    return studentReference;
  }


  public void setStudentReference(EdFiStudentReference studentReference) {
    this.studentReference = studentReference;
  }


  public EdFiPostSecondaryEvent etag(String etag) {
    
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
    EdFiPostSecondaryEvent edFiPostSecondaryEvent = (EdFiPostSecondaryEvent) o;
    return Objects.equals(this.id, edFiPostSecondaryEvent.id) &&
        Objects.equals(this.eventDate, edFiPostSecondaryEvent.eventDate) &&
        Objects.equals(this.postSecondaryEventCategoryDescriptor, edFiPostSecondaryEvent.postSecondaryEventCategoryDescriptor) &&
        Objects.equals(this.postSecondaryInstitutionReference, edFiPostSecondaryEvent.postSecondaryInstitutionReference) &&
        Objects.equals(this.studentReference, edFiPostSecondaryEvent.studentReference) &&
        Objects.equals(this.etag, edFiPostSecondaryEvent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventDate, postSecondaryEventCategoryDescriptor, postSecondaryInstitutionReference, studentReference, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiPostSecondaryEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    postSecondaryEventCategoryDescriptor: ").append(toIndentedString(postSecondaryEventCategoryDescriptor)).append("\n");
    sb.append("    postSecondaryInstitutionReference: ").append(toIndentedString(postSecondaryInstitutionReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
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

