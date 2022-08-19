import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String> mirror = new ArrayList<>();
        while (n-- > 0) {
            mirror.add(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        switch (k) {
            case 1:
                bw.append(String.join("\n", mirror));
                break;
            case 2:
                for (String m : mirror) {
                    StringBuffer sb = new StringBuffer(m);
                    bw.append(String.format("%s\n", sb.reverse()));
                }
                break;
            case 3:
                Collections.reverse(mirror);
                bw.append(String.join("\n", mirror));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}