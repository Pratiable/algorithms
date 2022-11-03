import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(",");
        int sum = 0;

        for (String str: s) {
            sum += Integer.parseInt(str);
        }

        System.out.println(sum);
    }
}
