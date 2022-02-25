class Person {
    public static final Person MAN = new Person();
    public static final Person WOMAN = new Person();

    @Override
    public String toString() {
        return "I am a dog person";    // "나는 개를 사랑하는 사람입니다."
    }
}

public class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }
}
