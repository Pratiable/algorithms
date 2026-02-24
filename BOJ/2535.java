import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        Student[] students = new Student[N];
        int[] countries = new int[101];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            students[i] = new Student(country, number, score);
        }

        Arrays.sort(students, (s1, s2) -> s2.score - s1.score);

        StringBuilder sb = new StringBuilder();
        int medal = 0;

        for (int i = 0; i < N && medal < 3; i++) {
            if (countries[students[i].country] >= 2) continue;
            countries[students[i].country]++;
            sb.append(students[i].country).append(" ").append(students[i].number).append("\n");
            medal++;
        }

        System.out.print(sb);
    }

    static class Student {
        int country, number, score;

        Student(int country, int number, int score) {
            this.country = country;
            this.number = number;
            this.score = score;
        }
    }
}
