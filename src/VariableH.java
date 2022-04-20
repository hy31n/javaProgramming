import javax.swing.JOptionPane;

public class VariableH {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("화씨 온도 값을 입력하세요");
		double	F = Double.parseDouble(s);
		double	C = (F - 32) * (5.0/9.0);
		JOptionPane.showMessageDialog(null, "화씨 " + F +"도는 섭씨 " + C + "도 입니다.");

	}

}
