

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int len_in = scn.nextInt();
		int num = scn.nextInt();
		int input;
		ArrayList<Integer> arr_out = new ArrayList<>();
		
		for(int i = 0; i < len_in; i++) {
			input = scn.nextInt();
			if(input < num) {
				arr_out.add(input);
			}
		}
		for(int i : arr_out) {
			System.out.print(i + " ");
		}
		
	}	
}