
public class Lucros {
    //ATRIBUTOS
    private double valorTotal;
    private double valorDespesas;

    //CONSTRUTOR
    public Lucros() {
        this.valorTotal = valorTotal;
        this.valorDespesas = valorDespesas;
    }

    //GETTERS AND SETTERS

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDespesas() {
        return valorDespesas;
    }

    public void setValorDespesas(double valorDespesas) {
        this.valorDespesas = valorDespesas;
    }

    //MÉTODO
    public double calcular(){
        return this.valorTotal - this.valorDespesas;
    }
}