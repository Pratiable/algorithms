import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        int l = 0;

        for (int i = 0; i < 9; i++) {
            String str = br.readLine();
            if (str.equals("Tiger")) {
                t++;
                continue;
            }
            l++;
        }

        System.out.println(t > l ? "Tiger" : "Lion");
    }
}