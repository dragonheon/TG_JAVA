
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(n-i)+"*".repeat(2 * i - 1));
		}
	}
}
