
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int  n = scn.nextInt();
		int[] score = new int[n];
		
		String qst;
		scn.nextLine();
		for(int i = 0; i < n; i++) {
			qst = scn.nextLine();
			score[i] = oxQuiz(qst);
		}
		
		scn.close();
		for(int i = 0; i < n; i++) {
			System.out.println(score[i]);
		}
	}
	static int oxQuiz(String qst) {
		int score = 0;
		int cnt = 0;
		for(int i = 0; i < qst.length(); i++) {
			if(qst.charAt(i) == 'O') {
				cnt++;
			}
			else cnt = 0;
			score += cnt;
		}
		
		return score;
		
	}
}