
public class ObjectG {

	public static void main(String[] args) {
		Applicant	a;
		a = new Applicant();
		a.testinfo = new Testinfo();
		a.testinfo.location = new LocationInfo();
		a.testinfo.date = new Dateinfo();
		
		a.seqNo = 89;
		a.testinfo.score = 87.5;
		a.testinfo.location.country = "�̱�";
		a.testinfo.location.city = "����";
		a.testinfo.date.year = 2020;
		a.testinfo.date.month = 3;
		a.testinfo.date.day = 25;
		
		System.out.println("������ ����: "+a.seqNo);
		System.out.println("�׽�Ʈ ����: "+a.testinfo.score);
		System.out.println("�׽�Ʈ ���: "+a.testinfo.location.country + " " + a.testinfo.location.city);
		System.out.println("�׽�Ʈ ��¥: "+ a.testinfo.date.year + "�� "+ a.testinfo.date.month + "�� " + a.testinfo.date.day+ "��");
	}

}
