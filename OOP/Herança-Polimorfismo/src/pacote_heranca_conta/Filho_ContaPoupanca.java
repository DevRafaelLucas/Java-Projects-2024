package pacote_heranca_conta;
public class Filho_ContaPoupanca extends Pai_ContaBancaria{
    
    //Atributo da classe contaPoupanca
    private double TaxaDeJuros;

    //Construtor da classe
    public Filho_ContaPoupanca(String numero, double saldo, double TaxaDeJuros) {
        super(numero, saldo);
        this.TaxaDeJuros = TaxaDeJuros;
    }

    // Get e Set do atributo Taxa de Juros
    public double getTaxaDeJuros() {
        return TaxaDeJuros;
    }
    public void setTaxaDeJuros(double TaxaDeJuros) {
        this.TaxaDeJuros = TaxaDeJuros;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("Juros: %.2f %n %n", TaxaDeJuros);
    }
}
