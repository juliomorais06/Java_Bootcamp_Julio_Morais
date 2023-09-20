package pilaresPoo.heranca;

public class Heranca {
    public static void main(String[] args) {
        Telegramheranca tlg = new Telegramheranca();
        System.out.println("Telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();

        Faceheranca face = new Faceheranca();
        System.out.println("\nFacebook Messenger");
        face.enviarMensagem();
        face.receberMensagem();

        Msnheranca msn = new Msnheranca();
        System.out.println("\nMsn Messenger");
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
