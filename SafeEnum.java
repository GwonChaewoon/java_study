enum Animal {
    DOG, CAT
}
enum Person {
    MAN, WOMAN
}

public class SafeEnum {
    public static void main(String[] args) {
        who(Person.MAN);   // 정상적인 메소드 호출
        // who(Animal.DOG);
    }

    public static void who(Person man) {
        switch(man) {
        case MAN:
            System.out.println("남성 손님입니다.");
            break;
        case WOMAN:
            System.out.println("여성 손님입니다.");
            break;
        }
    }
}
