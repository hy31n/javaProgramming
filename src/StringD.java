import javax.swing.JOptionPane;

public class StringD {

	public static void main(String[] args) {
		String	s = JOptionPane.showInputDialog("점수 입력");
		String	v[] = s.split("\\s+");
		double sum = 0;
		for(int i = 0; i < v.length; i++) {
			sum += Double.parseDouble(v[i]);
		}
		System.out.printf("평균 = %.2f", sum/v.length);
	}

}
