import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        ArrayList<Integer> nList = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            nList.add(Integer.parseInt(st.nextToken()));
        }
        int result = 0;
        int amount = 0;
        for (int i = 0; i < nList.size(); i++) {
           if (amount + nList.get(i) > T) {
               break;
           }
           amount += nList.get(i);
           result++;
        }
        System.out.println(result);
    }
}