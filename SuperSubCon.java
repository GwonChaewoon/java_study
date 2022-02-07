class SuperCLS {
    public SuperCLS() {      //생성자
        System.out.println("I'm Super Class");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS() {        //생성자
        System.out.println("I'm sub Class");
    }
}

public class SuperSubCon {
    public static void main(String[] args) {
        new SubCLS();
    }
}
