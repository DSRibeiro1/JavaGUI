import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContatoFrame extends JFrame {
	private JTextField nomeField;
	private JTextField telefoneField;

	public ContatoFrame() {
		super("Agenda Telefonica");

		criarMenu();
		criarFormulario();
	}

	private void criarFormulario() {
		setLayout(new BorderLayout());

		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());

		JLabel titulo = new JLabel("Cadastro de Contato");
		titulo.setFont(new Font("Arial", Font.BOLD, 16));

		panelTitulo.add(titulo);

		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(new FlowLayout());

		JLabel nomeLabel = new JLabel("Nome");
		nomeField = new JTextField(40);
		nomeField.setFont(new Font("Arial", 0, 12));
		nomeField.setBorder(BorderFactory.createEtchedBorder());

		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneField = new JTextField(40);
		telefoneField.setFont(new Font("Arial", 0, 12));
		telefoneField.setBorder(BorderFactory.createEtchedBorder());

		panelCadastro.add(nomeLabel);
		panelCadastro.add(nomeField);
		panelCadastro.add(telefoneLabel);
		panelCadastro.add(telefoneField);

		JPanel panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());

		SalvarAction salvarAction = new SalvarAction();
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(salvarAction);
		botaoSalvar.setFont(new Font("Arial", 1, 14));
		botaoSalvar.setBackground(Color.lightGray);

		FecharAction fecharAction = new FecharAction();
		JButton botaoFechar = new JButton("Fechar");
		botaoFechar.addActionListener(fecharAction);
		botaoFechar.setFont(new Font("Arial", 1, 14));
		botaoFechar.setBackground(Color.lightGray);

		panelBotoes.add(botaoSalvar);
		panelBotoes.add(botaoFechar);

		add(panelTitulo, BorderLayout.NORTH);
		add(panelCadastro, BorderLayout.CENTER);
		add(panelBotoes, BorderLayout.SOUTH);
	}

	private void criarMenu() {

		JMenu menuContato = new JMenu("Contato");
		menuContato.setFont(new Font("Arial", 1, 14));
		//////////////////////////////////////////////
		NovoAction novoAction = new NovoAction();
		FecharAction fecharAction = new FecharAction();
		SalvarAction salvarAction = new SalvarAction();
		SobreAction sobreAction = new SobreAction();

		// Itens dentro do menu contato
		JMenuItem menuItemNovo = new JMenuItem("Novo");
		menuItemNovo.setFont(new Font("Arial", 0, 12));
		menuItemNovo.addActionListener(novoAction);
		menuContato.add(menuItemNovo);

		JMenu menuItemSalvar = new JMenu("Salvar");
		menuItemSalvar.setFont(new Font("Arial", 0, 12));
		menuItemSalvar.addActionListener(salvarAction);
		menuContato.add(menuItemSalvar);

		JMenu menuItemFechar = new JMenu("Fechar");
		menuItemFechar.setFont(new Font("Arial", 0, 12));
		menuItemFechar.addActionListener(fecharAction);
		menuContato.add(menuItemFechar);

		/////////////////////////////////////////////
		JMenu menuAjuda = new JMenu("Ajuda");
		menuAjuda.setFont(new Font("Arial", 1, 14));

		// Itens dentro do menu ajuda

		JMenuItem menuItemSobre = new JMenuItem("Sobre...");
		menuItemSobre.addActionListener(sobreAction);
		menuItemSobre.setFont(new Font("Arial", 0, 12));
		menuAjuda.add(menuItemSobre);

		// Barra de menu
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.setBorder(BorderFactory.createEtchedBorder());
		barra.setBackground(Color.lightGray);
		barra.add(menuContato);
		barra.add(menuAjuda);

	}

	private class NovoAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			nomeField.setText("");
			telefoneField.setText("");
		}
	}

	private class FecharAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}
	}
	private class SalvarAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"O cadastro foi salvo","Cadastro",JOptionPane.PLAIN_MESSAGE);
		}
	}
	private class SobreAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Programa criado por Yuri Lacerda","Sobre...",JOptionPane.PLAIN_MESSAGE);
			
		}
		
	}
}
		


