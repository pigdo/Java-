package tw.ray.myproject.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int value = -15;
		if (value >= 0) {
			System.out.println(value + " is positive.");
			
			if (value % 2 == 0) {
				System.out.println(value + " is even.");
			} else {
				System.out.println(value + " is odd.");
			}
		} else {
			System.out.println(value + " is negtive.");
			
			if (value % 2 == 0) {
				System.out.println(value + " is even.");
			} else {
				System.out.println(value + " is odd.");
			}
		}
	}

}
