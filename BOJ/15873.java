import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.length() == 2) {
            System.out.println((str.charAt(0) - '0') + (str.charAt(1) - '0'));
        } else if (str.length() == 4) {
            System.out.println(20);
        } else if (str.length() == 3) {
            if (str.charAt(1) == '0') {
                System.out.println((str.charAt(2) - '0') + 10);
                return;
            }
            System.out.println((str.charAt(0) - '0') + 10);
        }
    }
}