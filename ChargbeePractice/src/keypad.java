import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class keypad {
	private static Scanner s;

	public static void main(String[] args) {
		int temp1;
		s = new Scanner(System.in);
		Map<String, String> m = new HashMap<String, String>();
		m.put("2", "ABC");
		m.put("3", "DEF");
		m.put("4", "GHI");
		m.put("5", "JKL");
		m.put("6", "MNO");
		m.put("7", "PQRS");
		m.put("8", "TUV");
		m.put("9", "WXYZ");
		System.out.println("Keypad Word Project");
		System.out.println("Enter the Number");
		String s0 = s.nextLine();
		StringBuffer s1 = new StringBuffer(s0);
		String s2 = s1.reverse().toString();
		int a = Integer.parseInt(s2);
		if (s1.equals("1") || s1.equals("*") || s1.equals("#")) {
			System.out.println("No Equivalent Key Found");
		} else {
			System.out.println("The Key Equivalent for " + s0 + " is/are : ");
			while (a > 0) {
				temp1 = a % 10;
				System.out.print(m.get(Integer.toString(temp1)));
				a = a / 10;
			}
		}
}}