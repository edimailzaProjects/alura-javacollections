package alura.edi.aulas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2
{
    public static void main(String[] args)
    {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
        javaColecoes.getAulas(); 

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList 3", 33)); 
        javaColecoes.adiciona(new Aula("Criando uma aula", 23));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 3));
        
        System.out.println(javaColecoes.getAulas());
        
        //COMO TORNAR AULAS QUE SÃO IMUTAVEIS MUTÁVEIS
        
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
        
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis); //COLOQUE-AS NO CONSTRUTOR DO ARRAYLIST
        
        Collections.sort(aulasMutaveis); // E ISSO SERÁ POSSÍVEL DE SER UTILIZADO
        System.out.println(aulasMutaveis);
        
        //UM FOR PARA SOMAR UM TOTAL DE TEMPO GASTO EM TODAS AS AULAS
        
        System.out.println(javaColecoes.getTempoTotal());
        
        
        System.out.println(javaColecoes);

    }

}
