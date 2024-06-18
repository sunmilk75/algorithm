import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(0 < a && a < 10001){
            int result = 0;
            for(int i = 1; i <= a; i++){
                result += i;
            }
            System.out.println(result);
        }
        scn.close();
    }
}