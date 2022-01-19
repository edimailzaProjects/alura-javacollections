package alura.edi.aulas.collections.exercicios;

import java.util.List;

public class TestaCursoExercicio
{
    public static void main(String[] args)
    {
        CursoExercicio c1 = new CursoExercicio("A ", "a");
        c1.getAulas(); //devolve uma lista de aulas
        List<AulaExercicio> aula = c1.getAulas();
        System.out.println(aula);
        
        /* SEM O UNMODIFIEBLE LIST, O CÓDIGO ABAIXO FUNCIONA
         * 
         *      
         *      c1.getAulas().add(new AulaExercicio("aa",1));
         *      c1.getAulas().add(new AulaExercicio("bb",2));
         *      c1.getAulas().add(new AulaExercicio("cc",3));
         *      c1.getAulas().add(new AulaExercicio("dd",4));
         *      
         *      for (AulaExercicio aulaExercicio : aula)
         *      {
         *      System.out.println(aulaExercicio);
         *      }
         *      
         *      System.out.println(c1.getAulas());
         *      
         * */
        
        //CÓDICO COM O MÉTODO "ADICIONA"
        
        c1.adiciona(new AulaExercicio("aa",1));
        c1.adiciona(new AulaExercicio("bb",2));
        c1.adiciona(new AulaExercicio("cc",3));
        c1.adiciona(new AulaExercicio("dd",4));
        
        
        for (AulaExercicio aulaExercicio : aula)
        {
            System.out.println(aulaExercicio);
        }
        
        System.out.println(aula);
        
        
        
        
    }

}
