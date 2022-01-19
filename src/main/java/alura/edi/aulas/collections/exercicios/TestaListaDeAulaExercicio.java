package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulaExercicio
{
    public static void main(String[] args)
    {
        AulaExercicio a1 = new AulaExercicio("C ", 10);
        AulaExercicio a2 = new AulaExercicio("A ", 30);
        AulaExercicio a3 = new AulaExercicio("B ", 5);
        
        ArrayList<AulaExercicio> aulas = new ArrayList<>();
        
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        System.out.println("Não ordenada pelo titulo: ");
        System.out.println(aulas);
        
        Collections.sort(aulas);
        System.out.println("Ordenada pelo título: ");
        System.out.println(aulas);
        
        System.out.println("Ordenada pelo tempo: ");
        aulas.sort(Comparator.comparing(AulaExercicio::getTempo));
        System.out.println(aulas);
    }

}
