import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        if(0 < n && n < 10001 && 0 < x && x < 10001){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scn.nextInt());
            }
            for (int j : list){
                if (j < x){
                    System.out.print(j + " ");
                }
            }
        }
    }
}
