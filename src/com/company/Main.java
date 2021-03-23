package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		int yearOfBirthday = 1982;
		int monthOfBirthday = 12;
		int dayOfBirthday = 26;
		int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
		System.out.println("Сумма моего года, месяца и дня рождения:" + sum);
		boolean monthBiggerDay = false;
		while (!monthBiggerDay) {
			monthBiggerDay = true;
			if (monthOfBirthday > dayOfBirthday) {
				System.out.println("Месяц моего рождения больше даты моего рождения:" + true);
			} else System.out.println("Месяц моего рождения больше даты моего рождения:" + false);
		}

		char [] a = new char[5];
		a [0] = 'O';
		a [1] = 'л';
		a [2] = 'е';
		a [3] = 'с';
		a [4] = 'я';
		System.out.print("Массив с моим именем: "); System.out.println(a);

		double myAge = 38;
		double partYear = 3.00 / 12.00;
		double o = myAge + partYear; {
		System.out.println("Мне " + o + " лет");

		}
	}
}
