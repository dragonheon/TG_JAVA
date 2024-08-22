
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] n = new int[10];
		int cnt = n.length;
		for(int i = 0; i < 10; i++) {
			n[i] = scn.nextInt() % 42;
		}
		
		for(int i = 0 ; i < 10; i++) {
			for(int j = i + 1; j < 10; j++) {
				if(n[i] == n[j]) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		

		
	
	}	
}