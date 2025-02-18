package view.utils;

/**
 * Classe generica che accetta un elemento <tt>left</tt> e <tt>right</tt> per poter creare una coppia.
 * @param <L> elemento <tt>left</tt>
 * @param <R> elemento <tt>right</tt>
 */
public class Pair<L,R> {

    private final L left;
    private final R right;

    public Pair(L left, R right) {
        assert left != null;
        assert right != null;

        this.left = left;
        this.right = right;
    }

    public L getLeft() { return left; }
    public R getRight() { return right; }

}