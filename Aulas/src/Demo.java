
public class Demo {

	public static void main(String[] args) {
		JSON jay = new JSON('J');
		System.out.println(jay.getJSON());

		Tabela tab = new Tabela('T');
		AdaptadorTabela adap = new AdaptadorTabela(tab);

		System.out.println(adap.getJSON());
	}
}
