package bronze_3;

import java.util.*;

public class quiz2562 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] input = new int[9];
        int max = 0;
        int result = 0;

        for(int i = 0; i < 9; i++){
            input[i] = sc.nextInt();
            if(max < input[i]){
                max = input[i];
                result = i + 1; // 최댓값의 위치 기록
            }
        }

        System.out.println(max);
        System.out.println(result);
    }

}
