package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {
	public static void main(String[] args) {

		
		// dados prontos para gravar
		Contato contato = new Contato();
		
		/*contato.setNome("Thiago");
		contato.setEmail("thiagoheavy@hotmail.com");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());*/
		contato.setId((long) 2);
		

		// gravar dados nesta conexão
		ContatoDAO dao = new ContatoDAO();

		// método elegante
		dao.remove(contato);

		System.out.println("Removido!");
	}

}
