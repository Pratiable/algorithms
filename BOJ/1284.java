import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String num = br.readLine();
            if (Objects.equals(num, "0")) break;
            int result = num.length() + 1;

            for (int i = 0; i < num.length(); i++) {
                if(num.charAt(i) == '1') {
                    result += 2;
                } else if(num.charAt(i) == '0'){
                    result += 4;
                } else {
                    result += 3;
                }
            }
            bw.append(String.valueOf(result)).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
