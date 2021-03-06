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
 * EdFiAssessmentReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiAssessmentReference {
  public static final String SERIALIZED_NAME_ASSESSMENT_IDENTIFIER = "assessmentIdentifier";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_IDENTIFIER)
  private String assessmentIdentifier;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public EdFiAssessmentReference() { 
  }

  public EdFiAssessmentReference assessmentIdentifier(String assessmentIdentifier) {
    
    this.assessmentIdentifier = assessmentIdentifier;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to an assessment.
   * @return assessmentIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique number or alphanumeric code assigned to an assessment.")

  public String getAssessmentIdentifier() {
    return assessmentIdentifier;
  }


  public void setAssessmentIdentifier(String assessmentIdentifier) {
    this.assessmentIdentifier = assessmentIdentifier;
  }


  public EdFiAssessmentReference namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the Assessment.
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace for the Assessment.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public EdFiAssessmentReference link(Link link) {
    
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
    EdFiAssessmentReference edFiAssessmentReference = (EdFiAssessmentReference) o;
    return Objects.equals(this.assessmentIdentifier, edFiAssessmentReference.assessmentIdentifier) &&
        Objects.equals(this.namespace, edFiAssessmentReference.namespace) &&
        Objects.equals(this.link, edFiAssessmentReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentIdentifier, namespace, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiAssessmentReference {\n");
    sb.append("    assessmentIdentifier: ").append(toIndentedString(assessmentIdentifier)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

