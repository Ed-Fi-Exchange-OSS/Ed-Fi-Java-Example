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
 * EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService {
  public static final String SERIALIZED_NAME_TITLE_I_PART_A_PROGRAM_SERVICE_DESCRIPTOR = "titleIPartAProgramServiceDescriptor";
  @SerializedName(SERIALIZED_NAME_TITLE_I_PART_A_PROGRAM_SERVICE_DESCRIPTOR)
  private String titleIPartAProgramServiceDescriptor;

  public static final String SERIALIZED_NAME_PRIMARY_INDICATOR = "primaryIndicator";
  @SerializedName(SERIALIZED_NAME_PRIMARY_INDICATOR)
  private Boolean primaryIndicator;

  public static final String SERIALIZED_NAME_SERVICE_BEGIN_DATE = "serviceBeginDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_BEGIN_DATE)
  private LocalDate serviceBeginDate;

  public static final String SERIALIZED_NAME_SERVICE_END_DATE = "serviceEndDate";
  @SerializedName(SERIALIZED_NAME_SERVICE_END_DATE)
  private LocalDate serviceEndDate;

  public EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService() { 
  }

  public EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService titleIPartAProgramServiceDescriptor(String titleIPartAProgramServiceDescriptor) {
    
    this.titleIPartAProgramServiceDescriptor = titleIPartAProgramServiceDescriptor;
    return this;
  }

   /**
   * Indicates the service being provided to the student by the Title I Part A Program.
   * @return titleIPartAProgramServiceDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates the service being provided to the student by the Title I Part A Program.")

  public String getTitleIPartAProgramServiceDescriptor() {
    return titleIPartAProgramServiceDescriptor;
  }


  public void setTitleIPartAProgramServiceDescriptor(String titleIPartAProgramServiceDescriptor) {
    this.titleIPartAProgramServiceDescriptor = titleIPartAProgramServiceDescriptor;
  }


  public EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService primaryIndicator(Boolean primaryIndicator) {
    
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


  public EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService serviceBeginDate(LocalDate serviceBeginDate) {
    
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


  public EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService serviceEndDate(LocalDate serviceEndDate) {
    
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
    EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService edFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService = (EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService) o;
    return Objects.equals(this.titleIPartAProgramServiceDescriptor, edFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService.titleIPartAProgramServiceDescriptor) &&
        Objects.equals(this.primaryIndicator, edFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService.primaryIndicator) &&
        Objects.equals(this.serviceBeginDate, edFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService.serviceBeginDate) &&
        Objects.equals(this.serviceEndDate, edFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService.serviceEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titleIPartAProgramServiceDescriptor, primaryIndicator, serviceBeginDate, serviceEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStudentTitleIPartAProgramAssociationTitleIPartAProgramService {\n");
    sb.append("    titleIPartAProgramServiceDescriptor: ").append(toIndentedString(titleIPartAProgramServiceDescriptor)).append("\n");
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

