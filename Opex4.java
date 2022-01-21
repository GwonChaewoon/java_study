public class Opex4 {
    public static void main(String[] args) {
        double n1 = ((25 + 5) + (36 / 4) - 72) * 5;
        double n2 = ((25 * 5) + (36 - 4) + 71) / 4;
        double n3 = (128/4) * 2;
        boolean toggle = false;
        if(n1 > n2) {
            if(n2 > n3) {
                toggle = true;
            }
        }
        if(toggle) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
