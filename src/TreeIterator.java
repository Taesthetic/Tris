import java.util.Iterator;
import java.util.List;

public class TreeIterator<T> implements Iterator<Node<T>> {
    private List<Node<T>> tree;
    private int size;
    private int current;

    public TreeIterator(List<Node<T>> tree) {
        this.tree = tree;
        this.size = tree.size();
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public Node<T> next() {
        Node<T> ret = tree.get(current);
        current++;
        return ret;
    }
}
