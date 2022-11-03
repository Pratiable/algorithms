import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        StringBuilder sb = new StringBuilder();

        while((s = br.readLine()) != null){
            int lower = 0;
            int upper = 0;
            int num = 0;
            int space = 0;
            for (int i = 0; i < s.length(); i++) {
                char now = s.charAt(i);
                if (now >= 'A' && now <= 'Z') {
                    upper++;
                } else if(now >= 'a' && now <= 'z'){
                    lower++;
                } else if(now >= '0' && now <= '9'){
                    num++;
                } else if(now == ' '){
                    space++;
                }
            }

            sb.append(lower).append(" ").append(upper).append(" ").append(num).append(" ").append(space).append("\n");
        }

        System.out.println(sb);
    }
}
