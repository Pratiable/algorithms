import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Type[] types = new Type[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            types[i] = new Type(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(types);

        for (Type type: types) {
            sb.append(type.key);
        }

        System.out.println(sb);
    }

    static class Type implements Comparable {
        int keyboard, time;

        public Type(int keyboard, int time, String key) {
            this.keyboard = keyboard;
            this.time = time;
            this.key = key;
        }

        String key;

        @Override
        public int compareTo (Object o) {
            Type t = (Type) o;

            if (this.time == t.time) {
                return this.keyboard - t.keyboard;
            }

            return this.time - t.time;
        }
    }
}