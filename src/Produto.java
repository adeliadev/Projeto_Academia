import java.util.HashMap;
import java.util.Random;

public class Produto {
    //ATRIBUTOS
    private String nome;
    private String id;
    private double valor;

    //LISTA DE PRODUTOS - MAP
    private static HashMap<String, Produto> produtos = new HashMap<>();

    //CONSTRUTOR
    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
        this.id = String.valueOf(new Random().nextInt(1000));
        produtos.put(id, this);
    }

    //GETTERS AND SETTERS

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

    //MÉTODOS

    public static Produto buscarProdutoPorId(String id) {
        return produtos.get(id);
    }

    public void mostrarProduto(){
        System.out.println(produtos.toString());
    }

    @Override
    public String toString() {
        return "[" + "nome='" + nome + '\'' +
                ", valor=" + valor + "]";
    }
}