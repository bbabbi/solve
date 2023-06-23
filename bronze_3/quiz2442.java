package bronze_3;

import java.util.Scanner;

public class quiz2442 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            // 0 ~ n-1, 0 ~ n-2, ... 까지
            for(int j = 0; j < (n-i-1); j++){
                System.out.print(" ");
            }
            // 별은 홀수의 개수만큼 출력
            for(int k = 0; k < (2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}