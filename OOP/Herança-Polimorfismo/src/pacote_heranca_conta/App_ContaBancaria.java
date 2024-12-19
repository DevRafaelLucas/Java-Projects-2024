package pacote_heranca_conta;
public class App_ContaBancaria {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Conta Poupança");
        Filho_ContaPoupanca poupanca = new Filho_ContaPoupanca("2272-2", -1000, 10);
        poupanca.exibirDetalhes();
        System.out.println("");

        System.out.println("Conta Corrente");
        Filho_ContaCorrente corrente = new Filho_ContaCorrente("6265-4", -124, 8);
        corrente.exibirDetalhes();
        System.out.println("");
    }
}
