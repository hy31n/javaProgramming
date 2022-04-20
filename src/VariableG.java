import javax.swing.JOptionPane;

public class VariableG {

	public static void main(String[] args) {
		String	s = JOptionPane.showInputDialog("마일(mile) 값을 입력하세요");
		double mile = Double.parseDouble(s);
		JOptionPane.showMessageDialog(null, s + " 마일(mile)은 " + mile * 1.609 + " 킬로미터(km) 입니다.");
	

	}

}
