package pt.upacademy.fizzbuzz;

// import java.util.Scanner;
import pt.upacademy.fizzbuzz.scannerUtils.*;

public class FizzBuzz {

	public static void main(String[] args) {
		ScannerUtils sc = new ScannerUtils();
		int min = 1;
		int max = 100;
		System.out.println(sc.getValidInt("Digite um número para resolver o FizzBuzz.", min, max));
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		// sc.close();

	}

}
