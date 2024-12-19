package polimorfismo;
import pacote_heranca_pessoa.Filho_Aluno;
import pacote_heranca_pessoa.Filho_Professor;
import pacote_heranca_pessoa.Pai_Pessoa;

public class PolimorfismoPessoa {
    public static void main(String[] args) {
        Pai_Pessoa[] pessoa = new Pai_Pessoa[3];

        pessoa[0] = new Filho_Aluno("Pequeno Garfanhoto", 13, "Inglês");
        pessoa[1] = new Filho_Aluno("Pequeno Garfanhoto", 13, "Inglês");
        pessoa[2] = new Filho_Professor("Guanabara", 19, "Português");       
        
        for (Pai_Pessoa SuperPessoa : pessoa) {
            SuperPessoa.apresentar();
        }
    }


}
