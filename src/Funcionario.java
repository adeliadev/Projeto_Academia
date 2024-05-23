public class Funcionario extends Pessoa {
    //ATRIBUTOS
    private int id;
    private double salario;
    private String funcao;

    //CONSTRUTOR
    public Funcionario(String nome, int idade, String telefone, int id, double salario, String funcao) {
        super(nome, idade, telefone);
        this.id = id;
        this.salario = salario;
        this.funcao = funcao;
    }

    //GETTERS AND SETTERS

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

    // MÉTODO
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("ID: " + getId());
        System.out.println("Função: " + getFuncao());
    }
}
