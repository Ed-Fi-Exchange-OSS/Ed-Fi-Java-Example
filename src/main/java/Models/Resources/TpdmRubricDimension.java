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
import Models.Resources.TpdmEvaluationElementReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TpdmRubricDimension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmRubricDimension {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RUBRIC_RATING = "rubricRating";
  @SerializedName(SERIALIZED_NAME_RUBRIC_RATING)
  private Integer rubricRating;

  public static final String SERIALIZED_NAME_EVALUATION_ELEMENT_REFERENCE = "evaluationElementReference";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ELEMENT_REFERENCE)
  private TpdmEvaluationElementReference evaluationElementReference;

  public static final String SERIALIZED_NAME_CRITERION_DESCRIPTION = "criterionDescription";
  @SerializedName(SERIALIZED_NAME_CRITERION_DESCRIPTION)
  private String criterionDescription;

  public static final String SERIALIZED_NAME_DIMENSION_ORDER = "dimensionOrder";
  @SerializedName(SERIALIZED_NAME_DIMENSION_ORDER)
  private Integer dimensionOrder;

  public static final String SERIALIZED_NAME_RUBRIC_RATING_LEVEL_DESCRIPTOR = "rubricRatingLevelDescriptor";
  @SerializedName(SERIALIZED_NAME_RUBRIC_RATING_LEVEL_DESCRIPTOR)
  private String rubricRatingLevelDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmRubricDimension() { 
  }

  public TpdmRubricDimension id(String id) {
    
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


  public TpdmRubricDimension rubricRating(Integer rubricRating) {
    
    this.rubricRating = rubricRating;
    return this;
  }

   /**
   * The rating achieved for the rubric dimension.
   * @return rubricRating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The rating achieved for the rubric dimension.")

  public Integer getRubricRating() {
    return rubricRating;
  }


  public void setRubricRating(Integer rubricRating) {
    this.rubricRating = rubricRating;
  }


  public TpdmRubricDimension evaluationElementReference(TpdmEvaluationElementReference evaluationElementReference) {
    
    this.evaluationElementReference = evaluationElementReference;
    return this;
  }

   /**
   * Get evaluationElementReference
   * @return evaluationElementReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmEvaluationElementReference getEvaluationElementReference() {
    return evaluationElementReference;
  }


  public void setEvaluationElementReference(TpdmEvaluationElementReference evaluationElementReference) {
    this.evaluationElementReference = evaluationElementReference;
  }


  public TpdmRubricDimension criterionDescription(String criterionDescription) {
    
    this.criterionDescription = criterionDescription;
    return this;
  }

   /**
   * The criterion description for the rubric dimension.
   * @return criterionDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The criterion description for the rubric dimension.")

  public String getCriterionDescription() {
    return criterionDescription;
  }


  public void setCriterionDescription(String criterionDescription) {
    this.criterionDescription = criterionDescription;
  }


  public TpdmRubricDimension dimensionOrder(Integer dimensionOrder) {
    
    this.dimensionOrder = dimensionOrder;
    return this;
  }

   /**
   * The order for the rubric dimension.
   * @return dimensionOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order for the rubric dimension.")

  public Integer getDimensionOrder() {
    return dimensionOrder;
  }


  public void setDimensionOrder(Integer dimensionOrder) {
    this.dimensionOrder = dimensionOrder;
  }


  public TpdmRubricDimension rubricRatingLevelDescriptor(String rubricRatingLevelDescriptor) {
    
    this.rubricRatingLevelDescriptor = rubricRatingLevelDescriptor;
    return this;
  }

   /**
   * The rating level achieved for the rubric dimension.
   * @return rubricRatingLevelDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rating level achieved for the rubric dimension.")

  public String getRubricRatingLevelDescriptor() {
    return rubricRatingLevelDescriptor;
  }


  public void setRubricRatingLevelDescriptor(String rubricRatingLevelDescriptor) {
    this.rubricRatingLevelDescriptor = rubricRatingLevelDescriptor;
  }


  public TpdmRubricDimension etag(String etag) {
    
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
    TpdmRubricDimension tpdmRubricDimension = (TpdmRubricDimension) o;
    return Objects.equals(this.id, tpdmRubricDimension.id) &&
        Objects.equals(this.rubricRating, tpdmRubricDimension.rubricRating) &&
        Objects.equals(this.evaluationElementReference, tpdmRubricDimension.evaluationElementReference) &&
        Objects.equals(this.criterionDescription, tpdmRubricDimension.criterionDescription) &&
        Objects.equals(this.dimensionOrder, tpdmRubricDimension.dimensionOrder) &&
        Objects.equals(this.rubricRatingLevelDescriptor, tpdmRubricDimension.rubricRatingLevelDescriptor) &&
        Objects.equals(this.etag, tpdmRubricDimension.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rubricRating, evaluationElementReference, criterionDescription, dimensionOrder, rubricRatingLevelDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmRubricDimension {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rubricRating: ").append(toIndentedString(rubricRating)).append("\n");
    sb.append("    evaluationElementReference: ").append(toIndentedString(evaluationElementReference)).append("\n");
    sb.append("    criterionDescription: ").append(toIndentedString(criterionDescription)).append("\n");
    sb.append("    dimensionOrder: ").append(toIndentedString(dimensionOrder)).append("\n");
    sb.append("    rubricRatingLevelDescriptor: ").append(toIndentedString(rubricRatingLevelDescriptor)).append("\n");
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

