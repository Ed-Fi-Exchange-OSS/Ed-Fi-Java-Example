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
import Models.Resources.EdFiStaffReference;
import Models.Resources.TpdmEducatorPreparationProgramReference;
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
 * TpdmStaffEducatorPreparationProgramAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmStaffEducatorPreparationProgramAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EDUCATOR_PREPARATION_PROGRAM_REFERENCE = "educatorPreparationProgramReference";
  @SerializedName(SERIALIZED_NAME_EDUCATOR_PREPARATION_PROGRAM_REFERENCE)
  private TpdmEducatorPreparationProgramReference educatorPreparationProgramReference;

  public static final String SERIALIZED_NAME_STAFF_REFERENCE = "staffReference";
  @SerializedName(SERIALIZED_NAME_STAFF_REFERENCE)
  private EdFiStaffReference staffReference;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_COMPLETER = "completer";
  @SerializedName(SERIALIZED_NAME_COMPLETER)
  private Boolean completer;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public TpdmStaffEducatorPreparationProgramAssociation() { 
  }

  public TpdmStaffEducatorPreparationProgramAssociation id(String id) {
    
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


  public TpdmStaffEducatorPreparationProgramAssociation educatorPreparationProgramReference(TpdmEducatorPreparationProgramReference educatorPreparationProgramReference) {
    
    this.educatorPreparationProgramReference = educatorPreparationProgramReference;
    return this;
  }

   /**
   * Get educatorPreparationProgramReference
   * @return educatorPreparationProgramReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TpdmEducatorPreparationProgramReference getEducatorPreparationProgramReference() {
    return educatorPreparationProgramReference;
  }


  public void setEducatorPreparationProgramReference(TpdmEducatorPreparationProgramReference educatorPreparationProgramReference) {
    this.educatorPreparationProgramReference = educatorPreparationProgramReference;
  }


  public TpdmStaffEducatorPreparationProgramAssociation staffReference(EdFiStaffReference staffReference) {
    
    this.staffReference = staffReference;
    return this;
  }

   /**
   * Get staffReference
   * @return staffReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiStaffReference getStaffReference() {
    return staffReference;
  }


  public void setStaffReference(EdFiStaffReference staffReference) {
    this.staffReference = staffReference;
  }


  public TpdmStaffEducatorPreparationProgramAssociation beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Start date for the association of staff to this program.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Start date for the association of staff to this program.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public TpdmStaffEducatorPreparationProgramAssociation completer(Boolean completer) {
    
    this.completer = completer;
    return this;
  }

   /**
   * Indicator of whether the staff completed the EducatorPreparationProgram.
   * @return completer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator of whether the staff completed the EducatorPreparationProgram.")

  public Boolean getCompleter() {
    return completer;
  }


  public void setCompleter(Boolean completer) {
    this.completer = completer;
  }


  public TpdmStaffEducatorPreparationProgramAssociation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End date for the association of staff to this program.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date for the association of staff to this program.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public TpdmStaffEducatorPreparationProgramAssociation etag(String etag) {
    
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
    TpdmStaffEducatorPreparationProgramAssociation tpdmStaffEducatorPreparationProgramAssociation = (TpdmStaffEducatorPreparationProgramAssociation) o;
    return Objects.equals(this.id, tpdmStaffEducatorPreparationProgramAssociation.id) &&
        Objects.equals(this.educatorPreparationProgramReference, tpdmStaffEducatorPreparationProgramAssociation.educatorPreparationProgramReference) &&
        Objects.equals(this.staffReference, tpdmStaffEducatorPreparationProgramAssociation.staffReference) &&
        Objects.equals(this.beginDate, tpdmStaffEducatorPreparationProgramAssociation.beginDate) &&
        Objects.equals(this.completer, tpdmStaffEducatorPreparationProgramAssociation.completer) &&
        Objects.equals(this.endDate, tpdmStaffEducatorPreparationProgramAssociation.endDate) &&
        Objects.equals(this.etag, tpdmStaffEducatorPreparationProgramAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, educatorPreparationProgramReference, staffReference, beginDate, completer, endDate, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmStaffEducatorPreparationProgramAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    educatorPreparationProgramReference: ").append(toIndentedString(educatorPreparationProgramReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    completer: ").append(toIndentedString(completer)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

