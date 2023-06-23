package bronze_4;

import java.util.Scanner;

public class quiz10039 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int total = 0; // 전체 스코어의 합

        for(int i = 0; i < 5; i++){
            int score = sc.nextInt();

            if(score < 40){
                score = 40;
            }

            total += score;
        }

        int result = total / 5;

        System.out.println(result);

        sc.close();
    }
}
