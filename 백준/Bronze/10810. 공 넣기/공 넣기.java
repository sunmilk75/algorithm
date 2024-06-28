
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [] basket = new int[n];
        for(int x = 0; x < m; x++){
            int i = scn.nextInt();
            int j = scn.nextInt();
            int k = scn.nextInt();
            for(int y = i -1 ; y <= j -1; y++){
                basket[y] = k;
            }
        }
        for(int x = 0; x < basket.length; x++){
            System.out.print(basket[x] + " ");
        }
    }
}