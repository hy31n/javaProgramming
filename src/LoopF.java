import javax.swing.JOptionPane;

public class LoopF {

	public static void main(String[] args) {
		while(true) {
			String str = JOptionPane.showInputDialog("����(0~100)�� �Է��ϼ���");
			
			double score = Double.parseDouble(str);
			String ans;
			
			if(score >= 90) ans = "A";
			else if(score >= 80) ans = "B";
			else if(score >= 70) ans = "C";
			else if(score >= 60) ans ="D";
			else ans = "F";
			
			String message = "����" + score + "�� ������ " + ans + "�Դϴ�.";
			
			if(str == null) break;
			
			JOptionPane.showMessageDialog(null, message);
		}

	}

}
