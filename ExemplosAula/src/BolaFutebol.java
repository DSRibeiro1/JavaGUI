
public class BolaFutebol {
	
		//Criamos um objeto dentro da classe
		private static BolaFutebol instance = new BolaFutebol();
		
		//Criamos um construtor como privado
		private BolaFutebol() {}
		
		//Buscando um unico objeto instanciado
		public static BolaFutebol getInstance() {
			return instance;
		}
		
		public void mostrandoMensagem() {
			System.out.println("A bola está na ponta esquerda");
		}
	}

			
		
	


