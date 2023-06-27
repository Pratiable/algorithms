import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " : ");
        int sh = Integer.parseInt(st.nextToken());
        int sm = Integer.parseInt(st.nextToken());
        int ss = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " : ");
        int eh = Integer.parseInt(st.nextToken());
        int em = Integer.parseInt(st.nextToken());
        int es = Integer.parseInt(st.nextToken());

        int sTime = sh * 3600 + sm * 60 + ss;
        int eTime = eh * 3600 + em * 60 + es;

        if (eTime >= sTime) {
            System.out.println(eTime - sTime);
            return;
        }
        
        System.out.println(24 * 3600 - sTime + eTime);
    }
}
