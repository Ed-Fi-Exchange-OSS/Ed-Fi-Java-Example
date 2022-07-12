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
import Models.Resources.EdFiSchoolReference;
import Models.Resources.EdFiStudentReference;
import Models.Resources.TpdmEducatorPreparationProgramReference;
import Models.Resources.TpdmFieldworkExperienceCoteaching;
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
 * TpdmFieldworkExperience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmFieldworkExperience {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_FIELDWORK_IDENTIFIER = "fieldworkIdentifier";
  @SerializedName(SERIALIZED_NAME_FIELDWORK_IDENTIFIER)
  private String fieldworkIdentifier;

  public static final String SERIALIZED_NAME_EDUCATOR_PREPARATION_PROGRAM_REFERENCE = "educatorPreparationProgramReference";
  @SerializedName(SERIALIZED_NAME_EDUCATOR_PREPARATION_PROGRAM_REFERENCE)
  private TpdmEducatorPreparationProgramReference educatorPreparationProgramReference;

  public static final String SERIALIZED_NAME_SCHOOL_REFERENCE = "schoolReference";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REFERENCE)
  private EdFiSchoolReference schoolReference;

  public static final String SERIALIZED_NAME_STUDENT_REFERENCE = "studentReference";
  @SerializedName(SERIALIZED_NAME_STUDENT_REFERENCE)
  private EdFiStudentReference studentReference;

  public static final String SERIALIZED_NAME_COTEACHING = "coteaching";
  @SerializedName(SERIALIZED_NAME_COTEACHING)
  private TpdmFieldworkExperienceCoteaching coteaching;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_FIELDWORK_TYPE_DESCRIPTOR = "fieldworkTypeDescriptor";
  @SerializedName(SERIALIZED_NAME_FIELDWORK_TYPE_DESCRIPTOR)
  private String fieldworkTypeDescriptor;

  public static final String SERIALIZED_NAME_HOURS_COMPLETED = "hoursCompleted";
  @SerializedName(SERIALIZED_NAME_HOURS_COMPLETED)
  private Double hoursCompleted;

  public static final String SERIALIZED_NAME_PROGRAM_GATEWAY_DESCRIPTOR = "programGatewayDescriptor";
  @SerializedName(SERIALIZED_NAME_PROGRAM_GATEWAY_DESCRIPTOR)
  private String programGatewayDescriptor;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmFieldworkExperience() { 
  }

  public TpdmFieldworkExperience id(String id) {
    
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


  public TpdmFieldworkExperience beginDate(LocalDate beginDate) {
    
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


  public TpdmFieldworkExperience fieldworkIdentifier(String fieldworkIdentifier) {
    
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


  public TpdmFieldworkExperience educatorPreparationProgramReference(TpdmEducatorPreparationProgramReference educatorPreparationProgramReference) {
    
    this.educatorPreparationProgramReference = educatorPreparationProgramReference;
    return this;
  }

   /**
   * Get educatorPreparationProgramReference
   * @return educatorPreparationProgramReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TpdmEducatorPreparationProgramReference getEducatorPreparationProgramReference() {
    return educatorPreparationProgramReference;
  }


  public void setEducatorPreparationProgramReference(TpdmEducatorPreparationProgramReference educatorPreparationProgramReference) {
    this.educatorPreparationProgramReference = educatorPreparationProgramReference;
  }


  public TpdmFieldworkExperience schoolReference(EdFiSchoolReference schoolReference) {
    
    this.schoolReference = schoolReference;
    return this;
  }

   /**
   * Get schoolReference
   * @return schoolReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiSchoolReference getSchoolReference() {
    return schoolReference;
  }


  public void setSchoolReference(EdFiSchoolReference schoolReference) {
    this.schoolReference = schoolReference;
  }


  public TpdmFieldworkExperience studentReference(EdFiStudentReference studentReference) {
    
    this.studentReference = studentReference;
    return this;
  }

   /**
   * Get studentReference
   * @return studentReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiStudentReference getStudentReference() {
    return studentReference;
  }


  public void setStudentReference(EdFiStudentReference studentReference) {
    this.studentReference = studentReference;
  }


  public TpdmFieldworkExperience coteaching(TpdmFieldworkExperienceCoteaching coteaching) {
    
    this.coteaching = coteaching;
    return this;
  }

   /**
   * Get coteaching
   * @return coteaching
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TpdmFieldworkExperienceCoteaching getCoteaching() {
    return coteaching;
  }


  public void setCoteaching(TpdmFieldworkExperienceCoteaching coteaching) {
    this.coteaching = coteaching;
  }


  public TpdmFieldworkExperience endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The month, day, and year on which the staff ends fieldwork.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month, day, and year on which the staff ends fieldwork.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public TpdmFieldworkExperience fieldworkTypeDescriptor(String fieldworkTypeDescriptor) {
    
    this.fieldworkTypeDescriptor = fieldworkTypeDescriptor;
    return this;
  }

   /**
   * The type of fieldwork being executed by a staff.
   * @return fieldworkTypeDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of fieldwork being executed by a staff.")

  public String getFieldworkTypeDescriptor() {
    return fieldworkTypeDescriptor;
  }


  public void setFieldworkTypeDescriptor(String fieldworkTypeDescriptor) {
    this.fieldworkTypeDescriptor = fieldworkTypeDescriptor;
  }


  public TpdmFieldworkExperience hoursCompleted(Double hoursCompleted) {
    
    this.hoursCompleted = hoursCompleted;
    return this;
  }

   /**
   * The number of hours completed during the fieldwork experience.
   * @return hoursCompleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of hours completed during the fieldwork experience.")

  public Double getHoursCompleted() {
    return hoursCompleted;
  }


  public void setHoursCompleted(Double hoursCompleted) {
    this.hoursCompleted = hoursCompleted;
  }


  public TpdmFieldworkExperience programGatewayDescriptor(String programGatewayDescriptor) {
    
    this.programGatewayDescriptor = programGatewayDescriptor;
    return this;
  }

   /**
   * The descriptor holds the program gateway that is associated with continuation in a program.
   * @return programGatewayDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptor holds the program gateway that is associated with continuation in a program.")

  public String getProgramGatewayDescriptor() {
    return programGatewayDescriptor;
  }


  public void setProgramGatewayDescriptor(String programGatewayDescriptor) {
    this.programGatewayDescriptor = programGatewayDescriptor;
  }


  public TpdmFieldworkExperience etag(String etag) {
    
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
    TpdmFieldworkExperience tpdmFieldworkExperience = (TpdmFieldworkExperience) o;
    return Objects.equals(this.id, tpdmFieldworkExperience.id) &&
        Objects.equals(this.beginDate, tpdmFieldworkExperience.beginDate) &&
        Objects.equals(this.fieldworkIdentifier, tpdmFieldworkExperience.fieldworkIdentifier) &&
        Objects.equals(this.educatorPreparationProgramReference, tpdmFieldworkExperience.educatorPreparationProgramReference) &&
        Objects.equals(this.schoolReference, tpdmFieldworkExperience.schoolReference) &&
        Objects.equals(this.studentReference, tpdmFieldworkExperience.studentReference) &&
        Objects.equals(this.coteaching, tpdmFieldworkExperience.coteaching) &&
        Objects.equals(this.endDate, tpdmFieldworkExperience.endDate) &&
        Objects.equals(this.fieldworkTypeDescriptor, tpdmFieldworkExperience.fieldworkTypeDescriptor) &&
        Objects.equals(this.hoursCompleted, tpdmFieldworkExperience.hoursCompleted) &&
        Objects.equals(this.programGatewayDescriptor, tpdmFieldworkExperience.programGatewayDescriptor) &&
        Objects.equals(this.etag, tpdmFieldworkExperience.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, beginDate, fieldworkIdentifier, educatorPreparationProgramReference, schoolReference, studentReference, coteaching, endDate, fieldworkTypeDescriptor, hoursCompleted, programGatewayDescriptor, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmFieldworkExperience {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    fieldworkIdentifier: ").append(toIndentedString(fieldworkIdentifier)).append("\n");
    sb.append("    educatorPreparationProgramReference: ").append(toIndentedString(educatorPreparationProgramReference)).append("\n");
    sb.append("    schoolReference: ").append(toIndentedString(schoolReference)).append("\n");
    sb.append("    studentReference: ").append(toIndentedString(studentReference)).append("\n");
    sb.append("    coteaching: ").append(toIndentedString(coteaching)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fieldworkTypeDescriptor: ").append(toIndentedString(fieldworkTypeDescriptor)).append("\n");
    sb.append("    hoursCompleted: ").append(toIndentedString(hoursCompleted)).append("\n");
    sb.append("    programGatewayDescriptor: ").append(toIndentedString(programGatewayDescriptor)).append("\n");
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
