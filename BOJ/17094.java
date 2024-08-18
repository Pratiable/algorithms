import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = 0;
        int b = 0;

        for (char c : str.toCharArray()) {
            if (c == '2') {
                a++;
                continue;
            }
            b++;
        }

        if (a > b) {
            System.out.println("2");
        } else if (b > a) {
            System.out.println("e");
        } else {
            System.out.println("yee");
        }
    }
}