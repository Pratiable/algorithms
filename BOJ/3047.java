import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        StringBuilder result = new StringBuilder();
        Arrays.sort(nums);
        String[] sequence = br.readLine().split("");

        for (String s : sequence) {
            switch (s) {
                case "A":
                    result.append(String.format("%d ", nums[0]));
                    break;
                case "B":
                    result.append(String.format("%d ", nums[1]));
                    break;
                case "C":
                    result.append(String.format("%d ", nums[2]));
                    break;
            }
        }
        System.out.println(result.toString().trim());
    }
}