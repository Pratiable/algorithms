import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();
        int bombSize = bomb.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));

            if (stack.size() >= bombSize) {
                boolean isBomb = true;
                for (int j = 0; j < bombSize; j++) {
                    if (bomb.charAt(j) != stack.get(stack.size() - (bombSize - j))) {
                        isBomb = false;
                    }
                }

                if (isBomb) {
                    for (int j = 0; j < bombSize; j++) {
                        stack.pop();
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("FRULA");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

        System.out.println(sb);
    }
}