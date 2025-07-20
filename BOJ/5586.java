import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int joiCnt = 0;
        int ioiCnt = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String next = str.substring(i, i + 3);
            if (next.equals("JOI")) joiCnt++;
            if (next.equals("IOI")) ioiCnt++;
        }

        System.out.printf("%d\n%d", joiCnt, ioiCnt);
    }
}
