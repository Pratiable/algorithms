import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if (n == 1) {
            System.out.println(cnt);
            return;
        }

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = br.readLine().trim();
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String s = names[i].length() >= names[j].length() ? names[j] : names[i];
                String l = names[i].length() >= names[j].length() ? names[i] : names[j];

                for (int si = 0; si < s.length(); si++) {
                    if (s.substring(0, si + 1).equals(l.substring(l.length() - si - 1)) || l.substring(0, si + 1).equals(s.substring(s.length() - si - 1))) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
