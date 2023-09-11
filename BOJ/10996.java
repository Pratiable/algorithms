import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if (n == 1) {
            System.out.println("*");
            return;
        }
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 1) {
                first.append("*");
                second.append(" ");
            } else {
                first.append(" ");
                second.append("*");
            }
        }

        first.append("\n");
        second.append("\n");

        System.out.println((first.toString() + second).repeat(n));
    }
}