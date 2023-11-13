package com.tenth.tenth.controllers;

import com.tenth.tenth.model.Info;
import com.tenth.tenth.repositories.InfoRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	private final InfoRepository infoRepository;
	public InfoController(InfoRepository infoRepository) {
		this.infoRepository = infoRepository;
	}
	@GetMapping("/info")
	public List<Info> getInfo() {
		return infoRepository.findAll();
	}
}
