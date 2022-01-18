public class whileex1 {
    public static void main(String[] args) {
        int num = 1;
        int total = 0;

        while (num < 100) {
            total += num;
            num++;
        }
        System.out.printf("합계: %d\n", total);

    }
}