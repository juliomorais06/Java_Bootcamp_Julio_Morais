package collections.OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Paulo", 123456);
        agendaContatos.adicionarContato("Paulo", 5665);
        agendaContatos.adicionarContato("Paulo Kozo", 111111);
        agendaContatos.adicionarContato("Paulo Ichikawa", 654987);
        agendaContatos.adicionarContato("Julio", 111111);
        agendaContatos.adicionarContato("Paulo", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Julio");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Paulo Ichikawa"));
    }
}
