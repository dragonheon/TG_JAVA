
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n;
		int m;
		int a, b;
		int tmp;
		n = scn.nextInt();
		m = scn.nextInt();
		
		int[] basket = new int[n];
		
		for(int i = 0; i < n; i++) {
			basket[i] = i + 1;
		}
		for(int i = 0; i < m; i++) {
			a = scn.nextInt();
			b = scn.nextInt();
			tmp = basket[a - 1];
			basket[a - 1] = basket[b - 1];
			basket[b - 1] = tmp;
		}	
		for(int o = 0; o < n; o++) {
			System.out.print(basket[o] + " ");
		}
		
	}	
}