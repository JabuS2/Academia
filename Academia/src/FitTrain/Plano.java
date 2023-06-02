package FitTrain;

public class Plano {
	private String nome;
	private int duracaoM;
	private double precoM;
	
	 public Plano(String nome, int duracao, double preco) {
	        this.nome = nome;
	        this.duracaoM = duracao;
	        this.precoM = preco;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getDuracaoM() {
	        return duracaoM;
	    }

	    public void setDuracaom(int duracaoM) {
	        this.duracaoM = duracaoM;
	    }
	    public double getPrecoM() {
	        return precoM;
	    }

	    public void setPrecoM(double precoM) {
	        this.precoM = precoM;
	    }

}
