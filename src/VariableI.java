import javax.swing.JOptionPane;

public class VariableI {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("��Ģ���� ����� ���� ù��° ������ �Է��ϼ���");
		String s2 = JOptionPane.showInputDialog("��Ģ���� ����� ���� �ι�° ������ �Է��ϼ���");
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		String message = n1 + "+" + n2 + "=" + (n1+n2) + "\n";
		message = message + n1 + "-" + n2 + "=" + (n1-n2) + "\n";
		message = message + n1 + "x" + n2 + "=" + (n1*n2) + "\n";
		message = message + n1 + "/" + n2 + "=" + (n1/n2);
		JOptionPane.showMessageDialog(null, message);
	}

}
