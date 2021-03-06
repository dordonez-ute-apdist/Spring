package com.example.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@RequestMapping("/saludo")
	public ResponseEntity<String> hola() {
		return new ResponseEntity<String>("Hola Mundo !!!", HttpStatus.OK);
	}

	@GetMapping("/saludoN")
	public ResponseEntity<String> holaNombre(@RequestParam(name = "n") String nombre, @RequestParam(name = "ape") String apellido) {
		String str = nombre.toUpperCase() + apellido.toUpperCase();
		return new ResponseEntity<String>("Hola " + str, HttpStatus.OK);
	}
	
	@PostMapping("/saludoC")
	public ResponseEntity<String> holaCargo(@RequestParam(name = "c") String cargo) {
		return new ResponseEntity<String>("Hola estimado " + cargo, HttpStatus.OK);
	}	
	
	@GetMapping("/saludoR")
	public ResponseEntity<String> holaRedirect() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "NewFile.html");		
		return new ResponseEntity<String>(headers, HttpStatus.TEMPORARY_REDIRECT);
	}		
	
}
