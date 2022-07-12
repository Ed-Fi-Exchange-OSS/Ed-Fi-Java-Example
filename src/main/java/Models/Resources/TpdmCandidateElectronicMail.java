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

/**
 * TpdmCandidateElectronicMail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCandidateElectronicMail {
  public static final String SERIALIZED_NAME_ELECTRONIC_MAIL_TYPE_DESCRIPTOR = "electronicMailTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_MAIL_TYPE_DESCRIPTOR)
  private String electronicMailTypeDescriptor;

  public static final String SERIALIZED_NAME_ELECTRONIC_MAIL_ADDRESS = "electronicMailAddress";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_MAIL_ADDRESS)
  private String electronicMailAddress;

  public static final String SERIALIZED_NAME_DO_NOT_PUBLISH_INDICATOR = "doNotPublishIndicator";
  @SerializedName(SERIALIZED_NAME_DO_NOT_PUBLISH_INDICATOR)
  private Boolean doNotPublishIndicator;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL_ADDRESS_INDICATOR = "primaryEmailAddressIndicator";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL_ADDRESS_INDICATOR)
  private Boolean primaryEmailAddressIndicator;

  public TpdmCandidateElectronicMail() { 
  }

  public TpdmCandidateElectronicMail electronicMailTypeDescriptor(String electronicMailTypeDescriptor) {
    
    this.electronicMailTypeDescriptor = electronicMailTypeDescriptor;
    return this;
  }

   /**
   * The type of email listed for an individual or organization. For example: Home/Personal, Work, etc.)
   * @return electronicMailTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of email listed for an individual or organization. For example: Home/Personal, Work, etc.)")

  public String getElectronicMailTypeDescriptor() {
    return electronicMailTypeDescriptor;
  }


  public void setElectronicMailTypeDescriptor(String electronicMailTypeDescriptor) {
    this.electronicMailTypeDescriptor = electronicMailTypeDescriptor;
  }


  public TpdmCandidateElectronicMail electronicMailAddress(String electronicMailAddress) {
    
    this.electronicMailAddress = electronicMailAddress;
    return this;
  }

   /**
   * The electronic mail (e-mail) address listed for an individual or organization.
   * @return electronicMailAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The electronic mail (e-mail) address listed for an individual or organization.")

  public String getElectronicMailAddress() {
    return electronicMailAddress;
  }


  public void setElectronicMailAddress(String electronicMailAddress) {
    this.electronicMailAddress = electronicMailAddress;
  }


  public TpdmCandidateElectronicMail doNotPublishIndicator(Boolean doNotPublishIndicator) {
    
    this.doNotPublishIndicator = doNotPublishIndicator;
    return this;
  }

   /**
   * An indication that the electronic email address should not be published.
   * @return doNotPublishIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication that the electronic email address should not be published.")

  public Boolean getDoNotPublishIndicator() {
    return doNotPublishIndicator;
  }


  public void setDoNotPublishIndicator(Boolean doNotPublishIndicator) {
    this.doNotPublishIndicator = doNotPublishIndicator;
  }


  public TpdmCandidateElectronicMail primaryEmailAddressIndicator(Boolean primaryEmailAddressIndicator) {
    
    this.primaryEmailAddressIndicator = primaryEmailAddressIndicator;
    return this;
  }

   /**
   * An indication that the electronic mail address should be used as the principal electronic mail address for an individual or organization.
   * @return primaryEmailAddressIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication that the electronic mail address should be used as the principal electronic mail address for an individual or organization.")

  public Boolean getPrimaryEmailAddressIndicator() {
    return primaryEmailAddressIndicator;
  }


  public void setPrimaryEmailAddressIndicator(Boolean primaryEmailAddressIndicator) {
    this.primaryEmailAddressIndicator = primaryEmailAddressIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCandidateElectronicMail tpdmCandidateElectronicMail = (TpdmCandidateElectronicMail) o;
    return Objects.equals(this.electronicMailTypeDescriptor, tpdmCandidateElectronicMail.electronicMailTypeDescriptor) &&
        Objects.equals(this.electronicMailAddress, tpdmCandidateElectronicMail.electronicMailAddress) &&
        Objects.equals(this.doNotPublishIndicator, tpdmCandidateElectronicMail.doNotPublishIndicator) &&
        Objects.equals(this.primaryEmailAddressIndicator, tpdmCandidateElectronicMail.primaryEmailAddressIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronicMailTypeDescriptor, electronicMailAddress, doNotPublishIndicator, primaryEmailAddressIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCandidateElectronicMail {\n");
    sb.append("    electronicMailTypeDescriptor: ").append(toIndentedString(electronicMailTypeDescriptor)).append("\n");
    sb.append("    electronicMailAddress: ").append(toIndentedString(electronicMailAddress)).append("\n");
    sb.append("    doNotPublishIndicator: ").append(toIndentedString(doNotPublishIndicator)).append("\n");
    sb.append("    primaryEmailAddressIndicator: ").append(toIndentedString(primaryEmailAddressIndicator)).append("\n");
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

