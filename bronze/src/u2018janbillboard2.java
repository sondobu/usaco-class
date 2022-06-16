import java.io.*;
import java.util.StringTokenizer;

public class u2018janbillboard2 {

	public static void main(String[] args) throws IOException {
		init();
		solve();
		output();
	}
	
	public static void init() {
		BufferedReader read = new BufferedReader(new FileReader("bb.in"));
		StringTokenizer badBoard = new StringTokenizer(read.readLine());
		int x1 = Integer.parseInt(badBoard.nextToken());
		int y1 = Integer.parseInt(badBoard.nextToken());
		int x2 = Integer.parseInt(badBoard.nextToken());
		int y2 = Integer.parseInt(badBoard.nextToken());
		StringTokenizer goodBoard = new StringTokenizer(read.readLine());
		int x3 = Integer.parseInt(goodBoard.nextToken());
		int y3 = Integer.parseInt(goodBoard.nextToken());
		int x4 = Integer.parseInt(goodBoard.nextToken());
		int y4 = Integer.parseInt(goodBoard.nextToken());
	}
	
	public static void solve() {
		
	}
	
	public static void output() {
		
	}
}
