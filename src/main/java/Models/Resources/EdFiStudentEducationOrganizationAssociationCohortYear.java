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
 * EdFiStudentEducationOrganizationAssociationCohortYear
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentEducationOrganizationAssociationCohortYear {
  public static final String SERIALIZED_NAME_COHORT_YEAR_TYPE_DESCRIPTOR = "cohortYearTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_COHORT_YEAR_TYPE_DESCRIPTOR)
  private String cohortYearTypeDescriptor;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE = "schoolYearTypeReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR_TYPE_REFERENCE)
  private EdFiSchoolYearTypeReference schoolYearTypeReference;

  public EdFiStudentEducationOrganizationAssociationCohortYear() { 
  }

  public EdFiStudentEducationOrganizationAssociationCohortYear cohortYearTypeDescriptor(String cohortYearTypeDescriptor) {
    
    this.cohortYearTypeDescriptor = cohortYearTypeDescriptor;
    return this;
  }

   /**
   * The type of cohort year (9th grade, graduation).
   * @return cohortYearTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of cohort year (9th grade, graduation).")

  public String getCohortYearTypeDescriptor() {
    return cohortYearTypeDescriptor;
  }


  public void setCohortYearTypeDescriptor(String cohortYearTypeDescriptor) {
    this.cohortYearTypeDescriptor = cohortYearTypeDescriptor;
  }


  public EdFiStudentEducationOrganizationAssociationCohortYear schoolYearTypeReference(EdFiSchoolYearTypeReference schoolYearTypeReference) {
    
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
    EdFiStudentEducationOrganizationAssociationCohortYear edFiStudentEducationOrganizationAssociationCohortYear = (EdFiStudentEducationOrganizationAssociationCohortYear) o;
    return Objects.equals(this.cohortYearTypeDescriptor, edFiStudentEducationOrganizationAssociationCohortYear.cohortYearTypeDescriptor) &&
        Objects.equals(this.schoolYearTypeReference, edFiStudentEducationOrganizationAssociationCohortYear.schoolYearTypeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohortYearTypeDescriptor, schoolYearTypeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentEducationOrganizationAssociationCohortYear {\n");
    sb.append("    cohortYearTypeDescriptor: ").append(toIndentedString(cohortYearTypeDescriptor)).append("\n");
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
