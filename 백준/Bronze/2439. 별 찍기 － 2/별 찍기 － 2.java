import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String star = "*";
        for (int i = 0; i < n; i++) {
            for(int x = 1; x < n-i; x++) {
                System.out.print(" ");
            }
            System.out.print(star);
            star = star + "*";
            System.out.print("\n");
        }
    }
}