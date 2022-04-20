
public class ObjectA {

	public static void main(String[] args) {
		Student	s;
		s = new Student();
		
		s.id = "KSU-123";
		s.NumerOfFinishedSemesters = 2;
		s.gender = '여';
		s.gpa = 3.97;
		s.foreignerYN = true;
		
		System.out.println("학번 = " + s.id);
		System.out.println("이수학기수 = " + s.NumerOfFinishedSemesters);
		System.out.println("성별 = " + s.gender);
		System.out.println("평점 = " + s.gpa);
		System.out.println("외국인여부 = " + s.foreignerYN);
	}

}
