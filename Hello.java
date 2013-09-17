package exercise1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter your name and hit return");
		String name=in.nextLine();
		System.out.println("Hello "+ name);
	}

}
