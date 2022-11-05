import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int sum = (e + f) / c;
        int remain = ((e + f) / c) + ((e + f) % c);
        while (remain > c - 1) {
            sum += remain / c;
            remain = (remain / c) + (remain % c);
        }
        System.out.println(sum);
    }
}