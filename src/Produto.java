import java.util.HashMap;
import java.util.Map;

public class Produto {
    //ATRIBUTOS
    private String nome;
    private double valor;
    private String id;
    private int quantidadeEmEstoque = 1000;

    //LISTA DE PRODUTOS - MAP
    private static HashMap<String, Produto> produtos = new HashMap<>();

    //CONSTRUTOR
    public Produto(String nome, double valor, String id){
        this.nome = nome;
        this.valor = valor;
        this.id = id;
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

    public String mostrarProduto(){
        return produtos.toString();
    }

    public static void adicionarProduto(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    @Override
    public String toString() {
        return "[" + "nome='" + nome + '\'' +
                ", valor=" + valor + "]";
    }

    public Produto(){

    }
    public double venderProduto(int quantidade) {
        if (quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            return this.valor * quantidade;
        } else {
            return -1;
        }
    }
}