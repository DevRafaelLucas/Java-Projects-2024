package pacote_heranca_conta;
public class Filho_ContaCorrente extends Pai_ContaBancaria{
    
    //Atributo da classe contaPoupanca
    private double limite;

    //Construtor da classe
    public Filho_ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    // Get e Set do atributo Taxa de Juros
    public double getLimite() {
        return limite;
    }
    public void setlimite(double limite) {
        this.limite = limite;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("Limite: %.2f ", limite);
    }
}
