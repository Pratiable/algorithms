import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int front = 9 + 7 * 3 + 8 + 0 * 3 + 9 + 2 * 3 + 1 + 4 * 3 + 1 + 8 * 3 ;
        int last = a + b * 3 + c;

        System.out.println("The 1-3-sum is " + (front + last));
    }
}
