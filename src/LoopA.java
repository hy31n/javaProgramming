
public class LoopA {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum = sum + i;
			i = i + 2;
			
			if(i >= 99) break;
		}
		
		System.out.println(sum);
		
	}
}
