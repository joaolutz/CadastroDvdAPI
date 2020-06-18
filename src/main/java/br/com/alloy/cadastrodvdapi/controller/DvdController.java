package br.com.alloy.cadastrodvdapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alloy.cadastrodvdapi.model.Dvd;
import br.com.alloy.cadastrodvdapi.repository.DvdRepository;


@RestController
@RequestMapping(path = "/dvd")
public class DvdController {
	
	@Autowired
	private DvdRepository dvdRepository;
	 
	@PostMapping("/cadastrar")
	public Dvd cadastrar(@RequestBody Dvd dvd) {
		return dvdRepository.save(dvd);
	}
	
	@GetMapping("/list")
	public List<Dvd> list() {
		return dvdRepository.findAll();
	}
	
	@GetMapping("/list2")
	public List<Dvd> list2() {
		return dvdRepository.findAll(Sort.by("titulo"));
	}
	
}
