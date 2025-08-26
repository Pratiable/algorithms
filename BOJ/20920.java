import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<Word> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.length() >= M) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        for (String word : map.keySet()) {
            list.add(new Word(word, map.get(word)));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).word).append("\n");
        }

        System.out.println(sb);
    }

    static class Word implements Comparable<Word> {
        String word;
        int count;

        Word(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(Word o) {
            if (this.count != o.count) {
                return o.count - this.count;
            }

            if (this.word.length() != o.word.length()) {
                return o.word.length() - this.word.length();
            }

            return this.word.compareTo(o.word);
        }
    }
}
