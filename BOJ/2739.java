import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            stringBuilder.append(String.format("%d * %d = %d\n", num, i, num * i));
        }
        System.out.println(stringBuilder);
    }
}
