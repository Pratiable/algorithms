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
        int[] list = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] temp;
        for (int i = 0; i < k; i++) {
            temp = new int[list.length - 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = list[j + 1] - list[j];
            }
            list = temp;
        }

        System.out.println(Arrays.stream(list).mapToObj(String::valueOf).collect(Collectors.joining(",")));
        bw.flush();
        bw.close();
    }
}