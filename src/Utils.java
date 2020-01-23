import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    public static void permute(List<Integer> testList, int i, int j) {
        if (i >= testList.size() && j >= testList.size())
            throw new ArrayIndexOutOfBoundsException();
        int saved_val = testList.get(i);
        testList.set(i, testList.get(j));
        testList.set(j, saved_val);
    }

    public static boolean isSorted(List<Integer> testList) {
        List<Integer> sortedList = List.copyOf(testList);
        Object[] temp = sortedList.toArray();
        Arrays.sort(temp);
        return Arrays.equals(testList.toArray(), temp);
    }

    public static boolean isSorted2(List<Integer> testList) {
        int before = testList.get(0);
        for (int value: testList) {
            if (value < before)
                return false;
            before = value;
        }
        return true;
    }

}
