import java.util.ArrayList;
import java.util.List;

public class HeapSort<T extends Comparable> implements Sort<T> {
    private List<T> list;

    public HeapSort(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public void apply() {
        Tree<T> tree = new Tree<>(list);
        for (Node<T> node: tree) {
            System.out.println(node.getValue());
            if (node.getLeftChild() != null) // if has child
                if (node.getLeftChild().getLeftChild() == null && node.getLeftChild().getRightChild() == null) // if feuille
                   System.out.println(node.getLeftChild().getValue());
            if (node.getRightChild() != null) // if has child
                if (node.getRightChild().getLeftChild() == null && node.getRightChild().getRightChild() == null) // if feuille
                    System.out.println(node.getRightChild().getValue());
        }
    }

    @Override
    public List<T> getList() {
        return null;
    }
}
