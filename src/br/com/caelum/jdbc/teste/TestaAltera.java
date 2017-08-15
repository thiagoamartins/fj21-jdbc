package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {
	public static void main(String[] args) {

		
		// dados prontos para gravar
		Contato contato = new Contato();
		
		contato.setNome("Thiago");
		contato.setEmail("thiagoheavy@hotmail.com");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 1);
		

		// gravar dados nesta conexão
		ContatoDAO dao = new ContatoDAO();

		// método elegante
		dao.altera(contato);

		System.out.println("Atualizado!");
	}

}
