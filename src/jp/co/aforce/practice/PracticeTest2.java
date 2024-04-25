package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String args[]) {

		//練習問題1
		final double TAX = 0.1;
		System.out.println(TAX);

		//練習問題2
		int x = 480;
		double price = x + (x * TAX);
		System.out.println(price);

		//練習問題3
		String name = "渡辺麻衣";
		System.out.println(name);

		//練習問題4
		//String型の変数名に指定はありません。
		String msg1 = "この商品の値段は";
		String msg2 = "円です";
		System.out.println(msg1 + price + msg2);

	}
}
