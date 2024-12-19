package polimorfismo;
import pacote_heranca_dispositivo.*;
public class PolimorfismoDispositivo {
   
    public static void main(String[] args) {
        Pai_Dispositivo[] dispositivo = new Pai_Dispositivo[3];

        dispositivo[0] = new Filho_Celular("Celular", "Sansung", "A01", "Linux");
        dispositivo[1] = new Filho_LapTop("Xuxa", "2,0", "Full", "16");
        dispositivo[2] = new Filho_Celular("Celular", "Sansung", "A0230", "Android");

        for (Pai_Dispositivo Dispositivo : dispositivo) {
            Dispositivo.informacoes();

        }
    }
}
