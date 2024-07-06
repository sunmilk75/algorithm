import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double)arr[i]/max * 100;
        }

        double avg = sum / n;
        System.out.println(avg);
    }
}