package alura.edi.aulas.collections;

public class Aluno
{
    private String nome;
    private int numMatricula;

    public Aluno(String nome, int numMatricula)
    {
        if (nome == null)
        {
            throw new NullPointerException("O nome não pode ser nulo!");
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
        return "[Aluno: " + this.nome + ", matrícula: " + this.numMatricula + "]";
    }

    @Override
    public int hashCode() //ajuda na tabela de espalhamento na busca e reduz colisões
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
        Aluno other = (Aluno) obj;
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
