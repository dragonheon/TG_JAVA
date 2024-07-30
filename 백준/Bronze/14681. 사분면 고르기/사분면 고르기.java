import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		int y = scn.nextInt();
		int result = 0;
		if(x * y > 0) {
			result = 3;
		}
		else {
			result = 4;
		}
		
		if(y > 0) {
			result -= 2;
		}
		System.out.println(result);
	}
}