package alura.edi.aulas.collections;

public class TestaBuscaAlunosNoCurso
{
    public static void main(String[] args)
    {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
        javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList 3", 33));
        javaColecoes.adiciona(new Aula("Criando uma aula", 23));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 3));

        Aluno a1 = new Aluno("Aa", 1);
        Aluno a2 = new Aluno("Bb", 2);
        Aluno a3 = new Aluno("Cc", 3);
        Aluno a4 = new Aluno("EE", 3);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        
        System.out.println(javaColecoes.getAlunos());
        
        System.out.println("Quem é o aluno com matrícula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(3);
        System.out.println(aluno); //vai apagar a3 e deixar apenas a4
        
        //uma chave que tem por referência um conjunto de alunos
        
        //Map<Integer, Set<Aluno>> matriculaParaAlunos;
        
        //é melhor ter uma classe de matrícula que possui aluno e curso
    }

}
