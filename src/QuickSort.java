import java.util.List;

public class QuickSort<T extends Comparable> implements Sort {
    private List<T> list;

    public QuickSort(List<T> list) {
        this.list = list;
    }

    private int partition(int p, int r) {
        T pivot = list.get(r);
        int i = p-1;
        for (int j = p; j < r ; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;
                Utils.permute(list, i, j);
            }
        }
        Utils.permute(list, i, r);
        return list.indexOf(pivot);

    }

    private void quickSort(int p, int r) {
        if (p < r) {
            int q = partition(p,r);
            quickSort(p, q-1);
            quickSort(q+1, r);
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
