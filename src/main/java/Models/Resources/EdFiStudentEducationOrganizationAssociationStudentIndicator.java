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
import Models.Resources.EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod;
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
 * EdFiStudentEducationOrganizationAssociationStudentIndicator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentEducationOrganizationAssociationStudentIndicator {
  public static final String SERIALIZED_NAME_INDICATOR_NAME = "indicatorName";
  @SerializedName(SERIALIZED_NAME_INDICATOR_NAME)
  private String indicatorName;

  public static final String SERIALIZED_NAME_DESIGNATED_BY = "designatedBy";
  @SerializedName(SERIALIZED_NAME_DESIGNATED_BY)
  private String designatedBy;

  public static final String SERIALIZED_NAME_INDICATOR = "indicator";
  @SerializedName(SERIALIZED_NAME_INDICATOR)
  private String indicator;

  public static final String SERIALIZED_NAME_INDICATOR_GROUP = "indicatorGroup";
  @SerializedName(SERIALIZED_NAME_INDICATOR_GROUP)
  private String indicatorGroup;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod> periods = null;

  public EdFiStudentEducationOrganizationAssociationStudentIndicator() { 
  }

  public EdFiStudentEducationOrganizationAssociationStudentIndicator indicatorName(String indicatorName) {
    
    this.indicatorName = indicatorName;
    return this;
  }

   /**
   * The name of the indicator or metric.
   * @return indicatorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the indicator or metric.")

  public String getIndicatorName() {
    return indicatorName;
  }


  public void setIndicatorName(String indicatorName) {
    this.indicatorName = indicatorName;
  }


  public EdFiStudentEducationOrganizationAssociationStudentIndicator designatedBy(String designatedBy) {
    
    this.designatedBy = designatedBy;
    return this;
  }

   /**
   * The person, organization, or department that designated the program association.
   * @return designatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The person, organization, or department that designated the program association.")

  public String getDesignatedBy() {
    return designatedBy;
  }


  public void setDesignatedBy(String designatedBy) {
    this.designatedBy = designatedBy;
  }


  public EdFiStudentEducationOrganizationAssociationStudentIndicator indicator(String indicator) {
    
    this.indicator = indicator;
    return this;
  }

   /**
   * The value of the indicator or metric.
   * @return indicator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value of the indicator or metric.")

  public String getIndicator() {
    return indicator;
  }


  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }


  public EdFiStudentEducationOrganizationAssociationStudentIndicator indicatorGroup(String indicatorGroup) {
    
    this.indicatorGroup = indicatorGroup;
    return this;
  }

   /**
   * The name for a group of indicators.
   * @return indicatorGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name for a group of indicators.")

  public String getIndicatorGroup() {
    return indicatorGroup;
  }


  public void setIndicatorGroup(String indicatorGroup) {
    this.indicatorGroup = indicatorGroup;
  }


  public EdFiStudentEducationOrganizationAssociationStudentIndicator periods(List<EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod> periods) {
    
    this.periods = periods;
    return this;
  }

  public EdFiStudentEducationOrganizationAssociationStudentIndicator addPeriodsItem(EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * An unordered collection of studentEducationOrganizationAssociationStudentIndicatorPeriods. The time periods for which the indicator was effective.
   * @return periods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of studentEducationOrganizationAssociationStudentIndicatorPeriods. The time periods for which the indicator was effective.")

  public List<EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod> getPeriods() {
    return periods;
  }


  public void setPeriods(List<EdFiStudentEducationOrganizationAssociationStudentIndicatorPeriod> periods) {
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
    EdFiStudentEducationOrganizationAssociationStudentIndicator edFiStudentEducationOrganizationAssociationStudentIndicator = (EdFiStudentEducationOrganizationAssociationStudentIndicator) o;
    return Objects.equals(this.indicatorName, edFiStudentEducationOrganizationAssociationStudentIndicator.indicatorName) &&
        Objects.equals(this.designatedBy, edFiStudentEducationOrganizationAssociationStudentIndicator.designatedBy) &&
        Objects.equals(this.indicator, edFiStudentEducationOrganizationAssociationStudentIndicator.indicator) &&
        Objects.equals(this.indicatorGroup, edFiStudentEducationOrganizationAssociationStudentIndicator.indicatorGroup) &&
        Objects.equals(this.periods, edFiStudentEducationOrganizationAssociationStudentIndicator.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicatorName, designatedBy, indicator, indicatorGroup, periods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationStudentIndicator {\n");
    sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
    sb.append("    designatedBy: ").append(toIndentedString(designatedBy)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    indicatorGroup: ").append(toIndentedString(indicatorGroup)).append("\n");
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

