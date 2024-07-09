import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        int [] position = new int[26];
        Arrays.fill(position, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asc = c - 'a';

            if (position[asc] == -1){
                position[asc] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(position[i] + " ");
        }

    }
}