package aulaLacosCondicionais;

import java.util.Scanner;

public class validaIdade {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("A pessoa � maior de idade.");
		} else {
			System.out.println("A pessoa � menor de idade.");
		}
		
		scanner.close();

	}

}
