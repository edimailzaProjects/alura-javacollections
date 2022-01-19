package alura.edi.aulas.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAlunos3
{
    public static void main(String[] args)
    {
        //ITERADORES E CÓDIGO LEGADO
        
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
        javaColecoes.getAulas(); 

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList 3", 33)); 
        javaColecoes.adiciona(new Aula("Criando uma aula", 23));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 3));
        
        Aluno a1 = new Aluno("Aa", 1);
        Aluno a2 = new Aluno("Bb", 2);
        Aluno a3 = new Aluno("Cc", 3);
        
        javaColecoes.matricula(a1); //criar método crtl+1
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        
        Set<Aluno> alunos = javaColecoes.getAlunos();
        
        Iterator<Aluno> iterator = alunos.iterator();        
        iterator.hasNext(); //Iterador, tem mais algum objeto pra pegar aí? tem um próximo?
        
        while (iterator.hasNext()) //enquanto houver um próximo elemento, faça:
        {
            Aluno proximo = iterator.next(); //traga o próximo aluno
            System.out.println(proximo); // fortemente usado em código legado!
        }
        
        Vector<Aluno> vetor = new Vector<>(); //pode ser usado por várias threads simultaneamente "threadsafe"
        System.out.println(vetor);
    }

}
