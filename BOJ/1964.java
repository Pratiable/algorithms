    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            long n = Long.parseLong(br.readLine());
            long result = 5;
            for (long i = 2; i < n + 1; i++) {
                result += (3 * i) + 1;
            }
            System.out.println(result % 45678);

            bw.flush();
            bw.close();
        }
    }