package com.example.demo;

import com.example.demo.dao.OffreRepository;
import com.example.demo.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	OffreRepository off;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		off.save(new Offre("Web Design",
				"informatique", "AXA", 2, "France"));
		off.save(new Offre("Developpeur",
				"informatique","Talys", 3, "Tunisie"));
		off.save(new Offre("Architecte",
				"informatique","SIS", 2, "Allemagne"));
	}

	}
