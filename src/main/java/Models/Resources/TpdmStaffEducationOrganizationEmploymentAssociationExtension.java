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
import Models.Resources.TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck;
import Models.Resources.TpdmStaffEducationOrganizationEmploymentAssociationSalary;
import Models.Resources.TpdmStaffEducationOrganizationEmploymentAssociationSeniority;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * TpdmStaffEducationOrganizationEmploymentAssociationExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmStaffEducationOrganizationEmploymentAssociationExtension {
  public static final String SERIALIZED_NAME_LENGTH_OF_CONTRACT_DESCRIPTOR = "lengthOfContractDescriptor";
  @SerializedName(SERIALIZED_NAME_LENGTH_OF_CONTRACT_DESCRIPTOR)
  private String lengthOfContractDescriptor;

  public static final String SERIALIZED_NAME_PROBATION_COMPLETE_DATE = "probationCompleteDate";
  @SerializedName(SERIALIZED_NAME_PROBATION_COMPLETE_DATE)
  private LocalDate probationCompleteDate;

  public static final String SERIALIZED_NAME_TENURED = "tenured";
  @SerializedName(SERIALIZED_NAME_TENURED)
  private Boolean tenured;

  public static final String SERIALIZED_NAME_TENURE_TRACK = "tenureTrack";
  @SerializedName(SERIALIZED_NAME_TENURE_TRACK)
  private Boolean tenureTrack;

  public static final String SERIALIZED_NAME_BACKGROUND_CHECKS = "backgroundChecks";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_CHECKS)
  private List<TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck> backgroundChecks = null;

  public static final String SERIALIZED_NAME_SENIORITIES = "seniorities";
  @SerializedName(SERIALIZED_NAME_SENIORITIES)
  private List<TpdmStaffEducationOrganizationEmploymentAssociationSeniority> seniorities = null;

  public static final String SERIALIZED_NAME_SALARY = "salary";
  @SerializedName(SERIALIZED_NAME_SALARY)
  private TpdmStaffEducationOrganizationEmploymentAssociationSalary salary;

  public TpdmStaffEducationOrganizationEmploymentAssociationExtension() { 
  }

  public TpdmStaffEducationOrganizationEmploymentAssociationExtension lengthOfContractDescriptor(String lengthOfContractDescriptor) {
    
    this.lengthOfContractDescriptor = lengthOfContractDescriptor;
    return this;
  }

   /**
   * The length of contract (e.g., 12 month, 9 month, summer).
   * @return lengthOfContractDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The length of contract (e.g., 12 month, 9 month, summer).")

  public String getLengthOfContractDescriptor() {
    return lengthOfContractDescriptor;
  }


  public void setLengthOfContractDescriptor(String lengthOfContractDescriptor) {
    this.lengthOfContractDescriptor = lengthOfContractDescriptor;
  }


  public TpdmStaffEducationOrganizationEmploymentAssociationExtension probationCompleteDate(LocalDate probationCompleteDate) {
    
    this.probationCompleteDate = probationCompleteDate;
    return this;
  }

   /**
   * The date the probation period ended or is scheduled to end.
   * @return probationCompleteDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date the probation period ended or is scheduled to end.")

  public LocalDate getProbationCompleteDate() {
    return probationCompleteDate;
  }


  public void setProbationCompleteDate(LocalDate probationCompleteDate) {
    this.probationCompleteDate = probationCompleteDate;
  }


  public TpdmStaffEducationOrganizationEmploymentAssociationExtension tenured(Boolean tenured) {
    
    this.tenured = tenured;
    return this;
  }

   /**
   * Indicator of whether the staff member is tenured.
   * @return tenured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the staff member is tenured.")

  public Boolean getTenured() {
    return tenured;
  }


  public void setTenured(Boolean tenured) {
    this.tenured = tenured;
  }


  public TpdmStaffEducationOrganizationEmploymentAssociationExtension tenureTrack(Boolean tenureTrack) {
    
    this.tenureTrack = tenureTrack;
    return this;
  }

   /**
   * An indication that the staff is on track for tenure.
   * @return tenureTrack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication that the staff is on track for tenure.")

  public Boolean getTenureTrack() {
    return tenureTrack;
  }


  public void setTenureTrack(Boolean tenureTrack) {
    this.tenureTrack = tenureTrack;
  }


  public TpdmStaffEducationOrganizationEmploymentAssociationExtension backgroundChecks(List<TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck> backgroundChecks) {
    
    this.backgroundChecks = backgroundChecks;
    return this;
  }

  public TpdmStaffEducationOrganizationEmploymentAssociationExtension addBackgroundChecksItem(TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck backgroundChecksItem) {
    if (this.backgroundChecks == null) {
      this.backgroundChecks = new ArrayList<TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck>();
    }
    this.backgroundChecks.add(backgroundChecksItem);
    return this;
  }

   /**
   * An unordered collection of staffEducationOrganizationEmploymentAssociationBackgroundChecks. Staff background check history and disposition.
   * @return backgroundChecks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffEducationOrganizationEmploymentAssociationBackgroundChecks. Staff background check history and disposition.")

  public List<TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck> getBackgroundChecks() {
    return backgroundChecks;
  }


  public void setBackgroundChecks(List<TpdmStaffEducationOrganizationEmploymentAssociationBackgroundCheck> backgroundChecks) {
    this.backgroundChecks = backgroundChecks;
  }


  public TpdmStaffEducationOrganizationEmploymentAssociationExtension seniorities(List<TpdmStaffEducationOrganizationEmploymentAssociationSeniority> seniorities) {
    
    this.seniorities = seniorities;
    return this;
  }

  public TpdmStaffEducationOrganizationEmploymentAssociationExtension addSenioritiesItem(TpdmStaffEducationOrganizationEmploymentAssociationSeniority senioritiesItem) {
    if (this.seniorities == null) {
      this.seniorities = new ArrayList<TpdmStaffEducationOrganizationEmploymentAssociationSeniority>();
    }
    this.seniorities.add(senioritiesItem);
    return this;
  }

   /**
   * An unordered collection of staffEducationOrganizationEmploymentAssociationSeniorities. Entries of job experience contributing to computations of seniority.
   * @return seniorities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of staffEducationOrganizationEmploymentAssociationSeniorities. Entries of job experience contributing to computations of seniority.")

  public List<TpdmStaffEducationOrganizationEmploymentAssociationSeniority> getSeniorities() {
    return seniorities;
  }


  public void setSeniorities(List<TpdmStaffEducationOrganizationEmploymentAssociationSeniority> seniorities) {
    this.seniorities = seniorities;
  }


  public TpdmStaffEducationOrganizationEmploymentAssociationExtension salary(TpdmStaffEducationOrganizationEmploymentAssociationSalary salary) {
    
    this.salary = salary;
    return this;
  }

   /**
   * Get salary
   * @return salary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TpdmStaffEducationOrganizationEmploymentAssociationSalary getSalary() {
    return salary;
  }


  public void setSalary(TpdmStaffEducationOrganizationEmploymentAssociationSalary salary) {
    this.salary = salary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmStaffEducationOrganizationEmploymentAssociationExtension tpdmStaffEducationOrganizationEmploymentAssociationExtension = (TpdmStaffEducationOrganizationEmploymentAssociationExtension) o;
    return Objects.equals(this.lengthOfContractDescriptor, tpdmStaffEducationOrganizationEmploymentAssociationExtension.lengthOfContractDescriptor) &&
        Objects.equals(this.probationCompleteDate, tpdmStaffEducationOrganizationEmploymentAssociationExtension.probationCompleteDate) &&
        Objects.equals(this.tenured, tpdmStaffEducationOrganizationEmploymentAssociationExtension.tenured) &&
        Objects.equals(this.tenureTrack, tpdmStaffEducationOrganizationEmploymentAssociationExtension.tenureTrack) &&
        Objects.equals(this.backgroundChecks, tpdmStaffEducationOrganizationEmploymentAssociationExtension.backgroundChecks) &&
        Objects.equals(this.seniorities, tpdmStaffEducationOrganizationEmploymentAssociationExtension.seniorities) &&
        Objects.equals(this.salary, tpdmStaffEducationOrganizationEmploymentAssociationExtension.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lengthOfContractDescriptor, probationCompleteDate, tenured, tenureTrack, backgroundChecks, seniorities, salary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmStaffEducationOrganizationEmploymentAssociationExtension {\n");
    sb.append("    lengthOfContractDescriptor: ").append(toIndentedString(lengthOfContractDescriptor)).append("\n");
    sb.append("    probationCompleteDate: ").append(toIndentedString(probationCompleteDate)).append("\n");
    sb.append("    tenured: ").append(toIndentedString(tenured)).append("\n");
    sb.append("    tenureTrack: ").append(toIndentedString(tenureTrack)).append("\n");
    sb.append("    backgroundChecks: ").append(toIndentedString(backgroundChecks)).append("\n");
    sb.append("    seniorities: ").append(toIndentedString(seniorities)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
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

