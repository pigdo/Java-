package tw.ray.myproject.operation;

public class TestOperationEx2 {

	public static void main(String[] args) {
		int i1=1,i2=1,j1,j2;
		j1= i1++; //先取i1值給j1,i1再加1
		j2= ++i2; //i2先加1,再取i2值給j2
		System.out.println("i1 = " + i1 + " i2 = " + i2 +" j1 = " + j1 + " j2 = " + j2);

	}

}
