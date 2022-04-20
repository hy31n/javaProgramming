
public class MethodE {

	public static void main(String[] args) {
		int	x[] = {1, 2, 3, 4, 5};
		int	y[] = {4, 5, 6, 7, 8};
		
		int	z[] = sum(x, y);
		for(int i = 0; i < z.length; i++) {
			System.out.println(z[i] + " ");
		}

	}

	private static int[] sum(int[] x, int[] y) {
		int [] v = new int[x.length];
		if (x.length == y.length) {
			for(int i = 0; i < x.length; i++) {
				v[i] = x[i] + y[i];
				System.out.println(v[i]);
			}	
		}
		
		return v;
		
	}

}
