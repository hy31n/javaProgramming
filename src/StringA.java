import javax.swing.JOptionPane;

public class StringA {

	public static void main(String[] args) {
		String s =JOptionPane.showInputDialog("문자열 입력");
		
		char	fistChar = s.charAt(0);
		char	lastChar = s.charAt(s.length()-1);
		
		System.out.println(fistChar);
		System.out.println(lastChar);
	}

}
