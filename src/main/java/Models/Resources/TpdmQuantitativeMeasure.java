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
 * TpdmQuantitativeMeasure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmQuantitativeMeasure {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_QUANTITATIVE_MEASURE_IDENTIFIER = "quantitativeMeasureIdentifier";
  @SerializedName(SERIALIZED_NAME_QUANTITATIVE_MEASURE_IDENTIFIER)
  private String quantitativeMeasureIdentifier;

  public static final String SERIALIZED_NAME_EVALUATION_ELEMENT_REFERENCE = "evaluationElementReference";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ELEMENT_REFERENCE)
  private TpdmEvaluationElementReference evaluationElementReference;

  public static final String SERIALIZED_NAME_QUANTITATIVE_MEASURE_DATATYPE_DESCRIPTOR = "quantitativeMeasureDatatypeDescriptor";
  @SerializedName(SERIALIZED_NAME_QUANTITATIVE_MEASURE_DATATYPE_DESCRIPTOR)
  private String quantitativeMeasureDatatypeDescriptor;

  public static final String SERIALIZED_NAME_QUANTITATIVE_MEASURE_TYPE_DESCRIPTOR = "quantitativeMeasureTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_QUANTITATIVE_MEASURE_TYPE_DESCRIPTOR)
  private String quantitativeMeasureTypeDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmQuantitativeMeasure() { 
  }

  public TpdmQuantitativeMeasure id(String id) {
    
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


  public TpdmQuantitativeMeasure quantitativeMeasureIdentifier(String quantitativeMeasureIdentifier) {
    
    this.quantitativeMeasureIdentifier = quantitativeMeasureIdentifier;
    return this;
  }

   /**
   * An assigned unique identifier for the quantitative measure.
   * @return quantitativeMeasureIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An assigned unique identifier for the quantitative measure.")

  public String getQuantitativeMeasureIdentifier() {
    return quantitativeMeasureIdentifier;
  }


  public void setQuantitativeMeasureIdentifier(String quantitativeMeasureIdentifier) {
    this.quantitativeMeasureIdentifier = quantitativeMeasureIdentifier;
  }


  public TpdmQuantitativeMeasure evaluationElementReference(TpdmEvaluationElementReference evaluationElementReference) {
    
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


  public TpdmQuantitativeMeasure quantitativeMeasureDatatypeDescriptor(String quantitativeMeasureDatatypeDescriptor) {
    
    this.quantitativeMeasureDatatypeDescriptor = quantitativeMeasureDatatypeDescriptor;
    return this;
  }

   /**
   * The datatype of the result. The results can be expressed as a number, percentile, range, level, etc.
   * @return quantitativeMeasureDatatypeDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datatype of the result. The results can be expressed as a number, percentile, range, level, etc.")

  public String getQuantitativeMeasureDatatypeDescriptor() {
    return quantitativeMeasureDatatypeDescriptor;
  }


  public void setQuantitativeMeasureDatatypeDescriptor(String quantitativeMeasureDatatypeDescriptor) {
    this.quantitativeMeasureDatatypeDescriptor = quantitativeMeasureDatatypeDescriptor;
  }


  public TpdmQuantitativeMeasure quantitativeMeasureTypeDescriptor(String quantitativeMeasureTypeDescriptor) {
    
    this.quantitativeMeasureTypeDescriptor = quantitativeMeasureTypeDescriptor;
    return this;
  }

   /**
   * The type of the quantitative measure (e.g., achievement, growth).
   * @return quantitativeMeasureTypeDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the quantitative measure (e.g., achievement, growth).")

  public String getQuantitativeMeasureTypeDescriptor() {
    return quantitativeMeasureTypeDescriptor;
  }


  public void setQuantitativeMeasureTypeDescriptor(String quantitativeMeasureTypeDescriptor) {
    this.quantitativeMeasureTypeDescriptor = quantitativeMeasureTypeDescriptor;
  }


  public TpdmQuantitativeMeasure etag(String etag) {
    
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
    TpdmQuantitativeMeasure tpdmQuantitativeMeasure = (TpdmQuantitativeMeasure) o;
    return Objects.equals(this.id, tpdmQuantitativeMeasure.id) &&
        Objects.equals(this.quantitativeMeasureIdentifier, tpdmQuantitativeMeasure.quantitativeMeasureIdentifier) &&
        Objects.equals(this.evaluationElementReference, tpdmQuantitativeMeasure.evaluationElementReference) &&
        Objects.equals(this.quantitativeMeasureDatatypeDescriptor, tpdmQuantitativeMeasure.quantitativeMeasureDatatypeDescriptor) &&
        Objects.equals(this.quantitativeMeasureTypeDescriptor, tpdmQuantitativeMeasure.quantitativeMeasureTypeDescriptor) &&
        Objects.equals(this.etag, tpdmQuantitativeMeasure.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantitativeMeasureIdentifier, evaluationElementReference, quantitativeMeasureDatatypeDescriptor, quantitativeMeasureTypeDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmQuantitativeMeasure {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantitativeMeasureIdentifier: ").append(toIndentedString(quantitativeMeasureIdentifier)).append("\n");
    sb.append("    evaluationElementReference: ").append(toIndentedString(evaluationElementReference)).append("\n");
    sb.append("    quantitativeMeasureDatatypeDescriptor: ").append(toIndentedString(quantitativeMeasureDatatypeDescriptor)).append("\n");
    sb.append("    quantitativeMeasureTypeDescriptor: ").append(toIndentedString(quantitativeMeasureTypeDescriptor)).append("\n");
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

