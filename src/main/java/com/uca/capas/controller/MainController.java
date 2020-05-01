package com.uca.capas.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uca.capas.domain.Student;

@Controller
public class MainController {

	@GetMapping(path = "/ejemplo1", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String ejemplo1() {
		return "Bienvenidos\n" + "Programacion N capas";
	}

	@GetMapping("/ejemplo2")
	public @ResponseBody List<Student> ejemplo2() {
		return Arrays.asList(new Student("Nombre1", "Apellido1", "10/10/1992", "Carrera X", true),
				new Student("Nombre2", "Apellido2", "10/10/1992", "Ingenieria en Limones", false));
	}
}