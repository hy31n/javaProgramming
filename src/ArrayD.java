
public class ArrayD {

	public static void main(String[] args) {
		String	s[] = {"100", "60", "90", "70", "80"};
		double sum = 0;
		
		for(int i = 0; i < s.length; i++) {
			sum += Double.parseDouble(s[i]);		
		}
		System.out.println(sum/ s.length);
	}

}
