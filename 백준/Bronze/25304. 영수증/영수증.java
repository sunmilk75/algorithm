import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int result = 0;
        if(0 < x && x <= 1000000000 && 0 < n && n <= 100){
            for(int i = 0; i < n; i++){
                int a = scn.nextInt();
                int b = scn.nextInt();
                if(0 < a && a <= 1000000 && 0 < b && b <= 10){
                    result += a * b;
                }
            }
            if(x == result){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }scn.close();
    }
}