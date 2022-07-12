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
import Models.Resources.EdFiEducationOrganizationReference;
import Models.Resources.EdFiLearningStandardContentStandardAuthor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * EdFiLearningStandardContentStandard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiLearningStandardContentStandard {
  public static final String SERIALIZED_NAME_PUBLICATION_STATUS_DESCRIPTOR = "publicationStatusDescriptor";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_STATUS_DESCRIPTOR)
  private String publicationStatusDescriptor;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private LocalDate publicationDate;

  public static final String SERIALIZED_NAME_PUBLICATION_YEAR = "publicationYear";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_YEAR)
  private Integer publicationYear;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_MANDATING_EDUCATION_ORGANIZATION_REFERENCE = "mandatingEducationOrganizationReference";
  @SerializedName(SERIALIZED_NAME_MANDATING_EDUCATION_ORGANIZATION_REFERENCE)
  private EdFiEducationOrganizationReference mandatingEducationOrganizationReference;

  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<EdFiLearningStandardContentStandardAuthor> authors = null;

  public EdFiLearningStandardContentStandard() { 
  }

  public EdFiLearningStandardContentStandard publicationStatusDescriptor(String publicationStatusDescriptor) {
    
    this.publicationStatusDescriptor = publicationStatusDescriptor;
    return this;
  }

   /**
   * The publication status of the document (i.e., Adopted, Draft, Published, Deprecated, Unknown).
   * @return publicationStatusDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The publication status of the document (i.e., Adopted, Draft, Published, Deprecated, Unknown).")

  public String getPublicationStatusDescriptor() {
    return publicationStatusDescriptor;
  }


  public void setPublicationStatusDescriptor(String publicationStatusDescriptor) {
    this.publicationStatusDescriptor = publicationStatusDescriptor;
  }


  public EdFiLearningStandardContentStandard beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * The beginning of the period during which this learning standard document is intended for use.
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The beginning of the period during which this learning standard document is intended for use.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiLearningStandardContentStandard endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end of the period during which this learning standard document is intended for use.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end of the period during which this learning standard document is intended for use.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiLearningStandardContentStandard publicationDate(LocalDate publicationDate) {
    
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * The date on which this content was first published.
   * @return publicationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which this content was first published.")

  public LocalDate getPublicationDate() {
    return publicationDate;
  }


  public void setPublicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
  }


  public EdFiLearningStandardContentStandard publicationYear(Integer publicationYear) {
    
    this.publicationYear = publicationYear;
    return this;
  }

   /**
   * The year at which this content was first published.
   * @return publicationYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year at which this content was first published.")

  public Integer getPublicationYear() {
    return publicationYear;
  }


  public void setPublicationYear(Integer publicationYear) {
    this.publicationYear = publicationYear;
  }


  public EdFiLearningStandardContentStandard title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The name of the content standard, for example Common Core.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the content standard, for example Common Core.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public EdFiLearningStandardContentStandard uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * An unambiguous reference to the standards using a network-resolvable URI.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unambiguous reference to the standards using a network-resolvable URI.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public EdFiLearningStandardContentStandard version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version identifier for the content.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version identifier for the content.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public EdFiLearningStandardContentStandard mandatingEducationOrganizationReference(EdFiEducationOrganizationReference mandatingEducationOrganizationReference) {
    
    this.mandatingEducationOrganizationReference = mandatingEducationOrganizationReference;
    return this;
  }

   /**
   * Get mandatingEducationOrganizationReference
   * @return mandatingEducationOrganizationReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiEducationOrganizationReference getMandatingEducationOrganizationReference() {
    return mandatingEducationOrganizationReference;
  }


  public void setMandatingEducationOrganizationReference(EdFiEducationOrganizationReference mandatingEducationOrganizationReference) {
    this.mandatingEducationOrganizationReference = mandatingEducationOrganizationReference;
  }


  public EdFiLearningStandardContentStandard authors(List<EdFiLearningStandardContentStandardAuthor> authors) {
    
    this.authors = authors;
    return this;
  }

  public EdFiLearningStandardContentStandard addAuthorsItem(EdFiLearningStandardContentStandardAuthor authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<EdFiLearningStandardContentStandardAuthor>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * An unordered collection of learningStandardContentStandardAuthors. The person or organization chiefly responsible for the intellectual content of the standard.
   * @return authors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of learningStandardContentStandardAuthors. The person or organization chiefly responsible for the intellectual content of the standard.")

  public List<EdFiLearningStandardContentStandardAuthor> getAuthors() {
    return authors;
  }


  public void setAuthors(List<EdFiLearningStandardContentStandardAuthor> authors) {
    this.authors = authors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdFiLearningStandardContentStandard edFiLearningStandardContentStandard = (EdFiLearningStandardContentStandard) o;
    return Objects.equals(this.publicationStatusDescriptor, edFiLearningStandardContentStandard.publicationStatusDescriptor) &&
        Objects.equals(this.beginDate, edFiLearningStandardContentStandard.beginDate) &&
        Objects.equals(this.endDate, edFiLearningStandardContentStandard.endDate) &&
        Objects.equals(this.publicationDate, edFiLearningStandardContentStandard.publicationDate) &&
        Objects.equals(this.publicationYear, edFiLearningStandardContentStandard.publicationYear) &&
        Objects.equals(this.title, edFiLearningStandardContentStandard.title) &&
        Objects.equals(this.uri, edFiLearningStandardContentStandard.uri) &&
        Objects.equals(this.version, edFiLearningStandardContentStandard.version) &&
        Objects.equals(this.mandatingEducationOrganizationReference, edFiLearningStandardContentStandard.mandatingEducationOrganizationReference) &&
        Objects.equals(this.authors, edFiLearningStandardContentStandard.authors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationStatusDescriptor, beginDate, endDate, publicationDate, publicationYear, title, uri, version, mandatingEducationOrganizationReference, authors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiLearningStandardContentStandard {\n");
    sb.append("    publicationStatusDescriptor: ").append(toIndentedString(publicationStatusDescriptor)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    publicationYear: ").append(toIndentedString(publicationYear)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    mandatingEducationOrganizationReference: ").append(toIndentedString(mandatingEducationOrganizationReference)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
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

