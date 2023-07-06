package bronze_3;

import java.util.*;

public class quiz2914 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int melody; // 저작권이 있는 멜로디의 개수
        int A = sc.nextInt(); // 앨범에 수록된 곡의 개수
        int I = sc.nextInt(); // 평균

        // I는 올림한 값이니까 -1해서 계산해줘야함.
        melody = A * (I - 1) + 1;

        System.out.println(melody);
    }
}
