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
import Models.Resources.EdFiEducationOrganizationIndicatorPeriod;
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

/**
 * EdFiEducationOrganizationIndicator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiEducationOrganizationIndicator {
  public static final String SERIALIZED_NAME_INDICATOR_DESCRIPTOR = "indicatorDescriptor";
  @SerializedName(SERIALIZED_NAME_INDICATOR_DESCRIPTOR)
  private String indicatorDescriptor;

  public static final String SERIALIZED_NAME_INDICATOR_GROUP_DESCRIPTOR = "indicatorGroupDescriptor";
  @SerializedName(SERIALIZED_NAME_INDICATOR_GROUP_DESCRIPTOR)
  private String indicatorGroupDescriptor;

  public static final String SERIALIZED_NAME_INDICATOR_LEVEL_DESCRIPTOR = "indicatorLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_INDICATOR_LEVEL_DESCRIPTOR)
  private String indicatorLevelDescriptor;

  public static final String SERIALIZED_NAME_DESIGNATED_BY = "designatedBy";
  @SerializedName(SERIALIZED_NAME_DESIGNATED_BY)
  private String designatedBy;

  public static final String SERIALIZED_NAME_INDICATOR_VALUE = "indicatorValue";
  @SerializedName(SERIALIZED_NAME_INDICATOR_VALUE)
  private String indicatorValue;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<EdFiEducationOrganizationIndicatorPeriod> periods = null;

  public EdFiEducationOrganizationIndicator() { 
  }

  public EdFiEducationOrganizationIndicator indicatorDescriptor(String indicatorDescriptor) {
    
    this.indicatorDescriptor = indicatorDescriptor;
    return this;
  }

   /**
   * The name or code for the indicator or metric.
   * @return indicatorDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name or code for the indicator or metric.")

  public String getIndicatorDescriptor() {
    return indicatorDescriptor;
  }


  public void setIndicatorDescriptor(String indicatorDescriptor) {
    this.indicatorDescriptor = indicatorDescriptor;
  }


  public EdFiEducationOrganizationIndicator indicatorGroupDescriptor(String indicatorGroupDescriptor) {
    
    this.indicatorGroupDescriptor = indicatorGroupDescriptor;
    return this;
  }

   /**
   * The name for a group of indicators.
   * @return indicatorGroupDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name for a group of indicators.")

  public String getIndicatorGroupDescriptor() {
    return indicatorGroupDescriptor;
  }


  public void setIndicatorGroupDescriptor(String indicatorGroupDescriptor) {
    this.indicatorGroupDescriptor = indicatorGroupDescriptor;
  }


  public EdFiEducationOrganizationIndicator indicatorLevelDescriptor(String indicatorLevelDescriptor) {
    
    this.indicatorLevelDescriptor = indicatorLevelDescriptor;
    return this;
  }

   /**
   * The value of the indicator or metric, as a value from a controlled vocabulary. The semantics of an empty value is \&quot;not submitted.\&quot;
   * @return indicatorLevelDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the indicator or metric, as a value from a controlled vocabulary. The semantics of an empty value is \"not submitted.\"")

  public String getIndicatorLevelDescriptor() {
    return indicatorLevelDescriptor;
  }


  public void setIndicatorLevelDescriptor(String indicatorLevelDescriptor) {
    this.indicatorLevelDescriptor = indicatorLevelDescriptor;
  }


  public EdFiEducationOrganizationIndicator designatedBy(String designatedBy) {
    
    this.designatedBy = designatedBy;
    return this;
  }

   /**
   * The person, organization, or department that defined the metric.
   * @return designatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person, organization, or department that defined the metric.")

  public String getDesignatedBy() {
    return designatedBy;
  }


  public void setDesignatedBy(String designatedBy) {
    this.designatedBy = designatedBy;
  }


  public EdFiEducationOrganizationIndicator indicatorValue(String indicatorValue) {
    
    this.indicatorValue = indicatorValue;
    return this;
  }

   /**
   * The value of the indicator or metric. The semantics of an empty value is \&quot;not submitted.\&quot;
   * @return indicatorValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the indicator or metric. The semantics of an empty value is \"not submitted.\"")

  public String getIndicatorValue() {
    return indicatorValue;
  }


  public void setIndicatorValue(String indicatorValue) {
    this.indicatorValue = indicatorValue;
  }


  public EdFiEducationOrganizationIndicator periods(List<EdFiEducationOrganizationIndicatorPeriod> periods) {
    
    this.periods = periods;
    return this;
  }

  public EdFiEducationOrganizationIndicator addPeriodsItem(EdFiEducationOrganizationIndicatorPeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<EdFiEducationOrganizationIndicatorPeriod>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * An unordered collection of educationOrganizationIndicatorPeriods. The time period or as-of date for the indicator.
   * @return periods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationOrganizationIndicatorPeriods. The time period or as-of date for the indicator.")

  public List<EdFiEducationOrganizationIndicatorPeriod> getPeriods() {
    return periods;
  }


  public void setPeriods(List<EdFiEducationOrganizationIndicatorPeriod> periods) {
    this.periods = periods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiEducationOrganizationIndicator edFiEducationOrganizationIndicator = (EdFiEducationOrganizationIndicator) o;
    return Objects.equals(this.indicatorDescriptor, edFiEducationOrganizationIndicator.indicatorDescriptor) &&
        Objects.equals(this.indicatorGroupDescriptor, edFiEducationOrganizationIndicator.indicatorGroupDescriptor) &&
        Objects.equals(this.indicatorLevelDescriptor, edFiEducationOrganizationIndicator.indicatorLevelDescriptor) &&
        Objects.equals(this.designatedBy, edFiEducationOrganizationIndicator.designatedBy) &&
        Objects.equals(this.indicatorValue, edFiEducationOrganizationIndicator.indicatorValue) &&
        Objects.equals(this.periods, edFiEducationOrganizationIndicator.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorDescriptor, indicatorGroupDescriptor, indicatorLevelDescriptor, designatedBy, indicatorValue, periods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiEducationOrganizationIndicator {\n");
    sb.append("    indicatorDescriptor: ").append(toIndentedString(indicatorDescriptor)).append("\n");
    sb.append("    indicatorGroupDescriptor: ").append(toIndentedString(indicatorGroupDescriptor)).append("\n");
    sb.append("    indicatorLevelDescriptor: ").append(toIndentedString(indicatorLevelDescriptor)).append("\n");
    sb.append("    designatedBy: ").append(toIndentedString(designatedBy)).append("\n");
    sb.append("    indicatorValue: ").append(toIndentedString(indicatorValue)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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

