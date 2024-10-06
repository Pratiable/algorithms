import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] name = str.split(" ");
            sb.append("god");

            for (int k = 1; k < name.length; k++) {
                sb.append(name[k]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
