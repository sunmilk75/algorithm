import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true){
            a = sc.nextInt();
            b = sc.nextInt();

            if(a > 0 && b < 10){
                int sum = a - b;
                System.out.println(sum);
                break;
            }
        }
        sc.close();
    }
}