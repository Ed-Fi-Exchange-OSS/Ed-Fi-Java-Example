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
import Models.Resources.EdFiCredentialReference;
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
 * TpdmCredentialEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCredentialEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREDENTIAL_EVENT_DATE = "credentialEventDate";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_EVENT_DATE)
  private LocalDate credentialEventDate;

  public static final String SERIALIZED_NAME_CREDENTIAL_EVENT_TYPE_DESCRIPTOR = "credentialEventTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_EVENT_TYPE_DESCRIPTOR)
  private String credentialEventTypeDescriptor;

  public static final String SERIALIZED_NAME_CREDENTIAL_REFERENCE = "credentialReference";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_REFERENCE)
  private EdFiCredentialReference credentialReference;

  public static final String SERIALIZED_NAME_CREDENTIAL_EVENT_REASON = "credentialEventReason";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_EVENT_REASON)
  private String credentialEventReason;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmCredentialEvent() { 
  }

  public TpdmCredentialEvent id(String id) {
    
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


  public TpdmCredentialEvent credentialEventDate(LocalDate credentialEventDate) {
    
    this.credentialEventDate = credentialEventDate;
    return this;
  }

   /**
   * The year, month and day of the Credential Event.
   * @return credentialEventDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The year, month and day of the Credential Event.")

  public LocalDate getCredentialEventDate() {
    return credentialEventDate;
  }


  public void setCredentialEventDate(LocalDate credentialEventDate) {
    this.credentialEventDate = credentialEventDate;
  }


  public TpdmCredentialEvent credentialEventTypeDescriptor(String credentialEventTypeDescriptor) {
    
    this.credentialEventTypeDescriptor = credentialEventTypeDescriptor;
    return this;
  }

   /**
   * The type of event associated with a person&#39;s Credential (e.g, suspension, revocation, or renewal).
   * @return credentialEventTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of event associated with a person's Credential (e.g, suspension, revocation, or renewal).")

  public String getCredentialEventTypeDescriptor() {
    return credentialEventTypeDescriptor;
  }


  public void setCredentialEventTypeDescriptor(String credentialEventTypeDescriptor) {
    this.credentialEventTypeDescriptor = credentialEventTypeDescriptor;
  }


  public TpdmCredentialEvent credentialReference(EdFiCredentialReference credentialReference) {
    
    this.credentialReference = credentialReference;
    return this;
  }

   /**
   * Get credentialReference
   * @return credentialReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiCredentialReference getCredentialReference() {
    return credentialReference;
  }


  public void setCredentialReference(EdFiCredentialReference credentialReference) {
    this.credentialReference = credentialReference;
  }


  public TpdmCredentialEvent credentialEventReason(String credentialEventReason) {
    
    this.credentialEventReason = credentialEventReason;
    return this;
  }

   /**
   * The reason for the credential event, or any other descriptive text.
   * @return credentialEventReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for the credential event, or any other descriptive text.")

  public String getCredentialEventReason() {
    return credentialEventReason;
  }


  public void setCredentialEventReason(String credentialEventReason) {
    this.credentialEventReason = credentialEventReason;
  }


  public TpdmCredentialEvent etag(String etag) {
    
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
    TpdmCredentialEvent tpdmCredentialEvent = (TpdmCredentialEvent) o;
    return Objects.equals(this.id, tpdmCredentialEvent.id) &&
        Objects.equals(this.credentialEventDate, tpdmCredentialEvent.credentialEventDate) &&
        Objects.equals(this.credentialEventTypeDescriptor, tpdmCredentialEvent.credentialEventTypeDescriptor) &&
        Objects.equals(this.credentialReference, tpdmCredentialEvent.credentialReference) &&
        Objects.equals(this.credentialEventReason, tpdmCredentialEvent.credentialEventReason) &&
        Objects.equals(this.etag, tpdmCredentialEvent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, credentialEventDate, credentialEventTypeDescriptor, credentialReference, credentialEventReason, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCredentialEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    credentialEventDate: ").append(toIndentedString(credentialEventDate)).append("\n");
    sb.append("    credentialEventTypeDescriptor: ").append(toIndentedString(credentialEventTypeDescriptor)).append("\n");
    sb.append("    credentialReference: ").append(toIndentedString(credentialReference)).append("\n");
    sb.append("    credentialEventReason: ").append(toIndentedString(credentialEventReason)).append("\n");
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
