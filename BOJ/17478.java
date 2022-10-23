import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        question(1, n, sb);

        System.out.println(sb);
        bw.flush();
        bw.close();
    }

    public static void question(int now, int stop, StringBuilder str) {
        str.append("____".repeat(now - 1)).append("\"재귀함수가 뭔가요?\"\n");
        str.append("____".repeat(now - 1)).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
        str.append("____".repeat(now - 1)).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
        str.append("____".repeat(now - 1)).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        if (now == stop) {
            str.append("____".repeat(now)).append("\"재귀함수가 뭔가요?\"\n");
            str.append("____".repeat(now)).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            str.append("____".repeat(now)).append("라고 답변하였지.\n");
            str.append("____".repeat(now - 1)).append("라고 답변하였지.\n");
            return;
        }
        question(now + 1, stop, str);
        str.append("____".repeat(now - 1)).append("라고 답변하였지.\n");
    }
}