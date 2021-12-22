package ex_polymorphism;

public class Ex1 {

	public static void main(String[] args) {
	
		
		
		
		
		System.out.println("======Truck======");
		
		Truck truck = new Truck();
		
		truck.speedUp();
		truck.speedDown();
		
		truck.dump();
		
		System.out.println("Truck-> Car로 업캐스팅");
		Car car = truck;
		car.speedUp();
		
		
	}

}

class Car {
	
	public void speedUp() {
		System.out.println("Car의 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("Car의 속력 감소!");
	}
}

class Truck extends Car{
	
	public void speedUp() {
	
		System.out.println("Truck의 속력 증가!");
	}
	
	public void speedDown() {
		
	System.out.println("Truck의 속력 감소!");	
	}
	public void dump() {
		System.out.println("Truck의 짐 싣기!");
	}
}

class Taxi extends Car{

	@Override
	public void speedUp() {
		System.out.println("Taxi의 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Taxi의 속력 감소!");
	}
	
	
	public void lift() {
		System.out.println("Taxi의 승객 승차!");
	}
	
	public void drop() {
		
		System.out.println("Taxi의 승객 하차!");
	}
		
		
		
		
		
		
		
	}
