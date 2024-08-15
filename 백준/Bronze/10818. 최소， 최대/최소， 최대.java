
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num;
		int input;
		
		num = scn.nextInt();
		input = scn.nextInt();
		int max = input;
		int min = input;
		for(int i = 0; i < num-1; i++) {
			input = scn.nextInt();
			if(input < min) {
				min = input;
			}
			else if(input > max) {
				max = input;
			}
		}
		System.out.print(min + " " + max);
		
	}	
}