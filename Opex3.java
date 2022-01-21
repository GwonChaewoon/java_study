public class Opex3 {
    public static void main(String[] args) {
        int original = 3;
        int i, j;
        for(i = 2; i < 5; i++) {
            int total = 0;
            for(j = 1; j<=i; j++) {
                total += original*j;
            }
            System.out.println(total);
        }
    }
}