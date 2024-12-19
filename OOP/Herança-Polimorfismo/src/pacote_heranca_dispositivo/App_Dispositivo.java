package pacote_heranca_dispositivo;
public class App_Dispositivo {

    //Exibição da classe super pai
    public static void main(String[] args) throws Exception{
        
        Filho_Celular celular = new Filho_Celular("Celular", "A01", "Kali Linux", "Linux");
        celular.informacoes();

        Filho_LapTop laptop = new Filho_LapTop("LapTop", "Xuxa", "2.0", "1");
        laptop.informacoes();
    }
    
}