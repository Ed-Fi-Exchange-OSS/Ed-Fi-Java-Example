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
 * EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin {
  public static final String SERIALIZED_NAME_ANCESTRY_ETHNIC_ORIGIN_DESCRIPTOR = "ancestryEthnicOriginDescriptor";
  @SerializedName(SERIALIZED_NAME_ANCESTRY_ETHNIC_ORIGIN_DESCRIPTOR)
  private String ancestryEthnicOriginDescriptor;

  public EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin() { 
  }

  public EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin ancestryEthnicOriginDescriptor(String ancestryEthnicOriginDescriptor) {
    
    this.ancestryEthnicOriginDescriptor = ancestryEthnicOriginDescriptor;
    return this;
  }

   /**
   * The original peoples or cultures with which the individual identifies.
   * @return ancestryEthnicOriginDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The original peoples or cultures with which the individual identifies.")

  public String getAncestryEthnicOriginDescriptor() {
    return ancestryEthnicOriginDescriptor;
  }


  public void setAncestryEthnicOriginDescriptor(String ancestryEthnicOriginDescriptor) {
    this.ancestryEthnicOriginDescriptor = ancestryEthnicOriginDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin edFiStudentEducationOrganizationAssociationAncestryEthnicOrigin = (EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin) o;
    return Objects.equals(this.ancestryEthnicOriginDescriptor, edFiStudentEducationOrganizationAssociationAncestryEthnicOrigin.ancestryEthnicOriginDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestryEthnicOriginDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationAncestryEthnicOrigin {\n");
    sb.append("    ancestryEthnicOriginDescriptor: ").append(toIndentedString(ancestryEthnicOriginDescriptor)).append("\n");
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

