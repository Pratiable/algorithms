import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int availableTeamCount = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            boolean isTeamAvailable = k <= a + b + c;
            boolean isIndividualAvailable = a >= l && b >= l && c >= l;

            if (isTeamAvailable && isIndividualAvailable) {
                availableTeamCount++;
                list.add(a);
                list.add(b);
                list.add(c);
            }
        }

        bw.append(String.valueOf(availableTeamCount)).append("\n");
        bw.append(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        bw.flush();
        bw.close();
    }
}