//package frontmenu;

import java.util.Scanner;

public class entry {

	Scanner read = new Scanner(System.in);

	public String readWord() {
		String someText = read.next();
		return someText;
	}

	public String readLine() {
		String someText = read.nextLine();
		return someText;
	}

	public Integer readInt() {
		Integer someNumber = read.nextInt();
		return someNumber;
	}

	public void clearscreen() {
		System.out.print("\033[H\033[2J");
        System.out.flush();
	}

	public void closeScanner() {
		read.close();
	}
}