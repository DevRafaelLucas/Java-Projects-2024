//package animais;: Define que esta classe pertence ao pacote animais.
//Pacotes são usados para organizar classes relacionadas em grupos.
package pacote_heranca_pessoa;

// Definição da classe Aluno, que herda de SuperPessoa
public class Filho_Aluno extends Pai_Pessoa {

    //Atributo da classe Aluno
    public String curso;

    // Construtor da classe Aluno que chama o construtor da classe pai (SuperPessoa)
    public Filho_Aluno(String nome, int idade, String curso) {
        super(nome, idade); // Chama o construtor da classe SuperPessoa para inicializar o nome e idade
        this.curso = curso;
    }

    //Get e Set do atributo disciplina
    public String getDisciplina() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void apresentar() {
        super.apresentar();
        System.out.printf("curso: %s %n %n" ,curso);
    }
}
