import java.util.List;

public class BubbleSort {

   public static List<Integer> sort(List<Integer> testList) {
       for (int j = 0; j < testList.size() ; j++) {
            for (int i = 0; i < testList.size()-1 ; i++) {
                if (testList.get(i+1) < testList.get(i)) Utils.permute(testList, i, i+1);
            }

        }
        //Utils.permute(testList, 0, 1);
        return testList;
    }
}