import javax.swing.JOptionPane;

public class StringE {

	public static void main(String[] args) {
		String 	s = JOptionPane.showInputDialog("문자 입력");
		String	v[] = s.split("\\s+");
		for(int i = v.length - 1; i >= 0; i--) {
			System.out.print(v[i]+ " ");
		}

	}

}
