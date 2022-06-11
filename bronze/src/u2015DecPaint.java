import java.util.*;
import java.io.*;

public class u2015DecPaint {
	
	static Scanner in;
	static PrintWriter out;
	
	static int a, b, c, d;
	
	static int totalPainted;
	
	public static void main(String[] args) throws IOException {
		init();
		solve();
		output();
	}
	
	public static void init() throws IOException{
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new FileWriter("paint.out"));
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		totalPainted = -1;
		
		in.close();
	}
	
	public static void solve() {
		int intersect = Math.min(b, d) - Math.max(a, c);
		if(intersect < 0) {
			intersect = 0;
		}
		
		totalPainted = (b-a) + (d-c) - intersect;
		
	}
	
	public static void output() {
		out.println(totalPainted);
		
		out.close();
	}
}
