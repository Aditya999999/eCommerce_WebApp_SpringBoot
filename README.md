                                                               ** E-commerce Application with Spring Boot **
Welcome to our E-commerce Application built using Spring Boot. This application provides a robust and scalable solution for managing products and their categories in an online store. It is designed to help you get started quickly and efficiently.

Features
Product Management: Easily add, update, and delete products in your inventory.
Category Management: Organize products into categories for improved navigation and search.
Search and Filtering: Efficiently search for products and filter them by various criteria.
User-Friendly Interface: A clean and intuitive user interface for a seamless shopping experience.
Security: Secure user authentication and authorization to protect sensitive data.
Getting Started
Follow these steps to set up and run the E-commerce Application on your local environment:

Prerequisites
Java Development Kit (JDK)
Apache Maven
MySQL Database
Installation
Clone the repository:


git clone https://github.com/Aditya999999/eCommerce-WebApp_SpringBoot.git

Configure your MySQL database settings in application.properties:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=your-username
spring.datasource.password=your-password

Build the project:

cd ecommerce-spring-boot
mvn clean install

Run the application:

java -jar target/ecommerce-0.1.jar
The application should now be up and running. You can access it at http://localhost:8080.# eCommerce_WebApp_SpringBoot
