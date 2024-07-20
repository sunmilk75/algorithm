import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int [] list = {1, 1, 2, 2, 2, 8};
        int [] result = new int[6];
        for(int i = 0; i < 6; i++) {
            int x = scn.nextInt();
            result[i] = list[i] - x;
        }
        for(int x : result){
            System.out.print(x + " ");
        }

    }

}