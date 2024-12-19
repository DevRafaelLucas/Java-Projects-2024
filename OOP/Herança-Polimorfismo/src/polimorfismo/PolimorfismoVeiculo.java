package polimorfismo;
import pacote_heranca_veiculo.*;
public class PolimorfismoVeiculo {
    
    public static void main(String args[]) {
        Pai_Veiculo[] superveiculo = new Pai_Veiculo[3];

        superveiculo[0] = new Filho_Carro("Volgs", 195, 0);
        superveiculo[1] = new Filho_Moto("Yondai", 2015, 5);
        superveiculo[2] = new Filho_Carro("Gol", 1785, 12);

        for (Pai_Veiculo SuperVeiculo : superveiculo) {
            SuperVeiculo.detalhes();
        }
    }
}
