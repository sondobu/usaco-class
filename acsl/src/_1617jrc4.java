import java.util.*;

/*
 1, 2
 1, 5
 2, 1
 2, 4
 3, 5
 4, 2
 4, 3
 5, 1
 2, 2
 1, 3
 
 */

public class _1617jrc4 {
	
	static Scanner in;
	
	static int left, right;
	
	static int possibleArrangements;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			init();
			solve();
			output();
		}
	}
	
	public static void init() {
		
		
		StringTokenizer st = new StringTokenizer(in.nextLine(), ", ");
		left = Integer.parseInt(st.nextToken());
		right = Integer.parseInt(st.nextToken());
		
		possibleArrangements = -1;
	}
	
	public static void solve() {
		System.out.println("SOLVING...................................................................");
		possibleArrangements = 0;
		for(int i = 1; i <= 5; i++)
		for(int j = 1; j <= 5; j++)
		for(int k = 1; k <= 5; k++)
		for(int l = 1; l <= 5; l++)
		for(int m = 1; m <= 5; m++)
			if(isAllUnique(i, j, k, l, m)) {
				int towers[] = {i, j, k, l, m};
				
				int l_count = 1;
				int bar = towers[0];
				for(int a = 1; a < 5; a++) {
					if(towers [a] > bar) {
						bar = towers[a];
						l_count ++;
					}
				}
				
				int r_count = 1;
				bar = towers [towers.length - 1];
				for(int a = 3 ; a >= 0; a--) {
					if(towers[a] > bar) {
						bar = towers[a];
						r_count++;
					}
				}
				
				if(l_count == left && r_count == right) {
					System.out.println(Arrays.toString(towers));
					possibleArrangements++; 
				}
			}
	}
	
	public static boolean isAllUnique(int a, int b, int c, int d, int e) {
		return a != b && a != c && a != d && a != e &&
				b != c && b != d && b != e &&
				c != d && c != e && 
				d != e;
	}
	
	public static void output() {
		
		System.out.println(possibleArrangements);
	}
}
