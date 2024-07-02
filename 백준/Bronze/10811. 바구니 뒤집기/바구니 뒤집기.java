import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int count = 1;
        int [] basket = new int[n];
        for(int x = 0; x < n; x++){
            basket[x] = count;
            count++;
        }

        for(int x = 0; x < m; x++){
            int i = scn.nextInt() -1;
            int j = scn.nextInt() -1;
            while (i < j){
                int num = basket[i];
                basket[i] = basket[j];
                basket[j] = num;
                i++;
                j--;
            }
        }
        for(int x : basket){
            System.out.print(x + " ");
        }
    }
}