import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String a = str.substring(0, n / 2);
        String b = str.substring(n / 2);
        System.out.println(a.equals(b) ? "Yes" : "No");
    }
}
