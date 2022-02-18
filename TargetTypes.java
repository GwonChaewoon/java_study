class Box<T> {
    private T ob;
    public void set(T o) { ob = o; }
    public T get() { return ob; }
}

class EmptyBoxFactory {
    public static <T> Box<T> makeBox() {   // 제너릭 메소드
        Box<T> box = new Box<T>();    // 상자 생성
        return box;    // 생성한 상자 반환
    }
}

public class TargetTypes {
    public static void main(String[] args) {
        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        iBox.set(25);
        System.out.println(iBox.get());
    }
}
