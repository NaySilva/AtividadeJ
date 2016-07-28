package br.edu.entity;

import br.edu.dal.GenericDAO;
import br.edu.dal.GenericJPADAO;

public class ParticipanteRepository {
	private GenericDAO<Participante> dao;
	
	private ParticipanteRepository(){
		this.dao = new GenericJPADAO<>(Participante.class);
	}
	
	private void save(Participante p){
		dao.save(p);
	}
	
	private void delete(Participante p){
		dao.delete(p.getId());
	}
	
	private void find(int id){
		dao.find(id);
	}
	
	private void find(){
		dao.find();
	}
	
	private void findByCpf(Participante p){
		dao.findByCpf(p.getCpf());
	}

}
