package com.example.mdbspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mdbspringboot.repository.ItemRepository;

@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMongoDbApplication implements CommandLineRunner {
	
	@Autowired
    ItemRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
