package pacote_heranca_veiculo;
public class Pai_Veiculo {

    /* Exercícios 24 OOP -  Crie uma superclasse "Veiculo" com um método "detalhes". Crie duas subclasses, "Carro" e "Moto", que sobrescrevem o método "detalhes" para fornecer informações específicas sobre carros e motos.

Passos:

Classe Veiculo:
Atributos: marca (String), ano (int).
Método: detalhes(), que exibe a marca e o ano do veículo.

Classe Carro (herda de Veiculo):
Atributo adicional: numPortas (int).
Método sobrescrito: detalhes(), que exibe a marca, o ano e o número de portas.

Classe Moto (herda de Veiculo):
Atributo adicional: cilindradas (int).
Método sobrescrito: detalhes(), que exibe a marca, o ano e as cilindradas.

Classe Principal App:
 Crie instâncias de Carro e Moto, e chame o método detalhes() para cada uma. */

    //Atributos da classe super pai(Super_veiculo)
    private String marca;
    private int ano;

    //Construtor da classe super pai(Super_veiculo)
    public Pai_Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    //Método da classe super pai(Super_veiculo)
    public void detalhes() {
        System.out.printf("Detalhe do veiculo: %n Nome: %s %n Ano: %d", marca, ano);
    }

    //Método getter e setter do atributo marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Método getter e setter do atributo ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


}
