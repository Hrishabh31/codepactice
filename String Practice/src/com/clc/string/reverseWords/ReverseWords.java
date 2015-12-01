package com.clc.string.reverseWords;

public class ReverseWords {

	public static void main(String[] args) {

		String reverse = "", check = "", s = "Hello world this";
		char[] cs = s.toCharArray();

		for (int i = 0; i < cs.length; i++) {

			if ((i + 1) == cs.length) {
				check = check + cs[i];
				char[] array = check.toCharArray();

				for (int j = array.length; j > 0; j--) {
					reverse = reverse + array[j - 1];
				}
				break;

			} else if (cs[i + 1] == ' ' && check != "") {

				check = check + cs[i];
				char[] array = check.toCharArray();
				for (int j = array.length; j > 0; j--) {
					reverse = reverse + array[j - 1];
				}
				reverse=reverse+" ";
				check = "";
				continue;
			} else if (cs[i] == ' ' && check == "") {
				reverse = reverse + cs[i];
				continue;
			}

			check = check + cs[i];
		}

		System.out.println(s);
		System.out.println(reverse);
	}
}
