import java.util.LinkedList;
import java.util.List;

public class MergeSort<T extends Comparable> implements Sort<T> {

    private LinkedList<T> list;

    public MergeSort(List<T> list) {
        this.list = new LinkedList<>(list);
    }

    @Override
    public LinkedList<T> getList() {
        return list;
    }

    private LinkedList<T> divide_left(LinkedList<T> list) {
        return new LinkedList<>(list.subList(0, list.size()/2));
    }

    private LinkedList<T> divide_right(LinkedList<T> list) {
        return new LinkedList<>(list.subList(list.size()/2, list.size()));
    }

    private LinkedList<T> merge(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> retList = new LinkedList<>();
        while (0 < list1.size() && 0 < list2.size()) {
            if (list1.peekFirst().compareTo(list2.peekFirst()) <= 0)
                retList.add(list1.pollFirst());
            if (list1.peekFirst().compareTo(list2.peekFirst()) >= 0)
                retList.add(list2.pollFirst());

        }

        if (!list1.isEmpty())
            retList.addAll(list1);
        if (!list2.isEmpty())
            retList.addAll(list2);

        return retList;
    }

    private LinkedList<T> mergeSort(LinkedList<T> list) {
        if (list.size() < 2)
            return list;
        LinkedList<T> leftList = mergeSort(divide_left(list));
        LinkedList<T> rightList = mergeSort(divide_right(list));
        return merge(leftList, rightList);
    }

    @Override
    public void apply() {
        list = mergeSort(list);
    }
}
