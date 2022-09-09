package Java08;

class CBox{
	int length;
	int width;
	int heigth;
}

public class Class04 {

	public static void main(String[] args) {
		CBox box;
		box = new CBox();
		box.heigth = 25;
		box.width = 10;
		box.length = 15;
		
		System.out.println("length = "+box.length);
		System.out.println("width = "+box.width);
		System.out.println("heigth = "+box.heigth);
		
	}

}
