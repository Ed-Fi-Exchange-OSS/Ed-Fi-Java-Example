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
import Models.Resources.EdFiEducationContentAppropriateGradeLevel;
import Models.Resources.EdFiEducationContentAppropriateSex;
import Models.Resources.EdFiEducationContentAuthor;
import Models.Resources.EdFiEducationContentDerivativeSourceEducationContent;
import Models.Resources.EdFiEducationContentDerivativeSourceLearningResourceMetadataURI;
import Models.Resources.EdFiEducationContentDerivativeSourceURI;
import Models.Resources.EdFiEducationContentLanguage;
import Models.Resources.EdFiLearningStandardReference;
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
 * EdFiEducationContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiEducationContent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTENT_IDENTIFIER = "contentIdentifier";
  @SerializedName(SERIALIZED_NAME_CONTENT_IDENTIFIER)
  private String contentIdentifier;

  public static final String SERIALIZED_NAME_LEARNING_STANDARD_REFERENCE = "learningStandardReference";
  @SerializedName(SERIALIZED_NAME_LEARNING_STANDARD_REFERENCE)
  private EdFiLearningStandardReference learningStandardReference;

  public static final String SERIALIZED_NAME_ADDITIONAL_AUTHORS_INDICATOR = "additionalAuthorsIndicator";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_AUTHORS_INDICATOR)
  private Boolean additionalAuthorsIndicator;

  public static final String SERIALIZED_NAME_APPROPRIATE_GRADE_LEVELS = "appropriateGradeLevels";
  @SerializedName(SERIALIZED_NAME_APPROPRIATE_GRADE_LEVELS)
  private List<EdFiEducationContentAppropriateGradeLevel> appropriateGradeLevels = null;

  public static final String SERIALIZED_NAME_APPROPRIATE_SEXES = "appropriateSexes";
  @SerializedName(SERIALIZED_NAME_APPROPRIATE_SEXES)
  private List<EdFiEducationContentAppropriateSex> appropriateSexes = null;

  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<EdFiEducationContentAuthor> authors = null;

  public static final String SERIALIZED_NAME_CONTENT_CLASS_DESCRIPTOR = "contentClassDescriptor";
  @SerializedName(SERIALIZED_NAME_CONTENT_CLASS_DESCRIPTOR)
  private String contentClassDescriptor;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public static final String SERIALIZED_NAME_COST_RATE_DESCRIPTOR = "costRateDescriptor";
  @SerializedName(SERIALIZED_NAME_COST_RATE_DESCRIPTOR)
  private String costRateDescriptor;

  public static final String SERIALIZED_NAME_DERIVATIVE_SOURCE_EDUCATION_CONTENTS = "derivativeSourceEducationContents";
  @SerializedName(SERIALIZED_NAME_DERIVATIVE_SOURCE_EDUCATION_CONTENTS)
  private List<EdFiEducationContentDerivativeSourceEducationContent> derivativeSourceEducationContents = null;

  public static final String SERIALIZED_NAME_DERIVATIVE_SOURCE_LEARNING_RESOURCE_METADATA_U_R_IS = "derivativeSourceLearningResourceMetadataURIs";
  @SerializedName(SERIALIZED_NAME_DERIVATIVE_SOURCE_LEARNING_RESOURCE_METADATA_U_R_IS)
  private List<EdFiEducationContentDerivativeSourceLearningResourceMetadataURI> derivativeSourceLearningResourceMetadataURIs = null;

  public static final String SERIALIZED_NAME_DERIVATIVE_SOURCE_U_R_IS = "derivativeSourceURIs";
  @SerializedName(SERIALIZED_NAME_DERIVATIVE_SOURCE_U_R_IS)
  private List<EdFiEducationContentDerivativeSourceURI> derivativeSourceURIs = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INTERACTIVITY_STYLE_DESCRIPTOR = "interactivityStyleDescriptor";
  @SerializedName(SERIALIZED_NAME_INTERACTIVITY_STYLE_DESCRIPTOR)
  private String interactivityStyleDescriptor;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<EdFiEducationContentLanguage> languages = null;

  public static final String SERIALIZED_NAME_LEARNING_RESOURCE_METADATA_U_R_I = "learningResourceMetadataURI";
  @SerializedName(SERIALIZED_NAME_LEARNING_RESOURCE_METADATA_U_R_I)
  private String learningResourceMetadataURI;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PUBLICATION_DATE = "publicationDate";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_DATE)
  private LocalDate publicationDate;

  public static final String SERIALIZED_NAME_PUBLICATION_YEAR = "publicationYear";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_YEAR)
  private Integer publicationYear;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private String publisher;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "shortDescription";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_TIME_REQUIRED = "timeRequired";
  @SerializedName(SERIALIZED_NAME_TIME_REQUIRED)
  private String timeRequired;

  public static final String SERIALIZED_NAME_USE_RIGHTS_U_R_L = "useRightsURL";
  @SerializedName(SERIALIZED_NAME_USE_RIGHTS_U_R_L)
  private String useRightsURL;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiEducationContent() { 
  }

  public EdFiEducationContent id(String id) {
    
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


  public EdFiEducationContent contentIdentifier(String contentIdentifier) {
    
    this.contentIdentifier = contentIdentifier;
    return this;
  }

   /**
   * A unique identifier for the EducationContent.
   * @return contentIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier for the EducationContent.")

  public String getContentIdentifier() {
    return contentIdentifier;
  }


  public void setContentIdentifier(String contentIdentifier) {
    this.contentIdentifier = contentIdentifier;
  }


  public EdFiEducationContent learningStandardReference(EdFiLearningStandardReference learningStandardReference) {
    
    this.learningStandardReference = learningStandardReference;
    return this;
  }

   /**
   * Get learningStandardReference
   * @return learningStandardReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdFiLearningStandardReference getLearningStandardReference() {
    return learningStandardReference;
  }


  public void setLearningStandardReference(EdFiLearningStandardReference learningStandardReference) {
    this.learningStandardReference = learningStandardReference;
  }


  public EdFiEducationContent additionalAuthorsIndicator(Boolean additionalAuthorsIndicator) {
    
    this.additionalAuthorsIndicator = additionalAuthorsIndicator;
    return this;
  }

   /**
   * Indicates whether there are additional un-named authors. In a research report, this is often marked by the abbreviation \&quot;et al\&quot;.
   * @return additionalAuthorsIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether there are additional un-named authors. In a research report, this is often marked by the abbreviation \"et al\".")

  public Boolean getAdditionalAuthorsIndicator() {
    return additionalAuthorsIndicator;
  }


  public void setAdditionalAuthorsIndicator(Boolean additionalAuthorsIndicator) {
    this.additionalAuthorsIndicator = additionalAuthorsIndicator;
  }


  public EdFiEducationContent appropriateGradeLevels(List<EdFiEducationContentAppropriateGradeLevel> appropriateGradeLevels) {
    
    this.appropriateGradeLevels = appropriateGradeLevels;
    return this;
  }

  public EdFiEducationContent addAppropriateGradeLevelsItem(EdFiEducationContentAppropriateGradeLevel appropriateGradeLevelsItem) {
    if (this.appropriateGradeLevels == null) {
      this.appropriateGradeLevels = new ArrayList<EdFiEducationContentAppropriateGradeLevel>();
    }
    this.appropriateGradeLevels.add(appropriateGradeLevelsItem);
    return this;
  }

   /**
   * An unordered collection of educationContentAppropriateGradeLevels. Grade levels for which this education content is applicable-if omitted, considered generally applicable.
   * @return appropriateGradeLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentAppropriateGradeLevels. Grade levels for which this education content is applicable-if omitted, considered generally applicable.")

  public List<EdFiEducationContentAppropriateGradeLevel> getAppropriateGradeLevels() {
    return appropriateGradeLevels;
  }


  public void setAppropriateGradeLevels(List<EdFiEducationContentAppropriateGradeLevel> appropriateGradeLevels) {
    this.appropriateGradeLevels = appropriateGradeLevels;
  }


  public EdFiEducationContent appropriateSexes(List<EdFiEducationContentAppropriateSex> appropriateSexes) {
    
    this.appropriateSexes = appropriateSexes;
    return this;
  }

  public EdFiEducationContent addAppropriateSexesItem(EdFiEducationContentAppropriateSex appropriateSexesItem) {
    if (this.appropriateSexes == null) {
      this.appropriateSexes = new ArrayList<EdFiEducationContentAppropriateSex>();
    }
    this.appropriateSexes.add(appropriateSexesItem);
    return this;
  }

   /**
   * An unordered collection of educationContentAppropriateSexes. Sexes for which this education content is applicable. If omitted, considered generally applicable.
   * @return appropriateSexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentAppropriateSexes. Sexes for which this education content is applicable. If omitted, considered generally applicable.")

  public List<EdFiEducationContentAppropriateSex> getAppropriateSexes() {
    return appropriateSexes;
  }


  public void setAppropriateSexes(List<EdFiEducationContentAppropriateSex> appropriateSexes) {
    this.appropriateSexes = appropriateSexes;
  }


  public EdFiEducationContent authors(List<EdFiEducationContentAuthor> authors) {
    
    this.authors = authors;
    return this;
  }

  public EdFiEducationContent addAuthorsItem(EdFiEducationContentAuthor authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<EdFiEducationContentAuthor>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * An unordered collection of educationContentAuthors. The individual credited with the creation of the resource.
   * @return authors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentAuthors. The individual credited with the creation of the resource.")

  public List<EdFiEducationContentAuthor> getAuthors() {
    return authors;
  }


  public void setAuthors(List<EdFiEducationContentAuthor> authors) {
    this.authors = authors;
  }


  public EdFiEducationContent contentClassDescriptor(String contentClassDescriptor) {
    
    this.contentClassDescriptor = contentClassDescriptor;
    return this;
  }

   /**
   * The predominate type or kind characterizing the learning resource.
   * @return contentClassDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The predominate type or kind characterizing the learning resource.")

  public String getContentClassDescriptor() {
    return contentClassDescriptor;
  }


  public void setContentClassDescriptor(String contentClassDescriptor) {
    this.contentClassDescriptor = contentClassDescriptor;
  }


  public EdFiEducationContent cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * An amount that has to be paid or spent to buy or obtain the EducationContent.
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An amount that has to be paid or spent to buy or obtain the EducationContent.")

  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public EdFiEducationContent costRateDescriptor(String costRateDescriptor) {
    
    this.costRateDescriptor = costRateDescriptor;
    return this;
  }

   /**
   * The rate by which the cost applies.
   * @return costRateDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rate by which the cost applies.")

  public String getCostRateDescriptor() {
    return costRateDescriptor;
  }


  public void setCostRateDescriptor(String costRateDescriptor) {
    this.costRateDescriptor = costRateDescriptor;
  }


  public EdFiEducationContent derivativeSourceEducationContents(List<EdFiEducationContentDerivativeSourceEducationContent> derivativeSourceEducationContents) {
    
    this.derivativeSourceEducationContents = derivativeSourceEducationContents;
    return this;
  }

  public EdFiEducationContent addDerivativeSourceEducationContentsItem(EdFiEducationContentDerivativeSourceEducationContent derivativeSourceEducationContentsItem) {
    if (this.derivativeSourceEducationContents == null) {
      this.derivativeSourceEducationContents = new ArrayList<EdFiEducationContentDerivativeSourceEducationContent>();
    }
    this.derivativeSourceEducationContents.add(derivativeSourceEducationContentsItem);
    return this;
  }

   /**
   * An unordered collection of educationContentDerivativeSourceEducationContents. Relates the education content source to the education content.
   * @return derivativeSourceEducationContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentDerivativeSourceEducationContents. Relates the education content source to the education content.")

  public List<EdFiEducationContentDerivativeSourceEducationContent> getDerivativeSourceEducationContents() {
    return derivativeSourceEducationContents;
  }


  public void setDerivativeSourceEducationContents(List<EdFiEducationContentDerivativeSourceEducationContent> derivativeSourceEducationContents) {
    this.derivativeSourceEducationContents = derivativeSourceEducationContents;
  }


  public EdFiEducationContent derivativeSourceLearningResourceMetadataURIs(List<EdFiEducationContentDerivativeSourceLearningResourceMetadataURI> derivativeSourceLearningResourceMetadataURIs) {
    
    this.derivativeSourceLearningResourceMetadataURIs = derivativeSourceLearningResourceMetadataURIs;
    return this;
  }

  public EdFiEducationContent addDerivativeSourceLearningResourceMetadataURIsItem(EdFiEducationContentDerivativeSourceLearningResourceMetadataURI derivativeSourceLearningResourceMetadataURIsItem) {
    if (this.derivativeSourceLearningResourceMetadataURIs == null) {
      this.derivativeSourceLearningResourceMetadataURIs = new ArrayList<EdFiEducationContentDerivativeSourceLearningResourceMetadataURI>();
    }
    this.derivativeSourceLearningResourceMetadataURIs.add(derivativeSourceLearningResourceMetadataURIsItem);
    return this;
  }

   /**
   * An unordered collection of educationContentDerivativeSourceLearningResourceMetadataURIs. The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.
   * @return derivativeSourceLearningResourceMetadataURIs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentDerivativeSourceLearningResourceMetadataURIs. The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.")

  public List<EdFiEducationContentDerivativeSourceLearningResourceMetadataURI> getDerivativeSourceLearningResourceMetadataURIs() {
    return derivativeSourceLearningResourceMetadataURIs;
  }


  public void setDerivativeSourceLearningResourceMetadataURIs(List<EdFiEducationContentDerivativeSourceLearningResourceMetadataURI> derivativeSourceLearningResourceMetadataURIs) {
    this.derivativeSourceLearningResourceMetadataURIs = derivativeSourceLearningResourceMetadataURIs;
  }


  public EdFiEducationContent derivativeSourceURIs(List<EdFiEducationContentDerivativeSourceURI> derivativeSourceURIs) {
    
    this.derivativeSourceURIs = derivativeSourceURIs;
    return this;
  }

  public EdFiEducationContent addDerivativeSourceURIsItem(EdFiEducationContentDerivativeSourceURI derivativeSourceURIsItem) {
    if (this.derivativeSourceURIs == null) {
      this.derivativeSourceURIs = new ArrayList<EdFiEducationContentDerivativeSourceURI>();
    }
    this.derivativeSourceURIs.add(derivativeSourceURIsItem);
    return this;
  }

   /**
   * An unordered collection of educationContentDerivativeSourceURIs. The URI (typical a URL) pointing to an education content item.
   * @return derivativeSourceURIs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentDerivativeSourceURIs. The URI (typical a URL) pointing to an education content item.")

  public List<EdFiEducationContentDerivativeSourceURI> getDerivativeSourceURIs() {
    return derivativeSourceURIs;
  }


  public void setDerivativeSourceURIs(List<EdFiEducationContentDerivativeSourceURI> derivativeSourceURIs) {
    this.derivativeSourceURIs = derivativeSourceURIs;
  }


  public EdFiEducationContent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An extended written representation of the education content.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An extended written representation of the education content.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EdFiEducationContent interactivityStyleDescriptor(String interactivityStyleDescriptor) {
    
    this.interactivityStyleDescriptor = interactivityStyleDescriptor;
    return this;
  }

   /**
   * The predominate mode of learning supported by the learning resource. Acceptable values are active, expositive, or mixed.
   * @return interactivityStyleDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The predominate mode of learning supported by the learning resource. Acceptable values are active, expositive, or mixed.")

  public String getInteractivityStyleDescriptor() {
    return interactivityStyleDescriptor;
  }


  public void setInteractivityStyleDescriptor(String interactivityStyleDescriptor) {
    this.interactivityStyleDescriptor = interactivityStyleDescriptor;
  }


  public EdFiEducationContent languages(List<EdFiEducationContentLanguage> languages) {
    
    this.languages = languages;
    return this;
  }

  public EdFiEducationContent addLanguagesItem(EdFiEducationContentLanguage languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<EdFiEducationContentLanguage>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * An unordered collection of educationContentLanguages. An indication of the languages in which the Education Content is designed.
   * @return languages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An unordered collection of educationContentLanguages. An indication of the languages in which the Education Content is designed.")

  public List<EdFiEducationContentLanguage> getLanguages() {
    return languages;
  }


  public void setLanguages(List<EdFiEducationContentLanguage> languages) {
    this.languages = languages;
  }


  public EdFiEducationContent learningResourceMetadataURI(String learningResourceMetadataURI) {
    
    this.learningResourceMetadataURI = learningResourceMetadataURI;
    return this;
  }

   /**
   * The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.
   * @return learningResourceMetadataURI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI (typical a URL) pointing to the metadata entry in a LRMI metadata repository, which describes this content item.")

  public String getLearningResourceMetadataURI() {
    return learningResourceMetadataURI;
  }


  public void setLearningResourceMetadataURI(String learningResourceMetadataURI) {
    this.learningResourceMetadataURI = learningResourceMetadataURI;
  }


  public EdFiEducationContent namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the EducationContent.
   * @return namespace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Namespace for the EducationContent.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public EdFiEducationContent publicationDate(LocalDate publicationDate) {
    
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


  public EdFiEducationContent publicationYear(Integer publicationYear) {
    
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


  public EdFiEducationContent publisher(String publisher) {
    
    this.publisher = publisher;
    return this;
  }

   /**
   * The organization credited with publishing the resource.
   * @return publisher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization credited with publishing the resource.")

  public String getPublisher() {
    return publisher;
  }


  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }


  public EdFiEducationContent shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description or name of the entity.
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description or name of the entity.")

  public String getShortDescription() {
    return shortDescription;
  }


  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public EdFiEducationContent timeRequired(String timeRequired) {
    
    this.timeRequired = timeRequired;
    return this;
  }

   /**
   * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience.
   * @return timeRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience.")

  public String getTimeRequired() {
    return timeRequired;
  }


  public void setTimeRequired(String timeRequired) {
    this.timeRequired = timeRequired;
  }


  public EdFiEducationContent useRightsURL(String useRightsURL) {
    
    this.useRightsURL = useRightsURL;
    return this;
  }

   /**
   * The URL where the owner specifies permissions for using the resource.
   * @return useRightsURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where the owner specifies permissions for using the resource.")

  public String getUseRightsURL() {
    return useRightsURL;
  }


  public void setUseRightsURL(String useRightsURL) {
    this.useRightsURL = useRightsURL;
  }


  public EdFiEducationContent version(String version) {
    
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


  public EdFiEducationContent etag(String etag) {
    
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
    EdFiEducationContent edFiEducationContent = (EdFiEducationContent) o;
    return Objects.equals(this.id, edFiEducationContent.id) &&
        Objects.equals(this.contentIdentifier, edFiEducationContent.contentIdentifier) &&
        Objects.equals(this.learningStandardReference, edFiEducationContent.learningStandardReference) &&
        Objects.equals(this.additionalAuthorsIndicator, edFiEducationContent.additionalAuthorsIndicator) &&
        Objects.equals(this.appropriateGradeLevels, edFiEducationContent.appropriateGradeLevels) &&
        Objects.equals(this.appropriateSexes, edFiEducationContent.appropriateSexes) &&
        Objects.equals(this.authors, edFiEducationContent.authors) &&
        Objects.equals(this.contentClassDescriptor, edFiEducationContent.contentClassDescriptor) &&
        Objects.equals(this.cost, edFiEducationContent.cost) &&
        Objects.equals(this.costRateDescriptor, edFiEducationContent.costRateDescriptor) &&
        Objects.equals(this.derivativeSourceEducationContents, edFiEducationContent.derivativeSourceEducationContents) &&
        Objects.equals(this.derivativeSourceLearningResourceMetadataURIs, edFiEducationContent.derivativeSourceLearningResourceMetadataURIs) &&
        Objects.equals(this.derivativeSourceURIs, edFiEducationContent.derivativeSourceURIs) &&
        Objects.equals(this.description, edFiEducationContent.description) &&
        Objects.equals(this.interactivityStyleDescriptor, edFiEducationContent.interactivityStyleDescriptor) &&
        Objects.equals(this.languages, edFiEducationContent.languages) &&
        Objects.equals(this.learningResourceMetadataURI, edFiEducationContent.learningResourceMetadataURI) &&
        Objects.equals(this.namespace, edFiEducationContent.namespace) &&
        Objects.equals(this.publicationDate, edFiEducationContent.publicationDate) &&
        Objects.equals(this.publicationYear, edFiEducationContent.publicationYear) &&
        Objects.equals(this.publisher, edFiEducationContent.publisher) &&
        Objects.equals(this.shortDescription, edFiEducationContent.shortDescription) &&
        Objects.equals(this.timeRequired, edFiEducationContent.timeRequired) &&
        Objects.equals(this.useRightsURL, edFiEducationContent.useRightsURL) &&
        Objects.equals(this.version, edFiEducationContent.version) &&
        Objects.equals(this.etag, edFiEducationContent.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentIdentifier, learningStandardReference, additionalAuthorsIndicator, appropriateGradeLevels, appropriateSexes, authors, contentClassDescriptor, cost, costRateDescriptor, derivativeSourceEducationContents, derivativeSourceLearningResourceMetadataURIs, derivativeSourceURIs, description, interactivityStyleDescriptor, languages, learningResourceMetadataURI, namespace, publicationDate, publicationYear, publisher, shortDescription, timeRequired, useRightsURL, version, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiEducationContent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentIdentifier: ").append(toIndentedString(contentIdentifier)).append("\n");
    sb.append("    learningStandardReference: ").append(toIndentedString(learningStandardReference)).append("\n");
    sb.append("    additionalAuthorsIndicator: ").append(toIndentedString(additionalAuthorsIndicator)).append("\n");
    sb.append("    appropriateGradeLevels: ").append(toIndentedString(appropriateGradeLevels)).append("\n");
    sb.append("    appropriateSexes: ").append(toIndentedString(appropriateSexes)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    contentClassDescriptor: ").append(toIndentedString(contentClassDescriptor)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    costRateDescriptor: ").append(toIndentedString(costRateDescriptor)).append("\n");
    sb.append("    derivativeSourceEducationContents: ").append(toIndentedString(derivativeSourceEducationContents)).append("\n");
    sb.append("    derivativeSourceLearningResourceMetadataURIs: ").append(toIndentedString(derivativeSourceLearningResourceMetadataURIs)).append("\n");
    sb.append("    derivativeSourceURIs: ").append(toIndentedString(derivativeSourceURIs)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    interactivityStyleDescriptor: ").append(toIndentedString(interactivityStyleDescriptor)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    learningResourceMetadataURI: ").append(toIndentedString(learningResourceMetadataURI)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    publicationYear: ").append(toIndentedString(publicationYear)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    timeRequired: ").append(toIndentedString(timeRequired)).append("\n");
    sb.append("    useRightsURL: ").append(toIndentedString(useRightsURL)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

