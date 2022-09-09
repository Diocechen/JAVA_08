package Java08;

class CSphere{
	private int x;
	private int y;
	private int z;
	private int radious;
	void setLocation(int x, int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void setRadious(int r) {
		this.radious = r;
	}
	void surfaceArea() {
		System.out.println(4 * Math.PI * Math.pow(radious, 2));
	}
	void volume() {
		System.out.println((4/3) * Math.PI * Math.pow(radious, 3));
	}
	void showCenter() {
		System.out.println("X = "+ x +","+"Y = "+ y +","+"Z = "+ z);
	}
}
public class Class16 {

	public static void main(String[] args) {
		CSphere s = new CSphere();
		s.setLocation(3, 4, 5);
		s.setRadious(1);
		s.surfaceArea();
		s.volume();
		s.showCenter();
	}

}
