package br.edu.dal;

import java.util.List;

import br.edu.entity.Participante;

public interface GenericDAO<T> {
	
	void save(Participante entity);
	
	void delete(int id);
	
	T find(int id);
	
	List<T> findAll();
	
	T findByCpf(String cpf);
	
	List<T> findByNome(String str);
	

}
