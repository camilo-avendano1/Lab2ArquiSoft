package com.udea.lab2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab2ApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void healthCheck() {
		assert dataController.healthCheck().equals("Health Check OK!");
	}

	@Test
	void version() {
		assert dataController.version().equals("The actual version is 1.0.0");
	}

	@Test
	void nationLength(){
		Integer length = dataController.getRandomnNations().size();
		assert length.equals(10);
	}

	@Test
	void currencyLength(){
		Integer length = dataController.getRandomCurrencies().size();
		assert length.equals(10);
	}
}
