import java.util.Scanner;

public class IfA1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n = in.nextDouble();
		
		n = (n >= 0)? n:-n;
		
		System.out.println(n);

	}

}
