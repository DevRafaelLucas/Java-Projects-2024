package pacote_heranca_veiculo2;

public class App_Veiculo {

    public static void main(String[] args) throws Exception {
        Filho_Carro carro = new Filho_Carro("Carro", "Diy", 5, 14);
        carro.exibirInformacoes();

        Filho_Caminhao caminhao = new Filho_Caminhao("Caminhão", "2013", 13, 16);
        caminhao.exibirInformacoes();

        Filho_Moto moto = new Filho_Moto("Moto", "2013", 13, "stckly");
        moto.exibirInformacoes();
    }
}