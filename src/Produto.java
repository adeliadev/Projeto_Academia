import java.util.HashMap;
import java.util.Random;

public class Produto {
    private String nome;
    private String id;
    private double valor;
    public Pessoa p;

    private static HashMap<String, Produto> produtos = new HashMap<>();

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
        this.id = String.valueOf(new Random().nextInt(1000));
        produtos.put(id, this);
    }

    public void valor(){
        this.nome = nome;
        this.id = id;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId(){return id;}

    public void setId(String id){
        this.id = id;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void mostrarProduto(){
        System.out.println("Nome do produto: " + getNome() + " ID: " + getId() + " Preço: " + getValor());
        System.out.println(produtos.toString());
    }

    @Override
    public String toString() {
        return "[" + "nome='" + nome + '\'' +
                ", valor=" + valor + "]";
    }
}