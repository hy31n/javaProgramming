
public class ObjectA {

	public static void main(String[] args) {
		Student	s;
		s = new Student();
		
		s.id = "KSU-123";
		s.NumerOfFinishedSemesters = 2;
		s.gender = '��';
		s.gpa = 3.97;
		s.foreignerYN = true;
		
		System.out.println("�й� = " + s.id);
		System.out.println("�̼��б�� = " + s.NumerOfFinishedSemesters);
		System.out.println("���� = " + s.gender);
		System.out.println("���� = " + s.gpa);
		System.out.println("�ܱ��ο��� = " + s.foreignerYN);
	}

}
