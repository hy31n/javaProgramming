
public class ObjectD {

	public static void main(String[] args) {
		Employee e;
		e = new Employee();
		e.joinDate = new Dateinfo();
		e.id = "EMP-123";
		e.joinDate.year = 2015;
		e.joinDate.month = 3;
		e.joinDate.day = 2;
		
		System.out.println("���� ���̵� : " + e.id);
		System.out.println("���� �Ի��� : " + e.joinDate.year + "�� " + e.joinDate.month + "�� " + e.joinDate.day + "��");
				

	}

}
