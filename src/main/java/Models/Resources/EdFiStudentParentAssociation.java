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
import Models.Resources.EdFiParentReference;
import Models.Resources.EdFiStudentReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiStudentParentAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentParentAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PARENT_REFERENCE = "parentReference";
  @SerializedName(SERIALIZED_NAME_PARENT_REFERENCE)
  private EdFiParentReference parentReference;

  public static final String SERIALIZED_NAME_STUDENT_REFERENCE = "studentReference";
  @SerializedName(SERIALIZED_NAME_STUDENT_REFERENCE)
  private EdFiStudentReference studentReference;

  public static final String SERIALIZED_NAME_CONTACT_PRIORITY = "contactPriority";
  @SerializedName(SERIALIZED_NAME_CONTACT_PRIORITY)
  private Integer contactPriority;

  public static final String SERIALIZED_NAME_CONTACT_RESTRICTIONS = "contactRestrictions";
  @SerializedName(SERIALIZED_NAME_CONTACT_RESTRICTIONS)
  private String contactRestrictions;

  public static final String SERIALIZED_NAME_EMERGENCY_CONTACT_STATUS = "emergencyContactStatus";
  @SerializedName(SERIALIZED_NAME_EMERGENCY_CONTACT_STATUS)
  private Boolean emergencyContactStatus;

  public static final String SERIALIZED_NAME_LEGAL_GUARDIAN = "legalGuardian";
  @SerializedName(SERIALIZED_NAME_LEGAL_GUARDIAN)
  private Boolean legalGuardian;

  public static final String SERIALIZED_NAME_LIVES_WITH = "livesWith";
  @SerializedName(SERIALIZED_NAME_LIVES_WITH)
  private Boolean livesWith;

  public static final String SERIALIZED_NAME_PRIMARY_CONTACT_STATUS = "primaryContactStatus";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CONTACT_STATUS)
  private Boolean primaryContactStatus;

  public static final String SERIALIZED_NAME_RELATION_DESCRIPTOR = "relationDescriptor";
  @SerializedName(SERIALIZED_NAME_RELATION_DESCRIPTOR)
  private String relationDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStudentParentAssociation() { 
  }

  public EdFiStudentParentAssociation id(String id) {
    
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


  public EdFiStudentParentAssociation parentReference(EdFiParentReference parentReference) {
    
    this.parentReference = parentReference;
    return this;
  }

   /**
   * Get parentReference
   * @return parentReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiParentReference getParentReference() {
    return parentReference;
  }


  public void setParentReference(EdFiParentReference parentReference) {
    this.parentReference = parentReference;
  }


  public EdFiStudentParentAssociation studentReference(EdFiStudentReference studentReference) {
    
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


  public EdFiStudentParentAssociation contactPriority(Integer contactPriority) {
    
    this.contactPriority = contactPriority;
    return this;
  }

   /**
   * The numeric order of the preferred sequence or priority of contact.
   * @return contactPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numeric order of the preferred sequence or priority of contact.")

  public Integer getContactPriority() {
    return contactPriority;
  }


  public void setContactPriority(Integer contactPriority) {
    this.contactPriority = contactPriority;
  }


  public EdFiStudentParentAssociation contactRestrictions(String contactRestrictions) {
    
    this.contactRestrictions = contactRestrictions;
    return this;
  }

   /**
   * Restrictions for student and/or teacher contact with the individual (e.g., the student may not be picked up by the individual).
   * @return contactRestrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrictions for student and/or teacher contact with the individual (e.g., the student may not be picked up by the individual).")

  public String getContactRestrictions() {
    return contactRestrictions;
  }


  public void setContactRestrictions(String contactRestrictions) {
    this.contactRestrictions = contactRestrictions;
  }


  public EdFiStudentParentAssociation emergencyContactStatus(Boolean emergencyContactStatus) {
    
    this.emergencyContactStatus = emergencyContactStatus;
    return this;
  }

   /**
   * Indicator of whether the person is a designated emergency contact for the Student.
   * @return emergencyContactStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the person is a designated emergency contact for the Student.")

  public Boolean getEmergencyContactStatus() {
    return emergencyContactStatus;
  }


  public void setEmergencyContactStatus(Boolean emergencyContactStatus) {
    this.emergencyContactStatus = emergencyContactStatus;
  }


  public EdFiStudentParentAssociation legalGuardian(Boolean legalGuardian) {
    
    this.legalGuardian = legalGuardian;
    return this;
  }

   /**
   * Indicator of whether the person is a legal guardian for the Student.
   * @return legalGuardian
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the person is a legal guardian for the Student.")

  public Boolean getLegalGuardian() {
    return legalGuardian;
  }


  public void setLegalGuardian(Boolean legalGuardian) {
    this.legalGuardian = legalGuardian;
  }


  public EdFiStudentParentAssociation livesWith(Boolean livesWith) {
    
    this.livesWith = livesWith;
    return this;
  }

   /**
   * Indicator of whether the Student lives with the associated parent.
   * @return livesWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the Student lives with the associated parent.")

  public Boolean getLivesWith() {
    return livesWith;
  }


  public void setLivesWith(Boolean livesWith) {
    this.livesWith = livesWith;
  }


  public EdFiStudentParentAssociation primaryContactStatus(Boolean primaryContactStatus) {
    
    this.primaryContactStatus = primaryContactStatus;
    return this;
  }

   /**
   * Indicator of whether the person is a primary parental contact for the Student.
   * @return primaryContactStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the person is a primary parental contact for the Student.")

  public Boolean getPrimaryContactStatus() {
    return primaryContactStatus;
  }


  public void setPrimaryContactStatus(Boolean primaryContactStatus) {
    this.primaryContactStatus = primaryContactStatus;
  }


  public EdFiStudentParentAssociation relationDescriptor(String relationDescriptor) {
    
    this.relationDescriptor = relationDescriptor;
    return this;
  }

   /**
   * The nature of an individual&#39;s relationship to a student, primarily used to capture family relationships.
   * @return relationDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The nature of an individual's relationship to a student, primarily used to capture family relationships.")

  public String getRelationDescriptor() {
    return relationDescriptor;
  }


  public void setRelationDescriptor(String relationDescriptor) {
    this.relationDescriptor = relationDescriptor;
  }


  public EdFiStudentParentAssociation etag(String etag) {
    
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
    EdFiStudentParentAssociation edFiStudentParentAssociation = (EdFiStudentParentAssociation) o;
    return Objects.equals(this.id, edFiStudentParentAssociation.id) &&
        Objects.equals(this.parentReference, edFiStudentParentAssociation.parentReference) &&
        Objects.equals(this.studentReference, edFiStudentParentAssociation.studentReference) &&
        Objects.equals(this.contactPriority, edFiStudentParentAssociation.contactPriority) &&
        Objects.equals(this.contactRestrictions, edFiStudentParentAssociation.contactRestrictions) &&
        Objects.equals(this.emergencyContactStatus, edFiStudentParentAssociation.emergencyContactStatus) &&
        Objects.equals(this.legalGuardian, edFiStudentParentAssociation.legalGuardian) &&
        Objects.equals(this.livesWith, edFiStudentParentAssociation.livesWith) &&
        Objects.equals(this.primaryContactStatus, edFiStudentParentAssociation.primaryContactStatus) &&
        Objects.equals(this.relationDescriptor, edFiStudentParentAssociation.relationDescriptor) &&
        Objects.equals(this.etag, edFiStudentParentAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentReference, studentReference, contactPriority, contactRestrictions, emergencyContactStatus, legalGuardian, livesWith, primaryContactStatus, relationDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentParentAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentReference: ").append(toIndentedString(parentReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    contactPriority: ").append(toIndentedString(contactPriority)).append("\n");
    sb.append("    contactRestrictions: ").append(toIndentedString(contactRestrictions)).append("\n");
    sb.append("    emergencyContactStatus: ").append(toIndentedString(emergencyContactStatus)).append("\n");
    sb.append("    legalGuardian: ").append(toIndentedString(legalGuardian)).append("\n");
    sb.append("    livesWith: ").append(toIndentedString(livesWith)).append("\n");
    sb.append("    primaryContactStatus: ").append(toIndentedString(primaryContactStatus)).append("\n");
    sb.append("    relationDescriptor: ").append(toIndentedString(relationDescriptor)).append("\n");
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
