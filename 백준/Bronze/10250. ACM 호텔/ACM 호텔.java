
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int test = scn.nextInt();
		int test_guest[] = new int[test];
		for(int i = 0; i < test_guest.length; i++) {
			hotel.h = scn.nextInt();
			hotel.w = scn.nextInt();
			hotel.n = scn.nextInt();
			hotel hotel = new hotel();
			hotel.guest_room();
			test_guest[i] = hotel.guest[hotel.n - 1];
		}
		for(int j : test_guest) {
			System.out.println(j);
		}
		
	}
}

class hotel {
	public static int h = 0;
	public static int w = 0;
	public static int n = 0;
    int[][] hotel_room = new int[h][w];
    public int guest[] = new int[n];
	public void room_gen() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				hotel_room[i][j] = (i+1)*100 + (j+1);
			}
		}
	}
	
	public void guest_room() {
		
		int g_w = 0;
		int g_h = 0;
		room_gen();
		
		for(int i = 0; i < n; i++) {
			if(g_h > h - 1) {
				g_w++;
				g_h = 0;
				guest[i] = hotel_room[g_h][g_w];
				g_h++;
				
			}
			else {
				guest[i] = hotel_room[g_h][g_w];
				g_h++;
			}
		}
	}
}

