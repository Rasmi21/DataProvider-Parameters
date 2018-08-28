package JavaOne;

import java.util.Scanner;

public class ScannerOne {

	public static void main(String[] args) {
		MainMenu();
		Scanner scan = new Scanner(System.in);
		String One = scan.next();
		while (!One.equals("q")) {
			switch (One) {
			case "1":
				 SubMenu();
				 One = scan.next();
				break;
			case "2":
				 SubMenu();
				 One = scan.next();
				break;
			case "3":
				 SubMenu();
				 One = scan.next();
				break;
			case "4":
				 SubMenu();
				 One = scan.next();
				break;
			case "5":
				 SubMenu();
				 One = scan.next();
				break;
			case "q":
				System.out.println("exit");
				One = scan.next();
				break;
			case "b":
				 MainMenu();
				 One = scan.next();
				break;

			default:
			One = scan.next();
			System.out.println("pick the right one");
				break;
			}
		}

	}

	public static void MainMenu() {
		System.out.println("1. Option 1");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("4. Option 4");
		System.out.println("5. Option 5");
		System.out.println("q to leave");
	}

	public static void SubMenu() {
		System.out.println("1. Option 1");
		System.out.println("2. Option 2");
		System.out.println("b to go back");

	}

}
