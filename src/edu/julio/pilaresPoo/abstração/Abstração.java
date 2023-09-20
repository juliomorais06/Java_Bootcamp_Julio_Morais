package pilaresPoo.abstração;

public class Abstração {
    public static void main(String[] args) {
        Faceabstracao face = new Faceabstracao();
        face.enviarMensagem();
        face.receberMensagem();

        Msnabstracao msn = new Msnabstracao();
        msn.enviarMensagem();
        msn.receberMensagem();

        Telegramabstracao tlg = new Telegramabstracao();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
