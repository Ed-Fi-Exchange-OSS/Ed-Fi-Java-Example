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
import Models.Resources.EdFiCohortProgram;
import Models.Resources.EdFiEducationOrganizationReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EdFiCohort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiCohort {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COHORT_IDENTIFIER = "cohortIdentifier";
  @SerializedName(SERIALIZED_NAME_COHORT_IDENTIFIER)
  private String cohortIdentifier;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE = "educationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference educationOrganizationReference;

  public static final String SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR = "academicSubjectDescriptor";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUBJECT_DESCRIPTOR)
  private String academicSubjectDescriptor;

  public static final String SERIALIZED_NAME_COHORT_DESCRIPTION = "cohortDescription";
  @SerializedName(SERIALIZED_NAME_COHORT_DESCRIPTION)
  private String cohortDescription;

  public static final String SERIALIZED_NAME_COHORT_SCOPE_DESCRIPTOR = "cohortScopeDescriptor";
  @SerializedName(SERIALIZED_NAME_COHORT_SCOPE_DESCRIPTOR)
  private String cohortScopeDescriptor;

  public static final String SERIALIZED_NAME_COHORT_TYPE_DESCRIPTOR = "cohortTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_COHORT_TYPE_DESCRIPTOR)
  private String cohortTypeDescriptor;

  public static final String SERIALIZED_NAME_PROGRAMS = "programs";
  @SerializedName(SERIALIZED_NAME_PROGRAMS)
  private List<EdFiCohortProgram> programs = null;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiCohort() { 
  }

  public EdFiCohort id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EdFiCohort cohortIdentifier(String cohortIdentifier) {
    
    this.cohortIdentifier = cohortIdentifier;
    return this;
  }

   /**
   * The name or ID for the Cohort.
   * @return cohortIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name or ID for the Cohort.")

  public String getCohortIdentifier() {
    return cohortIdentifier;
  }


  public void setCohortIdentifier(String cohortIdentifier) {
    this.cohortIdentifier = cohortIdentifier;
  }


  public EdFiCohort educationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    
    this.educationOrganizationReference = educationOrganizationReference;
    return this;
  }

   /**
   * Get educationOrganizationReference
   * @return educationOrganizationReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiEducationOrganizationReference getEducationOrganizationReference() {
    return educationOrganizationReference;
  }


  public void setEducationOrganizationReference(EdFiEducationOrganizationReference educationOrganizationReference) {
    this.educationOrganizationReference = educationOrganizationReference;
  }


  public EdFiCohort academicSubjectDescriptor(String academicSubjectDescriptor) {
    
    this.academicSubjectDescriptor = academicSubjectDescriptor;
    return this;
  }

   /**
   * The academic subject associated with an academic intervention.
   * @return academicSubjectDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The academic subject associated with an academic intervention.")

  public String getAcademicSubjectDescriptor() {
    return academicSubjectDescriptor;
  }


  public void setAcademicSubjectDescriptor(String academicSubjectDescriptor) {
    this.academicSubjectDescriptor = academicSubjectDescriptor;
  }


  public EdFiCohort cohortDescription(String cohortDescription) {
    
    this.cohortDescription = cohortDescription;
    return this;
  }

   /**
   * The description of the Cohort and its purpose.
   * @return cohortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the Cohort and its purpose.")

  public String getCohortDescription() {
    return cohortDescription;
  }


  public void setCohortDescription(String cohortDescription) {
    this.cohortDescription = cohortDescription;
  }


  public EdFiCohort cohortScopeDescriptor(String cohortScopeDescriptor) {
    
    this.cohortScopeDescriptor = cohortScopeDescriptor;
    return this;
  }

   /**
   * The scope of cohort (e.g., school, district, classroom).
   * @return cohortScopeDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of cohort (e.g., school, district, classroom).")

  public String getCohortScopeDescriptor() {
    return cohortScopeDescriptor;
  }


  public void setCohortScopeDescriptor(String cohortScopeDescriptor) {
    this.cohortScopeDescriptor = cohortScopeDescriptor;
  }


  public EdFiCohort cohortTypeDescriptor(String cohortTypeDescriptor) {
    
    this.cohortTypeDescriptor = cohortTypeDescriptor;
    return this;
  }

   /**
   * The type of cohort (e.g., academic intervention, classroom breakout).
   * @return cohortTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of cohort (e.g., academic intervention, classroom breakout).")

  public String getCohortTypeDescriptor() {
    return cohortTypeDescriptor;
  }


  public void setCohortTypeDescriptor(String cohortTypeDescriptor) {
    this.cohortTypeDescriptor = cohortTypeDescriptor;
  }


  public EdFiCohort programs(List<EdFiCohortProgram> programs) {
    
    this.programs = programs;
    return this;
  }

  public EdFiCohort addProgramsItem(EdFiCohortProgram programsItem) {
    if (this.programs == null) {
      this.programs = new ArrayList<EdFiCohortProgram>();
    }
    this.programs.add(programsItem);
    return this;
  }

   /**
   * An unordered collection of cohortPrograms. The (optional) program associated with this Cohort (e.g., special education).
   * @return programs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of cohortPrograms. The (optional) program associated with this Cohort (e.g., special education).")

  public List<EdFiCohortProgram> getPrograms() {
    return programs;
  }


  public void setPrograms(List<EdFiCohortProgram> programs) {
    this.programs = programs;
  }


  public EdFiCohort etag(String etag) {
    
    this.etag = etag;
    return this;
  }

   /**
   * A unique system-generated value that identifies the version of the resource.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique system-generated value that identifies the version of the resource.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiCohort edFiCohort = (EdFiCohort) o;
    return Objects.equals(this.id, edFiCohort.id) &&
        Objects.equals(this.cohortIdentifier, edFiCohort.cohortIdentifier) &&
        Objects.equals(this.educationOrganizationReference, edFiCohort.educationOrganizationReference) &&
        Objects.equals(this.academicSubjectDescriptor, edFiCohort.academicSubjectDescriptor) &&
        Objects.equals(this.cohortDescription, edFiCohort.cohortDescription) &&
        Objects.equals(this.cohortScopeDescriptor, edFiCohort.cohortScopeDescriptor) &&
        Objects.equals(this.cohortTypeDescriptor, edFiCohort.cohortTypeDescriptor) &&
        Objects.equals(this.programs, edFiCohort.programs) &&
        Objects.equals(this.etag, edFiCohort.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cohortIdentifier, educationOrganizationReference, academicSubjectDescriptor, cohortDescription, cohortScopeDescriptor, cohortTypeDescriptor, programs, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiCohort {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cohortIdentifier: ").append(toIndentedString(cohortIdentifier)).append("\n");
    sb.append("    educationOrganizationReference: ").append(toIndentedString(educationOrganizationReference)).append("\n");
    sb.append("    academicSubjectDescriptor: ").append(toIndentedString(academicSubjectDescriptor)).append("\n");
    sb.append("    cohortDescription: ").append(toIndentedString(cohortDescription)).append("\n");
    sb.append("    cohortScopeDescriptor: ").append(toIndentedString(cohortScopeDescriptor)).append("\n");
    sb.append("    cohortTypeDescriptor: ").append(toIndentedString(cohortTypeDescriptor)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

