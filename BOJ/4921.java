import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int tc = 1;

        Loop:
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            if (str.charAt(0) != '1' && str.charAt(str.length() - 1) != '2') {
                sb.append(tc).append(". NOT\n");
                tc++;
                continue;
            }
            char prev = '1';

            LoopFor:
            for (int i = 1; i < str.length(); i++) {
                char ch = str.charAt(i);
                switch (ch) {
                    case '1':
                        sb.append(tc).append(". NOT\n");
                        tc++;
                        continue Loop;
                    case '2':
                        if (i == str.length() - 1) {
                            if (prev == '4' || prev == '6') {
                                sb.append(tc).append(". VALID\n");
                                tc++;
                                continue Loop;
                            }
                        }
                        break LoopFor;
                    case '3':
                        if (prev == '4' || prev == '6') {
                            prev = ch;
                            break;
                        } else {
                            break LoopFor;
                        }
                    case '4':
                    case '5':
                        if (prev == '1' || prev == '3') {
                            prev = ch;
                            break;
                        } else {
                            break LoopFor;
                        }
                    case '6':
                    case '7':
                        if (prev == '8') {
                            prev = ch;
                            break;
                        } else {
                            break LoopFor;
                        }
                    case '8':
                        if (prev == '7' || prev == '5') {
                            prev = ch;
                            break;
                        } else {
                            break LoopFor;
                        }
                }
            }
            sb.append(tc).append(". NOT\n");
            tc++;
        }

        System.out.println(sb);
    }
}