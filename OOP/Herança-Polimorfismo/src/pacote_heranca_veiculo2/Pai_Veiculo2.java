package pacote_heranca_veiculo2;
public class Pai_Veiculo2 {
    
    /* Sistema de Veículos

Exercícios 28 OOP - Simule um sistema de veículos com verificações de consumo e capacidade de carga.
Passos:

Classe Veiculo:
Atributos: modelo (String), capacidadeTanque (double).
Método: exibirInformacoes() que exibe as informações básicas.

Classe Carro (herda de Veiculo):
Atributo adicional: consumoPorKm (double).
Método sobrescrito exibirInformacoes(): adiciona o consumo por quilômetro às informações exibidas.

Classe Caminhao (herda de Veiculo):
Atributo adicional: capacidadeCarga (double).
Método sobrescrito exibirInformacoes(): adiciona a capacidade de carga às informações exibidas.

Classe Moto (herda de Veiculo):
Atributo adicional: tipoMotor (String).
Método sobrescrito exibirInformacoes(): adiciona o tipo de motor às informações exibidas.

Classe Principal App:
Crie instâncias de Carro, Caminhao e Moto, configure seus atributos e exiba as informações usando o método exibirInformacoes(). */

    //Atributo da classe pai
    private String veiculo;
    private String modelo;
    private double capacidadeTanque;

    //Construtor da classe pai
    public Pai_Veiculo2(String veiculo, String modelo, double capacidadeTanque) {
        this.veiculo = veiculo;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Método da classe pai
    public void exibirInformacoes() {
        System.out.printf("Veiculo: %s %n modelo: %s %n Capacidade do Tanque %2f %n ", veiculo, modelo, capacidadeTanque);
    }

    //Getter e Setter do atributo modelo da classe pai
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Getter e Setter do atributo "Capacidade Tanque" da classe pai
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

}
