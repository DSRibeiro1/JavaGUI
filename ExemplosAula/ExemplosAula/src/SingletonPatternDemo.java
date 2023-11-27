
public class SingletonPatternDemo {

    public static void main(String[] args) {

        // BolaFutebol object = new BolaFutebol();

        BolaFutebol object = BolaFutebol.getInstance();

        object.mostrandoMensagem();

    }

}
