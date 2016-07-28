package br.edu.entity;

import java.util.List;

import br.edu.dal.GenericDAO;
import br.edu.dal.GenericJPADAO;

public class ParticipanteRepository {
	private GenericDAO<Participante> dao;
	
	public ParticipanteRepository(){
		this.dao = new GenericJPADAO<>(Participante.class);
	}
	
	public void save(Participante p){
		dao.save(p);
	}
	
	public void delete(Participante p){
		dao.delete(p.getId());
	}
	
	public Participante find(int id){
		return dao.find(id);
	}
	
	public List<Participante> findAll(){
		return dao.findAll();
	}
	
	public Participante findByCpf(String cpf){
		return dao.findByCpf(cpf);
	}

}
