package tw.ray.myproject.hw;

public class hw1 {

	public static void main(String[] args) {
		float temp = 37f;
		int index = 2;

		if (index == 1) {
			System.out.println("攝氏溫度 :" + temp + "度" + " 華氏溫度 :" + (temp * 9 / 5 + 32) + "度");
		}
		if (index == 2) {
			System.out.println("攝氏溫度 :" + ((temp - 32) * 5 / 9) + "度" + " 華氏溫度 :" + temp + "度");
		}
	}

}
