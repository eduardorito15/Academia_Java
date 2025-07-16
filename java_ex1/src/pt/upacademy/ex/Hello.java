package pt.upacademy.ex;

import java.util.Scanner;

public class Hello {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Hello helloWorld = new Hello();
		helloWorld.run();
		
	}

	private String getName() {
		String name = scanner.nextLine();
		return name;
	}

	private int getAge() {
		if (scanner.hasNextInt()) {
			int age = scanner.nextInt();
			return age;
		}
		scanner.nextLine();
		return -1;
	}

	private void run() {
		System.out.println("Hello World, what's your name?");
		String userName = getName();
		System.out.println("Hello " + userName + "!");
		System.out.println("And what's your age?");
		int userAge = getAge();
		while (userAge == -1) {
			System.out.println("That's not a valid age, try again!");
			userAge = getAge();
		}
		User user = new User();
		user.setName(userName);
		user.setAge(userAge);
		System.out.println("I've created a new user called " + user.getName() + ", who is " + user.getAge() + " years old.");
		scanner.close();
		System.out.println(user.toString());
	}
}