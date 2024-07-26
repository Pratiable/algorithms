import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = map[i][j];
                if (d == 1) {
                    switch(c) {
                        case 'd':
                            sb.append('q');
                            break;
                        case 'b':
                            sb.append('p');
                            break;
                        case 'q':
                            sb.append('d');
                            break;
                        case 'p':
                            sb.append('b');
                            break;
                    }
                } else {
                    switch(c) {
                        case 'd':
                            sb.append('b');
                            break;
                        case 'b':
                            sb.append('d');
                            break;
                        case 'q':
                            sb.append('p');
                            break;
                        case 'p':
                            sb.append('q');
                            break;
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}