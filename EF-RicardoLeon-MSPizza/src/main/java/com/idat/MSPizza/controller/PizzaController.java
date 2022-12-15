package com.idat.MSPizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MSPizza.model.Pizza;
import com.idat.MSPizza.service.PizzaService;

@Controller
@RequestMapping("/api/pizza/v1")
public class PizzaController {
	@Autowired
	private PizzaService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizza pizza) {
		service.guardar(pizza);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarPizzaCliente();
	}
}
