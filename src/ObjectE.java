
public class ObjectE {

	public static void main(String[] args) {
		Person	p;
		p = new Person();
		p.name = new Name();
		p.name.firstName = "James";
		p.name.lastName = "Brown";
		System.out.println("�̸� : " + p.name.firstName + " " +p.name.lastName);
		

	}

}
