import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> sList = new ArrayList<>();
        List<Integer> lList = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            sList.add(Integer.parseInt(br.readLine()));
        }

        for(int i = 0; i < 2; i++) {
            lList.add(Integer.parseInt(br.readLine()));
        }
        sList.sort(Comparator.reverseOrder());
        lList.sort(Comparator.reverseOrder());
        System.out.println(sList.get(0) + sList.get(1) + sList.get(2) + lList.get(0));
    }
}