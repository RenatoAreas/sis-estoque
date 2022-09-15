package br.com.sisestoque.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisestoque.models.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
	List<Funcionario> findAll();
	
	List<Funcionario> findByMatricula();

}
