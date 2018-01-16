package edu.fju.exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int left = 0;

		for (;;) {
			System.out.println("販賣機餘額：" + left + "元");
			System.out.println("請投幣或選擇飲料,或輸入0結束：");
			Scanner scanner = new Scanner(System.in);
			String coin = scanner.nextLine();
			if (coin.equals("1") || coin.equals("5") || coin.equals("10")) {
				left += Integer.parseInt(coin);

			} else {
				switch (coin) {
				case "a":
					if (left < 10) {
						System.out.println("BEEP!");
						System.out.println("販賣機餘額：" + left + "元");
					} else {
						left = left - 10;
						System.out.println("DONE!");
					}
					break;
				case "b":
					if (left < 15) {
						System.out.println("BEEP!");
						System.out.println("販賣機餘額：" + left + "元");
					} else {
						left = left - 15;
						System.out.println("DONE!");
					}
					break;
				case "c":
					if (left < 10) {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額：" + left + "元");
				} else {
					left = left - 10;
					System.out.println("DONE!");
				}
				break;
				case "d":
					if (left < 18) {
						System.out.println("BEEP!");
						System.out.println("販賣機餘額：" + left + "元");
					} else {
						left = left - 18;
						System.out.println("DONE!");
					}
					break;
				case "e":
					if (left < 10) {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額：" + left + "元");
				} else {
					left = left - 10;
					System.out.println("DONE!");
				}
				break;
				case "f":
					if (left < 20) {
						System.out.println("BEEP!");
						System.out.println("販賣機餘額：" + left + "元");
					} else {
						left = left - 20;
						System.out.println("DONE!");
					}
					break;
				case "g":
					if (left < 15) {
						System.out.println("BEEP!");
						System.out.println("販賣機餘額：" + left + "元");
					} else {
						left = left - 15;
						System.out.println("DONE!");
					}
					break;
				case "h":
					if (left < 18) {
						System.out.println("BEEP!");
						System.out.println("販賣機餘額：" + left + "元");
					} else {
						left = left - 18;
						System.out.println("DONE!");
					}
					break;

				}
			}

		}

	}
}
