import java.util.Scanner;

public class IfA0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n = in.nextDouble();
		
		if(n >= 0) n = n;
		else n = -n;
		
		System.out.println(n);

	}

}
