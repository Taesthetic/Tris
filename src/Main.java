import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> testList = new LinkedList<>(Arrays.asList(10, -4, 2, -3));
        List<Integer> testList2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(Utils.isSorted(testList));
        System.out.println(Utils.isSorted2(testList));
        System.out.println(Utils.isSorted(testList2));
        System.out.println(Utils.isSorted2(testList2));

        //for (int value : testList)
        //    System.out.print(" " + value);

        System.out.println(testList);
        //new BubbleSort().applyTo(testList);
        new FusionSort().applyTo(testList);
        System.out.println(testList);
        //System.out.println(testList.subList(0, 2));
    }
}
