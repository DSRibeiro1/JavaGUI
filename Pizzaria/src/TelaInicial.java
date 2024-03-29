import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import model.Pedido;
import repository.PedidoRepository;

public class TelaInicial extends JFrame implements ActionListener {

	JPanel painel = new JPanel();

	// Cabecalho
	JPanel panel1 = new JPanel();

	// Cabecalho
	JLabel lCadastro = new JLabel();

	// Titulos
	JLabel lDadosDoCliente = new JLabel();
	JLabel lNome = new JLabel();
	JLabel lCpf = new JLabel();
	JLabel lSexo = new JLabel();
	JLabel lFormaPagamento = new JLabel();
	JLabel lDadosDoProduto = new JLabel();
	JLabel lProduto = new JLabel();
	JLabel lPreco = new JLabel();
	JLabel lQtd = new JLabel();
	JLabel lCarrinhoDeCompras = new JLabel();
	JLabel lTotalPedido = new JLabel();

	// Imagem
	JLabel imagem = new JLabel();

	// Area texto
	JTextArea tNome = new JTextArea();
	JTextArea tCpf = new JTextArea();
	JTextArea tProduto = new JTextArea();
	JTextArea tPreco = new JTextArea();
	JTextArea tQtd = new JTextArea();
	JTextArea tTotalPedido = new JTextArea();

	// Botao
	JButton bAdicionarItem = new JButton();
	JButton bFinalizarPedido = new JButton();
	JButton bRemoverItem = new JButton();

	// Generos, para marcacao
	JRadioButton masculino = new JRadioButton();
	JRadioButton feminino = new JRadioButton();

	ButtonGroup genero = new ButtonGroup();

	// Combo, varias opcoes
	JComboBox<Object> combofPgto = new JComboBox<>();

	Pedido pedido = new Pedido();
	PedidoRepository repository = new PedidoRepository();

	// Tabela
	JTable tabela = new JTable();
	DefaultTableModel model = new DefaultTableModel();

	/*
	 * public double precoTotal() {
	 * 
	 * ArrayList<Double> valorParcial = new ArrayList<>();
	 * valorParcial.add(pedido.getPreco());
	 * double soma = 0;
	 * for (int i = 0; i < valorParcial.size(); i++) {
	 * soma += valorParcial.get(i);
	 * }
	 * return soma;
	 * 
	 * }
	 */

