import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pqAsc = new PriorityQueue<>();
            PriorityQueue<Integer> pqDesc = new PriorityQueue<>(Collections.reverseOrder());
            HashMap<Integer, Integer> mapAsc = new HashMap<>();
            HashMap<Integer, Integer> mapDesc = new HashMap<>();
            int len = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (Objects.equals(cmd, "I")) {
                    pqAsc.add(num);
                    pqDesc.add(num);
                    len++;
                } else {
                    boolean isDone = true;
                    if (len == 0) continue;
                    if (num == 1) {
                        while (isDone) {
                            isDone = f(pqDesc.poll(), mapDesc, mapAsc);
                        }
                    } else {
                        while (isDone) {
                            isDone = f(pqAsc.poll(), mapAsc, mapDesc);
                        }
                    }
                    len--;
                }
            }

            if (len == 0) {
                sb.append("EMPTY\n");
            } else {
                while (true) {
                    int now = pqDesc.peek();
                    if (mapAsc.containsKey(now) && mapAsc.get(now) != 0) {
                        f(pqDesc.poll(), mapDesc, mapAsc);
                        continue;
                    }
                    break;
                }

                while (true) {
                    int now = pqAsc.peek();
                    if (mapDesc.containsKey(now) && mapDesc.get(now) != 0) {
                        f(pqAsc.poll(), mapAsc, mapDesc);
                        continue;
                    }
                    break;
                }

                sb.append(pqDesc.poll()).append(" ").append(pqAsc.poll()).append("\n");
            }
        }

        System.out.println(sb);
    }

    static boolean f(int now, HashMap<Integer, Integer> plus, HashMap<Integer, Integer> minus) {
        if (minus.containsKey(now)) {
            if (minus.get(now) != 0) {
                minus.put(now, minus.get(now) - 1);
                return true;
            }
        }

        if (plus.containsKey(now)) {
            plus.put(now, plus.get(now) + 1);
        } else {
            plus.put(now, 1);
        }
        return false;
    }
}
