package alura.edi.aulas.collections;

public class Aula implements Comparable<Aula>
{
    private String titulo;
    private int tempo;
    
    public Aula(String titulo, int tempo)
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
        return "[Aula: " + titulo + ", " + tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) //qual é o critério de comparação?
    {
        return this.titulo.compareTo(outraAula.titulo); //compare estes dois títulos
    }
    
    
}
