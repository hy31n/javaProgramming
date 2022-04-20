import java.util.Scanner;

public class IfC {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			double fee = 1000;
			double ans = 0;
			int	age = in.nextInt();
			
			if(age <= 6) ans = fee * 0.7;
			else if(age >= 7 && age <= 20) ans = fee* 0.8;
			else if(age >= 65) ans = fee * 0.5;
			else ans = fee;
			
			System.out.println(ans);
		}
			
	}

}
