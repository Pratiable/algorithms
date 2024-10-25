import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;

        while (str.length() != 1) {
            int mul = 1;
            for (char now : str.toCharArray()) {
                mul *= now - '0';
            }
            
            str = Integer.toString(mul);
            cnt++;
        }

        System.out.println(cnt);
    }
}