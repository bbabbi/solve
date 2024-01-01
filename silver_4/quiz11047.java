package silver_4;

import java.io.*;
import java.util.StringTokenizer;

public class quiz11047 {
    public static void main(String[] args) throws IOException{
        // 입력 받을 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력할 준비
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* StringTokenizer : 지정한 구분자로 문자열을 쪼개줌!
           new StringTokenizer()를 사용하면 디폴트로 공백과 엔터로 문자열을 쪼갠다고 함 */
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 여기서는 공백을 기준으로

        int N = Integer.parseInt(st.nextToken()); // 쪼갠 문자열을 int N에 담음
        int K = Integer.parseInt(st.nextToken()); // 쪼갠 문자열을 int K에 담음

        int[] coin = new int [N];

        for(int i = 0; i < N; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i = N-1; i >= 0; i--){
            if(K >= coin[i]){
                count += K / coin[i];
                K = K % coin[i];
            }
        }
        bw. write(String.valueOf(count));

        br.close();
        bw.close();
    }
}
