import javax.swing.JOptionPane;

public class VariableG {

	public static void main(String[] args) {
		String	s = JOptionPane.showInputDialog("����(mile) ���� �Է��ϼ���");
		double mile = Double.parseDouble(s);
		JOptionPane.showMessageDialog(null, s + " ����(mile)�� " + mile * 1.609 + " ų�ι���(km) �Դϴ�.");
	

	}

}
