public class whileex3 {
    public static void main(String[] args) {
        int num = 0;
        int total = 0;

        while(num <= 1000) {
            if(num % 14 == 0) {
                total += num;
                System.out.printf("합계: %d\n", total);
            }
            num++;
        }
    }
}
