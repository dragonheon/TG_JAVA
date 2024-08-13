import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		Long n = scn.nextLong();
		Long result = (long) 1;
		
		for(int i = 1; i < n+1; i++) {
			result = result*i;
		}
		System.out.println(result);
	}
	
}