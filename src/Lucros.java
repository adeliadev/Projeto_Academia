public class Lucros {
    private double valorTotal;
    private double valorDespesas;

    public Lucros() {
        this.valorTotal = valorTotal;
        this.valorDespesas = valorDespesas;
    }

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

    public double calcular(){
        return this.valorTotal - this.valorDespesas;
    }
}
