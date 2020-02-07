import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree<T>  implements Iterable<Node<T>> {
    private List<Node<T>> tree;

    public Tree(List<T> list) {
        int size = list.size();
        if (size == 0)
            throw new IndexOutOfBoundsException();
        tree = new ArrayList<>();
        int i = 0;
        int state = 0;
        for (int j = 0; j < size; j++) {
            switch (state) {
                case 0:
                    tree.add(new Node<T>(list.get(i)));
                    break;
                case 1:
                    tree.get(i).setLeftChild(new Node<>(list.get(2*i+1)));
                    break;
                case 2:
                    tree.get(i).setRightChild(new Node<T>(list.get(2*i+2)));
                    i++;
                    break;
            }
            if (state == 2)
                state = 0;
            else
                state++;
        }
    }


    @Override
    public Iterator<Node<T>> iterator() {
        return new TreeIterator<>(tree);
    }
}
