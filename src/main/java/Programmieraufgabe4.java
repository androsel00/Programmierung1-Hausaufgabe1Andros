public class Programmieraufgabe4 {
    public static void main(String[] args) {
        for (int i = 7; i >= 1; i--) {
            if (i == 5) {
                for (int j = 0; j < i; j++) {
                    System.out.print(".");
                }
                System.out.println();}
            else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}