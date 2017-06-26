package tw.ray.myproject.operation;

public class TestShiftOperatorEx1 {
	public static void main(String[] args){
		int data1 = 1234;//00000000000000000000010011010010   1234
		int data2 = -1234;//11111111111111111111101100101110  -1234
		
		System.out.println(data1 + ">>2 = " + (data1>>2));//00000000000000000000000100110100   1234>>2  1234/2/2
		System.out.println(data2 + ">>2 = " + (data2>>2));//11111111111111111111111011001011  -1234>>2  -1234/2/2
		System.out.println(data1 + ">>>2 = " + (data1>>>2));//00000000000000000000000100110100   1234>>>2
		System.out.println(data2 + ">>>2 = " + (data2>>>2));//00111111111111111111111011001011  -1234>>>2
		System.out.println(data1 + "<<2 = " + (data1<<2));//00000000000000000001001101001000   1234<<2  1234*2*2
		System.out.println(data2 + "<<2 = " + (data2<<2));//
		//Shift Operator(移位運算子)的用法
		//6/2 = 6>>1(6>>1處理速度較快)
		//6*2 = 6<<1(6>>1處理速度較快)
	}
}
