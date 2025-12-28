import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        String[] clone = arr.clone();
        Arrays.sort(clone);
        
        if (Arrays.equals(arr, clone)) {
            System.out.print("INCREASING");
            return;
        }

        Arrays.sort(clone, Collections.reverseOrder());
        
        if (Arrays.equals(arr, clone)) {
            System.out.print("DECREASING");
            return;
        }

        System.out.print("NEITHER");
    }
}
