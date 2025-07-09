package pt.upacademy.ex;

import java.time.Year;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá! Como te chamas?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "! Qual é a tua idade?");
		String ageStr = scanner.nextLine();
		int age = Integer.parseInt(ageStr);
		System.out.println("Muito bem, " + name + ", tu tens " + age + " anos!");
		scanner.close();
		int year = Year.now().getValue();
		int yearBorn = year - age;
		System.out.println("Nasceste em " + yearBorn);
		}

	}

