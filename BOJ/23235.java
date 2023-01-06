import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNo = 1;
        while(true) {
            String str = br.readLine();
            if (Objects.equals(str, "0")) break;
            sb.append("Case ").append(caseNo++).append(": Sorting... done!\n");
        }

        System.out.println(sb);
    }
}