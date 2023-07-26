package bronze_2;

import java.util.*;

public class quiz1550 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        //16진수 -> 10진수
        System.out.println(Integer.parseInt(input, 16));

        sc.close();
    }
}
