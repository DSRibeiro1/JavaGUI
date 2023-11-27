import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaVazia extends JFrame {
	
	private JButton btnPrimeiro = new JButton("Primeiro");
	private JButton btnSegundo = new JButton("Segundo");
	private JButton btnTerceiro = new JButton("Terceiro");
	private JButton btnQuarto = new JButton("Quarto");
	
	
		
	public JanelaVazia() {
		setSize(300,300);
		setTitle("Janela Vazia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(rootPane);
		
		// Zero são quantas linha quiserem e Dois é a quantia de colunas
		//==========Botao===========//
		setLayout(new GridLayout(0,4));
		
		getContentPane().add(btnPrimeiro);
		getContentPane().add(btnSegundo);
		getContentPane().add(btnTerceiro);
		getContentPane().add(btnQuarto);
	}
}
	
	
	

		
		
		
