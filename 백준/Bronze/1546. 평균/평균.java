import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scn.nextInt();
            arr[i] = x;
        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];

        double [] avg = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double score = ((double)arr[i]/max) * 100;
            avg[i] = score;
        }
        double sum = 0;
        for(double i : avg){
            sum += i;
        }
        System.out.println(sum/n);
    }
}
