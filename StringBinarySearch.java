import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StringBinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Box");
        list.add("Robot");
        list.add("Apple");

        Collections.sort(list);    // 정렬
        int idx = Collections.binarySearch(list, "Robot");    // 탐색
        System.out.println(list.get(idx));
    }
}
