import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
    private List<T> list;
    public RandomList(int first, int last) {
        list = new ArrayList<>();
        for (int i = 0; i < last - first; i++) {
            list.add(new Random().next);
        }
    }

    public List<T> getList() {
        return list;
    }

}
