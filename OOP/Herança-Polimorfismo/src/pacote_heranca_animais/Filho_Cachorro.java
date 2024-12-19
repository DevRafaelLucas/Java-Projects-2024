package pacote_heranca_animais;

// Definição da classe Cachorro, que herda de Animal
public class Filho_Cachorro extends Pai_Animal {

// Construtor da classe Cachorro que chama o construtor da classe pai (Animal)
public Filho_Cachorro(String nome) {
super(nome); // Chama o construtor da classe Animal para inicializar o nome
}

// Método para simular o ato de latir
public void latir() {
// Imprime uma mensagem indicando que o cachorro latiu
System.out.printf("%s latiu\n", getNome());
}

// Método para simular o ato de lamber
public void lamber() {
// Imprime uma mensagem indicando que o cachorro lambeu
System.out.printf("%s lambeu\n",
getNome());
}

}
