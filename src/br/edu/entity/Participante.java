package br.edu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Participante {
	
	@Id
	@GeneratedValue
	private int id;
	private String cpf;
	private String nome;
	private String fone;
	private String perfil;
	
	public Participante(String cpf, String nome, String fone, String perfil) {
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;
		this.perfil = perfil;
	}
	
	Participante(){}
	
	@Override
	public String toString() {
		return nome + " > " + cpf;
	}

	public int getId() {
		return id;
	}

	public String getCpf() {
		// TODO Auto-generated method stub
		return cpf;
	}
	
	
	

}
