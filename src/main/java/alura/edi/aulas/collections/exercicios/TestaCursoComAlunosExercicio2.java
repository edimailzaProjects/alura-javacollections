package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.List;

public class TestaCursoComAlunosExercicio2
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
        
        curso.removerAluno(a1);
        
        System.out.println("Todos os alunos matriculados: ");
        curso.getAlunos().forEach(c -> {
            System.out.println(c);
        });
        
        List<AlunoExercicio> ordenaAlunos = new ArrayList<>(curso.getAlunos());
        System.out.println("Alunos ordenados: ");
        ordenaAlunos.forEach(a ->{
            System.out.println(a);
        });
        
        System.out.println(a2+" está matriculado?");
        System.out.println(curso.estaMatriculado(a2));
        
        System.out.println(a1+" está matriculado?");
        System.out.println(curso.estaMatriculado(a1));
        
        AlunoExercicio a5 = new AlunoExercicio("b",2);
        System.out.println("b e b são os mesmos?");
        System.out.println(a5==a2);
        System.out.println("b e b são iguais?");
        System.out.println(a5.equals(a2));
    }
    
    

}
