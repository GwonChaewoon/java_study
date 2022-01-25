public class returnmethodex1 {
    public static void main(String[] args) {
        double radius = 3.15;
        double PI = 3.14;
        double area = PI * (radius*radius);
        double Round = 2 * PI * radius;
        System.out.println("원의 넓이: " + area);
        System.out.println("원의 둘레: " + Round);
    }

    public static double area(double num1, double num2) {
        double area = num1 * (num2*num2);
        return area;
    }

    public static double Round(double num1, double num2) {
        return 2 * num1 * num2;
    }
}
