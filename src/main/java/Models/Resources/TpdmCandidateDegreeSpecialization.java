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
 * TpdmCandidateDegreeSpecialization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class TpdmCandidateDegreeSpecialization {
  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_MAJOR_SPECIALIZATION = "majorSpecialization";
  @SerializedName(SERIALIZED_NAME_MAJOR_SPECIALIZATION)
  private String majorSpecialization;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_MINOR_SPECIALIZATION = "minorSpecialization";
  @SerializedName(SERIALIZED_NAME_MINOR_SPECIALIZATION)
  private String minorSpecialization;

  public TpdmCandidateDegreeSpecialization() { 
  }

  public TpdmCandidateDegreeSpecialization beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The month, day, and year on which the Teacher Candidate first declared specialization.
   * @return beginDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The month, day, and year on which the Teacher Candidate first declared specialization.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public TpdmCandidateDegreeSpecialization majorSpecialization(String majorSpecialization) {
    
    this.majorSpecialization = majorSpecialization;
    return this;
  }

   /**
   * The major area for a degree or area of specialization for a certificate.
   * @return majorSpecialization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The major area for a degree or area of specialization for a certificate.")

  public String getMajorSpecialization() {
    return majorSpecialization;
  }


  public void setMajorSpecialization(String majorSpecialization) {
    this.majorSpecialization = majorSpecialization;
  }


  public TpdmCandidateDegreeSpecialization endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The month, day, and year on which the Teacher Candidate exited the declared specialization.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month, day, and year on which the Teacher Candidate exited the declared specialization.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public TpdmCandidateDegreeSpecialization minorSpecialization(String minorSpecialization) {
    
    this.minorSpecialization = minorSpecialization;
    return this;
  }

   /**
   * The major area for a degree or area of specialization for a certificate.
   * @return minorSpecialization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The major area for a degree or area of specialization for a certificate.")

  public String getMinorSpecialization() {
    return minorSpecialization;
  }


  public void setMinorSpecialization(String minorSpecialization) {
    this.minorSpecialization = minorSpecialization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TpdmCandidateDegreeSpecialization tpdmCandidateDegreeSpecialization = (TpdmCandidateDegreeSpecialization) o;
    return Objects.equals(this.beginDate, tpdmCandidateDegreeSpecialization.beginDate) &&
        Objects.equals(this.majorSpecialization, tpdmCandidateDegreeSpecialization.majorSpecialization) &&
        Objects.equals(this.endDate, tpdmCandidateDegreeSpecialization.endDate) &&
        Objects.equals(this.minorSpecialization, tpdmCandidateDegreeSpecialization.minorSpecialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, majorSpecialization, endDate, minorSpecialization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TpdmCandidateDegreeSpecialization {\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    majorSpecialization: ").append(toIndentedString(majorSpecialization)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    minorSpecialization: ").append(toIndentedString(minorSpecialization)).append("\n");
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
