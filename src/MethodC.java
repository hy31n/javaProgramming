
public class MethodC {

	public static void main(String[] args) {
		int v[] = {6, 2, -4, 9, -1, 4, -8};
		
		int sum = sumPositives(v);
		System.out.println(sum);

	}
	private static int sumPositives(int v[]) {
		int total = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > 0){
				total += v[i];
			}	
		}
		return total;
	}
}
