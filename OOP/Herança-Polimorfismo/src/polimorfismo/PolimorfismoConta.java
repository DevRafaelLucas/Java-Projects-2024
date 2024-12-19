package polimorfismo;
import pacote_heranca_conta.Filho_ContaPoupanca;
import pacote_heranca_conta.Pai_ContaBancaria;

public class PolimorfismoConta {
   public static void main(String[] args) {
    Pai_ContaBancaria[] conta = new Pai_ContaBancaria[3];

    conta[0] = new Pai_ContaBancaria("2275-6", 13);
    conta[1] = new Filho_ContaPoupanca("5123-5", 18000, 50000);
    conta[2] = new Pai_ContaBancaria("1526-7", 82);

    for (Pai_ContaBancaria ContaBancaria : conta) {
        ContaBancaria.exibirDetalhes();
        
    }
} 
}
