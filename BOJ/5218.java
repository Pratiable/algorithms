    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                bw.append("Distances: ");
                for (int j = 0; j < a.length(); j++) {
                    int ac = a.charAt(j);
                    int bc = b.charAt(j);
                    if (ac > bc) {
                        bw.append(String.valueOf((bc + 26) - ac)).append(" ");
                    } else {
                        bw.append(String.valueOf(bc - ac)).append(" ");
                    }
                }
                bw.append("\n");
            }

            bw.flush();
            bw.close();
        }
    }