import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] sentence = br.readLine().split(" ");

            for (int j = 2; j < sentence.length; j++) {
                sb.append(sentence[j]).append(" ");
            }

            sb.append(sentence[0]).append(" ").append(sentence[1]).append("\n");
        }

        System.out.print(sb);
    }
}
