import javax.swing.JOptionPane;

public class IfI {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("성적(0~100)을 입력하세요");
		
		double score = Double.parseDouble(str);
		String ans;
		
		if(score >= 90) ans = "A";
		else if(score >= 80) ans = "B";
		else if(score >= 70) ans = "C";
		else if(score >= 60) ans = "D";
		else ans = "F";
		
		String message = "성적" + score + "의 학점은" + ans + "입니다.";
		JOptionPane.showMessageDialog(null, message);

	}

}
