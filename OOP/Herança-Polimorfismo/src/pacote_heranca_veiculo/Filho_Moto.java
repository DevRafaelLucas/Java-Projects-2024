package pacote_heranca_veiculo;

public class Filho_Moto extends Pai_Veiculo{

    //Atributos da classe super filho(Moto)
    public int cilindradas;

    //Construtor da classe super filho que chama o construtor da classe super pai(SuperVeiculo)
    public Filho_Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas; //Chama o atributo construtor da classe pai(SuperVeiculo)
    }

    //Método que simula a ação da classe filho
    public void detalhes() {
        super.detalhes();
        System.out.printf(" %n numero de cilindradas: %d  " ,cilindradas);
    }

    //Método Getter e Setter do atributo cilindradas
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindadras(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
