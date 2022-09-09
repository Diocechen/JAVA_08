package Java08;

class DBox{
	int length;
	int width;
	int height;
	void volume(){
		System.out.println("volume =>" + length * width * height);
	}
	void surfaceArea(){
		System.out.println("Surface Area => " + (int)(length * width * 2 + height * width * 2 + length * height * 2));
	}
	void showData(){
		System.out.println("Length => " + length);
		System.out.println("Width => " + width);
		System.out.println("Heigth => " + height);
	}
	void showAll(){
		System.out.println("Length => " + length);
		System.out.println("Width => " + width);
		System.out.println("Heigth => " + height);
		System.out.println("volume =>" + length * width * height);
		System.out.println("Surface Area => " + (int)(length * width * 2 + height * width * 2 + length * height * 2));
	}
}
public class Class05 {

	public static void main(String[] args) {
		DBox box = new DBox();
		box.height = 1;
		box.width = 1;
		box.length = 1;
		
		box.volume();
		System.out.println();
		box.surfaceArea();
		System.out.println();
		box.showData();
		System.out.println();
		box.showAll();
	}

}
