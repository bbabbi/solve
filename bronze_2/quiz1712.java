package bronze_2;

// BufferedReader를 활용해서도 풀어볼 것.

import java.util.*;

public class quiz1712 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(C<=B){
            System.out.println("-1");
        }
        else{
            System.out.println((A/(C-B))+1);
        }
    }
}
