package tw.ray.myproject.flowcontrol;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		byte level = 25;
		switch (level) {
		default:
			System.out.println("cure herb.");
			// break;
		case 25:
			System.out.println("Machine Gun.");
			// break;
		case 10:
			System.out.println("pistal");
			// break;
		case 5:
			System.out.println("stick");
			// break;
		case 1:
			System.out.println("hand");
			// break;
		}
		System.out.println("fight.");
	}

}
