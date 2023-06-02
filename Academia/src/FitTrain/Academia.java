package FitTrain;


import java.util.Calendar;

public class Academia {

    public static void main(String[] args) {

        Endereco endMembro = new Endereco("Trump Tower", "Fiusa", "123",
                "Serrana", "SP", "14021615");

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(Calendar.YEAR, 1995);
        dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
        dataNascimento.set(Calendar.DAY_OF_MONTH, 20);

        Membro membro = new Membro("Arnold bisnaga","natasha@reges.edu.br",endMembro,"0028922",dataNascimento,"3351212");
        
        
        Endereco endInstrutor = new Endereco("Vingadores Tower",
                "João Rossi", 
                "9888",
                "Serrana", 
                "SP", 
                "14021618");
        
        
        Calendar dataNasInstr = Calendar.getInstance();
        dataNasInstr.set(Calendar.YEAR, 1995);
        dataNasInstr.set(Calendar.MONTH, Calendar.MARCH);
        dataNasInstr.set(Calendar.DAY_OF_MONTH, 20);

        Instrutor instrutor = new Instrutor("Joao Frango","clint@reges.edu.br",endInstrutor,"3212121",dataNasInstr, 
                "123456",1235,2000);   
        

        
        
        Plano planoMensal = new Plano("Plano Mensal", 30, 100);
        Plano planoTrimestral = new Plano("Plano Trimestral", 30, 265) ;
        Plano planoSemestral = new Plano("Plano Semestral", 180,510 );
        Plano planoAnual = new Plano("Plano Anual", 360, 900);
        
        Calendar dataVenda = Calendar.getInstance();
        dataVenda.set(Calendar.YEAR, 2023);
        dataVenda.set(Calendar.MONTH, Calendar.MARCH);
        dataVenda.set(Calendar.DAY_OF_MONTH, 20);
        
                
        Compra compra = new Compra(membro, instrutor,12, dataVenda );
        
        ItemCompra item1 = new ItemCompra(compra, planoSemestral, 1,510);

        
        compra.adicionarItemCompra(item1);

        compra.imprimirCupomFiscal();
    }
}
