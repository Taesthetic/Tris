import java.util.List;

public class BubbleSort<T extends Comparable> implements Sort<T> {

    private List<T> list;

    public BubbleSort(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

   public void apply() {
       for (int j = 0; j < list.size() ; j++) {
            for (int i = 0; i < list.size()-1 ; i++) {
                if (list.get(i+1).compareTo(list.get(i)) < 0) Utils.permute(list, i, i+1);
            }
        }
    }
}