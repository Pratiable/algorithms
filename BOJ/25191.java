import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int chicken = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        int available = Integer.parseInt(st.nextToken()) / 2 + Integer.parseInt(st.nextToken());
        
        System.out.println(Math.min(chicken, available));
    }
}
