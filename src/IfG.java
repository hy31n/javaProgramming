import java.util.Scanner;

public class IfG {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int ans;
		
		ans = Math.max(x, Math.max(y, z));
		
		System.out.println(ans);
		
	}

}
