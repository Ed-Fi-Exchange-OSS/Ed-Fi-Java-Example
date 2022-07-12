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
 * EdFiLocalEducationAgencyAccountability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiLocalEducationAgencyAccountability {
  public static final String SERIALIZED_NAME_GUN_FREE_SCHOOLS_ACT_REPORTING_STATUS_DESCRIPTOR = "gunFreeSchoolsActReportingStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_GUN_FREE_SCHOOLS_ACT_REPORTING_STATUS_DESCRIPTOR)
  private String gunFreeSchoolsActReportingStatusDescriptor;

  public static final String SERIALIZED_NAME_SCHOOL_CHOICE_IMPLEMENT_STATUS_DESCRIPTOR = "schoolChoiceImplementStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_SCHOOL_CHOICE_IMPLEMENT_STATUS_DESCRIPTOR)
  private String schoolChoiceImplementStatusDescriptor;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE = "schoolYearTypeReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE)
  private EdFiSchoolYearTypeReference schoolYearTypeReference;

  public EdFiLocalEducationAgencyAccountability() { 
  }

  public EdFiLocalEducationAgencyAccountability gunFreeSchoolsActReportingStatusDescriptor(String gunFreeSchoolsActReportingStatusDescriptor) {
    
    this.gunFreeSchoolsActReportingStatusDescriptor = gunFreeSchoolsActReportingStatusDescriptor;
    return this;
  }

   /**
   * An indication of whether the school or Local Education Agency (LEA) submitted a Gun-Free Schools Act (GFSA) of 1994 report to the state, as defined by Title 18, Section 921.
   * @return gunFreeSchoolsActReportingStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether the school or Local Education Agency (LEA) submitted a Gun-Free Schools Act (GFSA) of 1994 report to the state, as defined by Title 18, Section 921.")

  public String getGunFreeSchoolsActReportingStatusDescriptor() {
    return gunFreeSchoolsActReportingStatusDescriptor;
  }


  public void setGunFreeSchoolsActReportingStatusDescriptor(String gunFreeSchoolsActReportingStatusDescriptor) {
    this.gunFreeSchoolsActReportingStatusDescriptor = gunFreeSchoolsActReportingStatusDescriptor;
  }


  public EdFiLocalEducationAgencyAccountability schoolChoiceImplementStatusDescriptor(String schoolChoiceImplementStatusDescriptor) {
    
    this.schoolChoiceImplementStatusDescriptor = schoolChoiceImplementStatusDescriptor;
    return this;
  }

   /**
   * An indication of whether the LEA was able to implement the provisions for public school choice under Title I, Part A, Section 1116 of ESEA as amended.
   * @return schoolChoiceImplementStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether the LEA was able to implement the provisions for public school choice under Title I, Part A, Section 1116 of ESEA as amended.")

  public String getSchoolChoiceImplementStatusDescriptor() {
    return schoolChoiceImplementStatusDescriptor;
  }


  public void setSchoolChoiceImplementStatusDescriptor(String schoolChoiceImplementStatusDescriptor) {
    this.schoolChoiceImplementStatusDescriptor = schoolChoiceImplementStatusDescriptor;
  }


  public EdFiLocalEducationAgencyAccountability schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    
    this.schoolYearTypeReference = schoolYearTypeReference;
    return this;
  }

   /**
   * Get schoolYearTypeReference
   * @return schoolYearTypeReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    EdFiLocalEducationAgencyAccountability edFiLocalEducationAgencyAccountability = (EdFiLocalEducationAgencyAccountability) o;
    return Objects.equals(this.gunFreeSchoolsActReportingStatusDescriptor, edFiLocalEducationAgencyAccountability.gunFreeSchoolsActReportingStatusDescriptor) &&
        Objects.equals(this.schoolChoiceImplementStatusDescriptor, edFiLocalEducationAgencyAccountability.schoolChoiceImplementStatusDescriptor) &&
        Objects.equals(this.schoolYearTypeReference, edFiLocalEducationAgencyAccountability.schoolYearTypeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gunFreeSchoolsActReportingStatusDescriptor, schoolChoiceImplementStatusDescriptor, schoolYearTypeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiLocalEducationAgencyAccountability {\n");
    sb.append("    gunFreeSchoolsActReportingStatusDescriptor: ").append(toIndentedString(gunFreeSchoolsActReportingStatusDescriptor)).append("\n");
    sb.append("    schoolChoiceImplementStatusDescriptor: ").append(toIndentedString(schoolChoiceImplementStatusDescriptor)).append("\n");
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

