import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int min = Integer.MAX_VALUE;
        String tar = "";

        while (true) {
            st = new StringTokenizer(br.readLine());

            String city = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());

            if (temp < min) {
                min = temp;
                tar = city;
            }

            if (Objects.equals(city, "Waterloo")) break;
        }

        System.out.println(tar);
    }
}