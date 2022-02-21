interface Getable<T> {
    public T get();
}

class Box<T> implements Getable<String> {
    private T ob;
    public void set(T o) { ob = o; }

    @Override
    public String get() {     // 반환형은 T가 아닌 String이어야 한다.
        return ob.toString();
    }
}

class Toy {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

public class GetableGenericInterface {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        box.set(new Toy());

        Getable<String> gt = box;
        System.out.println(gt.get());
    }
}
