public class Planos {
    //ATRIBUTOS
    private int escolha;
    private String planoEscolhido;

    //CONSTRUTOR
    public Planos(){
        this.escolha = escolha;
        escolha();
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

    //MÉTODO
    public void escolha(){
        if (escolha == 1){
            System.out.println("Plano: " + getPlano1());
        } else if (escolha == 2) {
            System.out.println("Plano: " + getPlano2());
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }
    }

}
