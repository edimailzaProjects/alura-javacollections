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
    private Set<Aluno> alunos = new HashSet<>();// Hashset n�o garante a ordem dos elementos, por isso, usamos
                                                // LindedHashset
    // private Set<Aluno> alunos = new LinkedHashSet<>();
    // private Set<Aluno> alunos = new TreeSet<>(); //<- s� funciona para classes comparable

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); // dada uma matr�cula, me devolva o aluno

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
        return unmodifiableList(aulas); // aqui eu n�o permito mais que m�todos externos acessem minhas
                                        // aulas
    }

    // m�todo que pede para o Curso adicionar a aula

    public void adiciona(Aula aula)
    {
        this.aulas.add(aula); // adiciona a aula que foi recebida no argumento

    }

    // m�todo que calcula o total de tempo dos cursos

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

    // este c�digo abaixo faz a mesma coisa que o de cima

    public int getTempoTotal()
    {
        // Java 8
        // eu quero uma lista apenas do atributo getTempo de aulas e n�o as aulas todas
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();// a� usa o sum() pra som�-las

    }

    @Override
    public String toString()
    {
        return "[Curso: " + nome + ". Tempo total: " + this.getTempoTotal() + "," + " aulas:" + this.aulas + "]";
    }

    public void matricula(Aluno aluno)// Para n�o quebrar o encapsulamento,
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

    // este m�todo � ineficaz quando o n�mero de alunos � enorme
    // pois pergunta a todos os alunos at� encontrar ou n�o
    // public Aluno buscaMatriculado(int numero)
    // {
    // for (Aluno aluno : alunos)
    // {
    // if (aluno.getNumMatricula() == numero)
    // {
    // return aluno;
    // }
    // }
    // throw new NoSuchElementException("Aluno n�o encontrado.");
    // }

    // para isto usamos MAP, que trabalha com key value
    // Associamos um Integer ao nosso aluno

    public Aluno buscaMatriculado(int numero)
    { // olha a diferen�a!!!!
        if (!matriculaParaAluno.containsKey(numero))
        {
            throw new NoSuchElementException("Aluno n�o encontrado!");
        }
        return matriculaParaAluno.get(numero);
    }

    // O Map usa tabela de espalhamento! Logo, a busca � r�pida!
    //
    // Tamb�m temos o LinkedHashMap e sua diferen�a � que quando colocamos o put, ele guardar� a ordem das linhas na
    // ordem em que os puts foram feitos

}
