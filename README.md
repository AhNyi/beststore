# Java Web Application with CRUD Operations using Spring Boot, Spring MVC, MySQL, and Thymeleaf

This is a simple Java web application demonstrating CRUD (Create, Read, Update, Delete) operations using Spring Boot, Spring MVC, MySQL, and Thymeleaf.

## Features

- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on a MySQL database.
- **Spring Boot**: Utilize the Spring Boot framework for easier setup and configuration.
- **Spring MVC**: Implement the Model-View-Controller design pattern provided by Spring MVC.
- **MySQL**: Use MySQL as the database to store and retrieve data.
- **Thymeleaf**: Integrate Thymeleaf for server-side templating and rendering.
- **Form Data Validation**: Implement form data validation using Spring Boot and Spring MVC.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven
- MySQL Server
- Your favorite IDE (Eclipse, IntelliJ IDEA, etc.)

## Setup

1. **Clone the repository**:

    ```bash
    git clone https://github.com/your-username/java-web-crud.git
    ```

2. **Import the project** into your IDE.

3. **Configure MySQL**:
   
   - Create a MySQL database.
   - Update the `application.properties` file with your MySQL database configurations:

      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_mysql_username
      spring.datasource.password=your_mysql_password
      ```

4. **Run the application**:

    You can run the application either from your IDE or using Maven:

    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**:

    Open your web browser and navigate to `http://localhost:8080`.

## Usage

- **Create**: Click on the "Add New" button to add a new record.
- **Read**: View all records on the home page.
- **Update**: Click on the "Edit" button next to a record to update it.
- **Delete**: Click on the "Delete" button next to a record to remove it from the database.

## Contributing

Contributions are welcome! Feel free to open issues or pull requests.

## Reference

For a detailed tutorial on building a similar application, check out [this video](https://www.youtube.com/watch?v=6zfIxgaVkQI&t=97s).

Happy coding!
