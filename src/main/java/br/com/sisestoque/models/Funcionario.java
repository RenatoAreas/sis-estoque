package br.com.sisestoque.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sisestoque.enums.Cargos;
import lombok.Data;

@Data
@Entity
public class Funcionario {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 150, nullable = false )
	private String nome;
	
	@Column(length = 8, unique = true, nullable = false)
	private Integer matricula;
	
	@Column(unique = true, nullable = false)
	private Cargos cargo;

}
