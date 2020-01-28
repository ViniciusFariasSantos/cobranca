package com.vinicius.cobranca.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vinicius.cobranca.model.Titulo;
import com.vinicius.cobranca.repositoy.ReposiTitulos;

@Controller
@RequestMapping("/titulo")
public class TituloControler {

	@Autowired
	private ReposiTitulos titulos;
	
	@RequestMapping("/novo")
	public String novo() {
		
		return "CadastroTitulo";
		
	}
	
	
	@RequestMapping("/Pesquisa")
	public String pesq() {
		
		return "Pesquisa";
		
	}
	
	@RequestMapping(value="/novo", method = RequestMethod.POST )
	public ModelAndView salvar(Titulo  titulo ) {
		
		
		
		titulos.save(titulo);
		
		ModelAndView mv = new ModelAndView("CadastroTitulo");
				
		mv.addObject("mensagem", "Titulo salvo com Sucesso");
		
		return   mv;
		
	}
	
}
