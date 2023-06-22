package bronze_5;

/*
[엄청난 부자 2]

갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 그 돈을 나누자고 따진다.
그 사실이 전 우주로 알려지자 우주에 있던 많은 생명체들이 자신들에게 돈을 분배해 달라고 당장 달려오기 시작했다.
프로토스 중앙 우주 정부의 정책인, ‘모든 지적 생명체는 동등하다’라는 규칙에 입각해서 돈을 똑같이 분배하고자 한다.
한 생명체에게 얼마씩 돈을 줄 수 있는가?
또, 생명체들에게 동일하게 분배한 후 남는 돈은 얼마인가?
*/

import java.math.BigInteger;
import java.util.Scanner;

public class quiz1271 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        // 한 생명체에게 돌아가는 돈의 양
        BigInteger division = n.divide(m); // 나누기 연산
        BigInteger remain = n.remainder(m); // 나머지 연산

        System.out.println(division);
        System.out.println(remain);

        sc.close();
    }
}
