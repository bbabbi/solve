package bronze_3;

import java.util.*;

public class quiz2875 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int teams = 0;

        // 팀 구성 조건 : 여자(n)는 2명, 남자(m)는 1명
        // 단, 팀을 구성하기 전에 여자와 남자의 합은 3명과 인턴십 인원(k)명 이상의 인원이 남아있어야 한다.
        while(n >= 2 && m >= 1 && m+n >= 3+k){
            n = n-2;
            m = m-1;

            teams ++; // 팀 구성 완료 시, teams +1
        }

        System.out.println(teams);
    }
}
