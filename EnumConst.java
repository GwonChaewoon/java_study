enum Person {
    MAN, WOMAN;

    @Override
    public String toString() { return "I am a dog person"; }
}

public class EnumConst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);    // toString 메소드의 반환 값 출력
        System.out.println(Person.WOMAN);    // toString 메소드의 반환 값 출력
    }
}
