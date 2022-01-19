package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformancee
{
    /*
     * Crie a classe TestaPerformance, com um m�todo main e um c�digo que insere 50 mil n�meros em uma ArrayList e os
     * pesquisa. Vamos usar o m�todo currentTimeMillis(), de System, para cronometrar o tempo gasto com a adi��o e
     * pesquisa dos elementos:
     */
    
    public static void main(String[] args)
    {

        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis(); // esse m�todo pega o tempo atual 

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
