import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if (Objects.equals(name, "#") && age == 0 && weight == 0) {
                break;
            }
            String type = age > 17 || weight >= 80 ? "Senior" : "Junior";
            bw.append(String.format("%s %s\n", name, type));
        }

        bw.flush();
        bw.close();
    }
}