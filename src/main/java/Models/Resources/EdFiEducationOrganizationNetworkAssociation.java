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
import Models.Resources.EdFiEducationOrganizationNetworkReference;
import Models.Resources.EdFiEducationOrganizationReference;
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
 * EdFiEducationOrganizationNetworkAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiEducationOrganizationNetworkAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EDUCATION_ORGANIZATION_NETWORK_REFERENCE = "educationOrganizationNetworkReference";
  @SerializedName(SERIALIZED_NAME_EDUCATION_ORGANIZATION_NETWORK_REFERENCE)
  private EdFiEducationOrganizationNetworkReference educationOrganizationNetworkReference;

  public static final String SERIALIZED_NAME_MEMBER_EDUCATION_ORGANIZATION_REFERENCE = "memberEducationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_MEMBER_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference memberEducationOrganizationReference;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiEducationOrganizationNetworkAssociation() { 
  }

  public EdFiEducationOrganizationNetworkAssociation id(String id) {
    
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


  public EdFiEducationOrganizationNetworkAssociation educationOrganizationNetworkReference(EdFiEducationOrganizationNetworkReference educationOrganizationNetworkReference) {
    
    this.educationOrganizationNetworkReference = educationOrganizationNetworkReference;
    return this;
  }

   /**
   * Get educationOrganizationNetworkReference
   * @return educationOrganizationNetworkReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiEducationOrganizationNetworkReference getEducationOrganizationNetworkReference() {
    return educationOrganizationNetworkReference;
  }


  public void setEducationOrganizationNetworkReference(EdFiEducationOrganizationNetworkReference educationOrganizationNetworkReference) {
    this.educationOrganizationNetworkReference = educationOrganizationNetworkReference;
  }


  public EdFiEducationOrganizationNetworkAssociation memberEducationOrganizationReference(EdFiEducationOrganizationReference memberEducationOrganizationReference) {
    
    this.memberEducationOrganizationReference = memberEducationOrganizationReference;
    return this;
  }

   /**
   * Get memberEducationOrganizationReference
   * @return memberEducationOrganizationReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiEducationOrganizationReference getMemberEducationOrganizationReference() {
    return memberEducationOrganizationReference;
  }


  public void setMemberEducationOrganizationReference(EdFiEducationOrganizationReference memberEducationOrganizationReference) {
    this.memberEducationOrganizationReference = memberEducationOrganizationReference;
  }


  public EdFiEducationOrganizationNetworkAssociation beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The date on which the EducationOrganization joined this network.
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the EducationOrganization joined this network.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiEducationOrganizationNetworkAssociation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date on which the EducationOrganization left this network.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the EducationOrganization left this network.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiEducationOrganizationNetworkAssociation etag(String etag) {
    
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
    EdFiEducationOrganizationNetworkAssociation edFiEducationOrganizationNetworkAssociation = (EdFiEducationOrganizationNetworkAssociation) o;
    return Objects.equals(this.id, edFiEducationOrganizationNetworkAssociation.id) &&
        Objects.equals(this.educationOrganizationNetworkReference, edFiEducationOrganizationNetworkAssociation.educationOrganizationNetworkReference) &&
        Objects.equals(this.memberEducationOrganizationReference, edFiEducationOrganizationNetworkAssociation.memberEducationOrganizationReference) &&
        Objects.equals(this.beginDate, edFiEducationOrganizationNetworkAssociation.beginDate) &&
        Objects.equals(this.endDate, edFiEducationOrganizationNetworkAssociation.endDate) &&
        Objects.equals(this.etag, edFiEducationOrganizationNetworkAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, educationOrganizationNetworkReference, memberEducationOrganizationReference, beginDate, endDate, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiEducationOrganizationNetworkAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    educationOrganizationNetworkReference: ").append(toIndentedString(educationOrganizationNetworkReference)).append("\n");
    sb.append("    memberEducationOrganizationReference: ").append(toIndentedString(memberEducationOrganizationReference)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
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

