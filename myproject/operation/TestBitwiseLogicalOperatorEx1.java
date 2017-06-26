package tw.ray.myproject.operation;

public class TestBitwiseLogicalOperatorEx1 {

	public static void main(String[] args) {
		int x=2,y=3;
		System.out.println("~x = " + (~x) );//x取補數
		System.out.println("x & y = " + (x&y) );//都為1才是1
		System.out.println("x | y = " + (x|y) );//其中一個為1，就是1
		System.out.println("x ^ y = " + (x^y) );//互不同才為1

	}

}
