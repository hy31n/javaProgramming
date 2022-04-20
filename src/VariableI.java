import javax.swing.JOptionPane;

public class VariableI {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("사칙연산 계산을 위한 첫번째 정수를 입력하세요");
		String s2 = JOptionPane.showInputDialog("사칙연산 계산을 위한 두번째 정수를 입력하세요");
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		String message = n1 + "+" + n2 + "=" + (n1+n2) + "\n";
		message = message + n1 + "-" + n2 + "=" + (n1-n2) + "\n";
		message = message + n1 + "x" + n2 + "=" + (n1*n2) + "\n";
		message = message + n1 + "/" + n2 + "=" + (n1/n2);
		JOptionPane.showMessageDialog(null, message);
	}

}
