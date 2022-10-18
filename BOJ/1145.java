import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        list.add(Integer.parseInt(st.nextToken()));
        int multiple = 1;
        int availableCount = 0;
        Find:
        while (true) {
            for (int num : list) {
                if (multiple % num == 0) availableCount++;
                if (availableCount == 3) {
                    System.out.println(multiple);
                    break Find;
                }
            }
            multiple++;
            availableCount = 0;
        }

        bw.flush();
        bw.close();
    }
}