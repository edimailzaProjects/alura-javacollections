package alura.edi.aulas.collections.exercicios;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet
{
    public static void main(String[] args)
    {

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");

        // o que acontece aqui, caso tenhamos um conjunto vazio?
        /*
         * Exception in thread "main" java.lang.UnsupportedOperationException at
         * java.util.AbstractCollection.add(AbstractCollection.java:262) at
         * alura.edi.aulas.collections.exercicios.TesteEmptySet.main(TesteEmptySet.java:11)
         */
    }

}
