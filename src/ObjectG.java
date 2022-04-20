
public class ObjectG {

	public static void main(String[] args) {
		Applicant	a;
		a = new Applicant();
		a.testinfo = new Testinfo();
		a.testinfo.location = new LocationInfo();
		a.testinfo.date = new Dateinfo();
		
		a.seqNo = 89;
		a.testinfo.score = 87.5;
		a.testinfo.location.country = "미국";
		a.testinfo.location.city = "뉴욕";
		a.testinfo.date.year = 2020;
		a.testinfo.date.month = 3;
		a.testinfo.date.day = 25;
		
		System.out.println("지원자 순번: "+a.seqNo);
		System.out.println("테스트 점수: "+a.testinfo.score);
		System.out.println("테스트 장소: "+a.testinfo.location.country + " " + a.testinfo.location.city);
		System.out.println("테스트 날짜: "+ a.testinfo.date.year + "년 "+ a.testinfo.date.month + "월 " + a.testinfo.date.day+ "일");
	}

}
