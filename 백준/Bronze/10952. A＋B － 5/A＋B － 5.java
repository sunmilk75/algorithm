import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr_result = new ArrayList<>();
        while(true){
            int a = scn.nextInt();
            int b = scn.nextInt();
            if(a == 0 && b == 0){
                break;
            }else{
                arr_result.add(a+b);
            }
        }
        for(int result : arr_result){
            System.out.println(result);
        }
    }
}
