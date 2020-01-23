import java.util.List;

public interface Sort<T extends Comparable> {

    void applyTo(List<T> list);
}
