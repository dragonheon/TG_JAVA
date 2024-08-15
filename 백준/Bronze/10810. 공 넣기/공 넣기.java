
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n;
		int m;
		int i, j, k;
		
		n = scn.nextInt();
		m = scn.nextInt();
		
		int[] basket = new int[n];
		
		for(int p = 0; p < m; p++) {
			i = scn.nextInt();
			j = scn.nextInt();
			k = scn.nextInt();
			for(int q = i - 1; q < j; q++) {
				basket[q] = k;
			}
			
		}
		for(int o = 0; o < n; o++) {
			System.out.print(basket[o] + " ");
		}
		
	}	
}