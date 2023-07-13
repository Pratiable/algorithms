import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        if (S.charAt(N - 1) == 'G') {
            System.out.println(S.substring(0, N - 1));
        } else {
            System.out.println(S + "G");
        }
    }
}
