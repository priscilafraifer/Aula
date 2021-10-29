package com.aula.Aula;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AulaControler {

	@GetMapping ("/") 
	public String principal() {
		return "index";
	}
	
	@GetMapping ("/sobre") 
	public String pagSobre() {
		return "sobre";
	}
	
	@GetMapping ("/curiosidades") 
	public String pagCuriosidades() {
		return "curiosidades";
	}
	
	@GetMapping ("/favoritos") 
	public String pagFavoritos() {
		return "favoritos";
	}
	
}
