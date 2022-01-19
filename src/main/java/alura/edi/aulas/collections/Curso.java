package alura.edi.aulas.collections;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso
{
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>(); // quais aulas pertencem a este curso? Crie um relacionamento
                                                      // entre as classes
    private Set<Aluno> alunos = new HashSet<>();// Hashset não garante a ordem dos elementos, por isso, usamos
                                                // LindedHashset
    // private Set<Aluno> alunos = new LinkedHashSet<>();
    // private Set<Aluno> alunos = new TreeSet<>(); //<- só funciona para classes comparable

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); // dada uma matrícula, me devolva o aluno

    public Curso(String nome, String instrutor)
    {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome()
    {
        return nome;
    }

    public String getInstrutor()
    {
        return instrutor;
    }

    public List<Aula> getAulas()
    {
        return unmodifiableList(aulas); // aqui eu não permito mais que métodos externos acessem minhas
                                        // aulas
    }

    // método que pede para o Curso adicionar a aula

    public void adiciona(Aula aula)
    {
        this.aulas.add(aula); // adiciona a aula que foi recebida no argumento

    }

    // método que calcula o total de tempo dos cursos

    // public int getTempoTotal()
    // {
    // int tempoTotal = 0;
    //
    // for (Aula aula : aulas)
    // {
    // tempoTotal+=aula.getTempo();
    // }
    //
    // return tempoTotal;
    //
    // }

    // este código abaixo faz a mesma coisa que o de cima

    public int getTempoTotal()
    {
        // Java 8
        // eu quero uma lista apenas do atributo getTempo de aulas e não as aulas todas
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();// aí usa o sum() pra somá-las

    }

    @Override
    public String toString()
    {
        return "[Curso: " + nome + ". Tempo total: " + this.getTempoTotal() + "," + " aulas:" + this.aulas + "]";
    }

    public void matricula(Aluno aluno)// Para não quebrar o encapsulamento,
    {
        this.alunos.add(aluno); // vou pegar meu conjunto de alunos e adicionar o aluno
        this.matriculaParaAluno.put(aluno.getNumMatricula(), aluno);
    }

    public Set<Aluno> getAlunos()
    {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno)
    {
        return this.alunos.contains(aluno);
    }

    // este método é ineficaz quando o número de alunos é enorme
    // pois pergunta a todos os alunos até encontrar ou não
    // public Aluno buscaMatriculado(int numero)
    // {
    // for (Aluno aluno : alunos)
    // {
    // if (aluno.getNumMatricula() == numero)
    // {
    // return aluno;
    // }
    // }
    // throw new NoSuchElementException("Aluno não encontrado.");
    // }

    // para isto usamos MAP, que trabalha com key value
    // Associamos um Integer ao nosso aluno

    public Aluno buscaMatriculado(int numero)
    { // olha a diferença!!!!
        if (!matriculaParaAluno.containsKey(numero))
        {
            throw new NoSuchElementException("Aluno não encontrado!");
        }
        return matriculaParaAluno.get(numero);
    }

    // O Map usa tabela de espalhamento! Logo, a busca é rápida!
    //
    // Também temos o LinkedHashMap e sua diferença é que quando colocamos o put, ele guardará a ordem das linhas na
    // ordem em que os puts foram feitos

}
