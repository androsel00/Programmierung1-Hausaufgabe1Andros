public class Programmieraufgabe6 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            boolean odd = x % 2 == 1; //abwechselnde lines, bei odd line wird *, wenn nicht ., so kann man einfacher generieren

            for (int i = 1; i <= 4; i++) {
                if (odd) {
                    System.out.print("*.");
                }
                else {
                    System.out.print(".*");
                }
            }
            if (odd) {
                System.out.println("*");
            } else {
                System.out.println(".");
            }
        }
    }
}