package alura.edi.aulas.collections.exercicios;

public class AulaExercicio implements Comparable<AulaExercicio>
{
    private String titulo;
    private int tempo;
    
    public AulaExercicio(String titulo, int tempo)
    {
        this.titulo = titulo;
        this.tempo = tempo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public int getTempo()
    {
        return tempo;
    }

    @Override
    public String toString()
    {
        return "Aula [Titulo: " + titulo + ", tempo :" + tempo + "]";
    }

    @Override
    public int compareTo(AulaExercicio outraAula)
    {
        return this.titulo.compareTo(outraAula.titulo);
    }
    
    

}
