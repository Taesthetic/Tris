import java.util.ArrayList;
import java.util.List;

public class HeapSort<T extends Comparable> implements Sort<T> {
    private List<T> list;

    public HeapSort(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public void heapify(int i) {
        int index = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < list.size()) {
            if (list.get(left).compareTo(list.get(i)) > 0)
                index = left;
        }

        if (right < list.size()) {
            if (list.get(right).compareTo(list.get(i)) > 0)
                index = right;
        }

        if (index != i) {
            Utils.permute(list, index, i);
            heapify(index);
        }
    }


    public void buildMaxHeap() {
        int index = list.size() / 2;
        for (int i = index; i >= 0; i--)
            heapify(i);
    }


    public void heapSort() {
        buildMaxHeap();
        for (int i = list.size() - 1; i >= 0; i--) {
            Utils.permute(list, i,0);
            heapify(0);
        }
    }

    public void heapSortWithTree() {
        Tree<T> tree = new Tree<>(list);
        for (Node<T> node : tree) {
            System.out.println(node.getValue());
            if (node.getLeftChild() != null) // if has left child
                if (node.isLeaf())
                    System.out.println(node.getLeftChild().getValue());
            if (node.getRightChild() != null) // if has right child
                if (node.isLeaf())
                    System.out.println(node.getRightChild().getValue());
        }
    }


    public void apply() {
        heapSort();
    }

    @Override
    public List<T> getList() {
        return list;
    }


}
