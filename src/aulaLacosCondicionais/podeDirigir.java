package aulaLacosCondicionais;
import java.util.Scanner;

public class podeDirigir {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você tem idade para tirar CNH.");
		} else {
			System.out.println("Você não tem idade para tirar CNH.");
		}
		
		scanner.close();

	}

}
