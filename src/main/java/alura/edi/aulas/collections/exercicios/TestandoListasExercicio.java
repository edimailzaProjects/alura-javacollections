package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListasExercicio
{
    public static void main(String[] args)
    {
        String aula1 = "Alura Exceptions";
        String aula2 = "Alura Java Lang";
        String aula3 = "Alura Java Utils";
        
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula3);
        aulas.add(aula2);
        
        for (String aula : aulas) //para cada aula da lista de aulas
        {
            System.out.println(aula);
        }
        
        System.out.println("------------");
        
        for (int i = 0; i < aulas.size(); i++)
        {
            System.out.println(aulas.get(i)); // o get pega o índice
        }
        
        System.out.println("------------");
        
        System.out.println("Antes de Ordenar: " + aulas);
        Collections.sort(aulas);
        System.out.println("Depois de Ordenar: "+ aulas);
        
        aulas.remove(aula1);
        
        System.out.println("Removeu a primeira aula: " + aulas);
    }

}
