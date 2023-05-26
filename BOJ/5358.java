import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                switch (c) {
                    case 'i':
                        sb.append('e');
                        break;
                    case 'e':
                        sb.append('i');
                        break;
                    case 'I':
                        sb.append('E');
                        break;
                    case 'E':
                        sb.append('I');
                        break;
                    default:
                        sb.append(c);
                        break;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
