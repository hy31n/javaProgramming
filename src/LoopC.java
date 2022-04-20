import java.util.Scanner;

public class LoopC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;
		int i = 0;
		
		while(true) {
			sum += i;
			i++;
			
			if(i > n) break;
		}
		
		System.out.println(sum);
		
	}

}
