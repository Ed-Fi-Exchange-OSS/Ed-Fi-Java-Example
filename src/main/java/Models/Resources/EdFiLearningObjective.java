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
import Models.Resources.EdFiLearningObjectiveAcademicSubject;
import Models.Resources.EdFiLearningObjectiveContentStandard;
import Models.Resources.EdFiLearningObjectiveGradeLevel;
import Models.Resources.EdFiLearningObjectiveLearningStandard;
import Models.Resources.EdFiLearningObjectiveReference;
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
 * EdFiLearningObjective
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiLearningObjective {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACADEMIC_SUBJECTS = "academicSubjects";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SUBJECTS)
  private List<EdFiLearningObjectiveAcademicSubject> academicSubjects = new ArrayList<EdFiLearningObjectiveAcademicSubject>();

  public static final String SERIALIZED_NAME_LEARNING_OBJECTIVE_ID = "learningObjectiveId";
  @SerializedName(SERIALIZED_NAME_LEARNING_OBJECTIVE_ID)
  private String learningObjectiveId;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARENT_LEARNING_OBJECTIVE_REFERENCE = "parentLearningObjectiveReference";
  @SerializedName(SERIALIZED_NAME_PARENT_LEARNING_OBJECTIVE_REFERENCE)
  private EdFiLearningObjectiveReference parentLearningObjectiveReference;

  public static final String SERIALIZED_NAME_CONTENT_STANDARD = "contentStandard";
  @SerializedName(SERIALIZED_NAME_CONTENT_STANDARD)
  private EdFiLearningObjectiveContentStandard contentStandard;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GRADE_LEVELS = "gradeLevels";
  @SerializedName(SERIALIZED_NAME_GRADE_LEVELS)
  private List<EdFiLearningObjectiveGradeLevel> gradeLevels = null;

  public static final String SERIALIZED_NAME_LEARNING_STANDARDS = "learningStandards";
  @SerializedName(SERIALIZED_NAME_LEARNING_STANDARDS)
  private List<EdFiLearningObjectiveLearningStandard> learningStandards = null;

  public static final String SERIALIZED_NAME_NOMENCLATURE = "nomenclature";
  @SerializedName(SERIALIZED_NAME_NOMENCLATURE)
  private String nomenclature;

  public static final String SERIALIZED_NAME_OBJECTIVE = "objective";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE)
  private String objective;

  public static final String SERIALIZED_NAME_SUCCESS_CRITERIA = "successCriteria";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CRITERIA)
  private String successCriteria;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiLearningObjective() { 
  }

  public EdFiLearningObjective id(String id) {
    
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


  public EdFiLearningObjective academicSubjects(List<EdFiLearningObjectiveAcademicSubject> academicSubjects) {
    
    this.academicSubjects = academicSubjects;
    return this;
  }

  public EdFiLearningObjective addAcademicSubjectsItem(EdFiLearningObjectiveAcademicSubject academicSubjectsItem) {
    this.academicSubjects.add(academicSubjectsItem);
    return this;
  }

   /**
   * An unordered collection of learningObjectiveAcademicSubjects. The description of the content or subject area (e.g., arts, mathematics, reading, stenography, or a foreign language) of an assessment.
   * @return academicSubjects
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An unordered collection of learningObjectiveAcademicSubjects. The description of the content or subject area (e.g., arts, mathematics, reading, stenography, or a foreign language) of an assessment.")

  public List<EdFiLearningObjectiveAcademicSubject> getAcademicSubjects() {
    return academicSubjects;
  }


  public void setAcademicSubjects(List<EdFiLearningObjectiveAcademicSubject> academicSubjects) {
    this.academicSubjects = academicSubjects;
  }


  public EdFiLearningObjective learningObjectiveId(String learningObjectiveId) {
    
    this.learningObjectiveId = learningObjectiveId;
    return this;
  }

   /**
   * The identifier for the specific learning objective in the context of a standard (e.g., 111.15.3.1.A).
   * @return learningObjectiveId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier for the specific learning objective in the context of a standard (e.g., 111.15.3.1.A).")

  public String getLearningObjectiveId() {
    return learningObjectiveId;
  }


  public void setLearningObjectiveId(String learningObjectiveId) {
    this.learningObjectiveId = learningObjectiveId;
  }


  public EdFiLearningObjective namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the LearningObjective.
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace for the LearningObjective.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public EdFiLearningObjective parentLearningObjectiveReference(EdFiLearningObjectiveReference parentLearningObjectiveReference) {
    
    this.parentLearningObjectiveReference = parentLearningObjectiveReference;
    return this;
  }

   /**
   * Get parentLearningObjectiveReference
   * @return parentLearningObjectiveReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiLearningObjectiveReference getParentLearningObjectiveReference() {
    return parentLearningObjectiveReference;
  }


  public void setParentLearningObjectiveReference(EdFiLearningObjectiveReference parentLearningObjectiveReference) {
    this.parentLearningObjectiveReference = parentLearningObjectiveReference;
  }


  public EdFiLearningObjective contentStandard(EdFiLearningObjectiveContentStandard contentStandard) {
    
    this.contentStandard = contentStandard;
    return this;
  }

   /**
   * Get contentStandard
   * @return contentStandard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiLearningObjectiveContentStandard getContentStandard() {
    return contentStandard;
  }


  public void setContentStandard(EdFiLearningObjectiveContentStandard contentStandard) {
    this.contentStandard = contentStandard;
  }


  public EdFiLearningObjective description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the LearningObjective.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the LearningObjective.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EdFiLearningObjective gradeLevels(List<EdFiLearningObjectiveGradeLevel> gradeLevels) {
    
    this.gradeLevels = gradeLevels;
    return this;
  }

  public EdFiLearningObjective addGradeLevelsItem(EdFiLearningObjectiveGradeLevel gradeLevelsItem) {
    if (this.gradeLevels == null) {
      this.gradeLevels = new ArrayList<EdFiLearningObjectiveGradeLevel>();
    }
    this.gradeLevels.add(gradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of learningObjectiveGradeLevels. The grade level for which the LearningObjective is targeted. The semantics of null is assumed to mean that the learning objective is not associated with any grade level.
   * @return gradeLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of learningObjectiveGradeLevels. The grade level for which the LearningObjective is targeted. The semantics of null is assumed to mean that the learning objective is not associated with any grade level.")

  public List<EdFiLearningObjectiveGradeLevel> getGradeLevels() {
    return gradeLevels;
  }


  public void setGradeLevels(List<EdFiLearningObjectiveGradeLevel> gradeLevels) {
    this.gradeLevels = gradeLevels;
  }


  public EdFiLearningObjective learningStandards(List<EdFiLearningObjectiveLearningStandard> learningStandards) {
    
    this.learningStandards = learningStandards;
    return this;
  }

  public EdFiLearningObjective addLearningStandardsItem(EdFiLearningObjectiveLearningStandard learningStandardsItem) {
    if (this.learningStandards == null) {
      this.learningStandards = new ArrayList<EdFiLearningObjectiveLearningStandard>();
    }
    this.learningStandards.add(learningStandardsItem);
    return this;
  }

   /**
   * An unordered collection of learningObjectiveLearningStandards. LearningStandard(s) included in this objective.
   * @return learningStandards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of learningObjectiveLearningStandards. LearningStandard(s) included in this objective.")

  public List<EdFiLearningObjectiveLearningStandard> getLearningStandards() {
    return learningStandards;
  }


  public void setLearningStandards(List<EdFiLearningObjectiveLearningStandard> learningStandards) {
    this.learningStandards = learningStandards;
  }


  public EdFiLearningObjective nomenclature(String nomenclature) {
    
    this.nomenclature = nomenclature;
    return this;
  }

   /**
   * Reflects the specific nomenclature used for the LearningObjective.
   * @return nomenclature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reflects the specific nomenclature used for the LearningObjective.")

  public String getNomenclature() {
    return nomenclature;
  }


  public void setNomenclature(String nomenclature) {
    this.nomenclature = nomenclature;
  }


  public EdFiLearningObjective objective(String objective) {
    
    this.objective = objective;
    return this;
  }

   /**
   * The designated title of the LearningObjective.
   * @return objective
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The designated title of the LearningObjective.")

  public String getObjective() {
    return objective;
  }


  public void setObjective(String objective) {
    this.objective = objective;
  }


  public EdFiLearningObjective successCriteria(String successCriteria) {
    
    this.successCriteria = successCriteria;
    return this;
  }

   /**
   * One or more statements that describes the criteria used by teachers and students to check for attainment of a learning objective. This criteria gives clear indications as to the degree to which learning is moving through the Zone or Proximal Development toward independent achievement of the LearningObjective.
   * @return successCriteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more statements that describes the criteria used by teachers and students to check for attainment of a learning objective. This criteria gives clear indications as to the degree to which learning is moving through the Zone or Proximal Development toward independent achievement of the LearningObjective.")

  public String getSuccessCriteria() {
    return successCriteria;
  }


  public void setSuccessCriteria(String successCriteria) {
    this.successCriteria = successCriteria;
  }


  public EdFiLearningObjective etag(String etag) {
    
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
    EdFiLearningObjective edFiLearningObjective = (EdFiLearningObjective) o;
    return Objects.equals(this.id, edFiLearningObjective.id) &&
        Objects.equals(this.academicSubjects, edFiLearningObjective.academicSubjects) &&
        Objects.equals(this.learningObjectiveId, edFiLearningObjective.learningObjectiveId) &&
        Objects.equals(this.namespace, edFiLearningObjective.namespace) &&
        Objects.equals(this.parentLearningObjectiveReference, edFiLearningObjective.parentLearningObjectiveReference) &&
        Objects.equals(this.contentStandard, edFiLearningObjective.contentStandard) &&
        Objects.equals(this.description, edFiLearningObjective.description) &&
        Objects.equals(this.gradeLevels, edFiLearningObjective.gradeLevels) &&
        Objects.equals(this.learningStandards, edFiLearningObjective.learningStandards) &&
        Objects.equals(this.nomenclature, edFiLearningObjective.nomenclature) &&
        Objects.equals(this.objective, edFiLearningObjective.objective) &&
        Objects.equals(this.successCriteria, edFiLearningObjective.successCriteria) &&
        Objects.equals(this.etag, edFiLearningObjective.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, academicSubjects, learningObjectiveId, namespace, parentLearningObjectiveReference, contentStandard, description, gradeLevels, learningStandards, nomenclature, objective, successCriteria, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiLearningObjective {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    academicSubjects: ").append(toIndentedString(academicSubjects)).append("\n");
    sb.append("    learningObjectiveId: ").append(toIndentedString(learningObjectiveId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parentLearningObjectiveReference: ").append(toIndentedString(parentLearningObjectiveReference)).append("\n");
    sb.append("    contentStandard: ").append(toIndentedString(contentStandard)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gradeLevels: ").append(toIndentedString(gradeLevels)).append("\n");
    sb.append("    learningStandards: ").append(toIndentedString(learningStandards)).append("\n");
    sb.append("    nomenclature: ").append(toIndentedString(nomenclature)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    successCriteria: ").append(toIndentedString(successCriteria)).append("\n");
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

