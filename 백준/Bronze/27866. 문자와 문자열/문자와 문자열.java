import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int n = scn.nextInt();
        System.out.println(str.charAt(n-1));
    }
}