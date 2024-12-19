package pacote_heranca_veiculo2;
public class Filho_Caminhao extends Pai_Veiculo2 {
    
    //Atributo da classe filho
    public double capacidadeCarga;

    //Construtor da classe filho que chama da classe pai
    public Filho_Caminhao(String veiculo, String modelo, double capacidadeTanque, double capacidadeCarga) {
        super(veiculo, modelo, capacidadeCarga);
        this.capacidadeCarga = capacidadeCarga;
    }

    //Método da classe filho que chama da classe pai
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Capacidade por carga: %2f %n %n", capacidadeCarga);
    }

    //Getter e Setter do atributo consumoPorKm da classe filho
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
