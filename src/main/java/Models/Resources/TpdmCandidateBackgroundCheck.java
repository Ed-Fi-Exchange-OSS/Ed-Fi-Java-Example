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
 * TpdmCandidateBackgroundCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCandidateBackgroundCheck {
  public static final String SERIALIZED_NAME_BACKGROUND_CHECK_STATUS_DESCRIPTOR = "backgroundCheckStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_CHECK_STATUS_DESCRIPTOR)
  private String backgroundCheckStatusDescriptor;

  public static final String SERIALIZED_NAME_BACKGROUND_CHECK_TYPE_DESCRIPTOR = "backgroundCheckTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_CHECK_TYPE_DESCRIPTOR)
  private String backgroundCheckTypeDescriptor;

  public static final String SERIALIZED_NAME_BACKGROUND_CHECK_COMPLETED_DATE = "backgroundCheckCompletedDate";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_CHECK_COMPLETED_DATE)
  private LocalDate backgroundCheckCompletedDate;

  public static final String SERIALIZED_NAME_BACKGROUND_CHECK_REQUESTED_DATE = "backgroundCheckRequestedDate";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_CHECK_REQUESTED_DATE)
  private LocalDate backgroundCheckRequestedDate;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private Boolean fingerprint;

  public TpdmCandidateBackgroundCheck() { 
  }

  public TpdmCandidateBackgroundCheck backgroundCheckStatusDescriptor(String backgroundCheckStatusDescriptor) {
    
    this.backgroundCheckStatusDescriptor = backgroundCheckStatusDescriptor;
    return this;
  }

   /**
   * The status of the background check (e.g., pending, under investigation, offense(s) found, etc.).
   * @return backgroundCheckStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the background check (e.g., pending, under investigation, offense(s) found, etc.).")

  public String getBackgroundCheckStatusDescriptor() {
    return backgroundCheckStatusDescriptor;
  }


  public void setBackgroundCheckStatusDescriptor(String backgroundCheckStatusDescriptor) {
    this.backgroundCheckStatusDescriptor = backgroundCheckStatusDescriptor;
  }


  public TpdmCandidateBackgroundCheck backgroundCheckTypeDescriptor(String backgroundCheckTypeDescriptor) {
    
    this.backgroundCheckTypeDescriptor = backgroundCheckTypeDescriptor;
    return this;
  }

   /**
   * The type of background check (e.g., online, criminal, employment).
   * @return backgroundCheckTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of background check (e.g., online, criminal, employment).")

  public String getBackgroundCheckTypeDescriptor() {
    return backgroundCheckTypeDescriptor;
  }


  public void setBackgroundCheckTypeDescriptor(String backgroundCheckTypeDescriptor) {
    this.backgroundCheckTypeDescriptor = backgroundCheckTypeDescriptor;
  }


  public TpdmCandidateBackgroundCheck backgroundCheckCompletedDate(LocalDate backgroundCheckCompletedDate) {
    
    this.backgroundCheckCompletedDate = backgroundCheckCompletedDate;
    return this;
  }

   /**
   * The date the background check was completed.
   * @return backgroundCheckCompletedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the background check was completed.")

  public LocalDate getBackgroundCheckCompletedDate() {
    return backgroundCheckCompletedDate;
  }


  public void setBackgroundCheckCompletedDate(LocalDate backgroundCheckCompletedDate) {
    this.backgroundCheckCompletedDate = backgroundCheckCompletedDate;
  }


  public TpdmCandidateBackgroundCheck backgroundCheckRequestedDate(LocalDate backgroundCheckRequestedDate) {
    
    this.backgroundCheckRequestedDate = backgroundCheckRequestedDate;
    return this;
  }

   /**
   * The date the background check was requested.
   * @return backgroundCheckRequestedDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date the background check was requested.")

  public LocalDate getBackgroundCheckRequestedDate() {
    return backgroundCheckRequestedDate;
  }


  public void setBackgroundCheckRequestedDate(LocalDate backgroundCheckRequestedDate) {
    this.backgroundCheckRequestedDate = backgroundCheckRequestedDate;
  }


  public TpdmCandidateBackgroundCheck fingerprint(Boolean fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Indicates that a person has or has not completed a fingerprint.
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that a person has or has not completed a fingerprint.")

  public Boolean getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(Boolean fingerprint) {
    this.fingerprint = fingerprint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCandidateBackgroundCheck tpdmCandidateBackgroundCheck = (TpdmCandidateBackgroundCheck) o;
    return Objects.equals(this.backgroundCheckStatusDescriptor, tpdmCandidateBackgroundCheck.backgroundCheckStatusDescriptor) &&
        Objects.equals(this.backgroundCheckTypeDescriptor, tpdmCandidateBackgroundCheck.backgroundCheckTypeDescriptor) &&
        Objects.equals(this.backgroundCheckCompletedDate, tpdmCandidateBackgroundCheck.backgroundCheckCompletedDate) &&
        Objects.equals(this.backgroundCheckRequestedDate, tpdmCandidateBackgroundCheck.backgroundCheckRequestedDate) &&
        Objects.equals(this.fingerprint, tpdmCandidateBackgroundCheck.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundCheckStatusDescriptor, backgroundCheckTypeDescriptor, backgroundCheckCompletedDate, backgroundCheckRequestedDate, fingerprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCandidateBackgroundCheck {\n");
    sb.append("    backgroundCheckStatusDescriptor: ").append(toIndentedString(backgroundCheckStatusDescriptor)).append("\n");
    sb.append("    backgroundCheckTypeDescriptor: ").append(toIndentedString(backgroundCheckTypeDescriptor)).append("\n");
    sb.append("    backgroundCheckCompletedDate: ").append(toIndentedString(backgroundCheckCompletedDate)).append("\n");
    sb.append("    backgroundCheckRequestedDate: ").append(toIndentedString(backgroundCheckRequestedDate)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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

