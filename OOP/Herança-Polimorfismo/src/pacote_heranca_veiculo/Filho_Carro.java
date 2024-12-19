package pacote_heranca_veiculo;
public class Filho_Carro extends Pai_Veiculo {

    //Atributos da classe super filho(carro)
    public int numPortas;

    //Construtor da classe super filho(Carro) que chama o construtor da classe super pai(SuperVeiculo)
    public Filho_Carro(String marca, int ano, int numPortas) {
        super(marca, ano); //Chama o construtor da classe super pai(SuperVeiculo)
        this.numPortas = numPortas;
    }
    //Método que simula os detalhes da claase filhos(Carro)
    public void detalhes() {
        super.detalhes();
        System.out.printf("%n Número de portas: %d %n %n", numPortas);
    }

    //Getter e Setter da classe super filho(Carro)
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
