import java.util.Scanner;

public class IfD1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		System.out.println((score < 0 || score > 100) ? "비정상" : "정상");

	}

}
