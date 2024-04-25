package jp.co.aforce.practice;

import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String args[]) {

		//練習問題2
		String[] animal = { "犬", "猫", "うさぎ", "へび" };

		//練習問題3
		String animalName = "うさぎ";
		String msg = "はリストに含まれていません";
		for (int i = 0; i < animal.length; i++) {
			if (animal[i].equals(animalName)) {
				msg = "はリストに含まれています";
			}
		}

		System.out.println(animalName + msg);

		
		//練習問題４
		//現在の月をCalendarクラスから取得します。
		//getInstanceでインスタンス化をします
		Calendar calendar = Calendar.getInstance();
		//getメソッドを使用し、フィールドにMONTHを指定します。
		//これで現在の月-1が得られます。
		//月は0から始まるので、+1をすると現在の月になります。
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month);

		//メッセージを取得する変数を定義します。
		String message;

		//switchを使用します。
		switch (month) {
		case 1:
			//変数messageにメッセージを代入します。
			//case内で直接コンソールに出力しても構いません。
			message = "冬物セール";
			//breakを忘れずに記入します。
			break;

		case 2:
		case 3:
		case 4:
			message = "春物を売る";
			break;

		case 5:
			message = "春物セール";
			break;

		case 6:
		case 7:
			message = "夏物を売る";
			break;

		case 8:
			message = "夏物セール";
			break;

		case 9:
			message = "秋物を売る";
			break;

		case 10:
		case 11:
		case 12:
			message = "冬物を売る";
			break;

		default:
			message = "不正な月です";
			break;
		}

		//コンソールに出力
		System.out.println(message);
	}
}
