package aulaLacosCondicionais;
import java.util.Scanner;

public class melhoresStephenKing {

	public static void main(String[] args) {
		
		int opcao;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("# ## ### #### ##### ###### ESCOLHA A MELHOR OBRA DE STEPHEN KING  ###### ##### #### ### ## #");
		System.out.println("\n-- Digite 1 para escolher 'It A coisa'");
		System.out.println("-- Digite 2 para escolher 'Outsider'");
		System.out.println("-- Digite 3 para escolher a s�rie 'A Torre Negra(s�rie)'");
		System.out.println("-- Digite 4 para escolher Carrie");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Bom livro, mas n�o o melhor. Bom para quem est� come�ando :)");
			break;
		case 2:
			System.out.println("Parab�ns, voc� acertou e sabe muito bem escolher um livro <3 ");
			break;
		case 3:
			System.out.println("Voc� � corajoso de encarar esses todos..... mas tem bom gosto");
			break;
		case 4:
			System.out.println("Sem coment�rios...");
			break;
		default:
			System.out.println("Opc�o inv�lida.");
		}
		
		scanner.close();

	}

}
