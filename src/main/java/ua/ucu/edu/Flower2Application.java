package ua.ucu.edu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication()
@RestController
public class Flower2Application {

	public static void main(String[] args) {
		SpringApplication.run(Flower2Application.class, args);
	}

}
