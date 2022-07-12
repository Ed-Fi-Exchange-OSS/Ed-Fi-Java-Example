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
 * EdFiSchoolCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiSchoolCategory {
  public static final String SERIALIZED_NAME_SCHOOL_CATEGORY_DESCRIPTOR = "schoolCategoryDescriptor";
  @SerializedName(SERIALIZED_NAME_SCHOOL_CATEGORY_DESCRIPTOR)
  private String schoolCategoryDescriptor;

  public EdFiSchoolCategory() { 
  }

  public EdFiSchoolCategory schoolCategoryDescriptor(String schoolCategoryDescriptor) {
    
    this.schoolCategoryDescriptor = schoolCategoryDescriptor;
    return this;
  }

   /**
   * The one or more categories of school. For example: High School, Middle School, and/or Elementary School.
   * @return schoolCategoryDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The one or more categories of school. For example: High School, Middle School, and/or Elementary School.")

  public String getSchoolCategoryDescriptor() {
    return schoolCategoryDescriptor;
  }


  public void setSchoolCategoryDescriptor(String schoolCategoryDescriptor) {
    this.schoolCategoryDescriptor = schoolCategoryDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiSchoolCategory edFiSchoolCategory = (EdFiSchoolCategory) o;
    return Objects.equals(this.schoolCategoryDescriptor, edFiSchoolCategory.schoolCategoryDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schoolCategoryDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiSchoolCategory {\n");
    sb.append("    schoolCategoryDescriptor: ").append(toIndentedString(schoolCategoryDescriptor)).append("\n");
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

