import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str;
        int cnt = 0;

        while (true) {
            str = br.readLine();

            if (str.equals("고무오리 디버깅 끝")) break;

            if (str.equals("문제")) {
                cnt++;
            } else if (str.equals("고무오리")) {
                if (cnt > 0) {
                    cnt--;
                } else {
                    cnt += 2;
                }
            }
        }

        System.out.print(cnt == 0 ? "고무오리야 사랑해" : "힝구");
    }
}
