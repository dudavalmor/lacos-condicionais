package aulaLacosCondicionais;
import java.util.Scanner;

public class melhoresStephenKing {

	public static void main(String[] args) {
		
		int opcao;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("# ## ### #### ##### ###### ESCOLHA A MELHOR OBRA DE STEPHEN KING  ###### ##### #### ### ## #");
		System.out.println("\n-- Digite 1 para escolher 'It A coisa'");
		System.out.println("-- Digite 2 para escolher 'Outsider'");
		System.out.println("-- Digite 3 para escolher a série 'A Torre Negra(série)'");
		System.out.println("-- Digite 4 para escolher Carrie");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Bom livro, mas não o melhor. Bom para quem está começando :)");
			break;
		case 2:
			System.out.println("Parabéns, vocÊ acertou e sabe muito bem escolher um livro <3 ");
			break;
		case 3:
			System.out.println("Você é corajoso de encarar esses todos..... mas tem bom gosto");
			break;
		case 4:
			System.out.println("Sem comentários...");
			break;
		default:
			System.out.println("Opcão inválida.");
		}
		
		scanner.close();

	}

}
