package alura.edi.aulas.collections;

public class TestaCursoComAlunos
{
    public static void main(String[] args)
    {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
        javaColecoes.getAulas(); 

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList 3", 33)); 
        javaColecoes.adiciona(new Aula("Criando uma aula", 23));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 3));
        
        Aluno a1 = new Aluno("A", 1);
        Aluno a2 = new Aluno("B", 2);
        Aluno a3 = new Aluno("C", 3);
        
        javaColecoes.matricula(a1); //criar método crtl+1
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
    }

}
