package bronze_3;

import java.util.Scanner;

public class quiz2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for(int i = 0; i < 2*n; i++){
            // 절댓값 계산 : Math.abs
            for(int j = 0; j < Math.abs(n - i - 1); j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*n - 1 - 2*Math.abs(n - i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}