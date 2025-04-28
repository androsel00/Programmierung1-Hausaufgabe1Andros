public class Programmieraufgabe7 {
    public static int getMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(-5, 0, 5));
        System.out.println(getMax(10, 10, 5));
        System.out.println(getMax(7, 7, 7));
    }
}