package Java08;

class CTest{
	static void test(int input) {
		if(input == 0) {
			System.out.println("0");
		}else if(input % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}

public class Class07 {

	public static void main(String[] args) {
		CTest.test(3);
		CTest.test(8);
		CTest.test(0);
		
	}

}
