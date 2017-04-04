package com.matheuspcarvalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.matheuspcarvalho.models.CarroModel;

@Controller
@RequestMapping("/carro")
public class CarroController {

	@GetMapping("/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("cadastroCarro");
		modelAndView.addObject(new CarroModel());
		return modelAndView;
	}

	@PostMapping("/novo")
	public String salvar(@Validated CarroModel carro, Errors errors, RedirectAttributes attributes) {
		if (errors.hasErrors()) {
			return "cadastroCarro";
		}

		System.out.println("Carro Válido");
		return "cadastroCarro";
	}

}
