import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int v = scn.nextInt();
            list.add(v);
        }
        int r = scn.nextInt();
        for(int i : list){
            if(r == i){
                result = result + 1;
            }
        }
        System.out.println(result);
    }
}
