
public class ObjectD {

	public static void main(String[] args) {
		Employee e;
		e = new Employee();
		e.joinDate = new Dateinfo();
		e.id = "EMP-123";
		e.joinDate.year = 2015;
		e.joinDate.month = 3;
		e.joinDate.day = 2;
		
		System.out.println("직원 아이디 : " + e.id);
		System.out.println("직원 입사일 : " + e.joinDate.year + "년 " + e.joinDate.month + "월 " + e.joinDate.day + "일");
				

	}

}
