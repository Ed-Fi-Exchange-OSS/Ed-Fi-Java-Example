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


package Models.EnrollmentComposites;

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
 * SectionLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:13.622-05:00[America/Mexico_City]")
public class SectionLocation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHOOL_ID = "schoolId";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ID)
  private Integer schoolId;

  public static final String SERIALIZED_NAME_CLASSROOM_IDENTIFICATION_CODE = "classroomIdentificationCode";
  @SerializedName(SERIALIZED_NAME_CLASSROOM_IDENTIFICATION_CODE)
  private String classroomIdentificationCode;

  public SectionLocation() { 
  }

  public SectionLocation id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SectionLocation schoolId(Integer schoolId) {
    
    this.schoolId = schoolId;
    return this;
  }

   /**
   * The identifier assigned to a school.
   * @return schoolId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier assigned to a school.")

  public Integer getSchoolId() {
    return schoolId;
  }


  public void setSchoolId(Integer schoolId) {
    this.schoolId = schoolId;
  }


  public SectionLocation classroomIdentificationCode(String classroomIdentificationCode) {
    
    this.classroomIdentificationCode = classroomIdentificationCode;
    return this;
  }

   /**
   * A unique number or alphanumeric code assigned to a room by a school, school system, state, or other agency or entity.
   * @return classroomIdentificationCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique number or alphanumeric code assigned to a room by a school, school system, state, or other agency or entity.")

  public String getClassroomIdentificationCode() {
    return classroomIdentificationCode;
  }


  public void setClassroomIdentificationCode(String classroomIdentificationCode) {
    this.classroomIdentificationCode = classroomIdentificationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionLocation sectionLocation = (SectionLocation) o;
    return Objects.equals(this.id, sectionLocation.id) &&
        Objects.equals(this.schoolId, sectionLocation.schoolId) &&
        Objects.equals(this.classroomIdentificationCode, sectionLocation.classroomIdentificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schoolId, classroomIdentificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionLocation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    classroomIdentificationCode: ").append(toIndentedString(classroomIdentificationCode)).append("\n");
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

