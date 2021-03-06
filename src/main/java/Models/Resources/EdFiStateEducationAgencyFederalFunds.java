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
 * EdFiStateEducationAgencyFederalFunds
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStateEducationAgencyFederalFunds {
  public static final String SERIALIZED_NAME_FISCAL_YEAR = "fiscalYear";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEAR)
  private Integer fiscalYear;

  public static final String SERIALIZED_NAME_FEDERAL_PROGRAMS_FUNDING_ALLOCATION = "federalProgramsFundingAllocation";
  @SerializedName(SERIALIZED_NAME_FEDERAL_PROGRAMS_FUNDING_ALLOCATION)
  private Double federalProgramsFundingAllocation;

  public EdFiStateEducationAgencyFederalFunds() { 
  }

  public EdFiStateEducationAgencyFederalFunds fiscalYear(Integer fiscalYear) {
    
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


  public EdFiStateEducationAgencyFederalFunds federalProgramsFundingAllocation(Double federalProgramsFundingAllocation) {
    
    this.federalProgramsFundingAllocation = federalProgramsFundingAllocation;
    return this;
  }

   /**
   * The amount of federal dollars distributed to Local Education Agencies (LEAs), retained by the State Education Agency (SEA) for program administration or other approved state-level activities (including unallocated, transferred to another state agency, or distributed to entities other than LEAs).
   * @return federalProgramsFundingAllocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of federal dollars distributed to Local Education Agencies (LEAs), retained by the State Education Agency (SEA) for program administration or other approved state-level activities (including unallocated, transferred to another state agency, or distributed to entities other than LEAs).")

  public Double getFederalProgramsFundingAllocation() {
    return federalProgramsFundingAllocation;
  }


  public void setFederalProgramsFundingAllocation(Double federalProgramsFundingAllocation) {
    this.federalProgramsFundingAllocation = federalProgramsFundingAllocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStateEducationAgencyFederalFunds edFiStateEducationAgencyFederalFunds = (EdFiStateEducationAgencyFederalFunds) o;
    return Objects.equals(this.fiscalYear, edFiStateEducationAgencyFederalFunds.fiscalYear) &&
        Objects.equals(this.federalProgramsFundingAllocation, edFiStateEducationAgencyFederalFunds.federalProgramsFundingAllocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, federalProgramsFundingAllocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStateEducationAgencyFederalFunds {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    federalProgramsFundingAllocation: ").append(toIndentedString(federalProgramsFundingAllocation)).append("\n");
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

