interface Printable {
    void print(String s);
}

public class Lamda1 {
    public static void main(String[] args) {
        Printable prn = new Printable() {
            public void print(String s) {   // 익명 클래스
                System.out.println(s);
            }
        };

        prn.print("What is Lambda?");
    }
}
