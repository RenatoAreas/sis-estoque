package br.com.sisestoque.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cartorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 150, unique = true, nullable = false)
	private Integer numero;
	
	@Column(length = 70, unique = true, nullable = false)
	private String municipio;
	
	@Column(length = 150, unique = true, nullable = false)
	private String responsavel;
	
	@Column(length = 150, unique = true, nullable = false)
	private String coresponsavel;

}
