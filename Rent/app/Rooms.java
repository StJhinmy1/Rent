package app;

import java.util.Scanner;

import entitites.Rent;

public class Rooms {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Digite quantos quartos quer alugar: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) { 
			System.out.print("\n--- ALUGUEL #" + i + " ---");			 
			
			System.out.print("\nNome do inquilino: ");
			String name = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int roomnumber = sc.nextInt();
			
			vect[roomnumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println("#" + i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();
		

	}

}
