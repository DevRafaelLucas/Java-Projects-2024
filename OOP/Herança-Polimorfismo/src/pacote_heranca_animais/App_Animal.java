package pacote_heranca_animais;
public class App_Animal {
    public static void main(String[] args) throws Exception {
        
        Filho_Cachorro cachorro = new Filho_Cachorro("Spike");
        cachorro.latir();
        cachorro.comer();
        cachorro.lamber();

        Filho_Gato gato = new Filho_Gato("Tom");
        gato.miar();
        gato.comer();
        gato.beber();

    }
}
