package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformancee
{
    /*
     * Crie a classe TestaPerformance, com um método main e um código que insere 50 mil números em uma ArrayList e os
     * pesquisa. Vamos usar o método currentTimeMillis(), de System, para cronometrar o tempo gasto com a adição e
     * pesquisa dos elementos:
     */
    
    public static void main(String[] args)
    {

        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis(); // esse método pega o tempo atual 

        for (int i = 1; i <= 50000; i++)
        {
            numeros.add(i);
        }

        for (Integer numero : numeros)
        {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);
    }

}
