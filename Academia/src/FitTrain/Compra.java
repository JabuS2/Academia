package FitTrain;


import java.util.ArrayList;
import java.util.Calendar;

public class Compra {

    private Membro membro;
    private Instrutor instrutor;
    private int numeroCompra;

    private double valorTotalCompra;
    
    private ArrayList<ItemCompra> Itens;

    public Compra(Membro membro,Instrutor instrutor,int numeroCompra,Calendar dataCompra) {
        this.membro = membro;
        this.instrutor = instrutor;
        this.numeroCompra = numeroCompra;
        
    }
    
    public void adicionarItemCompra(ItemCompra item) {
        if (this.Itens == null) {
            this.Itens = new ArrayList<ItemCompra>();
        }
        this.valorTotalCompra += item.getSubTotal();
        this.Itens.add(item);
    }

    public void imprimirCupomFiscal() {
    	System.out.println("-------------Fit Train------------");
        System.out.println("Compra: " + this.numeroCompra);
        System.out.println("Cliente: " + this.membro.getNomeCompleto());
        System.out.println("Instrutor Responsavel: " + this.instrutor.getNomeCompleto());

        for (ItemCompra item : this.Itens) {
            System.out.println("----------------------------------");
            System.out.println("Produto: " + item.getPlano().getNome());
            System.out.println("Quantidade: " + item.getQtd());
            System.out.println("Valor: " + item.getValorProduto());
            System.out.println("SubTotal: " + item.getSubTotal());
        }

        System.out.println("----------------------------------");
        System.out.println("Total Geral da Compra: " + this.valorTotalCompra);
        System.out.println("----------------------------------");

    }
}