import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true){
            a = sc.nextInt();
            b = sc.nextInt();

            if(a > 0 && a < 10 && 0 < b && b < 10){
                double result = (double)a / b;
                System.out.printf("%.9f%n", result);  // 결과를 9자리 소수점 이하로 출력.
                break;
            }
        }
        sc.close();
    }
}
