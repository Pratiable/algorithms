import java.io.*;
import java.util.*;

public class Main {
    public static int[] aScoreBoard = new int[4];
    public static int[] bScoreBoard = new int[4];
    public static int[] cScoreBoard = new int[4];
    public static int aScore;
    public static int bScore;
    public static int cScore;
    public static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            aScoreBoard[Integer.parseInt(st.nextToken())]++;
            bScoreBoard[Integer.parseInt(st.nextToken())]++;
            cScoreBoard[Integer.parseInt(st.nextToken())]++;
        }

        aScore = aScoreBoard[1] + aScoreBoard[2] * 2 + aScoreBoard[3] * 3;
        bScore = bScoreBoard[1] + bScoreBoard[2] * 2 + bScoreBoard[3] * 3;
        cScore = cScoreBoard[1] + cScoreBoard[2] * 2 + cScoreBoard[3] * 3;
        max = Math.max(aScore, Math.max(bScore, cScore));

        if (aScore > bScore && aScore > cScore) {
            System.out.println("1 " + aScore);
        } else if (bScore > aScore && bScore > cScore) {
            System.out.println("2 " + bScore);
        } else if (cScore > aScore && cScore > bScore){
            System.out.println("3 " + cScore);
        } else {
            System.out.println(compareThree(3));
        }
    }

    public static String compareThree(int score) {
        if (aScoreBoard[score] == bScoreBoard[score] && bScoreBoard[score] == cScoreBoard[score]) {
            if (score == 3) {
                return compareThree(2);
            }
            return "0 " + max;
        }

        if (aScoreBoard[score] > bScoreBoard[score] && aScoreBoard[score] > cScoreBoard[score]) {
            return "1 " + aScore;
        } else if (bScoreBoard[score] > aScoreBoard[score] && bScoreBoard[score] > cScoreBoard[score]) {
            return "2 " + bScore;
        } else if (cScoreBoard[score] > aScoreBoard[score] && cScoreBoard[score] > bScoreBoard[score]) {
            return "3 " + cScore;
        }

        if (aScoreBoard[score] == bScoreBoard[score]) {
            return compareTwo(1, 2);
        } else if (bScoreBoard[score] == cScoreBoard[score]) {
            return compareTwo(2, 3);
        } else {
            return compareTwo(1, 3);
        }
    }

    public static String compareTwo(int a, int b) {
        if (a == 1 && b == 2) {
            if (aScoreBoard[2] > bScoreBoard[2]) return "1 " + max;
            if (bScoreBoard[2] > aScoreBoard[2]) return "2 " + max;
            return "0 " + max;
        } else if (a == 2 && b == 3) {
            if (bScoreBoard[2] > cScoreBoard[2]) return "2 " + max;
            if (cScoreBoard[2] > bScoreBoard[2]) return "3 " + max;
            return "0 " + max;
        } else {
            if (aScoreBoard[2] > cScoreBoard[2]) return "1 " + max;
            if (cScoreBoard[2] > aScoreBoard[2]) return "3 " + max;
            return "0 " + max;
        }
    }
}
