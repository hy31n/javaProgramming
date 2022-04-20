
public class ObjectF {

	public static void main(String[] args) {
		Student	s;
		s = new Student();
		s.score = new Score();
		s.id = "S-001";
		s.score.langScore = 100.0;
		s.score.mathScore = 90.0;
		s.score.engScore = 80.0;
		
		System.out.println("학번: "+s.id);
		System.out.println("국어점수: "+s.score.langScore);
		System.out.println("영어점수: "+s.score.engScore);
		System.out.println("수학점수: "+s.score.mathScore);

	}

}
