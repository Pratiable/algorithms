import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = {'J','A','B','C','D','E','F','G','H','I','Z'};
        int[] weights = {2, 7, 6, 5, 4, 3, 2};
        int sum = 0;

        for(int i = 0; i < 7; i++){
            sum += (input.charAt(i) - '0') * weights[i];
        }

        System.out.println(chars[sum % 11]);
    }
}