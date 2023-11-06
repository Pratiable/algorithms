import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (Objects.equals(str, "fdsajkl;") || Objects.equals(str, "jkl;fdsa")) {
            System.out.println("in-out");
        } else if (Objects.equals(str, "asdf;lkj") || Objects.equals(str, ";lkjasdf")) {
            System.out.println("out-in");
        } else if (Objects.equals(str, "asdfjkl;")) {
            System.out.println("stairs");
        } else if (Objects.equals(str, ";lkjfdsa")) {
            System.out.println("reverse");
        } else {
            System.out.println("molu");
        }
    }
}
