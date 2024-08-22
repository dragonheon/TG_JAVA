
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = 0;
		int[] n = new int[8];
		for(int i = 0; i < 8; i++) {
			n[i] = scn.nextInt();
		}
		
		int x = 0;
		for(int i = 1; i < 8; i++) {
			x = n[i] - n[i-1];
			if(x == 1) {
				t++;
			}
			else if(x == -1) {
				t--;
			}
		}
		if(t == 7) {
			System.out.println("ascending");
		}
		else if (t == -7) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	
	}	
}