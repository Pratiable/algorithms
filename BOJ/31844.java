import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().trim().toCharArray();
        int box = 0;
        int robot = 0;
        int goal = 0;
        for (int i = 0; i < 10; i++) {
            if (chars[i] == '@') {
                robot = i;
            } else if (chars[i] == '#') {
                box = i;
            } else if (chars[i] == '!') {
                goal = i;
            }
        }

        if ((box < goal && robot > box) || (box > goal && robot < box)) {
            System.out.println(-1);
            return;
        }

        System.out.println(robot > goal ? robot - goal - 1: goal - robot - 1);
    }
}