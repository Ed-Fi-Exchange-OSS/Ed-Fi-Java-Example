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
 * EdFiLearningStandardAcademicSubject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiLearningStandardAcademicSubject {
  public static final String SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR = "academicSubjectDescriptor";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR)
  private String academicSubjectDescriptor;

  public EdFiLearningStandardAcademicSubject() { 
  }

  public EdFiLearningStandardAcademicSubject academicSubjectDescriptor(String academicSubjectDescriptor) {
    
    this.academicSubjectDescriptor = academicSubjectDescriptor;
    return this;
  }

   /**
   * Subject area for the LearningStandard.
   * @return academicSubjectDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subject area for the LearningStandard.")

  public String getAcademicSubjectDescriptor() {
    return academicSubjectDescriptor;
  }


  public void setAcademicSubjectDescriptor(String academicSubjectDescriptor) {
    this.academicSubjectDescriptor = academicSubjectDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiLearningStandardAcademicSubject edFiLearningStandardAcademicSubject = (EdFiLearningStandardAcademicSubject) o;
    return Objects.equals(this.academicSubjectDescriptor, edFiLearningStandardAcademicSubject.academicSubjectDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSubjectDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiLearningStandardAcademicSubject {\n");
    sb.append("    academicSubjectDescriptor: ").append(toIndentedString(academicSubjectDescriptor)).append("\n");
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

