package aulaLacosCondicionais;
import java.util.Scanner;

public class faixaEtaria {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a idade do usu�rio: ");
		idade = scanner.nextInt();
		
		if(idade >= 0 && idade <= 12) {
			System.out.println("O usu�rio se classifica no p�blico infantil.");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("O usu�rio se classifica no p�blico adolescente.");
		} else if (idade >= 18 && idade <= 64) {
			System.out.println("O usu�rio se classifica no p�blico adulto.");
		} else {
			System.out.println("O usu�rio se classifica no p�blico idoso.");
		}
		
		scanner.close();

	}

}
