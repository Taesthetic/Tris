import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> testList = new ArrayList(Arrays.asList(1, 4, 2, 3));
        List<Integer> testList2 = new ArrayList(Arrays.asList(1, 2, 3, 4));

        //for (int value : testList)
        //    System.out.print(" " + value);

        System.out.println(testList);


        System.out.println(BubbleSort.sort(testList));

        System.out.println(Utils.isSorted(testList));
        System.out.println(Utils.isSorted2(testList));
        System.out.println(Utils.isSorted(testList2));
        System.out.println(Utils.isSorted2(testList2));
    }
}
