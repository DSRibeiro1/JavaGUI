import javax.swing.JFrame;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		ContatoFrame contatoFrame = new ContatoFrame();

		// Ao fechar a janela encerro o codigo
		contatoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Tamanho da janela
		contatoFrame.setSize(530, 260);

		// Mantem a janela visivel
		contatoFrame.setVisible(true);
		
		// Abre a janela ao centro da tela
		contatoFrame.setLocationRelativeTo(null);
	}
}
