package ex_type_casting;

public class Ex1 {

	public static void main(String[] args) {
		
		SmartPhone 내폰 = new SmartPhone();
		
		
		내폰.call();
		내폰.sms();
		내폰.kakaoTalk();
		내폰.youtube();
		
		HandPhone 엄마폰 = 내폰;
		
		엄마폰.call();
		엄마폰.sms();
		
		HandPhone 엄마폰2 = new HandPhone();
		
		엄마폰2.call();
		엄마폰2.sms();
		
		
		SmartPhone 내폰2 = (SmartPhone)엄마폰2;
		
		
		HandPhone 엄마폰3 = new SmartPhone();
		
		SmartPhone 내폰3 = (SmartPhone)엄마폰3;
		
		
		
	}

}
class HandPhone{
	
	public void call() {
		System.out.println("핸드폰의 전화 기능");
	}
	
	public void sms() {
		System.out.println("핸드폰의 문자 기능");
	}
	
	
	
}

class SmartPhone extends HandPhone{
		public void kakaoTalk() {
			System.out.println("스마트폰의 카톡 기능");
		}
		
		public void youtube() {
			
			System.out.println("스마트폰의 유튜브 기능");
		}
	
}