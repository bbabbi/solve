package bronze_4;

import java.util.*;

public class quiz1264 {
    public static int counting(String input){
        int cnt = 0;
        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence;

        while(true){
            sentence = sc.nextLine();

            if(sentence.equals("#")){
                break;
            }

            int result = counting(sentence);
            System.out.println(result);
        }


    }
}
