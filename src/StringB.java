import javax.swing.JOptionPane;

public class StringB {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("���ڿ� �Է�");
		String	prefix = s.substring(0, 3);
		String	postfix = s.substring(s.length() - 3);
		System.out.println(prefix);
		System.out.println(postfix);
		

	}

}
