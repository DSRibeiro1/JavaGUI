import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class TelaPrincipal extends JFrame implements ActionListener  {
		
	JLabel lGenero = new JLabel();
	JLabel imagem = new JLabel();
	
	JPasswordField passwordField = new JPasswordField();
	
	JPanel painel = new JPanel();
		
	ButtonGroup genero = new ButtonGroup();
	
	JRadioButton feminino = new JRadioButton();
	JRadioButton masculino = new JRadioButton();
	
	JComboBox<Object> opcao = new JComboBox<>();
	
	JButton bSalvar = new JButton();
	
	public void telaInicial() {
		
		//Frame (Tamanho, localizacao e encerrar operacao
		setSize(600, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		//Tamanho painel e sem layout
		painel.setSize(600, 300);
		painel.setLayout(null);

		//Título
		lGenero.setText("Genero: ");
		lGenero.setBounds(75, 80, 50, 20);
		
		//Espaço para senha, cor e borda leve
		passwordField.setBounds(200, 200, 100, 20);
		passwordField.setBorder(BorderFactory.createEtchedBorder());

		//JRadioButton genero 
		feminino.setText("Feminino");
		feminino.setBounds(120, 80, 80, 20);
		
		masculino.setText("Masculino");
		masculino.setBounds(200, 80, 150, 20);
		
		//-----------------------------------------------------//

		//JButtonGroup
		genero.add(masculino);
		genero.add(feminino);
				
		//-----------------------------------------------------//
		imagem.setBounds(400, 50, 160, 140);
		imagem.setIcon(new ImageIcon("img/OIP (1).jpg"));
		imagem.setBorder(BorderFactory.createEtchedBorder());

				
		// JComboBox
		opcao.setBounds(200, 150, 100, 20);
		opcao.addItem("Feminino");
		opcao.addItem("Masculino");

		//Botao
		bSalvar.setText("Salvar");
		bSalvar.setBounds(55, 150, 80, 55);
		bSalvar.addActionListener(this);
		
		//--------------------------------------------//

		add(painel);
		
		painel.add(lGenero);
		painel.add(masculino);
		painel.add(feminino);
		painel.add(passwordField);
		painel.add(imagem);
		painel.add(opcao);
		painel.add(bSalvar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(feminino.isSelected()) {
			System.out.println("Feminino");
		}else {
			System.out.println("Masculino");
		}
		System.out.println(opcao.getSelectedItem());
		System.out.println(passwordField.getPassword());
		
	}
}

		
		
	
	

	