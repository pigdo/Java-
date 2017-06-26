package tw.ray.myproject.operation;

public class TestOperationEx3 {

	public static void main(String[] args) {
		int i = 1,j = 2,k;
		k = (i++)+(++j); //先取i值給K,i1再加1,j先加1,再取j值給k = 1 + 3
		//k = i++ + ++j; 
//		k = i+++++j;(錯誤)
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
