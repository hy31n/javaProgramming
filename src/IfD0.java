import java.util.Scanner;

public class IfD0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		if(score < 0 || score > 100) System.out.println("������");
		else System.out.println("����");
	}

}
