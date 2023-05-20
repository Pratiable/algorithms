import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while (!(str = br.readLine()).equals("0")) {
            double n = Double.parseDouble(str);
            double sum = Math.pow(n, 4) + Math.pow(n, 3) + Math.pow(n, 2) + n + 1;
            sb.append(String.format("%.2f\n", sum));
        }
        
        System.out.println(sb);
    }
}
