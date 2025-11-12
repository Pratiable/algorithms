import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Student> qualifiers = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            boolean isEnrolled = st.nextToken().equals("jaehak");
            boolean hadWon = st.nextToken().equals("winner");
            int shakePlace = Integer.parseInt(st.nextToken());
            int apcPlace = Integer.parseInt(st.nextToken());

            if (isEnrolled && !hadWon && (shakePlace == -1 || shakePlace > 3)) {
                qualifiers.add(new Student(name, apcPlace));
            }
        }

        qualifiers.sort(Comparator.comparingInt(x -> x.place));

        ArrayList<String> qualifierNames = new ArrayList<>();

        for (int i = 0; i < Math.min(qualifiers.size(), 10); i++) {
            qualifierNames.add(qualifiers.get(i).name);
        }

        int cnt = Math.min(qualifierNames.size(), 10);
        Collections.sort(qualifierNames);

        sb.append(cnt).append("\n");

        for (int i = 0; i < cnt; i++) {
            sb.append(qualifierNames.get(i)).append("\n");
        }

        System.out.print(sb);
    }

    static class Student {
        String name;
        int place;

        public Student(String name, int place) {
            this.name = name;
            this.place = place;
        }
    }
}
