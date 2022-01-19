package alura.edi.aulas.collections.exercicios;

import java.util.HashMap;
import java.util.Map;

public class TesteMap
{
    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        //falta algo aqui....
        nomesParaIdade.entrySet().forEach(n ->{
            System.out.println("Nome: "+ nomesParaIdade.keySet() +" de idade: "+ nomesParaIdade.values());
        });

        
    }

}
