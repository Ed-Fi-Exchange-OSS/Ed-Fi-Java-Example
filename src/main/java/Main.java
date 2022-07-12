
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;
import Api.ApiClient;
import Api.ApiException;
import Api.Configuration;
import Api.auth.*;
import Models.Resources.EdFiEducationOrganizationCategory;
import Models.Resources.EdFiLocalEducationAgencyReference;
import Models.Resources.EdFiSchool;
import Models.Resources.EdFiSchoolGradeLevel;
import kong.unirest.Unirest;
import Api.Resources.SchoolsApi;
import com.google.gson.Gson;
import java.util.UUID;

public class Main {

	public static void main(String[] args) throws IOException {
		String file = "src\\main\\java\\data.csv";
		BufferedReader reader = null;
		String line = "";
		School school = new School();
		Address address = new Address();
		EducationOrganizationCategory educationOrganizationCategory =  new EducationOrganizationCategory();

		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");

				school.localEducationAgencyReference = new LocalEducationAgencyReference();
				school.addresses = new ArrayList<Address>();
				school.gradeLevels = new ArrayList<GradeLevel>();
				school.educationOrganizationCategories = new ArrayList<EducationOrganizationCategory>();
				school.localEducationAgencyReference.localEducationAgencyId = row[0];
				school.schoolId = row[1].replace("\"", "");
				school.nameOfInstitution = row[2].replace("\"", "");
				school.shortNameOfInstitution = row[3].replace("\"", "");
				address.addressTypeDescriptor = row[4].replace("\"", "");
				address.city = row[5].replace("\"", "");
				address.postalCode = row[6].replace("\"", "");
				address.stateAbbreviationDescriptor = row[7].replace("\"", "");
				address.streetNumberName = row[8].replace("\"", "");
				school.addresses.add(address);
				educationOrganizationCategory.educationOrganizationCategoryDescriptor= row[9].replace("\"", "");
				school.educationOrganizationCategories.add(educationOrganizationCategory);
				school.gradeLevels.add(new GradeLevel(row[10].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[11].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[12].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[13].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[14].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[15].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[16].replace("\"", "")));
				school.gradeLevels.add(new GradeLevel(row[17].replace("\"", "")));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			reader.close();
		}

        System.out.println(new Gson().toJson(school));

		// Oauth configuration
		String basePath = "https://api.ed-fi.org:443/v5.2/api";
		String clientKey = "RvcohKz9zHI4";
		String clientSecret = "E1iEFusaNf81xzCxwHfbolkC";
        
        Map response = Unirest.post("https://api.ed-fi.org/v5.2/api/oauth/token")
        		  .header("content-type", "application/x-www-form-urlencoded")
        		  .body("grant_type=client_credentials&client_id=" + clientKey + "&client_secret=" + clientSecret + "").asObject(i -> new Gson().fromJson(i.getContentReader(), HashMap.class))
                  .getBody();
        
        String token = (String) response.values().toArray()[0];
        System.out.println("Token response: " + token);

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("grant_type","client_credentials");
		// TODO Auto-generated method stub
		ApiClient defaultClient = Configuration.getDefaultApiClient();//new ApiClient(basePath,clientKey,clientSecret,parameters); //Configuration.getDefaultApiClient();
		defaultClient.setBasePath("https://api.ed-fi.org:443/v5.2/api/data/v3");
		OAuth oauth2_client_credentials = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials");
        oauth2_client_credentials.setAccessToken(token);

