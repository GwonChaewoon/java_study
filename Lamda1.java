interface Printable {
    void print(String s);
}

public class Lamda1 {
    public static void main(String[] args) {
        Printable prn = (s) -> { System.out.println(s); };
        prn.print("What is Lambda?");
    }
}
