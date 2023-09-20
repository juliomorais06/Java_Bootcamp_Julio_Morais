package pilaresPoo.polimorfismo.Apps;

public class Msnpolimorfismo extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Msn");
    }
}
