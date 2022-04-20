import java.util.Scanner;

public class ArrayB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		int stat[] = {x+y, x-y, x*y, x/y};
		
		for(int i : stat) {
			System.out.println(i);
		}
		
		for(int v = 0; v < stat.length; v++) {
			System.out.println(stat[v]);
		}
		
	}

}
