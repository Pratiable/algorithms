import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> intList = new ArrayList<>(n);

        while (st.hasMoreTokens()) {
            intList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(intList);

        System.out.printf("%d %d", intList.get(0), intList.get(intList.size() - 1));


    }
}