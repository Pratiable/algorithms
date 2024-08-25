import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] student = new String[n];
        String[] answer = new String[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            student[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            answer[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            if (student[i].equals(answer[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}