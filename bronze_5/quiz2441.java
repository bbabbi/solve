package bronze_5;

import java.util.Scanner;

public class quiz2441 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n;
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            // 공백의 개수를 결정. 공백은 0-1-2-3-4 순으로 증가해야함.
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // 별의 개수를 결정. 별의 개수는 (n-i)개
            for(int j = 1; j <= (n-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
