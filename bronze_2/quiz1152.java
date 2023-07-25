package bronze_2;

import java.util.*;

public class quiz1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // ;-;

        // 공백 기준으로 input 분리
        StringTokenizer st = new StringTokenizer(input, " ");
        // 토큰 개수 반환
        System.out.println(st.countTokens());

        sc.close();

    }
}
