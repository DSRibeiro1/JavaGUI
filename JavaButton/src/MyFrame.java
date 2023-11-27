import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;

	MyFrame() {
		ImageIcon icon = new ImageIcon("dedoApont.png");
		ImageIcon icon2 = new ImageIcon("emoji.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		button = new JButton();
		
		//Define posição e tamanho
		button.setBounds(100, 100, 250, 150);
		/////////////////////////////////////
		button.addActionListener(this);
		button.setText("I'm button");
		button.setFocusable(false);
		
		//Adiciona desenho em botao
		button.setIcon(icon);
		
		//Desenho fica ao centro
		button.setHorizontalTextPosition(JButton.CENTER);
		
		//Desenho fica acima do que esta escrito no Botao
		button.setVerticalTextPosition(JButton.BOTTOM);
		
		//Escolha tipo de letra, tamanho
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		
		//Imagem e palavras se aproximam
		button.setIconTextGap(-7);
		
		//muda cor das palavras
		button.setForeground(Color.white);
		
		//muda cor do botao
		button.setBackground(Color.blue);
		
		//borda suave no botao
		button.setBorder(BorderFactory.createEtchedBorder());
		
		button.setEnabled(true);
		
		
		//this = frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);

	}

	@Override
	//Ao apertar o botao eh enviado msg para o console
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button)
		    //System.out.println("pooo");
		    //button.setEnabled(false); -->Não permite apertar botao
			label.setVisible(true);

	}
}
