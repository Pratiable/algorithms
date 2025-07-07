import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stats[] stats = new Stats[4];
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            stats[i] = new Stats(
                    BigDecimal.valueOf(Integer.parseInt(st.nextToken())),
                    BigDecimal.valueOf(Integer.parseInt(st.nextToken())).divide(BigDecimal.valueOf(100)),
                    BigDecimal.valueOf(Integer.parseInt(st.nextToken())).divide(BigDecimal.valueOf(100)),
                    BigDecimal.valueOf(Integer.parseInt(st.nextToken())).divide(BigDecimal.valueOf(100)),
                    BigDecimal.valueOf(Integer.parseInt(st.nextToken())).divide(BigDecimal.valueOf(100))
            );
        }

        Stats fChange = stats[0].disarm(stats[2]).equip(stats[3]);
        Stats sChange = stats[1].disarm(stats[3]).equip(stats[2]);

        System.out.println(stats[0].power().compareTo(fChange.power()) == 0 ? 0 : stats[0].power().compareTo(fChange.power()) > 0 ? "-" : "+");
        System.out.println(stats[1].power().compareTo(sChange.power()) == 0 ? 0 : stats[1].power().compareTo(sChange.power()) > 0 ? "-" : "+");

    }

    static class Stats {
        final BigDecimal atk, str, crit, critDmg, as;

        Stats(BigDecimal atk, BigDecimal str, BigDecimal crit, BigDecimal critDmg, BigDecimal as) {
            this.atk = atk;
            this.str = str;
            this.crit = crit;
            this.critDmg = critDmg;
            this.as = as;
        }

        Stats equip(Stats weapon) {
            return new Stats(atk.add(weapon.atk), str.add(weapon.str), crit.add(weapon.crit), critDmg.add(weapon.critDmg), as.add(weapon.as));
        }

        Stats disarm(Stats weapon) {
            return new Stats(atk.subtract(weapon.atk), str.subtract(weapon.str), crit.subtract(weapon.crit), critDmg.subtract(weapon.critDmg), as.subtract(weapon.as));
        }

        BigDecimal power() {
            return atk.multiply(BigDecimal.ONE.add(str)).multiply(BigDecimal.ONE.subtract(crit.min(BigDecimal.ONE)).add(crit.min(BigDecimal.ONE).multiply(critDmg))).multiply(BigDecimal.ONE.add(as));
        }
    }
}