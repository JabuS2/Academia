package FitTrain;

import java.util.Calendar;

public class Pessoa {
	
	private String nomeCompleto;
	private String email;
	private Endereco endereco;
	private String telefone;
	private Calendar dataNasc;
	private String documento;

	
	public Pessoa(String nomeCompleto,String email,Endereco endereco,String telefone,Calendar dataNasc, String documento){
		this.nomeCompleto =	 nomeCompleto;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.documento = documento;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public String getDocumento() {
		return documento;
	}



}
