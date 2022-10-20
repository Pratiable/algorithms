import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[26];
        for (int i = 0; i < n; i++) {
            char firstChar = br.readLine().charAt(0);
            list[firstChar - 97]++;
        }

        StringBuilder result = new StringBuilder();
        for (int j = 0; j < list.length; j++) {
            if (list[j] >= 5) {
                result.append((char) (j + 97));
            }
        }

        System.out.println(Objects.equals(result.toString(), "") ? "PREDAJA" : result.toString());
    }
}
