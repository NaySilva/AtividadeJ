package br.edu.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.entity.Participante;

public class GenericJPADAO<T> implements GenericDAO<T>{
	
	private EntityManager em;
	private Class<T> classe;
	
	public GenericJPADAO(Class<T> classe) {
		this.classe = classe;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade-j");
		em = emf.createEntityManager();
	}

	@Override
	public void save(Participante entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	@Override
	public void delete(int id) {
		Participante entity = em.find(Participante.class, id);
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
		
	}

	@Override
	public T find(int id) {
		T entity = em.find(classe, id);
		return entity;
	}

	@Override
	public List<T> findAll() {
		Query query = em.createQuery("from Participante as p");
		List<T> lista = query.getResultList();
		return lista;
	}

	@Override
	public T findByCpf(String cpf) {
		Query query = em.createQuery("from Participante as p where cpf = :paramCpf", Participante.class);
		query.setParameter("paramCpf", cpf);
		T entity = (T) query.getSingleResult();
		return entity;
	}

	@Override
	public List<T> findByNome(String str) {
		Query query = em.createQuery("from Participante as p where nome = :paramStr)",Participante.class);
		query.setParameter("paramStr", "%"+str+"%");
		List<T> lista = query.getResultList();
		return lista;
	}

}
