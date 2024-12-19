package pacote_heranca_veiculo;
public class App_Veiculo {
    
    public static void main(String[] args) throws Exception{
        
        Filho_Carro carro = new Filho_Carro("Fiat uno", 2015, 0);
        carro.detalhes();

        Filho_Moto moto = new Filho_Moto("Honda", 2018, 10);
        moto.detalhes();

    }
}
