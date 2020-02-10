import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomListGenerator<T> {
    private List<T> list;

    public RandomListGenerator(int size, T[] table) {
        list = new ArrayList<>();
        for (int i = 0; i < size; i++)
            list.add(table[generateRandomInt(table.length)]);
    }

    public static int generateRandomInt(int bound) {
        return new Random().nextInt(bound);
    }

    public List<T> getList() {
        return list;
    }
}