	    SchoolsApi apiInstance = new SchoolsApi(defaultClient);
	    try {
			System.out.println("-----------------------");
			EdFiSchool postSchool = new EdFiSchool();
			postSchool.setId(null);
			postSchool.setSchoolId(Integer.valueOf(school.schoolId));
			EdFiLocalEducationAgencyReference localEducation = new EdFiLocalEducationAgencyReference();
			localEducation.setLocalEducationAgencyId(Integer.valueOf(school.localEducationAgencyReference.localEducationAgencyId.substring(1, school.localEducationAgencyReference.localEducationAgencyId.length())));
			postSchool.setLocalEducationAgencyReference(localEducation);
			postSchool.setNameOfInstitution(school.nameOfInstitution);
			ArrayList<EdFiSchoolGradeLevel> grade = new ArrayList<EdFiSchoolGradeLevel>();
			for (GradeLevel sGrade :school.gradeLevels) {
				EdFiSchoolGradeLevel level = new EdFiSchoolGradeLevel();
				level.setGradeLevelDescriptor(sGrade.gradeLevelDescriptor);
				grade.add(level);
			}
			postSchool.gradeLevels(grade);
			List<EdFiEducationOrganizationCategory> categories = new ArrayList<EdFiEducationOrganizationCategory>();
			EdFiEducationOrganizationCategory cat = new EdFiEducationOrganizationCategory();
			for (EducationOrganizationCategory sCat :school.educationOrganizationCategories) {
				cat.setEducationOrganizationCategoryDescriptor(sCat.educationOrganizationCategoryDescriptor);
				categories.add(cat);
			}

			postSchool.setEducationOrganizationCategories(categories);
			apiInstance.postSchool(postSchool);
			System.out.println("Post done!");
			System.out.println("-----------------------");
			System.out.println("Get...");

			String id = null; // String | A resource identifier that uniquely identifies the resource.
			String ifMatch = "ifMatch_example"; // String | The ETag header value used to prevent the DELETE from removing a resource modified by another consumer.
			Integer offset = 0; // Integer | Indicates how many items should be skipped before returning results.
			Integer limit = 25; // Integer | Indicates the maximum number of items that should be returned in the results.
			Integer minChangeVersion = null; // Integer | Used in synchronization to set sequence minimum ChangeVersion
			Integer maxChangeVersion = null; // Integer | Used in synchronization to set sequence maximum ChangeVersion
			Boolean totalCount = false; // Boolean | Indicates if the total number of items available should be returned in the 'Total-Count' header of the response.  If set to false, 'Total-Count' header will not be provided.
			Integer schoolId = Integer.valueOf(school.schoolId); // Integer | The identifier assigned to a school.
			Integer localEducationAgencyId = Integer.valueOf(school.localEducationAgencyReference.localEducationAgencyId.substring(1, school.localEducationAgencyReference.localEducationAgencyId.length())); // Integer | The identifier assigned to a local education agency.
			Integer charterApprovalSchoolYear = null; // Integer | The school year in which a charter school was initially approved.
			String administrativeFundingControlDescriptor = null; // String | The type of education institution as classified by its funding source, for example public or private.
			String charterApprovalAgencyTypeDescriptor = null; // String | The type of agency that approved the establishment or continuation of a charter school.
			String charterStatusDescriptor = null; // String | A school or agency providing free public elementary or secondary education to eligible students under a specific charter granted by the state legislature or other appropriate authority and designated by such authority to be a charter school.
			String internetAccessDescriptor = null; // String | The type of Internet access available.
			String magnetSpecialProgramEmphasisSchoolDescriptor = null; // String | A school that has been designed: 1) to attract students of different racial/ethnic backgrounds for the purpose of reducing, preventing, or eliminating racial isolation; and/or 2) to provide an academic or social focus on a particular theme (e.g., science/math, performing arts, gifted/talented, or foreign language).
			String schoolTypeDescriptor = null; // String | The type of education institution as classified by its primary focus.
			String titleIPartASchoolDesignationDescriptor = null; // String | Denotes the Title I Part A designation for the school.
			String snapshotIdentifier = null; // String | Indicates the Snapshot-Identifier that should be used.
	      List<EdFiSchool> result = apiInstance.getSchools(offset, limit, minChangeVersion, maxChangeVersion, totalCount, schoolId, localEducationAgencyId, charterApprovalSchoolYear, administrativeFundingControlDescriptor, charterApprovalAgencyTypeDescriptor, charterStatusDescriptor, internetAccessDescriptor, magnetSpecialProgramEmphasisSchoolDescriptor, schoolTypeDescriptor, titleIPartASchoolDesignationDescriptor, snapshotIdentifier);
	      System.out.println(result);
	    } catch (ApiException e) {
	      System.err.println("Exception when calling SchoolsApi#getSchools");
	      System.err.println("Status code: " + e.getCode());
	      System.err.println("Reason: " + e.getResponseBody());
	      System.err.println("Response headers: " + e.getResponseHeaders());
	      e.printStackTrace();
	    }
	}
}


