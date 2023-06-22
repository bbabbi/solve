package bronze_5;

import java.util.Scanner;

public class quiz2440 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}