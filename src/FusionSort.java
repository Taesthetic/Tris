import java.util.List;

public class FusionSort<T extends Comparable> implements Sort<T> {

    private List<T> divide_left(List<T> list) {
        return list.subList(0, list.size()/2);
    }

    private List<T> divide_right(List<T> list) {
        return list.subList(list.size()/2, list.size());
    }

    private List<T> merge(List<T> list1, List<T> list2) {
        return list1;
    }

    private List<T> aux(List<T> list) {
        if (list.isEmpty())
            return new ArrayList<T>;
        return merge(aux(divide_left(list)), aux(divide_right(list)));
    }

    public void applyTo(List<T> list) {
        aux(list);
    }
}
