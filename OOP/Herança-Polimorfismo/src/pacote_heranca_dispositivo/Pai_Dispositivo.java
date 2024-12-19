package pacote_heranca_dispositivo;
public class Pai_Dispositivo {

/* Exercícios 25 OOP -  Crie uma superclasse "Dispositivo" com um método "informacoes". Crie duas subclasses, "Celular" e "Laptop", que sobrescrevem o método "informações" para fornecer informações específicas sobre celulares e laptops.

Passos:
Classe Dispositivo:
Atributos: marca (String), modelo (String).
Método: informacoes(), que exibe a marca e o modelo do dispositivo.

Classe Celular (herda de Dispositivo):
Atributo adicional: sistemaOperacional (String).
Método sobrescrito: informacoes(), que exibe a marca, o modelo e o sistema operacional.

Classe Laptop (herda de Dispositivo):
Atributo adicional: memoriaRAM (int).
Método sobrescrito: informacoes(), que exibe a marca, o modelo e a memória RAM.

Classe Principal App:
Crie instâncias de Celular e Laptop, e chame o método informacoes() para cada uma. */
    
    //Atributos da classe super pai(Dispositivo)
    private String marca;
    private String modelo;
    private String dispositivo;

    //Construtor da classe super pai(Dispositivo)
    public Pai_Dispositivo(String marca, String modelo, String dispositivo) {
        this.marca = marca;
        this.modelo = modelo;
        this.dispositivo = dispositivo;
    }

    //Método da classe super pai(Dispositivo)
    public void informacoes() {
        System.out.printf("Dispositvo: %s %n marca: %s %n modelo: %s %n" ,marca ,modelo ,dispositivo);
    }

    //Getter e Setter do atributo "marca" da classe super pai(Dispositivo)
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Getter e Setter do atributo "modelo" da classe super pai(Dispositivo)
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}