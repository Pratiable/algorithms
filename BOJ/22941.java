import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long heroHp = Long.parseLong(st.nextToken());
        long heroAtk = Long.parseLong(st.nextToken());
        long demonHp = Long.parseLong(st.nextToken());
        long demonAtk = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long p = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());

        long heroAttackCount;
        long demonAttackCount = (long) Math.ceil((double) heroHp / demonAtk);
        long heroAtkMod = demonHp % heroAtk;

        if ((heroAtkMod == 0 && heroAtk <= p) || (heroAtkMod != 0 && heroAtkMod <= p)) {
            heroAttackCount = (long) Math.ceil((double) (demonHp + s) / heroAtk);
        } else {
            heroAttackCount = (long) Math.ceil((double) demonHp / heroAtk);
        }

        System.out.println(heroAttackCount <= demonAttackCount ? "Victory!" : "gg");
    }
}
