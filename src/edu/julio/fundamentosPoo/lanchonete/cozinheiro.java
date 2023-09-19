package fundamentosPoo.lanchonete;

public class cozinheiro {
    //pode ser default
    public void adicionarLancheBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
    }
    //pode ser default
    public void adicionarSucoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheBalcao();
        adicionarSucoBalcao();
    }
    static void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
    }
    public void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }
}
