
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] arr = new int[9];
		int num;
		int max;
		
		arr[0] = scn.nextInt();
		max = arr[0];
		num = 1;
		for(int i = 1; i < 9; i++) {
			arr[i] = scn.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				num = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(num);
		
	}	
}