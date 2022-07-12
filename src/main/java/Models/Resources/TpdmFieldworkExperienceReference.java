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
import org.threeten.bp.LocalDate;

/**
 * TpdmFieldworkExperienceReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmFieldworkExperienceReference {
  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_FIELDWORK_IDENTIFIER = "fieldworkIdentifier";
  @SerializedName(SERIALIZED_NAME_FIELDWORK_IDENTIFIER)
  private String fieldworkIdentifier;

  public static final String SERIALIZED_NAME_STUDENT_UNIQUE_ID = "studentUniqueId";
  @SerializedName(SERIALIZED_NAME_STUDENT_UNIQUE_ID)
  private String studentUniqueId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public TpdmFieldworkExperienceReference() { 
  }

  public TpdmFieldworkExperienceReference beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The month, day, and year on which the staff first starts fieldwork.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year on which the staff first starts fieldwork.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public TpdmFieldworkExperienceReference fieldworkIdentifier(String fieldworkIdentifier) {
    
    this.fieldworkIdentifier = fieldworkIdentifier;
    return this;
  }

   /**
   * The unique identifier for the fieldwork experience
   * @return fieldworkIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier for the fieldwork experience")

  public String getFieldworkIdentifier() {
    return fieldworkIdentifier;
  }


  public void setFieldworkIdentifier(String fieldworkIdentifier) {
    this.fieldworkIdentifier = fieldworkIdentifier;
  }


  public TpdmFieldworkExperienceReference studentUniqueId(String studentUniqueId) {
    
    this.studentUniqueId = studentUniqueId;
    return this;
  }

   /**
   * A unique alphanumeric code assigned to a student.
   * @return studentUniqueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique alphanumeric code assigned to a student.")

  public String getStudentUniqueId() {
    return studentUniqueId;
  }


  public void setStudentUniqueId(String studentUniqueId) {
    this.studentUniqueId = studentUniqueId;
  }


  public TpdmFieldworkExperienceReference link(Link link) {
    
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
    TpdmFieldworkExperienceReference tpdmFieldworkExperienceReference = (TpdmFieldworkExperienceReference) o;
    return Objects.equals(this.beginDate, tpdmFieldworkExperienceReference.beginDate) &&
        Objects.equals(this.fieldworkIdentifier, tpdmFieldworkExperienceReference.fieldworkIdentifier) &&
        Objects.equals(this.studentUniqueId, tpdmFieldworkExperienceReference.studentUniqueId) &&
        Objects.equals(this.link, tpdmFieldworkExperienceReference.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, fieldworkIdentifier, studentUniqueId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmFieldworkExperienceReference {\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    fieldworkIdentifier: ").append(toIndentedString(fieldworkIdentifier)).append("\n");
    sb.append("    studentUniqueId: ").append(toIndentedString(studentUniqueId)).append("\n");
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

