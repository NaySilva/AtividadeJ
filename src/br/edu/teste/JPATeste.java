package br.edu.teste;

import br.edu.entity.ParticipanteRepository;

public class JPATeste {

	public static void main(String[] args) {
		
		ParticipanteRepository repository = new ParticipanteRepository();
		//Participante p = new Participante("321", "Ana", "222-2123", "perfil3");
		//repository.save(p);
		//System.out.println(repository.find(2));
		//repository.delete(p);
		System.out.println(repository.findByCpf("123"));
	}

}
