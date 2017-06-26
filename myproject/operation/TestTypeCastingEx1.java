package tw.ray.myproject.operation;

public class TestTypeCastingEx1 {

	public static void main(String[] args) {
		byte b1 = 1, b2 = 127, b3;
//		b3 = b1 + b2; byte或short型態相加，java自動將形態轉為int型態。
		b3 = (byte)(b1 + b2);//將int型態的b3強制轉型為byte型態，導致127+1=-128。
		
		System.out.println("b1 = " + b1 + " b2 = " + b2 + " b3 = " + b3);
	}

}
