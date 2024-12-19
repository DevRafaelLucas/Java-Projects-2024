//package animais;: Define que esta classe pertence ao pacote animais.
//Pacotes são usados para organizar classes relacionadas em grupos.
package pacote_heranca_animais;

// Definição da classe Animal
public class Pai_Animal {

// Atributo privado para armazenar o nome do animal
private String nome;

// Construtor da classe Animal que inicializa o nome
public Pai_Animal(String nome) {
this.nome = nome;
}

// Método para simular o ato de comer
public void comer() {
System.out.printf("%s comeu\n", nome);
}

// Método para simular o ato de beber
public void beber() {
System.out.printf("%s bebeu\n", nome);
}

// Método getter para obter o nome do animal
public String getNome() {
return nome;
}

// Método setter para definir o nome do animal
public void setNome(String nome) {
this.nome = nome;
}

}
