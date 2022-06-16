import java.io.*;
import java.util.*;

public class u2016decsquare {
	
	static Scanner in;
	static PrintWriter out;
	
		public static void main(String[] args) throws IOException {
			
			BufferedReader stdin = new BufferedReader(new FileReader("square.in"));

			int[][] data = new int[4][2];
			for (int i=0; i<2; i++) {
				StringTokenizer area = new StringTokenizer(stdin.readLine());
				for (int j=0; j<4; j++)
					data[2*i+j/2][j%2] = Integer.parseInt(area.nextToken());
			}

			int max1 = data[0][0];
			int min1 = max1;
			int max2 = data[0][1];
			int min2 = max2;


			for (int i=1; i<4; i++) {
				min1 = Math.min(data[i][0], min1);
				max1 = Math.max(data[i][0], max1);
				min2 = Math.min(data[i][1], min2);
				max2 = Math.max(data[i][1], max2);
			}

			int totalArea = Math.max(max1 - min1, max2 - min2);
			totalArea *= totalArea;

			
			PrintWriter out = new PrintWriter(new FileWriter("square.out"));
			out.println(totalArea);
			out.close();
			stdin.close();
		}
}
		
