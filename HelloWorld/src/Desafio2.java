
public class Desafio2 {

	public static void main(String[] args) {
		
		int nota = 9;
		
		switch (nota) {
		case 10:
		case 9:
			System.out.println("Ótimo");
			System.out.println("Excelente aluno");
			break;
		case 8:
			System.out.println("Bom");
			break;
		case 7:
			System.out.println("Regular");
			break;
		default:
			System.out.println("Ruim");
	}
		
		/*
		float nota = 6;
		int conceito;
		
		if (nota >= 9.0) {
			conceito = 1;
		} else if (nota < 9.0 && nota >= 8.0) {
			conceito = 2;
		} else if (nota < 8.0 && nota >= 7.0) {
			conceito = 3;
		} else {
			conceito = 0;
		} 
		
		switch (conceito) {
			case 1:
				System.out.println("Ótimo");
				break;
			case 2:
				System.out.println("Bom");
				break;
			case 3:
				System.out.println("Regular");
				break;
			default:
				System.out.println("Ruim");
		}
		*/
	}
}
