import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = 9;
        while (n-- > 0) {
            sb.append(String.format("%s ",br.readLine()));
        }
        String[] numberStrings = sb.toString().split(" ");
        int[] nums = Arrays.stream(numberStrings).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(nums).max().getAsInt();
        int index = Arrays.asList(numberStrings).indexOf(String.valueOf(max));
        System.out.printf("%d\n%d %d", max, (index / 9) + 1, (index % 9) + 1);
        br.close();
    }
}