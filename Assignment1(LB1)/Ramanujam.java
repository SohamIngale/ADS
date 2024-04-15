public class Ramanujam {

    public static void checkR(int n) {
        boolean found = false;
        for (int a = 1; a <= Math.cbrt(n); a++) {
            for (int b = a; b <= Math.cbrt(n); b++) {
                if (a * a * a + b * b * b == n) {
                    System.out.println(n + " is a Ramanujan number:");
                    System.out.println(a + "^3 + " + b + "^3 = " + n);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println(n + " is not a Ramanujan number.");
        }
    }

    public static void main(String[] args) {
        int num = 1729; 
        checkR(num);
    }
}
