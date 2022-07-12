# Ed-Fi ODS/API Schools Post/Get

This repository provides an example of how to do a POST and GET to Ed-Fi ODS/API. 
This code loads schools from a CSV and uploads them to the API.  

Supports:

* Ed-Fi Data Standard 3.0 and higher
* Ed-Fi ODS/API Technical Suite 3, version 3.0 and higher

Prerequisites
------------
- Java SDK 11: https://www.oracle.com/mx/java/technologies/javase/jdk11-archive-downloads.html (If you don't have an Oracle Account, you will you need to create one to download the SDK)
- IDE: Any Java editor of your preference (NetBeans, Eclipse, IntelliJ IDEA, VS Code, etc)
- Maven (you can get it from: https://maven.apache.org/download.cgi)

Quick Start
------------
- Clone the repo
- Load the code to your IDE (if you don't have JDK you must install version 18 or higher)
- Build the project
- Go to src/main/java/Main.Java

    <img width="373" alt="image" src="https://user-images.githubusercontent.com/4332179/177821236-eb0cfcb6-e4de-42a3-893f-07a4afd34e60.png">

- Run the project
- Once the requests are done, you will see the results in the console in the below order:
  - The content of the CSV file
  - Message saying that the post was successfully done
  - The result of a the GET with all the schools loaded

Notes
------------
The first two columns in the CSV represent the **LocalEducationAgency** and **School** respectively. Make sure these two values already exist in your ODS. 
You can call the below two endpoints to validate: 
* https://api.ed-fi.org/v5.0.0/docs/index.html?urls.primaryName=Resources#/localEducationAgencies
* https://api.ed-fi.org/v5.0.0/docs/index.html?urls.primaryName=Resources#/schools

### Support
For any support please create a ticket in the Ed-Fi tracker ticketing system: https://tracker.ed-fi.org/ and make sure you select the "Ed-Fi Support (EDFI)" project. 

## Legal Information

Copyright (c) 2021 Ed-Fi Alliance, LLC and contributors.

Licensed under the [Apache License, Version 2.0](LICENSE) (the "License").

Unless required by applicable law or agreed to in writing, software distributed
under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

See [NOTICES](NOTICES.md) for additional copyright and license notifications.
