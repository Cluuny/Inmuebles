package view;

import java.util.Scanner;

public class View {
		private Scanner scanner;

		public View() {
				scanner = new Scanner(System.in);
		}

		public void print(String message) {
				System.out.println(message);
		}

		public String read(String message) {
				print(message);
				return scanner.nextLine();
		}
}
