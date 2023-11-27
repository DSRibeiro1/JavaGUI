
public class AdaptadorTabela extends JSON {

	private Tabela tab;

	public AdaptadorTabela(Tabela tab) {
		this.tab = tab;
	}

	@Override
	public char getJSON() {
		return tab.getTipo();
	}
}
