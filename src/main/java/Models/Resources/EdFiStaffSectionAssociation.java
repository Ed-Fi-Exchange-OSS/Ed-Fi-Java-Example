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
import Models.Resources.EdFiSectionReference;
import Models.Resources.EdFiStaffReference;
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
 * EdFiStaffSectionAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T14:58:32.034-05:00[America/Mexico_City]")
public class EdFiStaffSectionAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SECTION_REFERENCE = "sectionReference";
  @SerializedName(SERIALIZED_NAME_SECTION_REFERENCE)
  private EdFiSectionReference sectionReference;

  public static final String SERIALIZED_NAME_STAFF_REFERENCE = "staffReference";
  @SerializedName(SERIALIZED_NAME_STAFF_REFERENCE)
  private EdFiStaffReference staffReference;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_CLASSROOM_POSITION_DESCRIPTOR = "classroomPositionDescriptor";
  @SerializedName(SERIALIZED_NAME_CLASSROOM_POSITION_DESCRIPTOR)
  private String classroomPositionDescriptor;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_HIGHLY_QUALIFIED_TEACHER = "highlyQualifiedTeacher";
  @SerializedName(SERIALIZED_NAME_HIGHLY_QUALIFIED_TEACHER)
  private Boolean highlyQualifiedTeacher;

  public static final String SERIALIZED_NAME_PERCENTAGE_CONTRIBUTION = "percentageContribution";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE_CONTRIBUTION)
  private Double percentageContribution;

  public static final String SERIALIZED_NAME_TEACHER_STUDENT_DATA_LINK_EXCLUSION = "teacherStudentDataLinkExclusion";
  @SerializedName(SERIALIZED_NAME_TEACHER_STUDENT_DATA_LINK_EXCLUSION)
  private Boolean teacherStudentDataLinkExclusion;

  public static final String SERIALIZED_NAME_ETAG = "_etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;

  public EdFiStaffSectionAssociation() { 
  }

  public EdFiStaffSectionAssociation id(String id) {
    
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


  public EdFiStaffSectionAssociation sectionReference(EdFiSectionReference sectionReference) {
    
    this.sectionReference = sectionReference;
    return this;
  }

   /**
   * Get sectionReference
   * @return sectionReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EdFiSectionReference getSectionReference() {
    return sectionReference;
  }


  public void setSectionReference(EdFiSectionReference sectionReference) {
    this.sectionReference = sectionReference;
  }


  public EdFiStaffSectionAssociation staffReference(EdFiStaffReference staffReference) {
    
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


  public EdFiStaffSectionAssociation beginDate(LocalDate beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Month, day, and year of a teacher&#39;s assignment to the Section. If blank, defaults to the first day of the first grading period for the Section.
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Month, day, and year of a teacher's assignment to the Section. If blank, defaults to the first day of the first grading period for the Section.")

  public LocalDate getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }


  public EdFiStaffSectionAssociation classroomPositionDescriptor(String classroomPositionDescriptor) {
    
    this.classroomPositionDescriptor = classroomPositionDescriptor;
    return this;
  }

   /**
   * The type of position the Staff member holds in the specific class/section; for example:         Teacher of Record, Assistant Teacher, Support Teacher, Substitute Teacher...
   * @return classroomPositionDescriptor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of position the Staff member holds in the specific class/section; for example:         Teacher of Record, Assistant Teacher, Support Teacher, Substitute Teacher...")

  public String getClassroomPositionDescriptor() {
    return classroomPositionDescriptor;
  }


  public void setClassroomPositionDescriptor(String classroomPositionDescriptor) {
    this.classroomPositionDescriptor = classroomPositionDescriptor;
  }


  public EdFiStaffSectionAssociation endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Month, day, and year of the last day of a staff member&#39;s assignment to the Section.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Month, day, and year of the last day of a staff member's assignment to the Section.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EdFiStaffSectionAssociation highlyQualifiedTeacher(Boolean highlyQualifiedTeacher) {
    
    this.highlyQualifiedTeacher = highlyQualifiedTeacher;
    return this;
  }

   /**
   * An indication of whether a teacher is classified as highly qualified for his/her assignment according to state definition. This attribute indicates the teacher is highly qualified for this section being taught.
   * @return highlyQualifiedTeacher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indication of whether a teacher is classified as highly qualified for his/her assignment according to state definition. This attribute indicates the teacher is highly qualified for this section being taught.")

  public Boolean getHighlyQualifiedTeacher() {
    return highlyQualifiedTeacher;
  }


  public void setHighlyQualifiedTeacher(Boolean highlyQualifiedTeacher) {
    this.highlyQualifiedTeacher = highlyQualifiedTeacher;
  }


  public EdFiStaffSectionAssociation percentageContribution(Double percentageContribution) {
    
    this.percentageContribution = percentageContribution;
    return this;
  }

   /**
   * Indicates the percentage of the total scheduled course time, academic standards, and/or learning activities delivered in this section by this staff member. A teacher of record designation may be based solely or partially on this contribution percentage.
   * @return percentageContribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the percentage of the total scheduled course time, academic standards, and/or learning activities delivered in this section by this staff member. A teacher of record designation may be based solely or partially on this contribution percentage.")

  public Double getPercentageContribution() {
    return percentageContribution;
  }


  public void setPercentageContribution(Double percentageContribution) {
    this.percentageContribution = percentageContribution;
  }


  public EdFiStaffSectionAssociation teacherStudentDataLinkExclusion(Boolean teacherStudentDataLinkExclusion) {
    
    this.teacherStudentDataLinkExclusion = teacherStudentDataLinkExclusion;
    return this;
  }

   /**
   * Indicates that the entire section is excluded from calculation of value-added or growth attribution calculations used for a particular teacher evaluation.
   * @return teacherStudentDataLinkExclusion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the entire section is excluded from calculation of value-added or growth attribution calculations used for a particular teacher evaluation.")

  public Boolean getTeacherStudentDataLinkExclusion() {
    return teacherStudentDataLinkExclusion;
  }


  public void setTeacherStudentDataLinkExclusion(Boolean teacherStudentDataLinkExclusion) {
    this.teacherStudentDataLinkExclusion = teacherStudentDataLinkExclusion;
  }


  public EdFiStaffSectionAssociation etag(String etag) {
    
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
    EdFiStaffSectionAssociation edFiStaffSectionAssociation = (EdFiStaffSectionAssociation) o;
    return Objects.equals(this.id, edFiStaffSectionAssociation.id) &&
        Objects.equals(this.sectionReference, edFiStaffSectionAssociation.sectionReference) &&
        Objects.equals(this.staffReference, edFiStaffSectionAssociation.staffReference) &&
        Objects.equals(this.beginDate, edFiStaffSectionAssociation.beginDate) &&
        Objects.equals(this.classroomPositionDescriptor, edFiStaffSectionAssociation.classroomPositionDescriptor) &&
        Objects.equals(this.endDate, edFiStaffSectionAssociation.endDate) &&
        Objects.equals(this.highlyQualifiedTeacher, edFiStaffSectionAssociation.highlyQualifiedTeacher) &&
        Objects.equals(this.percentageContribution, edFiStaffSectionAssociation.percentageContribution) &&
        Objects.equals(this.teacherStudentDataLinkExclusion, edFiStaffSectionAssociation.teacherStudentDataLinkExclusion) &&
        Objects.equals(this.etag, edFiStaffSectionAssociation.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sectionReference, staffReference, beginDate, classroomPositionDescriptor, endDate, highlyQualifiedTeacher, percentageContribution, teacherStudentDataLinkExclusion, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdFiStaffSectionAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sectionReference: ").append(toIndentedString(sectionReference)).append("\n");
    sb.append("    staffReference: ").append(toIndentedString(staffReference)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    classroomPositionDescriptor: ").append(toIndentedString(classroomPositionDescriptor)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    highlyQualifiedTeacher: ").append(toIndentedString(highlyQualifiedTeacher)).append("\n");
    sb.append("    percentageContribution: ").append(toIndentedString(percentageContribution)).append("\n");
    sb.append("    teacherStudentDataLinkExclusion: ").append(toIndentedString(teacherStudentDataLinkExclusion)).append("\n");
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

