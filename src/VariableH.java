import javax.swing.JOptionPane;

public class VariableH {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("ȭ�� �µ� ���� �Է��ϼ���");
		double	F = Double.parseDouble(s);
		double	C = (F - 32) * (5.0/9.0);
		JOptionPane.showMessageDialog(null, "ȭ�� " + F +"���� ���� " + C + "�� �Դϴ�.");

	}

}
