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
 * EdFiLocalEducationAgencyReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiLocalEducationAgencyReference {
  public static final String SERIALIZED_NAME_LOCAL_EDUCATION_AGENCY_ID = "localEducationAgencyId";
  @SerializedName(SERIALIZED_NAME_LOCAL_EDUCATION_AGENCY_ID)
  private Integer localEducationAgencyId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiLocalEducationAgencyReference() { 
  }

  public EdFiLocalEducationAgencyReference localEducationAgencyId(Integer localEducationAgencyId) {
    
    this.localEducationAgencyId = localEducationAgencyId;
    return this;
  }

   /**
   * The identifier assigned to a local education agency.
   * @return localEducationAgencyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to a local education agency.")

  public Integer getLocalEducationAgencyId() {
    return localEducationAgencyId;
  }


  public void setLocalEducationAgencyId(Integer localEducationAgencyId) {
    this.localEducationAgencyId = localEducationAgencyId;
  }


  public EdFiLocalEducationAgencyReference link(Link link) {
    
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
    EdFiLocalEducationAgencyReference edFiLocalEducationAgencyReference = (EdFiLocalEducationAgencyReference) o;
    return Objects.equals(this.localEducationAgencyId, edFiLocalEducationAgencyReference.localEducationAgencyId) &&
        Objects.equals(this.link, edFiLocalEducationAgencyReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localEducationAgencyId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiLocalEducationAgencyReference {\n");
    sb.append("    localEducationAgencyId: ").append(toIndentedString(localEducationAgencyId)).append("\n");
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

