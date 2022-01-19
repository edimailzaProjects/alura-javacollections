package alura.edi.aulas.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas
{
    public static void main(String[] args)
    {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) // para cada String aula dentro de aulas faça...
        {
            System.out.println("Aula: " + aula);
        }

        // percorrer lista

        String primeiraAula = aulas.get(0);

        System.out.println("A primeira aula é: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++)
        { // para coleções sempre use size()
            System.out.println("Aula: " + aulas.get(i)); // da priméira a enésima aula
        }

        System.out.println(aulas.size());

        // crie lambda para percorrer
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula: " + aula);
        }); // para cada aula, eu abro e fecho chaves

        aulas.add("Aumentando nosso conhecimento");

        System.out.println("Sem ordenar: " + aulas);

        Collections.sort(aulas); // ordena pela ordem alfabética

        System.out.println("Depois de ordenado: " + aulas);

    }

}
