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
 * EdFiLocalEducationAgencyFederalFunds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiLocalEducationAgencyFederalFunds {
  public static final String SERIALIZED_NAME_FISCAL_YEAR = "fiscalYear";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEAR)
  private Integer fiscalYear;

  public static final String SERIALIZED_NAME_INNOVATIVE_DOLLARS_SPENT = "innovativeDollarsSpent";
  @SerializedName(SERIALIZED_NAME_INNOVATIVE_DOLLARS_SPENT)
  private Double innovativeDollarsSpent;

  public static final String SERIALIZED_NAME_INNOVATIVE_DOLLARS_SPENT_STRATEGIC_PRIORITIES = "innovativeDollarsSpentStrategicPriorities";
  @SerializedName(SERIALIZED_NAME_INNOVATIVE_DOLLARS_SPENT_STRATEGIC_PRIORITIES)
  private Double innovativeDollarsSpentStrategicPriorities;

  public static final String SERIALIZED_NAME_INNOVATIVE_PROGRAMS_FUNDS_RECEIVED = "innovativeProgramsFundsReceived";
  @SerializedName(SERIALIZED_NAME_INNOVATIVE_PROGRAMS_FUNDS_RECEIVED)
  private Double innovativeProgramsFundsReceived;

  public static final String SERIALIZED_NAME_SCHOOL_IMPROVEMENT_ALLOCATION = "schoolImprovementAllocation";
  @SerializedName(SERIALIZED_NAME_SCHOOL_IMPROVEMENT_ALLOCATION)
  private Double schoolImprovementAllocation;

  public static final String SERIALIZED_NAME_SCHOOL_IMPROVEMENT_RESERVED_FUNDS_PERCENTAGE = "schoolImprovementReservedFundsPercentage";
  @SerializedName(SERIALIZED_NAME_SCHOOL_IMPROVEMENT_RESERVED_FUNDS_PERCENTAGE)
  private Double schoolImprovementReservedFundsPercentage;

  public static final String SERIALIZED_NAME_STATE_ASSESSMENT_ADMINISTRATION_FUNDING = "stateAssessmentAdministrationFunding";
  @SerializedName(SERIALIZED_NAME_STATE_ASSESSMENT_ADMINISTRATION_FUNDING)
  private Double stateAssessmentAdministrationFunding;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_EDUCATIONAL_SERVICES_FUNDS_SPENT = "supplementalEducationalServicesFundsSpent";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_EDUCATIONAL_SERVICES_FUNDS_SPENT)
  private Double supplementalEducationalServicesFundsSpent;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_EDUCATIONAL_SERVICES_PER_PUPIL_EXPENDITURE = "supplementalEducationalServicesPerPupilExpenditure";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_EDUCATIONAL_SERVICES_PER_PUPIL_EXPENDITURE)
  private Double supplementalEducationalServicesPerPupilExpenditure;

  public EdFiLocalEducationAgencyFederalFunds() { 
  }

  public EdFiLocalEducationAgencyFederalFunds fiscalYear(Integer fiscalYear) {
    
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The fiscal year for which the federal funds are received.
   * @return fiscalYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The fiscal year for which the federal funds are received.")

  public Integer getFiscalYear() {
    return fiscalYear;
  }


  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public EdFiLocalEducationAgencyFederalFunds innovativeDollarsSpent(Double innovativeDollarsSpent) {
    
    this.innovativeDollarsSpent = innovativeDollarsSpent;
    return this;
  }

   /**
   * The total Title V, Part A funds expended by LEAs.
   * @return innovativeDollarsSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total Title V, Part A funds expended by LEAs.")

  public Double getInnovativeDollarsSpent() {
    return innovativeDollarsSpent;
  }


  public void setInnovativeDollarsSpent(Double innovativeDollarsSpent) {
    this.innovativeDollarsSpent = innovativeDollarsSpent;
  }


  public EdFiLocalEducationAgencyFederalFunds innovativeDollarsSpentStrategicPriorities(Double innovativeDollarsSpentStrategicPriorities) {
    
    this.innovativeDollarsSpentStrategicPriorities = innovativeDollarsSpentStrategicPriorities;
    return this;
  }

   /**
   * The total amount of Title V, Part A funds expended by LEAs for the four strategic priorities.
   * @return innovativeDollarsSpentStrategicPriorities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of Title V, Part A funds expended by LEAs for the four strategic priorities.")

  public Double getInnovativeDollarsSpentStrategicPriorities() {
    return innovativeDollarsSpentStrategicPriorities;
  }


  public void setInnovativeDollarsSpentStrategicPriorities(Double innovativeDollarsSpentStrategicPriorities) {
    this.innovativeDollarsSpentStrategicPriorities = innovativeDollarsSpentStrategicPriorities;
  }


  public EdFiLocalEducationAgencyFederalFunds innovativeProgramsFundsReceived(Double innovativeProgramsFundsReceived) {
    
    this.innovativeProgramsFundsReceived = innovativeProgramsFundsReceived;
    return this;
  }

   /**
   * The total Title V, Part A funds received by LEAs.
   * @return innovativeProgramsFundsReceived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total Title V, Part A funds received by LEAs.")

  public Double getInnovativeProgramsFundsReceived() {
    return innovativeProgramsFundsReceived;
  }


  public void setInnovativeProgramsFundsReceived(Double innovativeProgramsFundsReceived) {
    this.innovativeProgramsFundsReceived = innovativeProgramsFundsReceived;
  }


  public EdFiLocalEducationAgencyFederalFunds schoolImprovementAllocation(Double schoolImprovementAllocation) {
    
    this.schoolImprovementAllocation = schoolImprovementAllocation;
    return this;
  }

   /**
   * The amount of Section 1003(a) and 1003(g) allocations to LEAs.
   * @return schoolImprovementAllocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of Section 1003(a) and 1003(g) allocations to LEAs.")

  public Double getSchoolImprovementAllocation() {
    return schoolImprovementAllocation;
  }


  public void setSchoolImprovementAllocation(Double schoolImprovementAllocation) {
    this.schoolImprovementAllocation = schoolImprovementAllocation;
  }


  public EdFiLocalEducationAgencyFederalFunds schoolImprovementReservedFundsPercentage(Double schoolImprovementReservedFundsPercentage) {
    
    this.schoolImprovementReservedFundsPercentage = schoolImprovementReservedFundsPercentage;
    return this;
  }

   /**
   * An indication of the percentage of the Title I, Part A allocation that the SEA reserved in accordance with Section 1003(a) of ESEA and 200.100(a) of ED&#39;s regulations governing the reservation of funds for school improvement under Section 1003(a) of ESEA.
   * @return schoolImprovementReservedFundsPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of the percentage of the Title I, Part A allocation that the SEA reserved in accordance with Section 1003(a) of ESEA and 200.100(a) of ED's regulations governing the reservation of funds for school improvement under Section 1003(a) of ESEA.")

  public Double getSchoolImprovementReservedFundsPercentage() {
    return schoolImprovementReservedFundsPercentage;
  }


  public void setSchoolImprovementReservedFundsPercentage(Double schoolImprovementReservedFundsPercentage) {
    this.schoolImprovementReservedFundsPercentage = schoolImprovementReservedFundsPercentage;
  }


  public EdFiLocalEducationAgencyFederalFunds stateAssessmentAdministrationFunding(Double stateAssessmentAdministrationFunding) {
    
    this.stateAssessmentAdministrationFunding = stateAssessmentAdministrationFunding;
    return this;
  }

   /**
   * The percentage of funds used to administer assessments required by Section 1111(b) or to carry out other activities described in Section 6111 and other activities related to ensuring that the state&#39;s schools and LEAs are held accountable for results.
   * @return stateAssessmentAdministrationFunding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of funds used to administer assessments required by Section 1111(b) or to carry out other activities described in Section 6111 and other activities related to ensuring that the state's schools and LEAs are held accountable for results.")

  public Double getStateAssessmentAdministrationFunding() {
    return stateAssessmentAdministrationFunding;
  }


  public void setStateAssessmentAdministrationFunding(Double stateAssessmentAdministrationFunding) {
    this.stateAssessmentAdministrationFunding = stateAssessmentAdministrationFunding;
  }


  public EdFiLocalEducationAgencyFederalFunds supplementalEducationalServicesFundsSpent(Double supplementalEducationalServicesFundsSpent) {
    
    this.supplementalEducationalServicesFundsSpent = supplementalEducationalServicesFundsSpent;
    return this;
  }

   /**
   * The dollar amount spent on supplemental educational services during the school year under Title I, Part A, Section 1116 of ESEA as amended.
   * @return supplementalEducationalServicesFundsSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dollar amount spent on supplemental educational services during the school year under Title I, Part A, Section 1116 of ESEA as amended.")

  public Double getSupplementalEducationalServicesFundsSpent() {
    return supplementalEducationalServicesFundsSpent;
  }


  public void setSupplementalEducationalServicesFundsSpent(Double supplementalEducationalServicesFundsSpent) {
    this.supplementalEducationalServicesFundsSpent = supplementalEducationalServicesFundsSpent;
  }


  public EdFiLocalEducationAgencyFederalFunds supplementalEducationalServicesPerPupilExpenditure(Double supplementalEducationalServicesPerPupilExpenditure) {
    
    this.supplementalEducationalServicesPerPupilExpenditure = supplementalEducationalServicesPerPupilExpenditure;
    return this;
  }

   /**
   * The maximum dollar amount that may be spent per child for expenditures related to supplemental educational services under Title I of the ESEA.
   * @return supplementalEducationalServicesPerPupilExpenditure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum dollar amount that may be spent per child for expenditures related to supplemental educational services under Title I of the ESEA.")

  public Double getSupplementalEducationalServicesPerPupilExpenditure() {
    return supplementalEducationalServicesPerPupilExpenditure;
  }


  public void setSupplementalEducationalServicesPerPupilExpenditure(Double supplementalEducationalServicesPerPupilExpenditure) {
    this.supplementalEducationalServicesPerPupilExpenditure = supplementalEducationalServicesPerPupilExpenditure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiLocalEducationAgencyFederalFunds edFiLocalEducationAgencyFederalFunds = (EdFiLocalEducationAgencyFederalFunds) o;
    return Objects.equals(this.fiscalYear, edFiLocalEducationAgencyFederalFunds.fiscalYear) &&
        Objects.equals(this.innovativeDollarsSpent, edFiLocalEducationAgencyFederalFunds.innovativeDollarsSpent) &&
        Objects.equals(this.innovativeDollarsSpentStrategicPriorities, edFiLocalEducationAgencyFederalFunds.innovativeDollarsSpentStrategicPriorities) &&
        Objects.equals(this.innovativeProgramsFundsReceived, edFiLocalEducationAgencyFederalFunds.innovativeProgramsFundsReceived) &&
        Objects.equals(this.schoolImprovementAllocation, edFiLocalEducationAgencyFederalFunds.schoolImprovementAllocation) &&
        Objects.equals(this.schoolImprovementReservedFundsPercentage, edFiLocalEducationAgencyFederalFunds.schoolImprovementReservedFundsPercentage) &&
        Objects.equals(this.stateAssessmentAdministrationFunding, edFiLocalEducationAgencyFederalFunds.stateAssessmentAdministrationFunding) &&
        Objects.equals(this.supplementalEducationalServicesFundsSpent, edFiLocalEducationAgencyFederalFunds.supplementalEducationalServicesFundsSpent) &&
        Objects.equals(this.supplementalEducationalServicesPerPupilExpenditure, edFiLocalEducationAgencyFederalFunds.supplementalEducationalServicesPerPupilExpenditure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, innovativeDollarsSpent, innovativeDollarsSpentStrategicPriorities, innovativeProgramsFundsReceived, schoolImprovementAllocation, schoolImprovementReservedFundsPercentage, stateAssessmentAdministrationFunding, supplementalEducationalServicesFundsSpent, supplementalEducationalServicesPerPupilExpenditure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiLocalEducationAgencyFederalFunds {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    innovativeDollarsSpent: ").append(toIndentedString(innovativeDollarsSpent)).append("\n");
    sb.append("    innovativeDollarsSpentStrategicPriorities: ").append(toIndentedString(innovativeDollarsSpentStrategicPriorities)).append("\n");
    sb.append("    innovativeProgramsFundsReceived: ").append(toIndentedString(innovativeProgramsFundsReceived)).append("\n");
    sb.append("    schoolImprovementAllocation: ").append(toIndentedString(schoolImprovementAllocation)).append("\n");
    sb.append("    schoolImprovementReservedFundsPercentage: ").append(toIndentedString(schoolImprovementReservedFundsPercentage)).append("\n");
    sb.append("    stateAssessmentAdministrationFunding: ").append(toIndentedString(stateAssessmentAdministrationFunding)).append("\n");
    sb.append("    supplementalEducationalServicesFundsSpent: ").append(toIndentedString(supplementalEducationalServicesFundsSpent)).append("\n");
    sb.append("    supplementalEducationalServicesPerPupilExpenditure: ").append(toIndentedString(supplementalEducationalServicesPerPupilExpenditure)).append("\n");
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

