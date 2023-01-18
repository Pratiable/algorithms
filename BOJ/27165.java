import java.io.*;
import java.util.*;

public class Main {
    static int x, n;
    static int[] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine()) + 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(br.readLine());

        int countOne = 0;
        ArrayList<Integer> list = new ArrayList<>();
        map = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map[i] = num;
            if (num == 1) {
                countOne++;
                list.add(i);
            }
        }

        if (countOne > 2) {
            System.out.println("NO");
            return;
        }

        if (countOne == 1) {
            int oneIndex = list.get(0);
            if (oneIndex - x >= 0) {
                if (map[oneIndex - x] > 2) {
                    sb.append("YES\n");
                    sb.append(oneIndex - x).append(" ").append(oneIndex);
                    System.out.println(sb);
                    return;
                }
            }

            if (oneIndex + x < n) {
                if (map[oneIndex + x] != 0) {
                    sb.append("YES\n");
                    sb.append(oneIndex).append(" ").append(oneIndex + x);
                    System.out.println(sb);
                    return;
                }
            }

            System.out.println("NO");
            return;
        }

        if (countOne == 2) {
            int firstIndex = list.get(0);
            int secondIndex = list.get(1);
            if (firstIndex + x == secondIndex) {
                sb.append("YES\n");
                sb.append(firstIndex).append(" ").append(secondIndex);
                System.out.println(sb);
                return;
            }
            System.out.println("NO");
            return;
        }
		
        Loop:
        for (int i = 0; i < n - x; i++) {
            if (map[i] - 1 == 1 || map[i] == 0) continue;
            if (map[i] - 1 >= 2 && map[i + x] + 1 >= 2) {
                sb.append("YES\n");
                sb.append(i).append(" ").append(i + x);
                System.out.println(sb);
                return;
            }
        }
        System.out.println("NO");
    }
}
