import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<>(Arrays.asList(10, -4, 2, -3));
        List<Integer> testList2 = new ArrayList<>(Arrays.asList(99, 21, 36, 70, 45));
        List<Integer> testList3 = new LinkedList<>(Arrays.asList(10000, 9, 10000, 10000, 300));

        /*System.out.println(Utils.isSorted(testList));
        System.out.println(Utils.isSortedDeprecated(testList));
        System.out.println(Utils.isSorted(testList2));
        System.out.println(Utils.isSortedDeprecated(testList2));*/

        //for (int value : testList)
        //    System.out.print(" " + value);

        System.out.println(testList);


        Sort bubble = new BubbleSort(testList);
        //bubble.apply();
        System.out.println(bubble.getList());

        Sort merge = new MergeSort(testList);
        //merge.apply();
        System.out.println(merge.getList());

        Sort heap = new HeapSort(testList);
        heap.apply();
        System.out.println(heap.getList());

        Sort quick = new QuickSort(testList);
        //quick.apply();
        System.out.println(quick.getList());


        System.out.println(" " + Utils.getMaj(testList3));

        List<Integer> listStr = new RandomListGenerator<>(4, new Integer[]{3, 2, 10}).getList();
        //for (Integer value : listStr)
        //    System.out.print(" " + value);

        System.out.println();
        Sort quick2 = new MergeSort(listStr);
        long startTime = System.nanoTime();
        quick2.apply();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);
        //System.out.println(quick2.getList());

        Sort bubbleRandom = new BubbleSort(listStr);
        startTime = System.nanoTime();
        bubbleRandom.apply();
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);

    }
}
    