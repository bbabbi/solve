package bronze_3;

// 제곱을 다루는 math.pow()에 대한 문제

import java.util.*;

public class quiz1297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        double x = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));
        int height = (int)(x * H);
        int width = (int)(x * W);

        System.out.println(height + " " + width);
    }
}
