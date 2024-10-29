package aulaLacosCondicionais;
import java.util.Scanner;

public class faixaEtaria {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a idade do usuário: ");
		idade = scanner.nextInt();
		
		if(idade >= 0 && idade <= 12) {
			System.out.println("O usuário se classifica no público infantil.");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("O usuário se classifica no público adolescente.");
		} else if (idade >= 18 && idade <= 64) {
			System.out.println("O usuário se classifica no público adulto.");
		} else {
			System.out.println("O usuário se classifica no público idoso.");
		}
		
		scanner.close();

	}

}
