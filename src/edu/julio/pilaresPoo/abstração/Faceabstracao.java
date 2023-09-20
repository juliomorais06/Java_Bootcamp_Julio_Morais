package pilaresPoo.abstração;

public class Faceabstracao extends Servicomensagem {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
