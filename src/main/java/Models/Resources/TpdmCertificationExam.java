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
import Models.Resources.EdFiEducationOrganizationReference;
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
 * TpdmCertificationExam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCertificationExam {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_IDENTIFIER = "certificationExamIdentifier";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_IDENTIFIER)
  private String certificationExamIdentifier;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE = "educationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference educationOrganizationReference;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_TITLE = "certificationExamTitle";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_TITLE)
  private String certificationExamTitle;

  public static final String SERIALIZED_NAME_CERTIFICATION_EXAM_TYPE_DESCRIPTOR = "certificationExamTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_CERTIFICATION_EXAM_TYPE_DESCRIPTOR)
  private String certificationExamTypeDescriptor;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private LocalDate effectiveDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmCertificationExam() { 
  }

  public TpdmCertificationExam id(String id) {
    
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


  public TpdmCertificationExam certificationExamIdentifier(String certificationExamIdentifier) {
    
    this.certificationExamIdentifier = certificationExamIdentifier;
    return this;
  }

   /**
   * Identifier or serial number assigned to the CertificationExam.
   * @return certificationExamIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier or serial number assigned to the CertificationExam.")

  public String getCertificationExamIdentifier() {
    return certificationExamIdentifier;
  }


  public void setCertificationExamIdentifier(String certificationExamIdentifier) {
    this.certificationExamIdentifier = certificationExamIdentifier;
  }


  public TpdmCertificationExam namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the CertificationExam.
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace for the CertificationExam.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public TpdmCertificationExam educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }


  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }


  public TpdmCertificationExam certificationExamTitle(String certificationExamTitle) {
    
    this.certificationExamTitle = certificationExamTitle;
    return this;
  }

   /**
   * The title of the Certification Exam.
   * @return certificationExamTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The title of the Certification Exam.")

  public String getCertificationExamTitle() {
    return certificationExamTitle;
  }


  public void setCertificationExamTitle(String certificationExamTitle) {
    this.certificationExamTitle = certificationExamTitle;
  }


  public TpdmCertificationExam certificationExamTypeDescriptor(String certificationExamTypeDescriptor) {
    
    this.certificationExamTypeDescriptor = certificationExamTypeDescriptor;
    return this;
  }

   /**
   * The type or category of Certification Exam.
   * @return certificationExamTypeDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type or category of Certification Exam.")

  public String getCertificationExamTypeDescriptor() {
    return certificationExamTypeDescriptor;
  }


  public void setCertificationExamTypeDescriptor(String certificationExamTypeDescriptor) {
    this.certificationExamTypeDescriptor = certificationExamTypeDescriptor;
  }


  public TpdmCertificationExam effectiveDate(LocalDate effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The year, month and day on which the CertificationExam is offered.
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year, month and day on which the CertificationExam is offered.")

  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public TpdmCertificationExam endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The month, day, and year on which the CertificationExam offering is expected to end.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month, day, and year on which the CertificationExam offering is expected to end.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public TpdmCertificationExam etag(String etag) {
    
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
    TpdmCertificationExam tpdmCertificationExam = (TpdmCertificationExam) o;
    return Objects.equals(this.id, tpdmCertificationExam.id) &&
        Objects.equals(this.certificationExamIdentifier, tpdmCertificationExam.certificationExamIdentifier) &&
        Objects.equals(this.namespace, tpdmCertificationExam.namespace) &&
        Objects.equals(this.educationOrganizationReference, tpdmCertificationExam.educationOrganizationReference) &&
        Objects.equals(this.certificationExamTitle, tpdmCertificationExam.certificationExamTitle) &&
        Objects.equals(this.certificationExamTypeDescriptor, tpdmCertificationExam.certificationExamTypeDescriptor) &&
        Objects.equals(this.effectiveDate, tpdmCertificationExam.effectiveDate) &&
        Objects.equals(this.endDate, tpdmCertificationExam.endDate) &&
        Objects.equals(this.etag, tpdmCertificationExam.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, certificationExamIdentifier, namespace, educationOrganizationReference, certificationExamTitle, certificationExamTypeDescriptor, effectiveDate, endDate, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCertificationExam {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    certificationExamIdentifier: ").append(toIndentedString(certificationExamIdentifier)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    certificationExamTitle: ").append(toIndentedString(certificationExamTitle)).append("\n");
    sb.append("    certificationExamTypeDescriptor: ").append(toIndentedString(certificationExamTypeDescriptor)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

