package pt.upacademy.fizzbuzz.scannerUtils;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner sc = new Scanner(System.in);
	private Scanner lineSc;

	public String getValue() {
		return sc.nextLine();
	}

	public boolean isInt(String value) {
		lineSc = new Scanner(value);
		return lineSc.hasNextInt();
	}

	public int toInt(String value) {
		lineSc = new Scanner(value);
		return lineSc.nextInt();
	}

	public int getInt(String msg) {
		boolean valid = false;
		int result = 0;
		do {
			System.out.println(msg);
			String value = getValue();
			if (isInt(value)) {
				valid = true;
				result = toInt(value);
			}
		} while (!valid);
		return result;
	}

	public int getValidInt(String msg, int[] values) {
		int result;
		boolean valid = false;
		do {
			StringBuilder validStringBuilder = new StringBuilder(msg + "(");
			for (int i : values) {
				validStringBuilder.append(" ").append(i);
			}
			validStringBuilder.append(" )");
			String validString = validStringBuilder.toString();
			result = getInt(validString);
			for (int i : values) {
				if (result == i) {
					valid = true;
				}
			}
		} while (!valid);
		return result;
	}

	public int getValidInt(String msg, int min, int max) {
		int result;
		do {
			String myMsg = msg + " Valores validos entre " + min + " e " + max + ".";
			result = getInt(myMsg);
		} while (result < min || result > max);
		return result;
	}

}
