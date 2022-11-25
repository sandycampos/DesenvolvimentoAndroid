
public class Switch {

	public static void main(String[] args) {
		
		switch (2) {
			case 1:
				System.out.println("Cartão de crédito selecionado");
				break;
			case 2:
			case 3:
				System.out.println("Saldo da sua conta");
				break;
			default:
				System.out.println("Falar com o atendente");
		}
	}
}
