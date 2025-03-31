import java.io.*;
import java.util.*;

public class Main {
    static int n, a, sec;
    static Deque<Coord> deque;
    static boolean[][] map, snake;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        a = Integer.parseInt(br.readLine());

        map = new boolean[n][n];
        snake = new boolean[n][n];
        deque = new ArrayDeque<>();
        sec = 1;
        int moveIdx = 0;
        int x = 0;
        int y = 0;

        snake[x][y] = true;
        deque.add(new Coord(x, y));


        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            map[r][c] = true;
        }

        int l = Integer.parseInt(br.readLine());
        Queue<Command> queue = new LinkedList<>();

        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String command = st.nextToken();
            queue.add(new Command(time, command));
        }

        for (int i = 0; i < l + 1; i++) {
            int nt = !queue.isEmpty() ? queue.peek().time : Integer.MAX_VALUE;
            while (sec <= nt) {
                int nx = x + dx[moveIdx];
                int ny = y + dy[moveIdx];
                if (nx < 0 || ny < 0 || nx >= n || ny >= n || snake[nx][ny]) {
                    System.out.println(sec);
                    return;
                }

                deque.offerFirst(new Coord(nx, ny));
                if (map[nx][ny]) {
                    map[nx][ny] = false;
                } else {
                    Coord tail = deque.pollLast();
                    snake[tail.x][tail.y] = false;
                }

                snake[nx][ny] = true;
                x = nx;
                y = ny;
                sec++;
            }

            Command next = queue.poll();
            moveIdx += next.cmd.equals("D") ? 1 : -1;
            moveIdx = moveIdx > 3 ? 0 : moveIdx < 0 ? 3 : moveIdx;
        }
    }

    static class Coord {
        int x, y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Command {
        int time;
        String cmd;

        public Command(int time, String cmd) {
            this.time = time;
            this.cmd = cmd;
        }

    }
}