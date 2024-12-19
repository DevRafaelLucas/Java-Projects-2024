package pacote_heranca_animais;
// Declaração da classe Gato, que herda da classe Animal
public class Filho_Gato extends Pai_Animal {

// Construtor da classe Gato que chama o construtor da classe pai (Animal)
public Filho_Gato(String nome) {
super(nome); // Chama o construtor da classe Animal para inicializar o nome
}

// Método para simular o ato de miar
public void miar() {
// Imprime uma mensagem indicando que o gato miou
System.out.printf("%s miou\n", getNome());
}

}
