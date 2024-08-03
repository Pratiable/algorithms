import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 's' && str.charAt(i + 1) == 's') {
                System.out.println("hiss");
                return;
            }
        }

        System.out.println("no hiss");
    }
}