import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<>(Arrays.asList(10, -4, 2, -3));
        //LinkedList<Integer> testList2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

        /*System.out.println(Utils.isSorted(testList));
        System.out.println(Utils.isSorted2(testList));
        System.out.println(Utils.isSorted(testList2));
        System.out.println(Utils.isSorted2(testList2));*/

        //for (int value : testList)
        //    System.out.print(" " + value);

        System.out.println(testList);


        Sort bubble = new BubbleSort(testList);
        bubble.apply();


        Sort merge = new MergeSort(testList);
        merge.apply();




        System.out.println(bubble.getList());
        System.out.println(merge.getList());

    }
}
