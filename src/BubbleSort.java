import java.util.List;

public class BubbleSort<T extends Comparable> implements Sort<T> {

   public void applyTo(List<T> testList) {
       for (int j = 0; j < testList.size() ; j++) {
            for (int i = 0; i < testList.size()-1 ; i++) {
                if (testList.get(i+1).compareTo(testList.get(i)) < 0) Utils.permute(testList, i, i+1);
            }
        }
    }
}