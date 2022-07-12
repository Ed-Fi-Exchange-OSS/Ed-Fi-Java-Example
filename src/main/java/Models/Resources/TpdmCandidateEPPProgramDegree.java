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
 * TpdmCandidateEPPProgramDegree
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCandidateEPPProgramDegree {
  public static final String SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR = "academicSubjectDescriptor";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR)
  private String academicSubjectDescriptor;

  public static final String SERIALIZED_NAME_EPP_DEGREE_TYPE_DESCRIPTOR = "eppDegreeTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_EPP_DEGREE_TYPE_DESCRIPTOR)
  private String eppDegreeTypeDescriptor;

  public static final String SERIALIZED_NAME_GRADE_LEVEL_DESCRIPTOR = "gradeLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_GRADE_LEVEL_DESCRIPTOR)
  private String gradeLevelDescriptor;

  public TpdmCandidateEPPProgramDegree() { 
  }

  public TpdmCandidateEPPProgramDegree academicSubjectDescriptor(String academicSubjectDescriptor) {
    
    this.academicSubjectDescriptor = academicSubjectDescriptor;
    return this;
  }

   /**
   * The description of the content or subject area (e.g., arts, mathematics, reading, stenography, or a foreign language) of a degree.
   * @return academicSubjectDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description of the content or subject area (e.g., arts, mathematics, reading, stenography, or a foreign language) of a degree.")

  public String getAcademicSubjectDescriptor() {
    return academicSubjectDescriptor;
  }


  public void setAcademicSubjectDescriptor(String academicSubjectDescriptor) {
    this.academicSubjectDescriptor = academicSubjectDescriptor;
  }


  public TpdmCandidateEPPProgramDegree eppDegreeTypeDescriptor(String eppDegreeTypeDescriptor) {
    
    this.eppDegreeTypeDescriptor = eppDegreeTypeDescriptor;
    return this;
  }

   /**
   * A code for describing the degree type that a candidate accomplishes.
   * @return eppDegreeTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A code for describing the degree type that a candidate accomplishes.")

  public String getEppDegreeTypeDescriptor() {
    return eppDegreeTypeDescriptor;
  }


  public void setEppDegreeTypeDescriptor(String eppDegreeTypeDescriptor) {
    this.eppDegreeTypeDescriptor = eppDegreeTypeDescriptor;
  }


  public TpdmCandidateEPPProgramDegree gradeLevelDescriptor(String gradeLevelDescriptor) {
    
    this.gradeLevelDescriptor = gradeLevelDescriptor;
    return this;
  }

   /**
   * The grade level associated with the degree plan for the candidate.
   * @return gradeLevelDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The grade level associated with the degree plan for the candidate.")

  public String getGradeLevelDescriptor() {
    return gradeLevelDescriptor;
  }


  public void setGradeLevelDescriptor(String gradeLevelDescriptor) {
    this.gradeLevelDescriptor = gradeLevelDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCandidateEPPProgramDegree tpdmCandidateEPPProgramDegree = (TpdmCandidateEPPProgramDegree) o;
    return Objects.equals(this.academicSubjectDescriptor, tpdmCandidateEPPProgramDegree.academicSubjectDescriptor) &&
        Objects.equals(this.eppDegreeTypeDescriptor, tpdmCandidateEPPProgramDegree.eppDegreeTypeDescriptor) &&
        Objects.equals(this.gradeLevelDescriptor, tpdmCandidateEPPProgramDegree.gradeLevelDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSubjectDescriptor, eppDegreeTypeDescriptor, gradeLevelDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCandidateEPPProgramDegree {\n");
    sb.append("    academicSubjectDescriptor: ").append(toIndentedString(academicSubjectDescriptor)).append("\n");
    sb.append("    eppDegreeTypeDescriptor: ").append(toIndentedString(eppDegreeTypeDescriptor)).append("\n");
    sb.append("    gradeLevelDescriptor: ").append(toIndentedString(gradeLevelDescriptor)).append("\n");
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

