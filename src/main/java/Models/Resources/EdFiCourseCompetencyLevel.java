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
 * EdFiCourseCompetencyLevel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiCourseCompetencyLevel {
  public static final String SERIALIZED_NAME_COMPETENCY_LEVEL_DESCRIPTOR = "competencyLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_COMPETENCY_LEVEL_DESCRIPTOR)
  private String competencyLevelDescriptor;

  public EdFiCourseCompetencyLevel() { 
  }

  public EdFiCourseCompetencyLevel competencyLevelDescriptor(String competencyLevelDescriptor) {
    
    this.competencyLevelDescriptor = competencyLevelDescriptor;
    return this;
  }

   /**
   * The competency levels defined to rate the student for the course.
   * @return competencyLevelDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The competency levels defined to rate the student for the course.")

  public String getCompetencyLevelDescriptor() {
    return competencyLevelDescriptor;
  }


  public void setCompetencyLevelDescriptor(String competencyLevelDescriptor) {
    this.competencyLevelDescriptor = competencyLevelDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiCourseCompetencyLevel edFiCourseCompetencyLevel = (EdFiCourseCompetencyLevel) o;
    return Objects.equals(this.competencyLevelDescriptor, edFiCourseCompetencyLevel.competencyLevelDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competencyLevelDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCourseCompetencyLevel {\n");
    sb.append("    competencyLevelDescriptor: ").append(toIndentedString(competencyLevelDescriptor)).append("\n");
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