	public void telaCadastro() {

		// Imagem
		imagem.setBounds(0, 0, 90, 40);
		imagem.setIcon(new ImageIcon("img/pizza3.jpg"));
		imagem.setBorder(BorderFactory.createEtchedBorder());

		// Frame
		setTitle("Tela de Vendas");
		setSize(750, 690);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		// Painel
		painel.setSize(750, 690);
		painel.setLayout(null);

		// Cabe�alho

		lCadastro.setText("CADASTRO DE PEDIDO");
		lCadastro.setBounds(200, 0, 500, 0);
		lCadastro.setFont(new Font("Arial Black", Font.BOLD, 30));
		lCadastro.setForeground(Color.red);

		panel1.setBackground(Color.orange);
		panel1.setPreferredSize(new Dimension(100, 130));
		panel1.setBorder(BorderFactory.createEtchedBorder());

		// Titulos
		lDadosDoCliente.setText("Dados do cliente ");
		lDadosDoCliente.setBounds(16, 40, 200, 50);
		lDadosDoCliente.setFont(new Font("Arial", 1, 14));

		// Nome e area texto
		lNome.setText("Nome");
		lNome.setBounds(15, 85, 100, 100);
		tNome.setBounds(65, 125, 130, 20);
		tNome.setBorder(BorderFactory.createEtchedBorder());
		lNome.setFont(new Font("Arial", 0, 14));

		// CPF e area texto
		lCpf.setText("CPF");
		lCpf.setBounds(15, 120, 100, 100);
		tCpf.setBounds(65, 160, 130, 20);
		tCpf.setBorder(BorderFactory.createEtchedBorder());
		lCpf.setFont(new Font("Arial", 0, 14));

		// --------------------------------------//
		lFormaPagamento.setText("Forma de Pagamento");
		lFormaPagamento.setBounds(12, 205, 150, 50);
		lFormaPagamento.setFont(new Font("Arial", 1, 14));

		combofPgto.addItem("Cartão de Débito");
		combofPgto.addItem("Dinheiro");
		combofPgto.addItem("PIX");

		combofPgto.setBounds(170, 220, 150, 20);
		combofPgto.setFont(new Font("Arial", 0, 12));

		// -------------------------------------//

		lDadosDoProduto.setText("Dados do Produto");
		lDadosDoProduto.setBounds(15, 250, 180, 50);
		lDadosDoProduto.setFont(new Font("Arial", 1, 14));

		// ------------------------------------------//
		lProduto.setText("Produto");
		lProduto.setBounds(20, 300, 100, 50);
		tProduto.setBounds(75, 317, 235, 20);
		tProduto.setBorder(BorderFactory.createEtchedBorder());
		lProduto.setFont(new Font("Arial", 0, 14));

		// -------------------------------------------//
		lPreco.setText("Preço R$");
		lPreco.setBounds(20, 340, 100, 50);
		tPreco.setBounds(85, 355, 80, 20);
		tPreco.setBorder(BorderFactory.createEtchedBorder());
		lPreco.setFont(new Font("Arial", 0, 14));

		// --------------------------------------------//

		lQtd.setText("Qtd");
		lQtd.setBounds(200, 340, 100, 50);
		tQtd.setBounds(231, 355, 80, 20);
		lQtd.setFont(new Font("Arial", 0, 14));
		tQtd.setBorder(BorderFactory.createEtchedBorder());

		// ----------------------------------------------//

		lCarrinhoDeCompras.setText("Carrinho de Compras");
		lCarrinhoDeCompras.setBounds(370, 58, 150, 20);
		lCarrinhoDeCompras.setFont(new Font("Arial", 1, 14));

		// ----------------------------------------------//

		lSexo.setText("Sexo");
		lSexo.setBounds(215, 80, 100, 50);
		lSexo.setFont(new Font("Arial", 0, 12));

		// -----------------------------------------------//

		// JRadioButton
		masculino.setText("Masculino");
		masculino.setBounds(210, 110, 90, 55);
		masculino.setFont(new Font("Arial", 0, 14));

		feminino.setText("Feminino");
		feminino.setBounds(210, 145, 90, 55);
		feminino.setFont(new Font("Arial", 0, 14));

		// ---------------------------------------------//

		tabela.setBounds(350, 100, 350, 250);
		tabela.setAutoCreateRowSorter(true);
		tabela.setAutoscrolls(true);
		tabela.setBorder(BorderFactory.createEtchedBorder());
		// --------------------------------------------//

		lTotalPedido.setText("Total do pedido:");

		// Converter para String

		lTotalPedido.setBounds(350, 324, 130, 120);
		tTotalPedido.setBounds(480, 373, 200, 20);
		tTotalPedido.setBorder(BorderFactory.createEtchedBorder());
		lTotalPedido.setFont(new Font("Arial", 1, 16));

		// Botao ------------------------------------------//

		bAdicionarItem.setText("Adicionar Item");
		bAdicionarItem.setBounds(100, 420, 150, 40);
		bAdicionarItem.addActionListener(this);
		bAdicionarItem.setFont(new Font("Calibri", Font.BOLD, 16));
		bAdicionarItem.setBackground(Color.lightGray);
		bAdicionarItem.setBorder(BorderFactory.createEtchedBorder());

		FinalizarAction finalizarAction = new FinalizarAction();

		bFinalizarPedido.setText("Finalizar Pedido");
		bFinalizarPedido.setBounds(350, 420, 150, 40);
		bFinalizarPedido.setFont(new Font("Calibri", Font.BOLD, 16));
		bFinalizarPedido.setBackground(Color.lightGray);
		// Ira chamar classe Action Listener
		bFinalizarPedido.addActionListener(finalizarAction);

		bFinalizarPedido.add(lCarrinhoDeCompras);
		bFinalizarPedido.setBorder(BorderFactory.createEtchedBorder());
		bFinalizarPedido.addActionListener(new consultaAction());

		bRemoverItem.setText("Remover Item");
		bRemoverItem.setBounds(520, 420, 150, 40);
		bRemoverItem.setFont(new Font("Calibri", Font.BOLD, 16));
		bRemoverItem.setBackground(Color.lightGray);
		bRemoverItem.setBorder(BorderFactory.createEtchedBorder());
		bRemoverItem.addActionListener(new ActionListener() {

			// Botao excluir
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Pedido> pedidos = new ArrayList<>();
				int linhaSelecionada = tabela.getSelectedRow();
				try {
					repository.excluir((int) tabela.getValueAt(tabela.getSelectedRow(), 0));

				} catch (Exception e1) {
					e1.printStackTrace();
				}
				model.removeRow(linhaSelecionada);
				
				double valorTotal = 0;
				for (int i = 0; i <pedidos.size(); i++) {

					pedido = pedidos.get(i);
					valorTotal += pedido.getPreco() * pedido.getQtd();
					// valorTotal = valorTotal + preco * qtd
					model.addRow(
							new Object[] { pedido.getCodigo(), pedido.getProduto(), pedido.getQtd(), pedido.getPreco() });
				}
				tabela.setModel(model);
				tTotalPedido.setText(Double.toString(valorTotal));
				
			}
		});

