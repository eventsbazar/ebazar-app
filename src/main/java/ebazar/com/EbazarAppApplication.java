package ebazar.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbazarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbazarAppApplication.class, args);
		System.out.println("Events Bazaar Application Started..");
	}

}
