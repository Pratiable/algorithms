import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Snowman[] snowmen = new Snowman[n * (n - 1) / 2];
        int idx = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                snowmen[idx++] = new Snowman(i, j, nums[i] + nums[j]);
            }
        }

        Arrays.sort(snowmen, Comparator.comparing(o -> o.height));

        for (int i = 0; i < snowmen.length; i++) {
            for (int j = i + 1; j < snowmen.length; j++) {
                if (!snowmen[i].isAvailable(snowmen[j])) continue;

                if (snowmen[j].height - snowmen[i].height == 0) {
                    min = 0;
                    break;
                }
                if (snowmen[j].height - snowmen[i].height < min) {
                    min = snowmen[j].height - snowmen[i].height;
                }
                break;
            }
        }

        System.out.println(min);
    }

    static class Snowman {
        int x, y, height;

        public Snowman(int x, int y, int height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }

        boolean isAvailable(Snowman snow) {
            return x != snow.x && x != snow.y && y != snow.x && y != snow.y;
        }
    }
}