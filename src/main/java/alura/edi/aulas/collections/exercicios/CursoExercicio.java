package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CursoExercicio
{
    private String nome;
    private String instrutor;
    private List<AulaExercicio> aulas = new ArrayList<>();
    private Set<AlunoExercicio> alunos = new HashSet<>();
    
    public CursoExercicio(String nome, String instrutor)
    {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome()
    {
        return nome;
    }

    public String getInstrutor()
    {
        return instrutor;
    }

    public List<AulaExercicio> getAulas()
    {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(AulaExercicio aulaExercicio)
    {
        this.aulas.add(aulaExercicio);
    }
    
    

    // public int getTempoTotal() {
    // return this.aulas.stream().mapToInt(AulaExercicio::getTempo).sum();
    // }

    public int getTempoTotal()
    {
        int tempoTotal = 0;
        for (AulaExercicio aulaExercicio : aulas)
        {
            tempoTotal += aulaExercicio.getTempo();
        }
        return tempoTotal;
    }
    
    public void matricula(AlunoExercicio aluno) {
        this.alunos.add(aluno);
    }
    
    public void removerAluno(AlunoExercicio aluno) {
        this.alunos.remove(aluno);
    }
    
    public Set<AlunoExercicio> getAlunos()
    {
        return Collections.unmodifiableSet(alunos);
    }

    @Override
    public String toString()
    {
        return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas= [" + aulas + "]";
    }

    public boolean estaMatriculado(AlunoExercicio aluno)
    {
        return alunos.contains(aluno);   
    }

}
