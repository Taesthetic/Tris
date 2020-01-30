import java.util.List;

public class Tree<T> {
    private List<Node<T>> tree;

    public Tree(List<T> list) {
        int size = list.size();
        int i = 0;
        int state = 0;
        for (T element: list) {
            switch (state) {
                case 0:
                    tree.add(new Node<T>(list.get(i)));
                    break;
                case 1:
                    break;
                case 2:
                    break;
            }
            if (state == 2)
                state = 0;
            else
                state++;

        }

    }



}
