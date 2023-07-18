package org.sample;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println(checkPalindromeString("nitin"));
	}

	static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}

}
