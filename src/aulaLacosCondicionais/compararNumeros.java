package aulaLacosCondicionais;
import java.util.Scanner;

public class compararNumeros {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = scanner.nextInt();
		
		if (n1 < n2) {
			System.out.println("O primeiro número é menor que o segundo.");
		} 
		
		if (n1 > n3) {
			System.out.println("O primeiro número é maior que o terceiro.");
		} 
		
		if (n2 == n3) {
			System.out.println("O segundo número é igual ao terceiro.");
		}
		
		if (n1 == n3) {
			System.out.println("O primeiro número é igual ao terceiro.");
		}
		
		scanner.close();

	}

}
