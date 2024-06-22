import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int [] arr = new int [t];
        int a;
        int b;
        int [] arra = new int [t];
        int [] arrb = new int [t];
            for(int i = 0; i < t; i++){
                a = scn.nextInt();
                b = scn.nextInt();
                if(0 < a && b < 10){
                    arr[i] = a+b;
                    arra[i] = a;
                    arrb[i] = b;
                }else{
                    System.out.println("첫 번째 입력 값은 0보다 크고 두 번째 입력 값은 10보다 작아야 합니다.");
                }
            }
        for(int x = 0; x < arr.length; x++){
            System.out.println("Case #" + (x+1) + ": " + arra[x] + " + " + arrb[x] + " = " + arr[x]);
        }
    }
}