package pacote_heranca_dispositivo;
public class Filho_Celular extends Pai_Dispositivo{
    
    //Atributos da classe super filho
    public String sistemaOperacional;

    //Construtor da classe super filhos(Celular) que chama a classe super pai(Dispositivo)
    public Filho_Celular(String dispositivo, String marca, String modelo, String sistemaOperacional) {
        super(dispositivo, marca ,modelo);
        this.sistemaOperacional = sistemaOperacional;
    }

    //Método da classe filho(Celular) que chama da classe pai(Dispositivo)
    public void informacoes() {
        super.informacoes();
        System.out.printf("Sistema operacional: %s %n %n" ,sistemaOperacional);
    }
    
    //Getter e Setter do atributo Sistema Operacional
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
