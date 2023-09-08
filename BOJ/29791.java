import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] eTime = new int[n];
    int[] oTime = new int[m];

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      eTime[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < m; i++) {
      oTime[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(eTime);
    Arrays.sort(oTime);

    int eCnt = 0;
    int oCnt = 0;

    int eImmune = 0;
    int oImmune = 0;

    for (int i = 0; i < n; i++) {
      if (eImmune <= eTime[i]) {
        eCnt++;
        eImmune = eTime[i] + 100;
      }
    }
    
    for (int i = 0; i < m; i++) {
      if (oImmune <= oTime[i]) {
        oCnt++;
        oImmune = oTime[i] + 360;
      }
    }
    
    System.out.printf("%d %d", eCnt, oCnt);
  }
}