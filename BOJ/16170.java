import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DATE));
	}
}