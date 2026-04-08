import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            people[i] = new Person(h, m, s);
        }

        Arrays.sort(people);

        for (int i = 0; i < N; i++) {
            sb.append(people[i].h).append(" ").append(people[i].m).append(" ").append(people[i].s).append("\n");
        }

        System.out.print(sb);
    }

    static class Person implements Comparable<Person> {
        int h, m, s;

        Person(int h, int m, int s) {
            this.h = h;
            this.m = m;
            this.s = s;
        }

        @Override
        public int compareTo(Person p) {
            if (this.h != p.h) return this.h - p.h;
            if (this.m != p.m) return this.m - p.m;
            return this.s - p.s;
        }
    }
}
