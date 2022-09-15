package br.com.sisestoque.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisestoque.models.Cartorio;

public interface ICartorioRepository extends JpaRepository<Cartorio, Integer>{
	
	List<Cartorio> findAll();
	
	List<Cartorio> findByNumero();
	
	List<Cartorio> findByMunicipio();

}
