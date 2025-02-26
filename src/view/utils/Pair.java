package view.utils;

/**
 * Classe generica che accetta un elemento <tt>left</tt> e <tt>right</tt> per poter creare una coppia generica di elementi.
 * @param <L> qualsiasi classe per l'elemento "a sinistra" nel costruttore
 * @param <R> qualsiasi classe per l'elemento "a destra" nel costruttore
 */
public class Pair<L,R> {

    /**
     * oggetto da classe generica
     */
    private final L left;
    /**
     * oggetto da classe generica
     */
    private final R right;

    /**
     * Costruttore
     * @param left oggetto di classe generica
     * @param right oggetto di classe generica
     */
    public Pair(L left, R right) {

        this.left = left;
        this.right = right;
    }

    /**
     *
     * @return oggetto di classe generica definito "a sinistra"
     */
    public L getLeft() { return left; }

    /**
     *
     * @return oggetto di classe generica definito "a destra"
     */
    public R getRight() { return right; }

}