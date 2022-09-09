package Java08;

class CWin{
	private int width;
	private int height;
	private String name;
	
	void setW(int w) {
		this.width = w;
	}
	void setH(int h) {
		this.height = h;
	}
	void setName(String n) {
		this.name = n;
	}
	public void show() {
		System.out.println("Name => "+ name);
		System.out.println("W => " + width +", H => " + height);
	}
	void setWindows(int w,int h) {
		this.width = w;
		this.height = h;
	}
	void setWindows(int w,int h,String n) {
		this.width = w;
		this.height = h;
		this.name = n;
	}
}
public class Class12 {

	public static void main(String[] args) {
		CWin cw = new CWin();
		cw.setName("My Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}

}
