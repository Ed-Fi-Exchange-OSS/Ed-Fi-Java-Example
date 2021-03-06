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
import Models.Resources.TpdmCandidateEducatorPreparationProgramAssociationCandidateIndicator;
import Models.Resources.TpdmCandidateReference;
import Models.Resources.TpdmEducatorPreparationProgramReference;
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
 * TpdmCandidateEducatorPreparationProgramAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCandidateEducatorPreparationProgramAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_CANDIDATE_REFERENCE = "candidateReference";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_REFERENCE)
  private TpdmCandidateReference candidateReference;

  public static final String SERIALIZED_NAME_EDUCATOR_PREPARATION_PROGRAM_REFERENCE = "educatorPreparationProgramReference";
  @SerializedName(SERIALIZED_NAME_EDUCATOR_PREPARATION_PROGRAM_REFERENCE)
  private TpdmEducatorPreparationProgramReference educatorPreparationProgramReference;

  public static final String SERIALIZED_NAME_CANDIDATE_INDICATOR = "candidateIndicator";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_INDICATOR)
  private TpdmCandidateEducatorPreparationProgramAssociationCandidateIndicator candidateIndicator;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_EPP_PROGRAM_PATHWAY_DESCRIPTOR = "eppProgramPathwayDescriptor";
  @SerializedName(SERIALIZED_NAME_EPP_PROGRAM_PATHWAY_DESCRIPTOR)
  private String eppProgramPathwayDescriptor;

  public static final String SERIALIZED_NAME_MAJOR_SPECIALIZATION = "majorSpecialization";
  @SerializedName(SERIALIZED_NAME_MAJOR_SPECIALIZATION)
  private String majorSpecialization;

  public static final String SERIALIZED_NAME_MINOR_SPECIALIZATION = "minorSpecialization";
  @SerializedName(SERIALIZED_NAME_MINOR_SPECIALIZATION)
  private String minorSpecialization;

  public static final String SERIALIZED_NAME_REASON_EXITED_DESCRIPTOR = "reasonExitedDescriptor";
  @SerializedName(SERIALIZED_NAME_REASON_EXITED_DESCRIPTOR)
  private String reasonExitedDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmCandidateEducatorPreparationProgramAssociation() { 
  }

  public TpdmCandidateEducatorPreparationProgramAssociation id(String id) {
    
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


  public TpdmCandidateEducatorPreparationProgramAssociation beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The begin date for the association.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The begin date for the association.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation candidateReference(TpdmCandidateReference candidateReference) {
    
    this.candidateReference = candidateReference;
    return this;
  }

   /**
   * Get candidateReference
   * @return candidateReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmCandidateReference getCandidateReference() {
    return candidateReference;
  }


  public void setCandidateReference(TpdmCandidateReference candidateReference) {
    this.candidateReference = candidateReference;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation educatorPreparationProgramReference(TpdmEducatorPreparationProgramReference educatorPreparationProgramReference) {
    
    this.educatorPreparationProgramReference = educatorPreparationProgramReference;
    return this;
  }

   /**
   * Get educatorPreparationProgramReference
   * @return educatorPreparationProgramReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmEducatorPreparationProgramReference getEducatorPreparationProgramReference() {
    return educatorPreparationProgramReference;
  }


  public void setEducatorPreparationProgramReference(TpdmEducatorPreparationProgramReference educatorPreparationProgramReference) {
    this.educatorPreparationProgramReference = educatorPreparationProgramReference;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation candidateIndicator(TpdmCandidateEducatorPreparationProgramAssociationCandidateIndicator candidateIndicator) {
    
    this.candidateIndicator = candidateIndicator;
    return this;
  }

   /**
   * Get candidateIndicator
   * @return candidateIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TpdmCandidateEducatorPreparationProgramAssociationCandidateIndicator getCandidateIndicator() {
    return candidateIndicator;
  }


  public void setCandidateIndicator(TpdmCandidateEducatorPreparationProgramAssociationCandidateIndicator candidateIndicator) {
    this.candidateIndicator = candidateIndicator;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for the association.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date for the association.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation eppProgramPathwayDescriptor(String eppProgramPathwayDescriptor) {
    
    this.eppProgramPathwayDescriptor = eppProgramPathwayDescriptor;
    return this;
  }

   /**
   * A code for describing the program pathway, for example: Residency, Internship, Traditional
   * @return eppProgramPathwayDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A code for describing the program pathway, for example: Residency, Internship, Traditional")

  public String getEppProgramPathwayDescriptor() {
    return eppProgramPathwayDescriptor;
  }


  public void setEppProgramPathwayDescriptor(String eppProgramPathwayDescriptor) {
    this.eppProgramPathwayDescriptor = eppProgramPathwayDescriptor;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation majorSpecialization(String majorSpecialization) {
    
    this.majorSpecialization = majorSpecialization;
    return this;
  }

   /**
   * The major area for a degree or area of specialization for a certificate.
   * @return majorSpecialization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The major area for a degree or area of specialization for a certificate.")

  public String getMajorSpecialization() {
    return majorSpecialization;
  }


  public void setMajorSpecialization(String majorSpecialization) {
    this.majorSpecialization = majorSpecialization;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation minorSpecialization(String minorSpecialization) {
    
    this.minorSpecialization = minorSpecialization;
    return this;
  }

   /**
   * The major area for a degree or area of specialization for a certificate.
   * @return minorSpecialization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The major area for a degree or area of specialization for a certificate.")

  public String getMinorSpecialization() {
    return minorSpecialization;
  }


  public void setMinorSpecialization(String minorSpecialization) {
    this.minorSpecialization = minorSpecialization;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation reasonExitedDescriptor(String reasonExitedDescriptor) {
    
    this.reasonExitedDescriptor = reasonExitedDescriptor;
    return this;
  }

   /**
   * Reason exited for the association.
   * @return reasonExitedDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason exited for the association.")

  public String getReasonExitedDescriptor() {
    return reasonExitedDescriptor;
  }


  public void setReasonExitedDescriptor(String reasonExitedDescriptor) {
    this.reasonExitedDescriptor = reasonExitedDescriptor;
  }


  public TpdmCandidateEducatorPreparationProgramAssociation etag(String etag) {
    
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
    TpdmCandidateEducatorPreparationProgramAssociation tpdmCandidateEducatorPreparationProgramAssociation = (TpdmCandidateEducatorPreparationProgramAssociation) o;
    return Objects.equals(this.id, tpdmCandidateEducatorPreparationProgramAssociation.id) &&
        Objects.equals(this.beginDate, tpdmCandidateEducatorPreparationProgramAssociation.beginDate) &&
        Objects.equals(this.candidateReference, tpdmCandidateEducatorPreparationProgramAssociation.candidateReference) &&
        Objects.equals(this.educatorPreparationProgramReference, tpdmCandidateEducatorPreparationProgramAssociation.educatorPreparationProgramReference) &&
        Objects.equals(this.candidateIndicator, tpdmCandidateEducatorPreparationProgramAssociation.candidateIndicator) &&
        Objects.equals(this.endDate, tpdmCandidateEducatorPreparationProgramAssociation.endDate) &&
        Objects.equals(this.eppProgramPathwayDescriptor, tpdmCandidateEducatorPreparationProgramAssociation.eppProgramPathwayDescriptor) &&
        Objects.equals(this.majorSpecialization, tpdmCandidateEducatorPreparationProgramAssociation.majorSpecialization) &&
        Objects.equals(this.minorSpecialization, tpdmCandidateEducatorPreparationProgramAssociation.minorSpecialization) &&
        Objects.equals(this.reasonExitedDescriptor, tpdmCandidateEducatorPreparationProgramAssociation.reasonExitedDescriptor) &&
        Objects.equals(this.etag, tpdmCandidateEducatorPreparationProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, candidateReference, educatorPreparationProgramReference, candidateIndicator, endDate, eppProgramPathwayDescriptor, majorSpecialization, minorSpecialization, reasonExitedDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCandidateEducatorPreparationProgramAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    candidateReference: ").append(toIndentedString(candidateReference)).append("\n");
    sb.append("    educatorPreparationProgramReference: ").append(toIndentedString(educatorPreparationProgramReference)).append("\n");
    sb.append("    candidateIndicator: ").append(toIndentedString(candidateIndicator)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    eppProgramPathwayDescriptor: ").append(toIndentedString(eppProgramPathwayDescriptor)).append("\n");
    sb.append("    majorSpecialization: ").append(toIndentedString(majorSpecialization)).append("\n");
    sb.append("    minorSpecialization: ").append(toIndentedString(minorSpecialization)).append("\n");
    sb.append("    reasonExitedDescriptor: ").append(toIndentedString(reasonExitedDescriptor)).append("\n");
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

