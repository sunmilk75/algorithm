import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "";
        while (true) {
            int N = scn.nextInt();
            if(N%4 == 0 && N != 0){
                for(int i = 0; i < N/4; i++){
                    str += "long ";
                }
                System.out.println(str + "int");
                scn.close();
                break;
            }else{
                System.out.println("4의 배수를 입력하세요.");
            }
        }
    }
}