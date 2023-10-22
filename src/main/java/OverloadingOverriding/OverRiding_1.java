package OverloadingOverriding;

public class OverRiding_1 extends Car{

	public static void main(String args[]) {
		System.out.println("Under Main Method");
		Auto a=new OverRiding_1();
		a.getGear();
		a.getSpeed();
		
		Car r=new OverRiding_1();
		r.getGear();
		r.getSpeed();
		
		Auto b=new Auto();
		b.getGear();
		b.getSpeed();
		
		Car c=new Car();
		c.getGear();
		c.getSpeed();
	}

}

//Super class
class Auto{
	public void getGear() {
		System.out.println("Auto getGear");
	}

	public void getSpeed() {
		System.out.println("Auto getSpeed");
	}
}

//SubClass
class Car extends Auto{
	public void getGear() {
		System.out.println("car getGear");
	}

	public void getSpeed() {
		System.out.println("car getSpeed");
	}
}
