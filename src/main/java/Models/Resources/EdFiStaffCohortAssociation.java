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
import Models.Resources.EdFiCohortReference;
import Models.Resources.EdFiStaffReference;
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
 * EdFiStaffCohortAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStaffCohortAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_COHORT_REFERENCE = "cohortReference";
  @SerializedName(SERIALIZED_NAME_COHORT_REFERENCE)
  private EdFiCohortReference cohortReference;

  public static final String SERIALIZED_NAME_STAFF_REFERENCE = "staffReference";
  @SerializedName(SERIALIZED_NAME_STAFF_REFERENCE)
  private EdFiStaffReference staffReference;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_STUDENT_RECORD_ACCESS = "studentRecordAccess";
  @SerializedName(SERIALIZED_NAME_STUDENT_RECORD_ACCESS)
  private Boolean studentRecordAccess;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStaffCohortAssociation() { 
  }

  public EdFiStaffCohortAssociation id(String id) {
    
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


  public EdFiStaffCohortAssociation beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Start date for the association of staff to this cohort.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Start date for the association of staff to this cohort.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiStaffCohortAssociation cohortReference(EdFiCohortReference cohortReference) {
    
    this.cohortReference = cohortReference;
    return this;
  }

   /**
   * Get cohortReference
   * @return cohortReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiCohortReference getCohortReference() {
    return cohortReference;
  }


  public void setCohortReference(EdFiCohortReference cohortReference) {
    this.cohortReference = cohortReference;
  }


  public EdFiStaffCohortAssociation staffReference(EdFiStaffReference staffReference) {
    
    this.staffReference = staffReference;
    return this;
  }

   /**
   * Get staffReference
   * @return staffReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiStaffReference getStaffReference() {
    return staffReference;
  }


  public void setStaffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
  }


  public EdFiStaffCohortAssociation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for the association of staff to this cohort.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date for the association of staff to this cohort.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiStaffCohortAssociation studentRecordAccess(Boolean studentRecordAccess) {
    
    this.studentRecordAccess = studentRecordAccess;
    return this;
  }

   /**
   * Indicator of whether the staff has access to the student records of the cohort per district interpretation of FERPA and other privacy laws, regulations, and policies.
   * @return studentRecordAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the staff has access to the student records of the cohort per district interpretation of FERPA and other privacy laws, regulations, and policies.")

  public Boolean getStudentRecordAccess() {
    return studentRecordAccess;
  }


  public void setStudentRecordAccess(Boolean studentRecordAccess) {
    this.studentRecordAccess = studentRecordAccess;
  }


  public EdFiStaffCohortAssociation etag(String etag) {
    
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
    EdFiStaffCohortAssociation edFiStaffCohortAssociation = (EdFiStaffCohortAssociation) o;
    return Objects.equals(this.id, edFiStaffCohortAssociation.id) &&
        Objects.equals(this.beginDate, edFiStaffCohortAssociation.beginDate) &&
        Objects.equals(this.cohortReference, edFiStaffCohortAssociation.cohortReference) &&
        Objects.equals(this.staffReference, edFiStaffCohortAssociation.staffReference) &&
        Objects.equals(this.endDate, edFiStaffCohortAssociation.endDate) &&
        Objects.equals(this.studentRecordAccess, edFiStaffCohortAssociation.studentRecordAccess) &&
        Objects.equals(this.etag, edFiStaffCohortAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, cohortReference, staffReference, endDate, studentRecordAccess, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffCohortAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    cohortReference: ").append(toIndentedString(cohortReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    studentRecordAccess: ").append(toIndentedString(studentRecordAccess)).append("\n");
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
