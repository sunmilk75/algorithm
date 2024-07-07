import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println((int)ch);
        }
        System.out.println();
    }
}