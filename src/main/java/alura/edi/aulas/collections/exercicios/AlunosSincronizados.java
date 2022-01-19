package alura.edi.aulas.collections.exercicios;

public class AlunosSincronizados
{
    public static void main(String[] args)
    {

        // Set<AlunoExercicio> alunosSincronizados = Collections.synchronizedSet(alunos);

        /*
         * public static <T> Set<T> synchronizedSet(Set<T> s) Returns a synchronized (thread-safe) set backed by the
         * specified set. In order to guarantee serial access, it is critical that all access to the backing set is
         * accomplished through the returned set. It is imperative that the user manually synchronize on the returned
         * set when iterating over it: Set s = Collections.synchronizedSet(new HashSet()); ... synchronized (s) {
         * Iterator i = s.iterator(); // Must be in the synchronized block while (i.hasNext()) foo(i.next()); } Failure
         * to follow this advice may result in non-deterministic behavior. The returned set will be serializable if the
         * specified set is serializable. Type Parameters: T - the class of the objects in the set Parameters: s - the
         * set to be "wrapped" in a synchronized set. Returns: a synchronized view of the specified set.
         */
    }

}
