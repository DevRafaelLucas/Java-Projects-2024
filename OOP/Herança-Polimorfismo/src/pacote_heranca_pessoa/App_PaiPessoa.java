package pacote_heranca_pessoa;
public class App_PaiPessoa {
    public static void main(String[] args) throws Exception{

        Filho_Professor professor = new Filho_Professor("Elena", 38, "Matematica");
        System.out.println("");
        professor.apresentar();

        Filho_Aluno aluno = new Filho_Aluno("Jaime", 22, "Matematica");
        System.out.println("");
        aluno.apresentar();
    }
}