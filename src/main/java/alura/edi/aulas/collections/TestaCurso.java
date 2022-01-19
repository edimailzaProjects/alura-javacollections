package alura.edi.aulas.collections;

import java.util.List;

public class TestaCurso
{
    public static void main(String[] args)
    {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
        javaColecoes.getAulas(); // devolve uma lista de aulas

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas); // devolve [] pois está vazia

        //aulas.add(new Aula("Trabalhando com ArrayList", 21)); // unmodifiableList não permite mais que isso seja feito

        System.out.println(aulas);

        System.out.println(javaColecoes.getAulas()); // aqui imprime o mesmo de cima pois está referenciando para o
                                                     // mesmo objeto
        
        System.out.println(aulas == javaColecoes.getAulas()); //comparar a sacola de aulas
        
        //o código abaixo é equivalente a 
        //List<Aula> aulas = javaColecoes.getAulas();
        //System.out.println(aulas);
        
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList 2", 11)); // unmodifiableList não permite mais que isso seja feito
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList 3", 33)); // se quiser adicionar, daqui pra frente é ASSIM!
        javaColecoes.adiciona(new Aula("Criando uma aula", 23));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 3));
        
        System.out.println(javaColecoes.getAulas());
        
        List<Aula> aulas2 = javaColecoes.getAulas();
        System.out.println(aulas2);
        
        //LinkedList e ArrayList possuem os mesmos comportamentos:
        //permitem colocar itens repetidos
        //respeitam a ordem dos elementos inseridos
        //Sua diferença está em performance
        

    }

}
