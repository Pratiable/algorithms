import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            bw.append(String.format("Hello World, Judge %d!\n", i));
        }
        
        bw.flush();
        bw.close();
    }
}