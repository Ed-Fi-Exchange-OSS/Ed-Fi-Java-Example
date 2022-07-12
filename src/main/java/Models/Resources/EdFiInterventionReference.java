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
import Models.Resources.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EdFiInterventionReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiInterventionReference {
  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID = "educationOrganizationId";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_ID)
  private Integer educationOrganizationId;

  public static final String SERIALIZED_NAME_INTERVENTION_IDENTIFICATION_CODE = "interventionIdentificationCode";
  @SerializedName(SERIALIZED_NAME_INTERVENTION_IDENTIFICATION_CODE)
  private String interventionIdentificationCode;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiInterventionReference() { 
  }

  public EdFiInterventionReference educationOrganizationId(Integer educationOrganizationId) {
    
    this.educationOrganizationId = educationOrganizationId;
    return this;
  }

   /**
   * The identifier assigned to an education organization.
   * @return educationOrganizationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to an education organization.")

  public Integer getEducationOrganizationId() {
    return educationOrganizationId;
  }


  public void setEducationOrganizationId(Integer educationOrganizationId) {
    this.educationOrganizationId = educationOrganizationId;
  }


  public EdFiInterventionReference interventionIdentificationCode(String interventionIdentificationCode) {
    
    this.interventionIdentificationCode = interventionIdentificationCode;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to an intervention.
   * @return interventionIdentificationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique number or alphanumeric code assigned to an intervention.")

  public String getInterventionIdentificationCode() {
    return interventionIdentificationCode;
  }


  public void setInterventionIdentificationCode(String interventionIdentificationCode) {
    this.interventionIdentificationCode = interventionIdentificationCode;
  }


  public EdFiInterventionReference link(Link link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getLink() {
    return link;
  }


  public void setLink(Link link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiInterventionReference edFiInterventionReference = (EdFiInterventionReference) o;
    return Objects.equals(this.educationOrganizationId, edFiInterventionReference.educationOrganizationId) &&
        Objects.equals(this.interventionIdentificationCode, edFiInterventionReference.interventionIdentificationCode) &&
        Objects.equals(this.link, edFiInterventionReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(educationOrganizationId, interventionIdentificationCode, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiInterventionReference {\n");
    sb.append("    educationOrganizationId: ").append(toIndentedString(educationOrganizationId)).append("\n");
    sb.append("    interventionIdentificationCode: ").append(toIndentedString(interventionIdentificationCode)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

