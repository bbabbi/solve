package bronze_3;

import java.util.*;

public class quiz2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = sc.nextInt();

        int min = 60 * A + B; // 시간 -> 분 변경
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}