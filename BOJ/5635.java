import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String minN = "", maxN = "";
        int minY = Integer.MAX_VALUE, minM = Integer.MAX_VALUE, minD = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE, maxM = Integer.MIN_VALUE, maxD = Integer.MIN_VALUE;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (maxY < year) {
                 maxY = year;
                 maxM = month;
                 maxD = day;
                 maxN = name;
            } else if (maxY == year) {
                if (maxM < month) {
                    maxM = month;
                    maxD = day;
                    maxN = name;
                } else if (maxM == month) {
                    if (maxD < day) {
                        maxD = day;
                        maxN = name;
                    }
                }
            }

            if (minY > year) {
                minY = year;
                minM = month;
                minD = day;
                minN = name;
            } else if (minY == year) {
                if (minM > month) {
                    minM = month;
                    minD = day;
                    minN = name;
                } else if (minM == month) {
                    if (minD > day) {
                        minD = day;
                        minN = name;
                    }
                }
            }
        }

        System.out.println(maxN);
        System.out.println(minN);
    }
}