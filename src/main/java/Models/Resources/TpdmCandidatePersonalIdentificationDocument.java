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
 * TpdmCandidatePersonalIdentificationDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCandidatePersonalIdentificationDocument {
  public static final String SERIALIZED_NAME_IDENTIFICATION_DOCUMENT_USE_DESCRIPTOR = "identificationDocumentUseDescriptor";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_DOCUMENT_USE_DESCRIPTOR)
  private String identificationDocumentUseDescriptor;

  public static final String SERIALIZED_NAME_PERSONAL_INFORMATION_VERIFICATION_DESCRIPTOR = "personalInformationVerificationDescriptor";
  @SerializedName(SERIALIZED_NAME_PERSONAL_INFORMATION_VERIFICATION_DESCRIPTOR)
  private String personalInformationVerificationDescriptor;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY_DESCRIPTOR = "issuerCountryDescriptor";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY_DESCRIPTOR)
  private String issuerCountryDescriptor;

  public static final String SERIALIZED_NAME_DOCUMENT_EXPIRATION_DATE = "documentExpirationDate";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_EXPIRATION_DATE)
  private LocalDate documentExpirationDate;

  public static final String SERIALIZED_NAME_DOCUMENT_TITLE = "documentTitle";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TITLE)
  private String documentTitle;

  public static final String SERIALIZED_NAME_ISSUER_DOCUMENT_IDENTIFICATION_CODE = "issuerDocumentIdentificationCode";
  @SerializedName(SERIALIZED_NAME_ISSUER_DOCUMENT_IDENTIFICATION_CODE)
  private String issuerDocumentIdentificationCode;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public TpdmCandidatePersonalIdentificationDocument() { 
  }

  public TpdmCandidatePersonalIdentificationDocument identificationDocumentUseDescriptor(String identificationDocumentUseDescriptor) {
    
    this.identificationDocumentUseDescriptor = identificationDocumentUseDescriptor;
    return this;
  }

   /**
   * The primary function of the document used for establishing identity.
   * @return identificationDocumentUseDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The primary function of the document used for establishing identity.")

  public String getIdentificationDocumentUseDescriptor() {
    return identificationDocumentUseDescriptor;
  }


  public void setIdentificationDocumentUseDescriptor(String identificationDocumentUseDescriptor) {
    this.identificationDocumentUseDescriptor = identificationDocumentUseDescriptor;
  }


  public TpdmCandidatePersonalIdentificationDocument personalInformationVerificationDescriptor(String personalInformationVerificationDescriptor) {
    
    this.personalInformationVerificationDescriptor = personalInformationVerificationDescriptor;
    return this;
  }

   /**
   * The category of the document relative to its purpose.
   * @return personalInformationVerificationDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The category of the document relative to its purpose.")

  public String getPersonalInformationVerificationDescriptor() {
    return personalInformationVerificationDescriptor;
  }


  public void setPersonalInformationVerificationDescriptor(String personalInformationVerificationDescriptor) {
    this.personalInformationVerificationDescriptor = personalInformationVerificationDescriptor;
  }


  public TpdmCandidatePersonalIdentificationDocument issuerCountryDescriptor(String issuerCountryDescriptor) {
    
    this.issuerCountryDescriptor = issuerCountryDescriptor;
    return this;
  }

   /**
   * Country of origin of the document. It is strongly recommended that entries use only ISO 3166 2-letter country codes.
   * @return issuerCountryDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of origin of the document. It is strongly recommended that entries use only ISO 3166 2-letter country codes.")

  public String getIssuerCountryDescriptor() {
    return issuerCountryDescriptor;
  }


  public void setIssuerCountryDescriptor(String issuerCountryDescriptor) {
    this.issuerCountryDescriptor = issuerCountryDescriptor;
  }


  public TpdmCandidatePersonalIdentificationDocument documentExpirationDate(LocalDate documentExpirationDate) {
    
    this.documentExpirationDate = documentExpirationDate;
    return this;
  }

   /**
   * The day when the document  expires, if null then never expires.
   * @return documentExpirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The day when the document  expires, if null then never expires.")

  public LocalDate getDocumentExpirationDate() {
    return documentExpirationDate;
  }


  public void setDocumentExpirationDate(LocalDate documentExpirationDate) {
    this.documentExpirationDate = documentExpirationDate;
  }


  public TpdmCandidatePersonalIdentificationDocument documentTitle(String documentTitle) {
    
    this.documentTitle = documentTitle;
    return this;
  }

   /**
   * The title of the document given by the issuer.
   * @return documentTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the document given by the issuer.")

  public String getDocumentTitle() {
    return documentTitle;
  }


  public void setDocumentTitle(String documentTitle) {
    this.documentTitle = documentTitle;
  }


  public TpdmCandidatePersonalIdentificationDocument issuerDocumentIdentificationCode(String issuerDocumentIdentificationCode) {
    
    this.issuerDocumentIdentificationCode = issuerDocumentIdentificationCode;
    return this;
  }

   /**
   * The unique identifier on the issuer&#39;s identification system.
   * @return issuerDocumentIdentificationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier on the issuer's identification system.")

  public String getIssuerDocumentIdentificationCode() {
    return issuerDocumentIdentificationCode;
  }


  public void setIssuerDocumentIdentificationCode(String issuerDocumentIdentificationCode) {
    this.issuerDocumentIdentificationCode = issuerDocumentIdentificationCode;
  }


  public TpdmCandidatePersonalIdentificationDocument issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Name of the entity or institution that issued the document.
   * @return issuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the entity or institution that issued the document.")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCandidatePersonalIdentificationDocument tpdmCandidatePersonalIdentificationDocument = (TpdmCandidatePersonalIdentificationDocument) o;
    return Objects.equals(this.identificationDocumentUseDescriptor, tpdmCandidatePersonalIdentificationDocument.identificationDocumentUseDescriptor) &&
        Objects.equals(this.personalInformationVerificationDescriptor, tpdmCandidatePersonalIdentificationDocument.personalInformationVerificationDescriptor) &&
        Objects.equals(this.issuerCountryDescriptor, tpdmCandidatePersonalIdentificationDocument.issuerCountryDescriptor) &&
        Objects.equals(this.documentExpirationDate, tpdmCandidatePersonalIdentificationDocument.documentExpirationDate) &&
        Objects.equals(this.documentTitle, tpdmCandidatePersonalIdentificationDocument.documentTitle) &&
        Objects.equals(this.issuerDocumentIdentificationCode, tpdmCandidatePersonalIdentificationDocument.issuerDocumentIdentificationCode) &&
        Objects.equals(this.issuerName, tpdmCandidatePersonalIdentificationDocument.issuerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationDocumentUseDescriptor, personalInformationVerificationDescriptor, issuerCountryDescriptor, documentExpirationDate, documentTitle, issuerDocumentIdentificationCode, issuerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCandidatePersonalIdentificationDocument {\n");
    sb.append("    identificationDocumentUseDescriptor: ").append(toIndentedString(identificationDocumentUseDescriptor)).append("\n");
    sb.append("    personalInformationVerificationDescriptor: ").append(toIndentedString(personalInformationVerificationDescriptor)).append("\n");
    sb.append("    issuerCountryDescriptor: ").append(toIndentedString(issuerCountryDescriptor)).append("\n");
    sb.append("    documentExpirationDate: ").append(toIndentedString(documentExpirationDate)).append("\n");
    sb.append("    documentTitle: ").append(toIndentedString(documentTitle)).append("\n");
    sb.append("    issuerDocumentIdentificationCode: ").append(toIndentedString(issuerDocumentIdentificationCode)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
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

