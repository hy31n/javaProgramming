import java.util.Scanner;

public class IfF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x > y) {
			System.out.println(x);
		}
		else {
			x = y;
			System.out.println(x);
		}

	}

}
