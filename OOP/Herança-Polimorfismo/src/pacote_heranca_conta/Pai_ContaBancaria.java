package pacote_heranca_conta;
public class Pai_ContaBancaria {
    
    //Atributos da classe pai
    private String numero;
    private double saldo;

    //Construtor da classe pai
    public Pai_ContaBancaria(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //Método para simular o ato exibir
    public void exibirDetalhes() {
        System.out.printf("Numero da conta: %s %n Saldo da conta: %.2f %n %n", numero ,saldo);
    }

    //Set e get do atributo numero
    public String getNome() {
        return numero;        
    }
    public void setNome(String numero) {
        this.numero = numero;
    }

    //Set e Get do atributo saldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
