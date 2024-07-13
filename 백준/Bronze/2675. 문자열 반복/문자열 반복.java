import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        List<Integer> repetitions = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int r = scn.nextInt();
            String str = scn.next();
            repetitions.add(r);
            strings.add(str);
        }

        for (int i = 0; i < n; i++) {
            int r = repetitions.get(i);
            String str = strings.get(i);
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}