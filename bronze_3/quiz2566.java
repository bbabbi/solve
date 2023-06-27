package bronze_3;

import java.util.*;

public class quiz2566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] input = new int[9][9];
        int row = 0, column = 0;
        int max = 0;

        for (int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                input[i][j] = sc.nextInt(); // i행 j열에 입력받기

                if(max < input[i][j]){
                    max = input[i][j];
                    row = i+1; // 최댓값의 위치 기록 - 행 = i
                    column = j+1; // 최댓값의 위치 기록 - 열 = j
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);

        sc.close();
    }
}
