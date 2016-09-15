## Sorting of elements Using MySQL in Spring Boot via Spring Data JPA and Hibernate


### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations. please change spring.jpa.hibernate.ddl-auto = update when you run this application second time otherwise old data will be flushed out

#### Prerequisites

- Java 8
- Maven > 3.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.


### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the database:
    * `/findAllNumbers`: To see the result of the sorted numbers.
    * `/addNewNumber?number=[any number]`: add new number in the stack the program will automatically sorted the stack and redirect to the findAllNumbers.    