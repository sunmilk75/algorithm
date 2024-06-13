import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		

        Scanner scn = new Scanner(System.in);

        int a, b;

        while (true) {
            a = scn.nextInt();

            b = scn.nextInt();

            if (a > 0 && b < 10) {
                int sum = a + b;
                System.out.println(sum);
                break;
            } else {
            }
        }

        scn.close();
    }
}