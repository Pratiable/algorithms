import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] date = str.split("/");
        int a = Integer.parseInt(date[0]);
        int b = Integer.parseInt(date[1]);

        if ((a >= 1 && a <= 12) && (b >= 1 && b <= 12)) {
            System.out.println("either");
        } else if (a >= 1 && a <= 12) {
            System.out.println("US");
        } else if (b >= 1 && b <= 12) {
            System.out.println("EU");
        }
    }
}