package FitTrain;

import java.util.Calendar;

public class Instrutor extends Pessoa {
	



	private int cref;
	private double salario;
	private int jornadaMensal;

	
	
	
	 public Instrutor(String nomeCompleto, String email, Endereco endereco, String telefone, Calendar dataNasc,
			String documento, int cref, double salario) {
		super(nomeCompleto, email, endereco, telefone, dataNasc, documento);
		this.cref = cref;
		this.salario = salario;	
	}
	 
		public int getCref() {
			return cref;
		}




		public void setCref(int cref) {
			this.cref = cref;
		}




		public double getSalario() {
			return salario;
		}




		public void setSalario(double salario) {
			this.salario = salario;
		}




		public int getJornadaMensal() {
			return jornadaMensal;
		}




		public void setJornadaMensal(int jornadaMensal) {
			this.jornadaMensal = jornadaMensal;
		}



}
