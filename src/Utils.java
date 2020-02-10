import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    public static <T extends Comparable> void permute(List<T> testList, int i, int j) {
        if (i >= testList.size() && j >= testList.size())
            throw new ArrayIndexOutOfBoundsException();
        T saved_val = testList.get(i);
        testList.set(i, testList.get(j));
        testList.set(j, saved_val);
    }

    // deprecated because unefficient
    public static <T extends Comparable> boolean isSortedDeprecated(List<T> testList) {
        List<T> sortedList = List.copyOf(testList);
        Object[] temp = sortedList.toArray();
        Arrays.sort(temp);
        return Arrays.equals(testList.toArray(), temp);
    }

    public static <T extends Comparable> boolean isSorted(List<T> testList) {
        T before = testList.get(0);
        for (T value: testList) {
            if (value.compareTo(before) > 0)
                return false;
            before = value;
        }
        return true;
    }

    public static <T> T getMaj(T[] table) {
        if (table.length == 0)
            return null;
        int limit = table.length / 2;
        if (limit == 0)
            return table[0];
        Map<T, Integer> map = new HashMap<>();
        for (T elt : table) {
            if (map.containsKey(elt)) {
                int newCount = map.get(elt) + 1;
                if (newCount > limit)
                    return elt;
                map.replace(elt, newCount);
            } else map.put(elt, 1);
        }
        return null;
    }

    public static <T> T getMajNaif(T[] table) {
        if (table.length == 0)
            return null;
        int limit = table.length / 2;
        if (limit == 0)
            return table[0];
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i] == table[j]) {
                    count++;
                    if (count > limit)
                        return table[j];
                }
            }
            count = 0;
        }
        return null;
    }

    public static <T> T getMaj(List<T> list) {
        return getMaj((T[]) list.toArray());
    }

    public static <T> T getMajNaif(List<T> list) {
        return getMajNaif((T[]) list.toArray());
    }


}
