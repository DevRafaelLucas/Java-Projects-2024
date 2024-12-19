package pacote_heranca_veiculo2;
public class Filho_Moto extends Pai_Veiculo2 {

    //Atributo da classe filho
    public String tipoMotor;

    //Construtor da classe filho que chama da classe pai
    public Filho_Moto(String veiculo, String modelo, double capacidadeTanque, String tipoMotor) {
        super(veiculo, modelo, capacidadeTanque);
        this.tipoMotor = tipoMotor;
    }

    //Método da classe filho que chama da classe pai
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Tipo de motor: %s %n %n", tipoMotor);
    }

    //Getter e Setter do atributo consumoPorKm da classe filho
    public String gettipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
