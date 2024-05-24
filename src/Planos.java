public class Planos {
    //ATRIBUTOS
    private int escolha;
    private String planoEscolhido;

    public Planos(){

    }

    public Planos(int escolha, String planoEscolhido) {
        this.escolha = escolha;
        this.planoEscolhido = planoEscolhido;
    }

    //GETTERS AND SETTERS

    public String getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(String planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public String getPlano1() {
        return "Mensal - R$ 70.00";
    }

    public String getPlano2() {
        return "Anual - R$ 50.00";
    }

}
