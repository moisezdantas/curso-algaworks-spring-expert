package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientesController {

	@RequestMapping("/clientes/novo")
	public String novoCliente() {
		return "cliente/CadastroCliente";
	}
}
