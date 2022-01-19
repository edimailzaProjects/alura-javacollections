package alura.edi.aulas.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAlunos3
{
    public static void main(String[] args)
    {
        //ITERADORES E C�DIGO LEGADO
        
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
        
        Set<Aluno> alunos = javaColecoes.getAlunos();
        
        Iterator<Aluno> iterator = alunos.iterator();        
        iterator.hasNext(); //Iterador, tem mais algum objeto pra pegar a�? tem um pr�ximo?
        
        while (iterator.hasNext()) //enquanto houver um pr�ximo elemento, fa�a:
        {
            Aluno proximo = iterator.next(); //traga o pr�ximo aluno
            System.out.println(proximo); // fortemente usado em c�digo legado!
        }
        
        Vector<Aluno> vetor = new Vector<>(); //pode ser usado por v�rias threads simultaneamente "threadsafe"
        System.out.println(vetor);
    }

}
