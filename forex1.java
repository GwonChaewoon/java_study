public class forex1 {
    public static void main(String[] args) {
        int i, j;
        for(i = 2; i < 10; i++) {
            if(i % 2 == 0) {
                for(j = 1; j <= i; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println("--------------------------");
            }
        }
    }
}
