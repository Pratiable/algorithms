import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (char c : str.toCharArray()) {
                switch (c) {
                    case 'A':
                        sum += 4;
                        break;
                    case 'K':
                        sum += 3;
                        break;
                    case 'Q':
                        sum += 2;
                        break;
                    case 'J':
                        sum += 1;
                        break;
                }
            }
        }

        System.out.println(sum);
    }
}