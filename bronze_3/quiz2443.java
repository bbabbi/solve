package bronze_3;

//quiz2442를 그저 뒤집는다고 생각하면 편함.

import java.util.Scanner;

public class quiz2443 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // 홀수개의 별이 출력되어야 하는 건 맞는데,i가 작을수록 많은 별이 출력되어야 함.
            for(int k = 1; k <= 2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
