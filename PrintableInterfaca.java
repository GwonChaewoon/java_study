interface Printable {
    public void print(String doc);
}

class Printer implements Printable {     // Printable을 구현하는 Printer 클래스
    @Override
    public void print(String doc) {      // 오버라이딩 관계 성립
        System.out.println(doc);
    }
}

public class PrintableInterfaca {
    public static void main(String[] args) {
        Printable prn = new Printer();
        prn.print("Hello Java");
    }
}
