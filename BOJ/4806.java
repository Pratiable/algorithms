import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int cnt = 0;
        
        while ((str = br.readLine()) != null) {
            cnt++;
        }

        System.out.println(cnt);
    }
}