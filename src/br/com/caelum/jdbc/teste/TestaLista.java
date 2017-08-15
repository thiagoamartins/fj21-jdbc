package br.com.caelum.jdbc.teste;


import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		//criando ContatoDAO
		ContatoDAO dao = new ContatoDAO();
		
		//listando contatos com o DAO
		List<Contato> contatos = dao.getLista();
		
		//iterando nesta lista e imprimindo as informações dos contatos
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
			
		
		}
		
	}

}


//SimpleDateFormat