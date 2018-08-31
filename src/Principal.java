import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ListaLigada Lista = new ListaLigada();

		int opc = 0;
		int num = 0;

		opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adiciona inicio" + "\n 2- Remove Inicio"
				+ "\n 3- Adiciona Final" + "\n 4- Remove Final" + "\n 5- Remove Final"
				+ "\n 6- Remove da posicao especifica" + "\n 7- Mostre o primeiro elemento"
				+ "\n 8- Mostre o ultimo elemento" + "\n 9- Mostra todos os elementos" + "\n 10- Sair"));
		switch (opc) {
		case 1:
			num = (Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para adicionar no inicio: ")));
			Lista.adicionaInicio(num);
			break;

		case 2:
			JOptionPane.showMessageDialog(null, Lista.removeInicio());
			break;

		case 3:
			num = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor para adicionar no final: ")));
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, Lista.removeFinal());
			break;
			
		case 9:
			JOptionPane.showMessageDialog(null, Lista.toString());

			break;

		default:
			System.out.println("Opcao Invalida!");

			break;
		}
		while (opc != 10)
			;
		Lista.adicionaInicio(30);
		Lista.adicionaInicio(120);
		Lista.adicionaInicio(90);
		System.out.println(Lista.toString());
	}
}