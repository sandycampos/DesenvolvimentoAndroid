
public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		int idade = 18;
		int opcao = 10;
		
		if (opcao == 1) {
			System.out.println("Cartão de crédito selecionado");
		} else if (opcao == 2) {
			System.out.println("Saldo da sua conta");
		} else if (opcao == 3) {
			System.out.println("Descontos indevidos");
		} else {
			System.out.println("Fale com um atendente");
		}
	}
}
