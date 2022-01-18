public class whileex2 {
    public static void main(String[] args) {
        int num = 1;

        while (num < 100) {
            System.out.println(num);
            num++;
        }
        do {
            System.out.println(num);
            num--;
        } while (num >= 1);
    }
}