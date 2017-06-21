package org.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.stackroute.model.Car;
import org.stackroute.producer.MsgGenerator;

@SpringBootApplication
public class AsMsgGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsMsgGeneratorApplication.class, args);
		Car car = new Car("Passat", "Volkswagen", "ABC-123");
		MsgGenerator mg = new MsgGenerator();
		mg.sendMsg(car);
	}
}
