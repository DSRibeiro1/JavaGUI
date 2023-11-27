import javax.swing.JFrame;

public class Janela extends JFrame {
	
	//Metodo construtor
	public Janela() {
		
		//Nao preciso instanciar, pois a Classe ira herdar de JFrame
		//JFrame jf = new JFrame();
		
		//Insercao do titulo
		setTitle("Titulo da Janela");
		
		//Largura X Altura
		setSize(500,400);
		
		//Tornar visivel a janela
		setVisible(true);
		
		//Impede a execucao do codigo com a janela fechada
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//A janela ira abrir no centro do Eclipse
		setLocationRelativeTo(null);
		
		//Cancela o redimensionamento da Janela
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new Janela();
		
	}
}
		
		
		
		
		
		
