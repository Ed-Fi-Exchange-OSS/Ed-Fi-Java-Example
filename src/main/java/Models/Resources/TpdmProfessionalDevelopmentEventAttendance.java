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
import Models.Resources.EdFiPersonReference;
import Models.Resources.TpdmProfessionalDevelopmentEventReference;
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
 * TpdmProfessionalDevelopmentEventAttendance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmProfessionalDevelopmentEventAttendance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ATTENDANCE_DATE = "attendanceDate";
  @SerializedName(SERIALIZED_NAME_ATTENDANCE_DATE)
  private LocalDate attendanceDate;

  public static final String SERIALIZED_NAME_PERSON_REFERENCE = "personReference";
  @SerializedName(SERIALIZED_NAME_PERSON_REFERENCE)
  private EdFiPersonReference personReference;

  public static final String SERIALIZED_NAME_PROFESSIONAL_DEVELOPMENT_EVENT_REFERENCE = "professionalDevelopmentEventReference";
  @SerializedName(SERIALIZED_NAME_PROFESSIONAL_DEVELOPMENT_EVENT_REFERENCE)
  private TpdmProfessionalDevelopmentEventReference professionalDevelopmentEventReference;

  public static final String SERIALIZED_NAME_ATTENDANCE_EVENT_CATEGORY_DESCRIPTOR = "attendanceEventCategoryDescriptor";
  @SerializedName(SERIALIZED_NAME_ATTENDANCE_EVENT_CATEGORY_DESCRIPTOR)
  private String attendanceEventCategoryDescriptor;

  public static final String SERIALIZED_NAME_ATTENDANCE_EVENT_REASON = "attendanceEventReason";
  @SerializedName(SERIALIZED_NAME_ATTENDANCE_EVENT_REASON)
  private String attendanceEventReason;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmProfessionalDevelopmentEventAttendance() { 
  }

  public TpdmProfessionalDevelopmentEventAttendance id(String id) {
    
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


  public TpdmProfessionalDevelopmentEventAttendance attendanceDate(LocalDate attendanceDate) {
    
    this.attendanceDate = attendanceDate;
    return this;
  }

   /**
   * Date for this attendance event.
   * @return attendanceDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date for this attendance event.")

  public LocalDate getAttendanceDate() {
    return attendanceDate;
  }


  public void setAttendanceDate(LocalDate attendanceDate) {
    this.attendanceDate = attendanceDate;
  }


  public TpdmProfessionalDevelopmentEventAttendance personReference(EdFiPersonReference personReference) {
    
    this.personReference = personReference;
    return this;
  }

   /**
   * Get personReference
   * @return personReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiPersonReference getPersonReference() {
    return personReference;
  }


  public void setPersonReference(EdFiPersonReference personReference) {
    this.personReference = personReference;
  }


  public TpdmProfessionalDevelopmentEventAttendance professionalDevelopmentEventReference(TpdmProfessionalDevelopmentEventReference professionalDevelopmentEventReference) {
    
    this.professionalDevelopmentEventReference = professionalDevelopmentEventReference;
    return this;
  }

   /**
   * Get professionalDevelopmentEventReference
   * @return professionalDevelopmentEventReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmProfessionalDevelopmentEventReference getProfessionalDevelopmentEventReference() {
    return professionalDevelopmentEventReference;
  }


  public void setProfessionalDevelopmentEventReference(TpdmProfessionalDevelopmentEventReference professionalDevelopmentEventReference) {
    this.professionalDevelopmentEventReference = professionalDevelopmentEventReference;
  }


  public TpdmProfessionalDevelopmentEventAttendance attendanceEventCategoryDescriptor(String attendanceEventCategoryDescriptor) {
    
    this.attendanceEventCategoryDescriptor = attendanceEventCategoryDescriptor;
    return this;
  }

   /**
   * A code describing the attendance event, for example:       Present       Unexcused absence       Excused absence       Tardy.
   * @return attendanceEventCategoryDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A code describing the attendance event, for example:       Present       Unexcused absence       Excused absence       Tardy.")

  public String getAttendanceEventCategoryDescriptor() {
    return attendanceEventCategoryDescriptor;
  }


  public void setAttendanceEventCategoryDescriptor(String attendanceEventCategoryDescriptor) {
    this.attendanceEventCategoryDescriptor = attendanceEventCategoryDescriptor;
  }


  public TpdmProfessionalDevelopmentEventAttendance attendanceEventReason(String attendanceEventReason) {
    
    this.attendanceEventReason = attendanceEventReason;
    return this;
  }

   /**
   * The reported reason for a teacher candidate&#39;s absence.
   * @return attendanceEventReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reported reason for a teacher candidate's absence.")

  public String getAttendanceEventReason() {
    return attendanceEventReason;
  }


  public void setAttendanceEventReason(String attendanceEventReason) {
    this.attendanceEventReason = attendanceEventReason;
  }


  public TpdmProfessionalDevelopmentEventAttendance etag(String etag) {
    
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
    TpdmProfessionalDevelopmentEventAttendance tpdmProfessionalDevelopmentEventAttendance = (TpdmProfessionalDevelopmentEventAttendance) o;
    return Objects.equals(this.id, tpdmProfessionalDevelopmentEventAttendance.id) &&
        Objects.equals(this.attendanceDate, tpdmProfessionalDevelopmentEventAttendance.attendanceDate) &&
        Objects.equals(this.personReference, tpdmProfessionalDevelopmentEventAttendance.personReference) &&
        Objects.equals(this.professionalDevelopmentEventReference, tpdmProfessionalDevelopmentEventAttendance.professionalDevelopmentEventReference) &&
        Objects.equals(this.attendanceEventCategoryDescriptor, tpdmProfessionalDevelopmentEventAttendance.attendanceEventCategoryDescriptor) &&
        Objects.equals(this.attendanceEventReason, tpdmProfessionalDevelopmentEventAttendance.attendanceEventReason) &&
        Objects.equals(this.etag, tpdmProfessionalDevelopmentEventAttendance.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attendanceDate, personReference, professionalDevelopmentEventReference, attendanceEventCategoryDescriptor, attendanceEventReason, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmProfessionalDevelopmentEventAttendance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attendanceDate: ").append(toIndentedString(attendanceDate)).append("\n");
    sb.append("    personReference: ").append(toIndentedString(personReference)).append("\n");
    sb.append("    professionalDevelopmentEventReference: ").append(toIndentedString(professionalDevelopmentEventReference)).append("\n");
    sb.append("    attendanceEventCategoryDescriptor: ").append(toIndentedString(attendanceEventCategoryDescriptor)).append("\n");
    sb.append("    attendanceEventReason: ").append(toIndentedString(attendanceEventReason)).append("\n");
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
