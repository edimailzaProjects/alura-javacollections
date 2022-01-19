package alura.edi.aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula
{
    public static void main(String[] args)
    {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 16);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        System.out.println(aulas);
        
        
        
        String s1 = "Teste1";
        String s2 = "Teste2";
        s1.compareTo(s2); //vai comparar quem é maior devolve negativo se s1 for menor que s2, positivo de s2 vir antes de s1, ou zero, se forem iguais
        System.out.println(s1.compareTo(s2));
        
        
      //não consigo usar sort se não criar o Comparable<Aula> na classe aula. 
      //É preciso implementar o  compareTo(Aula outraAula)
        
        System.out.println("-------------");
        
        Collections.sort(aulas);
        System.out.println("Ordenou pelo titulo: ");
        System.out.println(aulas);
        
        System.out.println("-------------");
        
        //comparando pelo tempo
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        
        System.out.println("Ordenou pelo tempo:");
        System.out.println(aulas);
       
        //essa linha de baixo faz a mesma coisa e é mais bonitinha!!
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
    }

}
