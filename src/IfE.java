import java.util.Scanner;

public class IfE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int temp;
		
		if(x > y) {
			x = x;
			y = y;
		}
		else {
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.println(x + "\n" + y);
		
	}

}
