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
import org.threeten.bp.LocalDate;

/**
 * EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService {
  public static final String SERIALIZED_NAME_LANGUAGE_INSTRUCTION_PROGRAM_SERVICE_DESCRIPTOR = "languageInstructionProgramServiceDescriptor";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_INSTRUCTION_PROGRAM_SERVICE_DESCRIPTOR)
  private String languageInstructionProgramServiceDescriptor;

  public static final String SERIALIZED_NAME_PRIMARY_INDICATOR = "primaryIndicator";
  @SerializedName(SERIALIZED_NAME_PRIMARY_INDICATOR)
  private Boolean primaryIndicator;

  public static final String SERIALIZED_NAME_SERVICE_BEGIN_DATE = "serviceBeginDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_BEGIN_DATE)
  private LocalDate serviceBeginDate;

  public static final String SERIALIZED_NAME_SERVICE_END_DATE = "serviceEndDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_END_DATE)
  private LocalDate serviceEndDate;

  public EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService() { 
  }

  public EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService languageInstructionProgramServiceDescriptor(String languageInstructionProgramServiceDescriptor) {
    
    this.languageInstructionProgramServiceDescriptor = languageInstructionProgramServiceDescriptor;
    return this;
  }

   /**
   * Indicates the service being provided to the student by the Language Instruction Program.
   * @return languageInstructionProgramServiceDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates the service being provided to the student by the Language Instruction Program.")

  public String getLanguageInstructionProgramServiceDescriptor() {
    return languageInstructionProgramServiceDescriptor;
  }


  public void setLanguageInstructionProgramServiceDescriptor(String languageInstructionProgramServiceDescriptor) {
    this.languageInstructionProgramServiceDescriptor = languageInstructionProgramServiceDescriptor;
  }


  public EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService primaryIndicator(Boolean primaryIndicator) {
    
    this.primaryIndicator = primaryIndicator;
    return this;
  }

   /**
   * True if service is a primary service.
   * @return primaryIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if service is a primary service.")

  public Boolean getPrimaryIndicator() {
    return primaryIndicator;
  }


  public void setPrimaryIndicator(Boolean primaryIndicator) {
    this.primaryIndicator = primaryIndicator;
  }


  public EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService serviceBeginDate(LocalDate serviceBeginDate) {
    
    this.serviceBeginDate = serviceBeginDate;
    return this;
  }

   /**
   * First date the Student was in this option for the current school year.
   * @return serviceBeginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First date the Student was in this option for the current school year.")

  public LocalDate getServiceBeginDate() {
    return serviceBeginDate;
  }


  public void setServiceBeginDate(LocalDate serviceBeginDate) {
    this.serviceBeginDate = serviceBeginDate;
  }


  public EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService serviceEndDate(LocalDate serviceEndDate) {
    
    this.serviceEndDate = serviceEndDate;
    return this;
  }

   /**
   * Last date the Student was in this option for the current school year.
   * @return serviceEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last date the Student was in this option for the current school year.")

  public LocalDate getServiceEndDate() {
    return serviceEndDate;
  }


  public void setServiceEndDate(LocalDate serviceEndDate) {
    this.serviceEndDate = serviceEndDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService edFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService = (EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService) o;
    return Objects.equals(this.languageInstructionProgramServiceDescriptor, edFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService.languageInstructionProgramServiceDescriptor) &&
        Objects.equals(this.primaryIndicator, edFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService.primaryIndicator) &&
        Objects.equals(this.serviceBeginDate, edFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService.serviceBeginDate) &&
        Objects.equals(this.serviceEndDate, edFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService.serviceEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageInstructionProgramServiceDescriptor, primaryIndicator, serviceBeginDate, serviceEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentLanguageInstructionProgramAssociationLanguageInstructionProgramService {\n");
    sb.append("    languageInstructionProgramServiceDescriptor: ").append(toIndentedString(languageInstructionProgramServiceDescriptor)).append("\n");
    sb.append("    primaryIndicator: ").append(toIndentedString(primaryIndicator)).append("\n");
    sb.append("    serviceBeginDate: ").append(toIndentedString(serviceBeginDate)).append("\n");
    sb.append("    serviceEndDate: ").append(toIndentedString(serviceEndDate)).append("\n");
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
