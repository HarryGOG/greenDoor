package com.kmercab.bnb.greenDoor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class GreenDoorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenDoorApplication.class, args);
	}

}