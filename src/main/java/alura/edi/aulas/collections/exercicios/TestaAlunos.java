package alura.edi.aulas.collections.exercicios;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos
{
    public static void main(String[] args)
    {
        Set<String> alunos = new HashSet<>();
        
        alunos.add("a");
        alunos.add("b");
        alunos.add("c");
        alunos.add("d");
        
        System.out.println(alunos);
        
        alunos.add("a");
        System.out.println(alunos);
        
        alunos.remove("a");
        System.out.println(alunos);
        
        for (String aluno : alunos)
        {
            System.out.println(aluno);
        }
        
        System.out.println(alunos.size());
        
        alunos.forEach(aluno-> {
            System.out.println(alunos);
        });
    }

}

