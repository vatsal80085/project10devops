# CI/CD Pipeline for Web Application Deployment on AWS

## 1. Project Objectives

This project demonstrates the design and implementation of a fully automated CI/CD pipeline for deploying a web-based Advanced Text Analyser application.  
The primary goal is to implement Infrastructure as Code (IaC) and DevOps principles to achieve a reliable, repeatable, and efficient deployment process.

### Key Objectives
- **Automated Infrastructure Provisioning:**  
  Build, test, and deploy the application with minimal manual intervention.

- **CI/CD Implementation:**  
  Use Jenkins to create a robust pipeline triggered automatically by code changes.

- **Cloud Foundation:**  
  Deploy and manage the application on a scalable environment using AWS EC2.

- **Version Control:**  
  Manage source code using Git and GitHub, enabling collaboration and traceability.

---

## 2. Solution Architecture and Workflow

The solution follows a classic CI/CD workflow, automating the process from code commit to application deployment.

### Workflow Steps
1. **Code Commit:**  
   A developer pushes changes to the GitHub repository.

2. **Pipeline Trigger:**  
   A webhook triggers the Jenkins pipeline on new commits to the main branch.

3. **Build & Test:**  
   Jenkins executes sequential stages:
   - Compile: Converts source code to executable format.  
   - Unit Test: Runs automated tests to catch bugs early.  
   - Package: Generates a deployable `.war` artifact.

4. **Deployment:**  
   Jenkins securely transfers the `.war` file to the Tomcat application server.

5. **Live Application:**  
   The application is deployed automatically on an Apache Tomcat server running on AWS EC2 and accessed via the public IP.

---

## 3. Tools and Technologies Used

| Category                | Tool / Service                     |
|--------------------------|-------------------------------------|
| Cloud Provider           | Amazon Web Services (AWS)          |
| CI/CD Automation         | Jenkins                            |
| Version Control          | Git, GitHub                         |
| Application Server       | Apache Tomcat                      |
| Infrastructure           | AWS EC2 (t2.micro)                 |
| Programming              | Java (WAR Deployment)              |
| Containerization         | Docker (future integration)        |
| Infrastructure as Code   | Terraform (future scope)          |

---

## 4. Implementation Details

### A. Cloud Infrastructure (AWS)
- Two primary EC2 instances were provisioned in the `us-east-1` region:
  - **Jenkins Server:** Dedicated to running the Jenkins automation server.
  - **Tomcat Server:** Hosts the Apache Tomcat web server where the final application is deployed.

### B. CI/CD Pipeline (Jenkins)
- A Jenkins pipeline named `Advanced_Text_Analyser_Project` was created.
- The pipeline consists of stages including:
  - Compile
  - Unit Test
  - Package
  - Deploy to Tomcat
- A failure in any stage halts the pipeline, preventing faulty deployments.
- Build history confirms successful automated deployments triggered by code changes.

### C. Application Deployment (Tomcat)
- The final stage of the pipeline deploys the WAR file to the Tomcat server.
- The Tomcat Web Application Manager shows the application running successfully and accessible via the EC2 public IP.

---

## 5. Conclusion and Future Scope

This project successfully demonstrates a fully functional and automated CI/CD pipeline using a modern DevOps toolchain.  
Code changes are seamlessly integrated, tested, and deployed to a live server hosted on AWS, achieving the core goals of automation, consistency, and reliability.

### Future Scope
- **Infrastructure as Code (Terraform):** Convert manual AWS setup into Terraform configuration files to enable version-controlled, repeatable infrastructure deployment. 
- **Multi-Cloud Expansion:** Extend configurations to deploy the same application across Azure and Google Cloud Platform (GCP).  
- **Advanced Networking:** Implement cross-cloud networking and load balancing to distribute traffic and enhance high availability.  
- **Monitoring and Cost Management:** Integrate monitoring tools like CloudWatch and implement cost optimization strategies.

## Group Number: 10

### Team Members
- Vatsal Agarwal  
- Aditya Verma  
- Siddhartha Saxena Kanojia  
- Yash Singh
- Suryabhan  
---
