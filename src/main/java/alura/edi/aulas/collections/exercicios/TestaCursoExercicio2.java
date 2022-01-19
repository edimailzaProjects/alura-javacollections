package alura.edi.aulas.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoExercicio2
{
    public static void main(String[] args)
    {
        CursoExercicio c1 = new CursoExercicio("Curso ", "exercicio");

        c1.getAulas();

        c1.adiciona(new AulaExercicio("cc", 3));
        c1.adiciona(new AulaExercicio("aa", 1));
        c1.adiciona(new AulaExercicio("dd", 4));
        c1.adiciona(new AulaExercicio("bb", 2));

        List<AulaExercicio> aulasImutaveis = c1.getAulas();
        System.out.println(aulasImutaveis);

        List<AulaExercicio> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println(c1.getTempoTotal());

        System.out.println(c1);

        Collections.reverse(aulas); // reverte as ordens das aulas

        System.out.println(aulas);

        Collections.shuffle(aulas); // embaralha a ordem

        System.out.println(aulas);

        // método nCopies() nos retorna uma lista imutável com a quantidade escolhida de um determinado elemento. Se
        // temos uma lista específica e precisamos obter uma outra lista imutável , contendo diversas cópias de um
        // destes objetos, utilizamos o método nCopies(). O bom deste método é que mesmo que nós solicitemos uma lista
        // com um número grande, como 10000 objetos, ele na verdade se referencia a apenas um, ocupando assim um pequeno
        // espaço. Este método também é utilizado para inicializar Listas recém criadas com Null, como mostra o exemplo
        // abaixo:

        List<AulaExercicio> list = new ArrayList<AulaExercicio>(Collections.nCopies(10, (AulaExercicio) null));
        System.out.println(list);
    }

}
