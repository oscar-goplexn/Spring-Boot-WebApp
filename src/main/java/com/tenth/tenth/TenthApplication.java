package com.tenth.tenth;

import com.tenth.tenth.repositories.InfoRepository;
import com.tenth.tenth.model.Info;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TenthApplication implements CommandLineRunner {

	private final InfoRepository infoRepository;

	public TenthApplication(InfoRepository infoRepository) {
		this.infoRepository = infoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TenthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (infoRepository.findAll().isEmpty()) {
			infoRepository.save(new Info("John", "Doe"));
			infoRepository.save(new Info("Asif", "Jain"));
			infoRepository.save(new Info("Akash", "Sharif"));
			infoRepository.save(new Info("Araf", "Sharif"));
		}
		for (Info info : infoRepository.findAll()) {
			System.out.println(info);
		}
	}
}
