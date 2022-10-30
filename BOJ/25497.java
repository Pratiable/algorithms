import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Character> lStack = new Stack<>();
        Stack<Character> sStack = new Stack<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'L') {
                lStack.push(ch);
            } else if(ch == 'S'){
                sStack.push(ch);
            } else if(ch == 'R'){
                if (!lStack.isEmpty()) {
                    if (lStack.peek() == 'L') {
                        count++;
                        lStack.pop();
                        continue;
                    }
                }
                break;
            } else if(ch == 'K') {
                if (!sStack.isEmpty()) {
                    if (sStack.peek() == 'S') {
                        count++;
                        sStack.pop();
                        continue;
                    }
                }
                break;
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}