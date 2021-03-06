package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			rent[room] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}

}
