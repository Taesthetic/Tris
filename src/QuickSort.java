import java.util.ArrayList;
import java.util.List;

public class QuickSort<T extends Comparable> implements Sort {
    private List<T> list;

    public QuickSort(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    private int getPivot(int premier, int dernier) {
        return dernier; // premier ne marche pas, pourquoi?
    }

    private int partition(int premier, int dernier, int pivot) {
        Utils.permute(list, pivot, dernier);
        int j = premier;
        for (int i = premier; i < dernier; i++) {
            if (list.get(i).compareTo(list.get(pivot)) <= 0) {
                Utils.permute(list, i, j);
                j++;
            }
        }
        Utils.permute(list, dernier, j);
        return j;

    }

    private void quickSort(int premier, int dernier) {
        if (premier < dernier) {
            int pivot = getPivot(premier, dernier);
            pivot = partition(premier, dernier, pivot);
            quickSort(premier, pivot-1);
            quickSort(pivot+1, dernier);
        }
    }

    @Override
    public void apply() {
        quickSort(0, list.size()-1);
    }

    

    @Override
    public List getList() {
        return list;
    }
}