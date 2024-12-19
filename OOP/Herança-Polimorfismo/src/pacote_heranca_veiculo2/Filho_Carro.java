package pacote_heranca_veiculo2;
public class Filho_Carro extends Pai_Veiculo2 {
    
    //Atributo da classe filho
    public double consumoPorKm;

    //Construtor da classe filho que chama da classe pai
    public Filho_Carro(String veiculo, String modelo, double capacidadeTanque, double consumoPorKm) {
        super(veiculo, modelo, capacidadeTanque);
        this.consumoPorKm = consumoPorKm;
    }

    //Método da classe filho que chama da classe pai
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Consumo por Km: %2f %n %n", consumoPorKm);
    }

    //Getter e Setter do atributo consumoPorKm da classe filho
    public double getConsumoPorKm() {
        return consumoPorKm;
    }
    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
}
