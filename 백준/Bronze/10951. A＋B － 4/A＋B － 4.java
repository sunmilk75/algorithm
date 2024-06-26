import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        while (scn.hasNextInt()) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            if(0 < a && b < 10){
                result.add(a+b);
            }
        }
        scn.close();
        for(int plus : result){
            System.out.println(plus);
        }

    }
}
