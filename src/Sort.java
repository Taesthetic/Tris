import java.util.List;

public interface Sort<T extends Comparable> {

    void apply();

    List<T> getList();
}
