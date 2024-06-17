import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true){
            int x = scn.nextInt();

            if(1 <= x && x < 10){
                for(int y = 1; y < 10; y++) {
                    System.out.println(x + " * " + y + " = " + (x*y));
                }
                break;
            }
        }
        scn.close();
    }
}