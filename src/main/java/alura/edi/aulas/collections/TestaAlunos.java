package alura.edi.aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos
{
    public static void main(String[] args)
    {
        //AULA SOBRE SETS "conjunto"
        //Collection<String> alunos = new HashSet<>();
        Set<String> alunos = new HashSet<>();
        
        alunos.add("A ");
        alunos.add("B ");
        alunos.add("C ");
        alunos.add("D ");
        alunos.add("E ");
        alunos.add("F ");
        alunos.add("G ");
        
        //A ordem é diferente da que os elementos foram adicionados
        
        System.out.println(alunos);
        
        //Não existe get no conjunto porque não existe o n elemento
        //para isto, deve-se usar o foreach
        
        for (String aluno : alunos)
        {
            System.out.println(aluno);
        }
        
        //NÃO ADMITE ELEMENTOS REPETIDOS
        alunos.add("A ");
        System.out.println(alunos);
        
        System.out.println(alunos.size());
        
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        
        //a vantagem de sets é a PERFORMANCE
        
        boolean bEstaMatriculado = alunos.contains("B ");
        System.out.println(bEstaMatriculado);
        
        boolean removeB = alunos.remove("B ");
        System.out.println(removeB);
        
        System.out.println(alunos);
        
        //HashSet -> se eu quero saber se um aluno matriculado, eu não preciso fazer comparações
        //como estrutura de dados.
        //get só existe em List
        
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista.get(2));
        
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }

}
