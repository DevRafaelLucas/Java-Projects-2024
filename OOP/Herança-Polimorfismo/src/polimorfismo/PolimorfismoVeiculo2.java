package polimorfismo;
import pacote_heranca_veiculo2.*;

public class PolimorfismoVeiculo2 {
    
    public static void main(String[] args) {
        Pai_Veiculo2[] veiculo2 = new Pai_Veiculo2[3];

        veiculo2[0] = new Filho_Carro("Carro", "Yondai", 5, 1000);
        veiculo2[1] = new Filho_Caminhao("Gol", "Cavalo07", 12, 32);
        veiculo2[2] = new Filho_Moto("YOndai", "nullnull", 97, "13 Cavalos");

        for (Pai_Veiculo2 PaiVeiculo2 : veiculo2) {
            PaiVeiculo2.exibirInformacoes();
        }
    }
}
