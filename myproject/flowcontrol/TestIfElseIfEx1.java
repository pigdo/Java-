package tw.ray.myproject.flowcontrol;

public class TestIfElseIfEx1 {

	public static void main(String[] args) {
		int month = 2;
		int year = 2000;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + " month has 31 days.");// 只要符合其中一月份，就印31天。
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + " month has 30 days.");// 只要符合其中一月份，就印30天。
		} else if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {// 閏年公式
				System.out.println(month + " month has 29 days.");// 如果是閏年，2月就29天
			} else {
				System.out.println(month + " month has 28 days.");// 如果不是閏年，2月就28天
			}
		} else {
			System.out.println("no month.");

		}
		System.out.println("finished");

	}

}
