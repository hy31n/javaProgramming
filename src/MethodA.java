
public class MethodA {

	public static void main(String[] args) {
		int x = 1, y = 2, z = 2;
		
		double value = func(x, y, z);
		System.out.println(value);
	}
	private static double func(int x, int y, int z) {
		return (x - y) / (double) z;
	}
}
