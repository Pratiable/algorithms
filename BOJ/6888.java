import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = X; i <= Y; i++) {
            if ((i - X) % 60 == 0) {
                sb.append("All positions change in year ").append(i).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
