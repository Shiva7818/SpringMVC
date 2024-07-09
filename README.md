Spring MVC Project
Overview
This project demonstrates the implementation of a Spring MVC web application. The primary functionalities include fetching data from the view and displaying data on the view. Additionally, a user registration form has been implemented.

Features:
Data Fetching: Retrieve data from the view.
Data Display: Show data on the view.
User Registration Form: A complete registration form to capture user details.
Technologies Used
Spring Framework: Utilized for building the MVC architecture.
JSP: Used for the view layer.
Java: The core programming language for the application

Project Structure :
spring.mvc/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── springmvc/
│   │   │       └── controller/
│   │   │           ├── FormController.java
│   │   │           └── HomeController.java
│   │   ├── resources/
│   │   │   └── application.properties
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           ├── lib/
│   │           │   ├── about.jsp
│   │           │   ├── form.jsp
│   │           │   ├── help.jsp
│   │           │   ├── home.jsp
│   │           │   └── success.jsp
│   │           └── web.xml
└── pom.xml

Prerequisites :
* Java JDK 8 or higher
* Apache Maven
* Apache Tomcat
