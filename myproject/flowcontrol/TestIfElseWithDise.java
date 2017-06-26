package tw.ray.myproject.flowcontrol;

import java.util.Scanner;

public class TestIfElseWithDise {

	public static void main(String[] args) {
		while (true) {
			int diceNum = (int) (Math.random() * 6 + 1);// 骰子隨機1~6。

			System.out.print("你猜的數字:");
			Scanner sc = new Scanner(System.in);

			int youDiceNum = sc.nextInt();

			System.out.println("diceNum:" + diceNum);

			if (youDiceNum == diceNum) {
				System.out.println("You win !!");// 如果youDiceNum等於diceNum，顯示You
													// win !!
				break;
			} else {
				System.out.println("Try again.");// 如果youDiceNum不等於diceNum，顯示Try
													// again.
			}
			System.out.println("finished.");
		}
	}
}
