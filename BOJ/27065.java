import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            boolean isRight = true;
            if (!isOver(num)) {
                isRight = false;
            } else {
                for (int j = 1; j < num; j++) {
                    if (num % j == 0) {
                        if (isOver(j)) {
                            isRight = false;
                            break;
                        }
                    }
                }
            }
            sb.append(isRight ? "Good Bye\n" : "BOJ 2022\n");
        }
        System.out.println(sb);
    }

    static boolean isOver(int num) {
        int sum = 0;
        for (int i = 1; i < (num / 2) + 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }
}
