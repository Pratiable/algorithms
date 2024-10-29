import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String bin = Integer.toBinaryString(n);

        System.out.println(Integer.parseInt(new StringBuilder(bin).reverse().toString(), 2));
    }
}
