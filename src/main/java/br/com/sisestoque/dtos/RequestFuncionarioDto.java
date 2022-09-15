package br.com.sisestoque.dtos;

import br.com.sisestoque.enums.Cargos;
import lombok.Data;

@Data
public class RequestFuncionarioDto {
	
	private String nome;
	private Integer matricula;
	private Cargos cargo;
}
