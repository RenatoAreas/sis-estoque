package br.com.sisestoque.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sisestoque.dtos.ResponseFuncionarioDto;
import io.swagger.annotations.ApiOperation;

@RestController
public class FuncionarioController {
	@ApiOperation("Serviço para cadastrar um funcionario")
	@PostMapping("/v1/cadastrar")
	public ResponseEntity<ResponseFuncionarioDto> cadastrar (){
		
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

}
