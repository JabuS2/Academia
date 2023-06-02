package FitTrain;

public class ItemCompra {

    private Compra compra;
    private Plano plano;    
    private double qtd;
    private double valorProduto;
    private double subTotal;
    
    public ItemCompra(Compra compra, Plano plano, double qtd, double valorProduto) {
        this.compra = compra;
        this.plano = plano;
        this.qtd = qtd;
        this.valorProduto = valorProduto;
        this.subTotal = qtd * valorProduto;
        
    }
    
    
    public Compra getCompra() {
        return compra;
    }

    public Plano getPlano() {
        return plano;
    }

    public double getQtd() {
        return qtd;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public double getSubTotal() {
        return subTotal;
    }
  
  
    
}