		add(painel);

		// Genero
		genero.add(masculino);
		genero.add(feminino);

		// imagem
		panel1.add(imagem);

		// Titulos
		painel.add(lDadosDoCliente);

		// Nomes
		painel.add(lNome);
		painel.add(lCpf);

		// Forma Pagamento
		painel.add(lFormaPagamento);
		painel.add(combofPgto);

		// Area de texto nome
		painel.add(tNome);
		painel.add(tCpf);

		// Dados produto
		painel.add(lDadosDoProduto);

		// area de texto de produto, preco e quantidade
		painel.add(lProduto);
		painel.add(tProduto);
		painel.add(tPreco);
		painel.add(lPreco);

		// Quantidade produto
		painel.add(lQtd);
		painel.add(tQtd);

		// Genero, sexo
		painel.add(lSexo);
		painel.add(masculino);
		painel.add(feminino);

		// Botao
		painel.add(bAdicionarItem);
		painel.add(bFinalizarPedido);
		painel.add(bRemoverItem);

		// Carrinho de compra
		painel.add(lCarrinhoDeCompras);

		// Tabela
		painel.add(tabela);

		// Valor Total
		painel.add(lTotalPedido);
		painel.add(tTotalPedido);

		// Cabecalho
		add(panel1, BorderLayout.NORTH);
		panel1.add(lCadastro);

	}

	@Override

	// Botao adicionar Item
	public void actionPerformed(ActionEvent e) {

		pedido.setProduto(tProduto.getText());
		pedido.setQtd(Integer.parseInt(tQtd.getText()));
		pedido.setPreco(Double.parseDouble((tPreco.getText())));

		System.out.println(pedido.getProduto());
		System.out.println(pedido.getQtd());
		System.out.println(pedido.getPreco());

		repository.insere(pedido);

		tProduto.setText(null);
		tQtd.setText(null);
		tPreco.setText(null);

		new consultaAction().actionPerformed(e);

	}

	// Forma tabela dados / Botao Finalizar pedido = consulta
	public class consultaAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			while (tabela.getModel().getRowCount() > 0) {
				((DefaultTableModel) tabela.getModel()).setRowCount(0);
				((DefaultTableModel) tabela.getModel()).setColumnCount(0);
			}
			ArrayList<Pedido> pedidos = new ArrayList<>();
			try {
				pedidos = repository.consulta();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			model.addColumn("codigo");
			model.addColumn("produto");
			model.addColumn("qtd");
			model.addColumn("valor");
			model.addRow(new Object[] { "C�digo", "Produto", "Qtd", "Valor" });
			double valorTotal = 0;
			for (int i = 0; i < pedidos.size(); i++) {

				pedido = pedidos.get(i);
				valorTotal += pedido.getPreco() * pedido.getQtd();
				// valorTotal = valorTotal + preco * qtd
				model.addRow(
						new Object[] { pedido.getCodigo(), pedido.getProduto(), pedido.getQtd(), pedido.getPreco() });
			}
			tabela.setModel(model);
			tTotalPedido.setText(Double.toString(valorTotal));
		}
	}

	// Exibir mensagem ao clicar em Finalizar Pedido

	private class FinalizarAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Seu pedido foi finalizado com sucesso", "Caro Cliente",
					JOptionPane.PLAIN_MESSAGE);
			try {
				repository.excluir(pedido.getCodigo());
			} catch (Exception e1) {

				e1.printStackTrace();
			}

		}

	}
	// Total após excluir (atualiza valor)  
		public class excluirAction implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {

				while (tabela.getModel().getRowCount() > 0) {
					((DefaultTableModel) tabela.getModel()).setRowCount(0);
					((DefaultTableModel) tabela.getModel()).setColumnCount(0);
				}
				ArrayList<Pedido> pedidos = new ArrayList<>();
				try {
					pedidos = repository.consulta();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				model.addColumn("codigo");
				model.addColumn("produto");
				model.addColumn("qtd");
				model.addColumn("valor");
				model.addRow(new Object[] { "Código", "Produto", "Qtd", "Valor" });
				
				/*
				double valorTotal = 0;
				for (int i = 0 <= pedidos.size(); i--) {

					pedido = pedidos.get(i);
					valorTotal -= pedido.getPreco() * pedido.getQtd();
					// valorTotal = valorTotal + preco * qtd
					model.addRow(
							new Object[] { pedido.getCodigo(), pedido.getProduto(), pedido.getQtd(), pedido.getPreco() });
				}
				tabela.setModel(model);
				tTotalPedido.setText(Double.toString(valorTotal));
			}*/
		}
		}
}
	
	

