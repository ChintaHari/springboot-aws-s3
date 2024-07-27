# Spring Boot AWS S3 File Upload and Download

This project demonstrates the integration of Spring Boot with Amazon S3 to provide file upload and download functionalities. It utilizes AWS SDK for Java to interact with Amazon S3 services. The application allows users to upload files to an S3 bucket and download them back to their local system.

## Prerequisites

- **Java Development Kit (JDK)**: Java 17 or above.
- **Maven**: 3.6 or above.
- **AWS Account**: An AWS account and access to S3 services.
- **Spring Boot**: Version 3.3.2, as specified in `pom.xml`.
- **IDE**: Any Java-compatible IDE such as IntelliJ IDEA, Eclipse, or VS Code.

## Technologies Used

- **Spring Boot**: For creating the web application.
- **AWS Java SDK**: For interacting with Amazon S3.
- **Spring Boot Starter Web**: For RESTful APIs and Spring MVC support.
- **Project Lombok**: For reducing boilerplate code.

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd springboot-aws-s3
   ```
2. **Configure AWS Credentials**:

    Update `src/main/resources/application.yml` with your AWS credentials:

    ```yaml
    cloud:
      aws:
        credentials:
          access-key: YOUR_ACCESS_KEY
          secret-key: YOUR_SECRET_KEY
        region:
          static: us-east-1
    ```
    Ensure these credentials have sufficient permissions to perform S3 bucket operations.

3. **Maven Dependencies**:
   Ensure all dependencies in pom.xml are correctly downloaded by running:
   
   ```bash
   mvn clean install
   ```
5. **Running the Application**:
   
   ```bash
   mvn spring-boot:run
   ```
## Features

- **File Upload**: Upload files to a specified AWS S3 bucket.
- **File Download**: Download files from the AWS S3 bucket to your local system.
- **File Deletion**: Remove files from the AWS S3 bucket.

## Configuration Details

- The main configuration can be found in `src/main/resources/application.yml`, which includes AWS credentials and region settings.
- Spring MVC file upload settings under `spring.servlet.multipart` ensure limitations on upload size for performance and security.

## Endpoints

- `POST /storage/upload`: Uploads a file to the S3 bucket.
- `GET /storage/download/{fileName}`: Downloads the specified file.
- `DELETE /storage/delete/{fileName}`: Deletes the specified file from the bucket.

## Project Structure

- `src/main/java/com/example/springboot_aws_s3` - Root package for the application.
  - `config` - Contains AWS S3 configuration.
  - `service` - Contains services for handling file upload, download, and deletion.
  - `controller` - Web controllers that expose RESTful endpoints.
- `src/main/resources` - Contains configuration files such as `application.yml`.

    

