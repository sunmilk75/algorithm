import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] list = new int[9];
        for(int i = 0; i < 9; i++) {
            list[i] = scn.nextInt();
        }
        int max = list[0];
        int count = 0;
        for(int x = 1; x < 9; x++) {
            if(list[x] > max) {
                max = list[x];
                count = x;
            }
        }
        System.out.println(max + "\n" + (count + 1));
    }
}