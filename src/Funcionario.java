public class Funcionario extends Pessoa {
    private int id;
    private double salario;
    private String funcao;

    public Funcionario(String nome, int idade, String telefone, int id, double salario, String funcao) {
        super(nome, idade, telefone);
        this.id = id;
        this.salario = salario;
        this.funcao = funcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Telefone: " + getTelefone());
    }
}
