enum Person {
    MAN, WOMAN;

    private Person() {
        System.out.println("Person constructor called");
    }

    @Override
    public String toString() { return "I am a dog person"; }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }
}
