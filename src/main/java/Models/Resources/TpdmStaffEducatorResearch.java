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
import org.threeten.bp.LocalDate;

/**
 * TpdmStaffEducatorResearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmStaffEducatorResearch {
  public static final String SERIALIZED_NAME_RESEARCH_EXPERIENCE_DATE = "researchExperienceDate";
  @SerializedName(SERIALIZED_NAME_RESEARCH_EXPERIENCE_DATE)
  private LocalDate researchExperienceDate;

  public static final String SERIALIZED_NAME_RESEARCH_EXPERIENCE_DESCRIPTION = "researchExperienceDescription";
  @SerializedName(SERIALIZED_NAME_RESEARCH_EXPERIENCE_DESCRIPTION)
  private String researchExperienceDescription;

  public static final String SERIALIZED_NAME_RESEARCH_EXPERIENCE_TITLE = "researchExperienceTitle";
  @SerializedName(SERIALIZED_NAME_RESEARCH_EXPERIENCE_TITLE)
  private String researchExperienceTitle;

  public TpdmStaffEducatorResearch() { 
  }

  public TpdmStaffEducatorResearch researchExperienceDate(LocalDate researchExperienceDate) {
    
    this.researchExperienceDate = researchExperienceDate;
    return this;
  }

   /**
   * Month, day, and year of the start or effective date of a staff member&#39;s teacher educator position for an Education Organization.
   * @return researchExperienceDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Month, day, and year of the start or effective date of a staff member's teacher educator position for an Education Organization.")

  public LocalDate getResearchExperienceDate() {
    return researchExperienceDate;
  }


  public void setResearchExperienceDate(LocalDate researchExperienceDate) {
    this.researchExperienceDate = researchExperienceDate;
  }


  public TpdmStaffEducatorResearch researchExperienceDescription(String researchExperienceDescription) {
    
    this.researchExperienceDescription = researchExperienceDescription;
    return this;
  }

   /**
   * The description of the research experience.
   * @return researchExperienceDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the research experience.")

  public String getResearchExperienceDescription() {
    return researchExperienceDescription;
  }


  public void setResearchExperienceDescription(String researchExperienceDescription) {
    this.researchExperienceDescription = researchExperienceDescription;
  }


  public TpdmStaffEducatorResearch researchExperienceTitle(String researchExperienceTitle) {
    
    this.researchExperienceTitle = researchExperienceTitle;
    return this;
  }

   /**
   * The title of the research experience.
   * @return researchExperienceTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the research experience.")

  public String getResearchExperienceTitle() {
    return researchExperienceTitle;
  }


  public void setResearchExperienceTitle(String researchExperienceTitle) {
    this.researchExperienceTitle = researchExperienceTitle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmStaffEducatorResearch tpdmStaffEducatorResearch = (TpdmStaffEducatorResearch) o;
    return Objects.equals(this.researchExperienceDate, tpdmStaffEducatorResearch.researchExperienceDate) &&
        Objects.equals(this.researchExperienceDescription, tpdmStaffEducatorResearch.researchExperienceDescription) &&
        Objects.equals(this.researchExperienceTitle, tpdmStaffEducatorResearch.researchExperienceTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(researchExperienceDate, researchExperienceDescription, researchExperienceTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmStaffEducatorResearch {\n");
    sb.append("    researchExperienceDate: ").append(toIndentedString(researchExperienceDate)).append("\n");
    sb.append("    researchExperienceDescription: ").append(toIndentedString(researchExperienceDescription)).append("\n");
    sb.append("    researchExperienceTitle: ").append(toIndentedString(researchExperienceTitle)).append("\n");
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

