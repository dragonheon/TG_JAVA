import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scans = new Scanner(System.in);
		int hour;
		int min;
		hour = scans.nextInt();
		min = scans.nextInt();
		
		alarmCal(hour, min);
	}

	private static void alarmCal(int hour, int min) {
		min -= 45;
		if(min < 0) {
			hour--;
			if(hour < 0)  {
				hour = 24 - hour*(-1);
			}
			min = 60 - (min)*(-1);
		}
		System.out.printf("%d %d", hour, min);
		
	}
}