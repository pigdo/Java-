package tw.ray.myproject.flowcontrol;

public class TestIfEx1 {

	public static void main(String[] args) {
		int degree = 32;
		//int degree = 20; //因為degree小於30，if內容不會執行。
		if(degree >= 30){
			System.out.println("It's hot.");
		}
		System.out.println("Keep writing java.");
	}

}
