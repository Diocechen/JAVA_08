package Java08;

class CCircle{
	double pi = 3.14;
	double radious;
	
	void show_periphery() {
		System.out.println("periphery => " + radious * pi * 2);
	}
	void changeRadious(double Radious) {
		this.radious = Radious;
	}
}
public class Class06 {

	public static void main(String[] args) {
		CCircle cir1 = new CCircle();
		cir1.radious = 3.0;
		cir1.show_periphery();
		cir1.changeRadious(6.0);
		cir1.show_periphery();
	}

}
