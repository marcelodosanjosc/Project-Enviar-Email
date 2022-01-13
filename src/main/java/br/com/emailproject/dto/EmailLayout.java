package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	
	public Email montarEmailAdmin(String destinatario, String assunto) {
		StringBuilder texto = new StringBuilder();
	
		texto
		.append("A/C Administrador")
		.append(QUEBRA_DE_LINHA_DUPLA);
		texto
		.append("Teste de e-mail")
		.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
	private String gerarRodape(StringBuilder texto) {
		return texto.append("Marcelo Caldas - DEVOPS").toString();
	}

}
