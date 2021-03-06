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
import Models.Resources.EdFiSchoolYearTypeReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TpdmOpenStaffPositionExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmOpenStaffPositionExtension {
  public static final String SERIALIZED_NAME_FUNDING_SOURCE_DESCRIPTOR = "fundingSourceDescriptor";
  @SerializedName(SERIALIZED_NAME_FUNDING_SOURCE_DESCRIPTOR)
  private String fundingSourceDescriptor;

  public static final String SERIALIZED_NAME_OPEN_STAFF_POSITION_REASON_DESCRIPTOR = "openStaffPositionReasonDescriptor";
  @SerializedName(SERIALIZED_NAME_OPEN_STAFF_POSITION_REASON_DESCRIPTOR)
  private String openStaffPositionReasonDescriptor;

  public static final String SERIALIZED_NAME_TERM_DESCRIPTOR = "termDescriptor";
  @SerializedName(SERIALIZED_NAME_TERM_DESCRIPTOR)
  private String termDescriptor;

  public static final String SERIALIZED_NAME_FULL_TIME_EQUIVALENCY = "fullTimeEquivalency";
  @SerializedName(SERIALIZED_NAME_FULL_TIME_EQUIVALENCY)
  private Double fullTimeEquivalency;

  public static final String SERIALIZED_NAME_HIGH_NEED_ACADEMIC_SUBJECT = "highNeedAcademicSubject";
  @SerializedName(SERIALIZED_NAME_HIGH_NEED_ACADEMIC_SUBJECT)
  private Boolean highNeedAcademicSubject;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_MAX_SALARY = "maxSalary";
  @SerializedName(SERIALIZED_NAME_MAX_SALARY)
  private Double maxSalary;

  public static final String SERIALIZED_NAME_MIN_SALARY = "minSalary";
  @SerializedName(SERIALIZED_NAME_MIN_SALARY)
  private Double minSalary;

  public static final String SERIALIZED_NAME_POSITION_CONTROL_NUMBER = "positionControlNumber";
  @SerializedName(SERIALIZED_NAME_POSITION_CONTROL_NUMBER)
  private String positionControlNumber;

  public static final String SERIALIZED_NAME_TOTAL_BUDGETED = "totalBudgeted";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUDGETED)
  private Double totalBudgeted;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE = "schoolYearTypeReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE)
  private EdFiSchoolYearTypeReference schoolYearTypeReference;

  public TpdmOpenStaffPositionExtension() { 
  }

  public TpdmOpenStaffPositionExtension fundingSourceDescriptor(String fundingSourceDescriptor) {
    
    this.fundingSourceDescriptor = fundingSourceDescriptor;
    return this;
  }

   /**
   * The funding source for open staff position.
   * @return fundingSourceDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The funding source for open staff position.")

  public String getFundingSourceDescriptor() {
    return fundingSourceDescriptor;
  }


  public void setFundingSourceDescriptor(String fundingSourceDescriptor) {
    this.fundingSourceDescriptor = fundingSourceDescriptor;
  }


  public TpdmOpenStaffPositionExtension openStaffPositionReasonDescriptor(String openStaffPositionReasonDescriptor) {
    
    this.openStaffPositionReasonDescriptor = openStaffPositionReasonDescriptor;
    return this;
  }

   /**
   * The reason for the open staff position (e.g., new position, replacement, etc.).
   * @return openStaffPositionReasonDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for the open staff position (e.g., new position, replacement, etc.).")

  public String getOpenStaffPositionReasonDescriptor() {
    return openStaffPositionReasonDescriptor;
  }


  public void setOpenStaffPositionReasonDescriptor(String openStaffPositionReasonDescriptor) {
    this.openStaffPositionReasonDescriptor = openStaffPositionReasonDescriptor;
  }


  public TpdmOpenStaffPositionExtension termDescriptor(String termDescriptor) {
    
    this.termDescriptor = termDescriptor;
    return this;
  }

   /**
   * The first term for the Session during the school year for which the OpenStaffPosition is seeking to fill.
   * @return termDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first term for the Session during the school year for which the OpenStaffPosition is seeking to fill.")

  public String getTermDescriptor() {
    return termDescriptor;
  }


  public void setTermDescriptor(String termDescriptor) {
    this.termDescriptor = termDescriptor;
  }


  public TpdmOpenStaffPositionExtension fullTimeEquivalency(Double fullTimeEquivalency) {
    
    this.fullTimeEquivalency = fullTimeEquivalency;
    return this;
  }

   /**
   * The ratio between the hours of work expected in a position and the hours of work normally expected in a full-time position in the same setting.
   * @return fullTimeEquivalency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ratio between the hours of work expected in a position and the hours of work normally expected in a full-time position in the same setting.")

  public Double getFullTimeEquivalency() {
    return fullTimeEquivalency;
  }


  public void setFullTimeEquivalency(Double fullTimeEquivalency) {
    this.fullTimeEquivalency = fullTimeEquivalency;
  }


  public TpdmOpenStaffPositionExtension highNeedAcademicSubject(Boolean highNeedAcademicSubject) {
    
    this.highNeedAcademicSubject = highNeedAcademicSubject;
    return this;
  }

   /**
   * Indicator as to whether the OpenStaffPosition is filling a high-need subject area designated as a teacher shortage that may be eligible for special grants, aid or compensation.
   * @return highNeedAcademicSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator as to whether the OpenStaffPosition is filling a high-need subject area designated as a teacher shortage that may be eligible for special grants, aid or compensation.")

  public Boolean getHighNeedAcademicSubject() {
    return highNeedAcademicSubject;
  }


  public void setHighNeedAcademicSubject(Boolean highNeedAcademicSubject) {
    this.highNeedAcademicSubject = highNeedAcademicSubject;
  }


  public TpdmOpenStaffPositionExtension isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicator of whether the OpenStaffPosition is currently Active.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the OpenStaffPosition is currently Active.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public TpdmOpenStaffPositionExtension maxSalary(Double maxSalary) {
    
    this.maxSalary = maxSalary;
    return this;
  }

   /**
   * The maximum salary or wage a person is paid before deductions (excluding differentials) but including annuities.
   * @return maxSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum salary or wage a person is paid before deductions (excluding differentials) but including annuities.")

  public Double getMaxSalary() {
    return maxSalary;
  }


  public void setMaxSalary(Double maxSalary) {
    this.maxSalary = maxSalary;
  }


  public TpdmOpenStaffPositionExtension minSalary(Double minSalary) {
    
    this.minSalary = minSalary;
    return this;
  }

   /**
   * The minimum salary or wage a person is paid before deductions (excluding differentials) but including annuities.
   * @return minSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum salary or wage a person is paid before deductions (excluding differentials) but including annuities.")

  public Double getMinSalary() {
    return minSalary;
  }


  public void setMinSalary(Double minSalary) {
    this.minSalary = minSalary;
  }


  public TpdmOpenStaffPositionExtension positionControlNumber(String positionControlNumber) {
    
    this.positionControlNumber = positionControlNumber;
    return this;
  }

   /**
   * Identifier assigned to the position to be filled.
   * @return positionControlNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier assigned to the position to be filled.")

  public String getPositionControlNumber() {
    return positionControlNumber;
  }


  public void setPositionControlNumber(String positionControlNumber) {
    this.positionControlNumber = positionControlNumber;
  }


  public TpdmOpenStaffPositionExtension totalBudgeted(Double totalBudgeted) {
    
    this.totalBudgeted = totalBudgeted;
    return this;
  }

   /**
   * Including salary, the fully loaded cost budgeted for this teacher.
   * @return totalBudgeted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Including salary, the fully loaded cost budgeted for this teacher.")

  public Double getTotalBudgeted() {
    return totalBudgeted;
  }


  public void setTotalBudgeted(Double totalBudgeted) {
    this.totalBudgeted = totalBudgeted;
  }


  public TpdmOpenStaffPositionExtension schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiSchoolYearTypeReference getSchoolYearTypeReference() {
    return schoolYearTypeReference;
  }


  public void setSchoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    this.schoolYearTypeReference = schoolYearTypeReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmOpenStaffPositionExtension tpdmOpenStaffPositionExtension = (TpdmOpenStaffPositionExtension) o;
    return Objects.equals(this.fundingSourceDescriptor, tpdmOpenStaffPositionExtension.fundingSourceDescriptor) &&
        Objects.equals(this.openStaffPositionReasonDescriptor, tpdmOpenStaffPositionExtension.openStaffPositionReasonDescriptor) &&
        Objects.equals(this.termDescriptor, tpdmOpenStaffPositionExtension.termDescriptor) &&
        Objects.equals(this.fullTimeEquivalency, tpdmOpenStaffPositionExtension.fullTimeEquivalency) &&
        Objects.equals(this.highNeedAcademicSubject, tpdmOpenStaffPositionExtension.highNeedAcademicSubject) &&
        Objects.equals(this.isActive, tpdmOpenStaffPositionExtension.isActive) &&
        Objects.equals(this.maxSalary, tpdmOpenStaffPositionExtension.maxSalary) &&
        Objects.equals(this.minSalary, tpdmOpenStaffPositionExtension.minSalary) &&
        Objects.equals(this.positionControlNumber, tpdmOpenStaffPositionExtension.positionControlNumber) &&
        Objects.equals(this.totalBudgeted, tpdmOpenStaffPositionExtension.totalBudgeted) &&
        Objects.equals(this.schoolYearTypeReference, tpdmOpenStaffPositionExtension.schoolYearTypeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingSourceDescriptor, openStaffPositionReasonDescriptor, termDescriptor, fullTimeEquivalency, highNeedAcademicSubject, isActive, maxSalary, minSalary, positionControlNumber, totalBudgeted, schoolYearTypeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmOpenStaffPositionExtension {\n");
    sb.append("    fundingSourceDescriptor: ").append(toIndentedString(fundingSourceDescriptor)).append("\n");
    sb.append("    openStaffPositionReasonDescriptor: ").append(toIndentedString(openStaffPositionReasonDescriptor)).append("\n");
    sb.append("    termDescriptor: ").append(toIndentedString(termDescriptor)).append("\n");
    sb.append("    fullTimeEquivalency: ").append(toIndentedString(fullTimeEquivalency)).append("\n");
    sb.append("    highNeedAcademicSubject: ").append(toIndentedString(highNeedAcademicSubject)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    maxSalary: ").append(toIndentedString(maxSalary)).append("\n");
    sb.append("    minSalary: ").append(toIndentedString(minSalary)).append("\n");
    sb.append("    positionControlNumber: ").append(toIndentedString(positionControlNumber)).append("\n");
    sb.append("    totalBudgeted: ").append(toIndentedString(totalBudgeted)).append("\n");
    sb.append("    schoolYearTypeReference: ").append(toIndentedString(schoolYearTypeReference)).append("\n");
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

