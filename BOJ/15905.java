import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Student> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        arr.sort(Comparator.comparing((Student s) -> s.solved)
                .reversed()
                .thenComparingInt(s -> s.penalties));

        int cnt = 0;
        int std = arr.get(4).solved;

        for (int i = 5; i < n; i++) {
            if (arr.get(i).solved == std) cnt++;
        }

        System.out.println(cnt);
    }

    static class Student {
        int solved, penalties;

        public Student(int solved, int penalties) {
            this.solved = solved;
            this.penalties = penalties;
        }
    }
}