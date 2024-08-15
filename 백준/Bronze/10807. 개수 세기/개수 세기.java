import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int n = scn.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = scn.nextInt();
		}
		int v = scn.nextInt();
		
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(num[i] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}