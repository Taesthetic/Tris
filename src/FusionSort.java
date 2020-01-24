import java.util.LinkedList;
import java.util.List;

public class FusionSort<T extends Comparable> implements Sort<T> {

    private List<T> list;

    public FusionSort(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    private LinkedList<T> divide_left(LinkedList<T> list) {
        return new LinkedList<>(list.subList(0, list.size()/2));
    }

    private LinkedList<T> divide_right(LinkedList<T> list) {
        return new LinkedList<>(list.subList(list.size()/2, list.size()));
    }

    private LinkedList<T> merge(LinkedList<T> list1, LinkedList<T> list2) {
        int max = Math.max(list1.size(), list2.size());
        int min = Math.min(list1.size(), list2.size());

        aux2(list1, list2);

    }

    private T getMin(LinkedList<T> list) {
        T min = list.pollFirst();
        for (T element: list) {
            if (element.compareTo(min) < 0) min = element;
        }
        return min;
    }
    private LinkedList<T> aux2(LinkedList<T> list1, LinkedList<T> list2 ) {
        while (list1.size() > 0 && list2.size() > 0) {
            LinkedList<T> temp_list = new LinkedList<>();
            if (getMin(list1).compareTo(getMin(list2)) < 0) {
                temp_list.add(getMin(list1));
                list1.removeFirstOccurrence(getMin(list1));
            } else if (getMin(list1).compareTo(getMin(list2)) > 0) {
                temp_list.add(getMin(list2));
                list1.removeFirstOccurrence(getMin(list2));
            }

            else {
                temp_list.add(getMin(list1));
                list1.removeFirstOccurrence(getMin(list1));
                temp_list.add(getMin(list2));
                list1.removeFirstOccurrence(getMin(list2));
            }

            return temp_list;
        }
    }



        private LinkedList<T> aux(LinkedList<T> list) {
        if (list.size() <= 1)
            return list;
        return merge(aux(divide_left(list)), aux(divide_right(list)));
    }

    public void apply() {
        list = aux(new LinkedList<>(list));
    }
}
