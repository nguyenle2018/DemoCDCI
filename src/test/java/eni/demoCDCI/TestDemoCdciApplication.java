package eni.demoCDCI;

import org.springframework.boot.SpringApplication;

public class TestDemoCdciApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoCdciApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
