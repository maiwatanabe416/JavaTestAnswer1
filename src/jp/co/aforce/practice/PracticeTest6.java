package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		//練習問題１
		Random random = new Random();
		int fortune = random.nextInt(4);
		String result = "";
		switch (fortune) {
		case 1:
			result = "吉です";
			break;
		case 2:
			result = "中吉です";
			break;
		case 3:
			result = "大吉です";
			break;
		default:
			result = "凶です";
			break;
		}
		System.out.println(result);

		//練習問題２
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + ",");
			}
		}

		//次の問題で答えが改行されないので
		//念のためここに改行を入れています

		System.out.println();
		//練習問題３

		for (int y = 1; y <= 9; y++) {
			for (int x = 1; x <= 9; x++) {
				System.out.printf("%2d ", y * x);
			}
			System.out.println();
		}

		//改行
		System.out.println();

		//練習問題４
		int num = 10;
		for (int y = num; y <= num + 9; y++) {
			for (int x = num; x <= num + 9; x++) {
				System.out.printf("%2d ", y * x);
			}
			System.out.println();
		}
		
		//改行
		System.out.println();

		//練習問題５
		ArrayList<String> employees = new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");

		ArrayList<String> submitters = new ArrayList<>();
		submitters.add("斎藤");
		submitters.add("高橋");

		
		for (int a = 0; a < employees.size(); a++) {
			for (int b = 0; b < submitters.size(); b++) {
				if (employees.get(a) == submitters.get(b)) {
					break;
				}else if(submitters.size()-1 == b) {
					System.out.println(employees.get(a));
				}
			}
		}
		
		//練習問題５別解
		
        // employeesにはあるがsubmittersにはない人を探す
        ArrayList<String> notInSubmitters = new ArrayList<>();
        for (String employee : employees) {
            if (!submitters.contains(employee)) {
                notInSubmitters.add(employee);
            }
        }
        // 結果を出力
        for (String employee : notInSubmitters) {
            System.out.println(employee);
        }
		
		//練習問題６
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // 素数かどうかを格納する変数を初期化

            // 2からその数の平方根までの数で割り算を行い、割り切れるかどうかを調べる
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // 割り切れる場合は素数ではない
                    break;
                }
            }
            // 素数である場合はその数を出力
            if (isPrime) {
                System.out.println(i);
            }
        }
        
        
	}
}
