/**
 * 
 */
package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CidadeController {
	
	@RequestMapping("/cidades/nova")
	public String novoCliente() {
		return "cidade/CadastroCidade";
	}

}
