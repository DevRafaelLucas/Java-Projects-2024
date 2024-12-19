//package animais;: Define que esta classe pertence ao pacote animais.
//Pacotes são usados para organizar classes relacionadas em grupos.
package pacote_heranca_pessoa;

//// Definição da classe Professor, que herda de SuperPessoa
public class Filho_Professor extends Pai_Pessoa {

    //Atributo da classe
    public String disciplina;

    //Construtor da classe Professor que chama o construtor da classe pai(SuperPessoa)
    public Filho_Professor(String nome, int idade, String disciplina) {
        super(nome, idade); // Chama o construtor da classe SuperPessoa para inicializar o nome e idade
        this.disciplina = disciplina;
    }

    //Métodos que simula apresentação
    public void apresentar() {
        super.apresentar();
        System.out.printf("disciplina: %s" ,disciplina);    
    }

    //Get e Set do atributo disciplina
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
