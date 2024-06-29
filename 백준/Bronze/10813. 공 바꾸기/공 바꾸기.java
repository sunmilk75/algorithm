import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [] basket = new int[n];
        for(int i=0; i<n; i++){
            basket[i] = i+1;
        }
        for(int x=0; x<m ;x++){
            int i = scn.nextInt();
            int j = scn.nextInt();
            int a = basket[i-1];
            int b = basket[j-1];
            basket[i-1] = b;
            basket[j-1] = a;
        }
        for(int y : basket){
            System.out.print(y + " ");
        }
    }
}