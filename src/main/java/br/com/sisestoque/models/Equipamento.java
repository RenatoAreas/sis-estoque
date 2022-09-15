package br.com.sisestoque.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sisestoque.enums.Tipo;
import lombok.Data;

@Data
@Entity
public class Equipamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, unique = true, nullable = false)
	private Integer numeroDeSerie;
	
	@Column(length = 10, unique = true, nullable = false)
	private Integer patrimonio;
	
	@Column(length = 150, nullable = false)
	private String nome;
	
	@Column(length = 100, nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private Tipo tipo; 
	

}
