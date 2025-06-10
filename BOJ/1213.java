import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] alp = new int[26];
        for (char ch : str.toCharArray()) {
            alp[ch - 'A']++;
        }
        boolean canMake = true;

        for (int i = 0; i < 26; i++) {
            if (alp[i] % 2 == 1 && canMake) {
                canMake = false;
            } else if (alp[i] % 2 == 1 && !canMake) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();
        char mid = 'A';

        for (int i = 0; i < 26; i++) {
            sb.append(String.valueOf(Character.valueOf((char) (i + 'A'))).repeat(alp[i] / 2));
            if (alp[i] % 2 == 1) mid = (char) (i + 'A');
        }

        StringBuilder reverse = new StringBuilder(sb);

        System.out.printf("%s%s%s", sb, str.length() % 2 == 1 ? mid : "", reverse.reverse());
    }
}
