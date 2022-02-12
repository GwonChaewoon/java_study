class Cake {
    public void yummy() {
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake {
    public void yummy() {
        super.yummy();    //Cake의 yummy 메소드 호출
        System.out.println("Yummy Cheese Cake");
    }
    public void tasty() {
        super.yummy();    //Cake의 yummy 메소드 호출
        System.out.println("Yummy Tasty Cake");
    }
}

public class YummyCakeSuper {
    public static void main(String[] args) {
        CheeseCake cake = new CheeseCake();
        cake.yummy();
        cake.tasty();
    }
}
