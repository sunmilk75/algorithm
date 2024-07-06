import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String [] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            strArr[i] = str;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(strArr[i].charAt(0) + "" + strArr[i].charAt(strArr[i].length() - 1));
        }
    }
}