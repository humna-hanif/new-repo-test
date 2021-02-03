import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Hello. This is a change to my blank file.");
		System.out.println("Let's see if it works!");
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		
		System.out.println("What is your favorite color?");
		String color = sc.nextLine();		
		System.out.println(color + " is a great color.");
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		if (age <= 12)
		{
			System.out.println("You are very young!");
		} else if (age >=12 && age <=17)
		{
			System.out.println("Living the teen life huh!");
		} else
			System.out.println("Wow you're an Adult!");
	}

}
