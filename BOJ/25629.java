import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        if (n % 2 == 0 && evens.size() == odds.size()) {
            System.out.println(1);
        } else if (n % 2 == 1 && evens.size() + 1 == odds.size()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}