import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        String str = scn.next();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int x = (int)ch - (int)'0';
            sum += x;
        }
        System.out.println(sum);
    }
}