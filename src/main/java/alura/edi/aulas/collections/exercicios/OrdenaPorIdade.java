package alura.edi.aulas.collections.exercicios;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>
{

    @Override
    public int compare(Funcionario o1, Funcionario o2)
    {
        if(o1.equals(o2)) {
            return 1;
        }
        return 0;
    }

}
