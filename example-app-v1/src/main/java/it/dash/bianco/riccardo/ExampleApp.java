package it.dash.bianco.riccardo;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.petstore.dto.gen.Order;

@SpringBootApplication
public class ExampleApp {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ExampleApp.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> this.main();
	}

	private void main() {
		Order order = new Order();
		order.setFieldSetComplete("How does it feel to treat me like you do?");
		System.out.println(order.getFieldSetComplete());
	}

}
