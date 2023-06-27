package bronze_3;

// 배열을 다루는 문제임.

import java.util.*;

public class quiz2857 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] FBI = new String[5];
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            FBI[i] = sc.nextLine();
            if (FBI[i].contains("FBI")) { // "FBI"가 포함되어 있는지 확인
                index.add(i + 1);
            }
        }

        if (index.isEmpty()) {
            System.out.println("HE GOT AWAY!");
        } else {
            for (int resultindex : index) {
                System.out.print(resultindex + " ");
            }
        }

    }
}
