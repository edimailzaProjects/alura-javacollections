package alura.edi.aulas.collections;

public class TestaCursoComAlunos2
{
    public static void main(String[] args)
    {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
        javaColecoes.getAulas(); 

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList 3", 33)); 
        javaColecoes.adiciona(new Aula("Criando uma aula", 23));
        javaColecoes.adiciona(new Aula("Modelando com cole��es", 3));
        
        Aluno a1 = new Aluno("Aa", 1);
        Aluno a2 = new Aluno("Bb", 2);
        Aluno a3 = new Aluno("Cc", 3);
        
        javaColecoes.matricula(a1); //criar m�todo crtl+1
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        
        
        //BUSCAR SE UM ALUNO EST� MATRICULADO OU N�O
        System.out.println("O aluno " + a1 +" est� matriculado?");
        if (javaColecoes.estaMatriculado(a1))
        {
            System.out.println("Sim!");
        }else {System.out.println("N�o!");}
        
        Aluno a = new Aluno("Aa", 1);
        System.out.println(javaColecoes.estaMatriculado(a));
        
        System.out.println("Aa � == a Aa?"); //eles s�o os mesmos?
        System.out.println(a1 == a);
        System.out.println("Aa � equals a Aa:"); //eles s�o iguais?
        System.out.println(a.equals(a1));
        //SE OS DOIS OBJETOS S�O EQUALS, OS DOIS PRECISAM TER O MESMO HASHCODE  
        //oi seja...
        //SEMPRE QUE USAR O EQUALS, USE O HASCODE!
        
    }

}
