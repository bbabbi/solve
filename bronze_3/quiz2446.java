package bronze_3;

import java.util.*;

public class quiz2446 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //역삼각형
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(num-i)-1; j++){ // i가 작을 수록 별이 많이 출력됨.
                System.out.print("*");
            }
            System.out.println();
        }
        //삼각형
        for(int i = num-2; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(num-i)-1; j++){ // i가 작을 수록 별이 적게 출력됨.
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
