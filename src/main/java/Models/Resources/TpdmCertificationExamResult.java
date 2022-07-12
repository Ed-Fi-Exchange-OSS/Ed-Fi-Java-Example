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
import Models.Resources.TpdmCertificationExamReference;
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
 * TpdmCertificationExamResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCertificationExamResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_DATE = "certificationExamDate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_DATE)
  private LocalDate certificationExamDate;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_REFERENCE = "certificationExamReference";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_REFERENCE)
  private TpdmCertificationExamReference certificationExamReference;

  public static final String SERIALIZED_NAME_PERSON_REFERENCE = "personReference";
  @SerializedName(SERIALIZED_NAME_PERSON_REFERENCE)
  private EdFiPersonReference personReference;

  public static final String SERIALIZED_NAME_ATTEMPT_NUMBER = "attemptNumber";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_NUMBER)
  private Integer attemptNumber;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_PASS_INDICATOR = "certificationExamPassIndicator";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_PASS_INDICATOR)
  private Boolean certificationExamPassIndicator;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_SCORE = "certificationExamScore";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_SCORE)
  private Double certificationExamScore;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_STATUS_DESCRIPTOR = "certificationExamStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_STATUS_DESCRIPTOR)
  private String certificationExamStatusDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmCertificationExamResult() { 
  }

  public TpdmCertificationExamResult id(String id) {
    
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


  public TpdmCertificationExamResult certificationExamDate(LocalDate certificationExamDate) {
    
    this.certificationExamDate = certificationExamDate;
    return this;
  }

   /**
   * The year, month and day on which the CertificationExam is taken.
   * @return certificationExamDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The year, month and day on which the CertificationExam is taken.")

  public LocalDate getCertificationExamDate() {
    return certificationExamDate;
  }


  public void setCertificationExamDate(LocalDate certificationExamDate) {
    this.certificationExamDate = certificationExamDate;
  }


  public TpdmCertificationExamResult certificationExamReference(TpdmCertificationExamReference certificationExamReference) {
    
    this.certificationExamReference = certificationExamReference;
    return this;
  }

   /**
   * Get certificationExamReference
   * @return certificationExamReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmCertificationExamReference getCertificationExamReference() {
    return certificationExamReference;
  }


  public void setCertificationExamReference(TpdmCertificationExamReference certificationExamReference) {
    this.certificationExamReference = certificationExamReference;
  }


  public TpdmCertificationExamResult personReference(EdFiPersonReference personReference) {
    
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


  public TpdmCertificationExamResult attemptNumber(Integer attemptNumber) {
    
    this.attemptNumber = attemptNumber;
    return this;
  }

   /**
   * The number of the person&#39;s attempt for the Certification Exam.
   * @return attemptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of the person's attempt for the Certification Exam.")

  public Integer getAttemptNumber() {
    return attemptNumber;
  }


  public void setAttemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber;
  }


  public TpdmCertificationExamResult certificationExamPassIndicator(Boolean certificationExamPassIndicator) {
    
    this.certificationExamPassIndicator = certificationExamPassIndicator;
    return this;
  }

   /**
   * Indicator that the person passed the Certification Exam.
   * @return certificationExamPassIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator that the person passed the Certification Exam.")

  public Boolean getCertificationExamPassIndicator() {
    return certificationExamPassIndicator;
  }


  public void setCertificationExamPassIndicator(Boolean certificationExamPassIndicator) {
    this.certificationExamPassIndicator = certificationExamPassIndicator;
  }


  public TpdmCertificationExamResult certificationExamScore(Double certificationExamScore) {
    
    this.certificationExamScore = certificationExamScore;
    return this;
  }

   /**
   * The score result for the Certification Exam attempt.
   * @return certificationExamScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The score result for the Certification Exam attempt.")

  public Double getCertificationExamScore() {
    return certificationExamScore;
  }


  public void setCertificationExamScore(Double certificationExamScore) {
    this.certificationExamScore = certificationExamScore;
  }


  public TpdmCertificationExamResult certificationExamStatusDescriptor(String certificationExamStatusDescriptor) {
    
    this.certificationExamStatusDescriptor = certificationExamStatusDescriptor;
    return this;
  }

   /**
   * The status of the Certification Exam attempt.
   * @return certificationExamStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the Certification Exam attempt.")

  public String getCertificationExamStatusDescriptor() {
    return certificationExamStatusDescriptor;
  }


  public void setCertificationExamStatusDescriptor(String certificationExamStatusDescriptor) {
    this.certificationExamStatusDescriptor = certificationExamStatusDescriptor;
  }


  public TpdmCertificationExamResult etag(String etag) {
    
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
    TpdmCertificationExamResult tpdmCertificationExamResult = (TpdmCertificationExamResult) o;
    return Objects.equals(this.id, tpdmCertificationExamResult.id) &&
        Objects.equals(this.certificationExamDate, tpdmCertificationExamResult.certificationExamDate) &&
        Objects.equals(this.certificationExamReference, tpdmCertificationExamResult.certificationExamReference) &&
        Objects.equals(this.personReference, tpdmCertificationExamResult.personReference) &&
        Objects.equals(this.attemptNumber, tpdmCertificationExamResult.attemptNumber) &&
        Objects.equals(this.certificationExamPassIndicator, tpdmCertificationExamResult.certificationExamPassIndicator) &&
        Objects.equals(this.certificationExamScore, tpdmCertificationExamResult.certificationExamScore) &&
        Objects.equals(this.certificationExamStatusDescriptor, tpdmCertificationExamResult.certificationExamStatusDescriptor) &&
        Objects.equals(this.etag, tpdmCertificationExamResult.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, certificationExamDate, certificationExamReference, personReference, attemptNumber, certificationExamPassIndicator, certificationExamScore, certificationExamStatusDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCertificationExamResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    certificationExamDate: ").append(toIndentedString(certificationExamDate)).append("\n");
    sb.append("    certificationExamReference: ").append(toIndentedString(certificationExamReference)).append("\n");
    sb.append("    personReference: ").append(toIndentedString(personReference)).append("\n");
    sb.append("    attemptNumber: ").append(toIndentedString(attemptNumber)).append("\n");
    sb.append("    certificationExamPassIndicator: ").append(toIndentedString(certificationExamPassIndicator)).append("\n");
    sb.append("    certificationExamScore: ").append(toIndentedString(certificationExamScore)).append("\n");
    sb.append("    certificationExamStatusDescriptor: ").append(toIndentedString(certificationExamStatusDescriptor)).append("\n");
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
