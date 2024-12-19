package pacote_heranca_dispositivo;
public class Filho_LapTop extends Pai_Dispositivo{
    
    //Atributo da classe super filhos(LapTop)
    public String memoriaRam;

    //Construtor da classe super filho(LapTop) que chama da classe super pai(Dispositivo)
    public Filho_LapTop(String dispositivo, String marca, String modelo, String memoriaRam) {
        super(dispositivo, marca ,modelo);
        this.memoriaRam = memoriaRam;
    }

    //Método da classe filho(LapTop) que chama da classe super pai(Dispositivo)
    public void informacoes() {
        super.informacoes();
        System.out.printf("Memoria Ram: %s %n %n", memoriaRam);
    }

    //Getter e Setter da classe super filho(lapTop)
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}
