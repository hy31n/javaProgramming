
public class ObjectF {

	public static void main(String[] args) {
		Student	s;
		s = new Student();
		s.score = new Score();
		s.id = "S-001";
		s.score.langScore = 100.0;
		s.score.mathScore = 90.0;
		s.score.engScore = 80.0;
		
		System.out.println("�й�: "+s.id);
		System.out.println("��������: "+s.score.langScore);
		System.out.println("��������: "+s.score.engScore);
		System.out.println("��������: "+s.score.mathScore);

	}

}
