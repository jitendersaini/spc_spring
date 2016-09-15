package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author j.saini
 *
 */
@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		StringBuilder stb = new StringBuilder();

		stb.append("## Sorting of elements Using MySQL in Spring Boot via Spring Data JPA and Hibernate<br><br>");

		stb.append("### Build and run<br><br>");

		stb.append("#### Configurations<br><br>");

		stb.append(
				"Open the `application.properties` file and set your own configurations. please change spring.jpa.hibernate.ddl-auto = update when you run this application second time otherwise old data will be flushed out<br><br>");

		stb.append("#### Prerequisites<br><br>");

		stb.append("- Java 8<br>");
		stb.append("- Maven > 3.0<br><br><br><br>");

		stb.append("#### From terminal<br>");

		stb.append("Go on the project's root folder, then type:<br><br>");

		stb.append("$ mvn spring-boot:run<br><br>");

		stb.append("#### From Eclipse (Spring Tool Suite)<br><br>");

		stb.append("Import as *Existing Maven Project* and run it as *Spring Boot App*.<br>");

		stb.append("### Usage<br><br>");

		stb.append("- Run the application and go on http://localhost:8080/<br><br>");
		stb.append("- Use the following urls to invoke controllers methods and see the interactions<br><br>");
		stb.append("with the database:<br>");
		stb.append("* `/findAllNumbers`: To see the result of the sorted numbers.<br><br>");
		stb.append(
				"* `/addNewNumber?number=[any number]`: add new number in the stack the program will automatically sorted the stack and redirect to the findAllNumbers.");
		return stb.toString();
	}

}
