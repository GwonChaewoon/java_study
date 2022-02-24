import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int disp;    // 배기량

    public Car(int d) { disp = d; }

    @Override
    public String toString() {
        return "cc: " + disp;
    }
    @Override
    public int compareTo(Car o) {
        return disp - o.disp;
    }
}

public class CarSortCollections {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1200));
        list.add(new Car(3000));
        list.add(new Car(1800));
        Collections.sort(list);    // 정렬

        for(Iterator<Car> itr = list.iterator(); itr.hasNext(); )  // 출력
            System.out.println(itr.next().toString() + '\t');
    }
}
