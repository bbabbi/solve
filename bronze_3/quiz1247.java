package bronze_3;

// long 타입을 사용하지말고 bigInteger()를 사용해야함.
// bigInteger()는 quiz1271.md 참고

import java.util.*;
import java.math.BigInteger;

public class quiz1247 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            int n = sc.nextInt(); // 각 테스트 케이스별로 몇 개의 정수를 입력할건지, 입력받음.
            BigInteger sum = BigInteger.ZERO; // 입력받은 정수들의 합 (BigInteger)

            for(int j = 0; j < n; j++){
                // 문제에서 주어진 입력의 범위가 long에 해당하므로 long 타입 변수로 선언
                BigInteger input = sc.nextBigInteger(); // 정수 입력받기 (n개)
                sum = sum.add(input); // 입력받은 정수를 sum에 더해서 전체 합 구하기(add 메소드)
            }

            if(sum.compareTo(BigInteger.ZERO) > 0){
                System.out.println("+");
            }
            else if (sum.compareTo(BigInteger.ZERO) < 0){
                System.out.println("-");
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
    }
}
