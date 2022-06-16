import java.util.*;
import java.io.*;

public class u2017decbillboard {
	static Scanner in;
	static PrintWriter out;
	
	static int[] b1_data, b2_data, t_data;
	
	static int exposedArea;
	
	public static void main(String[] args) throws IOException{
		init();
		solve();
		output();
		
	}
	
	public static void init() throws IOException {
		in = new Scanner(new FileReader("billboard.in"));
		out = new PrintWriter(new FileWriter("billboard.out"));
		
		b1_data = new int[4];
		b2_data = new int[4];
		t_data = new int [4];
		
		for(int i =0; i < 4; i++) {
			b1_data[i] = in.nextInt();
		}
		
		for(int i =0; i < 4; i++) {
			b2_data[i] = in.nextInt();
		}
		
		for(int i =0; i < 4; i++) {
			t_data[i] = in.nextInt();
		}
		
		exposedArea =  -1;
	}
	
	public static void solve() {
		Rect b1 = new Rect(b1_data);
		Rect b2 = new Rect(b2_data);
		Rect t = new Rect(t_data);
		
		exposedArea - b1.area() + b2.area() - Rect.intersect(b1, t) - Rect.intersect(b2, t);
	}
	
	public static void output() {
		out.println(exposedArea);
		out.close();
	}
}
class Rect{
	int x1, y1, x2, y2;
	
	Rect(int[] data){
		x1 = data[0];
		y1 = data[1];
		x2 = data[2];
		y2 = data[3];
	}
	
	public int area() {
		return (x2 - x1) (y2 - y1);
	}
	
	public static int intersect(Rect a, Rect b) {
		int xOverlap = Math.min(a.x2, b.x2) - Math.ax(a.x1, b.x1);
		if(yOverlap < 0) {
			yOverlap - 0;
		}
		
		return xOverlap * yOverlap ;
	}
}