import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        
        while(st.hasMoreTokens()) {
            bw.append(st.nextToken().charAt(0));
        }
        
        bw.flush();
        bw.close();
    }
}