package ex;

import java.util.Scanner;

public class Ex {

	private Scanner sc;
	
	public void run() {
		int menu;
		final int EXIT = 3;
		do {
			printmenu();
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
	}

	private void runMenu(int menu) {
		// TODO Auto-generated method stub
		
	}

	private void printmenu() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}