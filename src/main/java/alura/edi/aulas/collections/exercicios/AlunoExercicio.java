package alura.edi.aulas.collections.exercicios;

public class AlunoExercicio
{
    private String nome;
    private int numMatricula;
    
    public AlunoExercicio(String nome, int numMatricula)
    {
        if(nome == null) {
            throw new NullPointerException("Dado inválido");
        }
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    public String getNome()
    {
        return nome;
    }

    public int getNumMatricula()
    {
        return numMatricula;
    }

    @Override
    public String toString()
    {
        return "[Aluno:" + nome + ", matricula=" + numMatricula + "]";
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numMatricula;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AlunoExercicio other = (AlunoExercicio) obj;
        if (nome == null)
        {
            if (other.nome != null)
                return false;
        }
        else if (!nome.equals(other.nome))
            return false;
        if (numMatricula != other.numMatricula)
            return false;
        return true;
    }
    
    
    

}
