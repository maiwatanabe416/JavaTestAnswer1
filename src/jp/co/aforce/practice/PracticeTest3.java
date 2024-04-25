package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest3 {

	public static void main(String[] args) {
		//練習問題１
		String[] products = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		
		//練習問題２
		System.out.println(products[1]);
		
		//練習問題３
		ArrayList<String> employee = new ArrayList<>();
		employee.add("山田太郎");
		employee.add("鈴木花子");
		employee.add("佐藤二郎");
		employee.add("山田太郎");
		employee.add("高橋三郎");
		
		//練習問題４
		//Excelファイルに記載
		
		//練習問題５
		System.out.println(employee.get(2));
		
		//練習問題６
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		list1.addAll(list2);
		Collections.sort(list1);
		for(int item:list1) {
			System.out.println(item);
		}
		
		//改行
		System.out.println();
		
		//練習問題７
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		
		int num1 = 0;
		int num3 = 0;
		
		
		for(int i = 1; i <=list1.size() + list3.size() ; i++) {
			if(list1.size()-1 < num1) {
				System.out.println(list3.get(num3));
				num3++;
			}else if(list3.size()-1 < num3) {
				System.out.println(list1.get(num1));
				num1++;
			}else if(list1.get(num1)<list3.get(num3)) {
				System.out.println(list1.get(num1));
				num1++;
			}else {
				System.out.println(list3.get(num3));
				num3++;
			}
			

			
		}
		
		
		

	}

}
