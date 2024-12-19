//package animais;: Define que esta classe pertence ao pacote animais.
//Pacotes são usados para organizar classes relacionadas em grupos.
package pacote_heranca_pessoa;
public class Pai_Pessoa { //Define que esta classe pertence ao pacote animais. Pacotes são usados para organizar classes relacionadas em grupos.
    
    //Atributo privado para armazenar o nome e idade da pessoa
    private String nome;
    private int idade;

    //Construtor da classe Animal que inicializa o nome
    public Pai_Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Método para simular o ato de apresentar
    public void apresentar() {
        System.out.printf("%s de %s apresentou %n" , nome, idade + " anos");
    }

    //Método getter para obter o nome e idade da pessoa
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    //Método setter para definir o nome do animal
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
