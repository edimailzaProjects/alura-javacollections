package alura.edi.aulas.collections.exercicios;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunosExercicio3
{
    
    public static void main(String[] args)
    {
        CursoExercicio curso = new CursoExercicio("Exercicio", "Sets");
        
        AlunoExercicio a1 = new AlunoExercicio("a",1);
        AlunoExercicio a2 = new AlunoExercicio("b",2);
        AlunoExercicio a3 = new AlunoExercicio("c",3);
        AlunoExercicio a4 = new AlunoExercicio("d",4);
        
        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);
        curso.matricula(a4);
        
        System.out.println(curso.getAlunos());
        
        System.out.println("Todos os alunos matriculados: ");
        curso.getAlunos().forEach(c -> {
            System.out.println(c);
        });
        
        Set<AlunoExercicio> alunos = curso.getAlunos();
        Iterator<AlunoExercicio> alunoss = alunos.iterator();
        
        System.out.println("Todos os alunos matriculados com Iterator: ");
        while (alunoss.hasNext())
        {
           System.out.println(alunoss.next());
            
        }
        
    }
    
    

}
