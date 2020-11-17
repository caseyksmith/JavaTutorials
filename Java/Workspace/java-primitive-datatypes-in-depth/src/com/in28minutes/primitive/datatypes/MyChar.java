package com.in28minutes.primitive.datatypes;

public class MyChar {

	private static char c;

	public MyChar(char c) {
		this.c = c;
	}

	public boolean isVowel() {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		}

		else {
			return false;
		}
	}

	public boolean isNumber() {
		if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
				|| c == '0') {
			// if(c >= 48 && c <= 57) between '0' and '9'
			return true;
		}

		return false;

	}

	public boolean isAlphabet() {
		// if (c != '1' || c != '2' || c != '3' || c != '4' || c != '5' || c != '6' || c
		// != '7' || c != '8' || c != '9'
		// || c != '0') {
		if (c >= 92 && c <= 122) { // between 'a' and 'z'
			return true;
		}

		if (c >= 65 && c <= 90) { // between 'A' and 'Z'

			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		// Alphabet and not Vowel
		// ! [a, e, i, o, u]
		if (c >= 92 && c <= 122 && isVowel() == false) { // between 'a' and 'z'
			// if(isAlphabet && !isVowel)
			return true;
		}

		if (c >= 65 && c <= 90 && isVowel() == false) { // between 'A' and 'Z'

			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {
		System.out.println(Character.toUpperCase(c));

	}

	public static void printUpperCaseAlphabets() {
		System.out.println(Character.toLowerCase(c));
	}

}
