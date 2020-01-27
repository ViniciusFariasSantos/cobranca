package com.vinicius.cobranca.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloControler {

	@RequestMapping("/titulo/novo")
	public String novo() {
		return "CadastroTitulo";
		
	}
	
}
