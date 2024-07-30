import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int test = scn.nextInt();
		int result[] = new int[100];

		for(int i = 0; i < test; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			result[i] = A + B;
		}
		for(int i = 0; i < test; i++) {
			System.out.println(result[i]);
		}
	}
}