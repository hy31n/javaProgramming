import javax.swing.JOptionPane;

public class StringC {

	public static void main(String[] args) {
		String	s = JOptionPane.showInputDialog("���ڿ� �Է�");
		String	v[] = s.split("\\s+");
		for(int i = 0; i < v.length; i++) {
			if(v[i].length() >= 3) System.out.println(v[i]);
		}
	}

}
