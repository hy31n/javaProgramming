
public class MethodD {

	public static void main(String[] args) {
		double	x = 3.0, y = 5.0;
		
		double	v[] = basicMath(x, y);
		System.out.println("�� = " + v[0]);
		System.out.println("�� = " + v[1]);
		System.out.println("�� = " + v[2]);
		System.out.println("��(������ ����) = " + v[3]);

	}

	private static double[] basicMath(double x, double y) {
		double	v[] = {x + y, x- y, x * y, x / y};
		return v;
	}
}
