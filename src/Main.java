import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //OBJETOS
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario("", 0, "", 0, 0, "");
        Lucros l = new Lucros();
        Planos p = new Planos();
        Cliente c = new Cliente("", 0, "", "", "", "");

        int r;
        do {
            //MENU INICIAL
            System.out.println("======= Cadastro =======");
            System.out.println("[1] para cadastrar cliente");
            System.out.println("[2] para Login no sistema");
            System.out.println("Escolha uma opção:");

            int x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1:
                    //CADASTRO DE CLIENTE

                    System.out.println("Digite as informações do cliente abaixo:");
                    sc.nextLine();
                    System.out.println("Nome:");
                    c.setNome(sc.nextLine());
                    System.out.println("Idade:");
                    c.setIdade(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Telefone:");
                    c.setTelefone(sc.nextLine());
                    System.out.println("Data de Nascimento:");
                    c.setDataNascimento(sc.nextLine());
                    System.out.println("CPF:");
                    c.setCpf(sc.nextLine());
                    System.out.println("Email:");
                    c.setEmail(sc.nextLine());

                    System.out.println("\n");
                    System.out.println("escolha o plano 1 ou 2");
                    System.out.println(p.getPlano1());
                    System.out.println(p.getPlano2());

                    int escolha = sc.nextInt();
                    if (escolha == 1){
                        System.out.println("Plano 1 escolhido");
                    } else if (escolha == 2) {
                        System.out.println("Plano 2 escolhido");
                    } else {
                        System.out.println("Opção inválida! Tente novamente.");
                    }

                    c.mostrarDados();


                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    Login.main();
                    int y = sc.nextInt();
                    sc.nextLine();
                    if (y == 1) {
                        //CADASTRO DE FUNCIONÁRIO
                        System.out.println("\n");
                        System.out.println("Você solicitou cadastro de funcionario, digite as informações abaixo:");
                        System.out.println("Nome:");
                        f.setNome(sc.nextLine());
                        System.out.println("Idade:");
                        f.setIdade(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Telefone:");
                        f.setTelefone(sc.nextLine());
                        System.out.println("ID:");
                        f.setId(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Função:");
                        f.setFuncao(sc.nextLine());
                        System.out.println("Funcionario cadastrado com sucesso!");

                        System.out.println("\n");
                        f.mostrarDados();
                    } else if (y == 2) {
                        //CÁLCULO DOS LUCROS
                        System.out.println("\n");
                        System.out.println("Valor total: R$");
                        l.setValorTotal(sc.nextDouble());
                        System.out.println("Valor das despesas: R$");
                        l.setValorDespesas(sc.nextDouble());
                        double resultado = l.calcular();
                        System.out.println("O lucro é de: R$" + resultado);
                        sc.nextLine();
                    } else if (y == 3) {
                        //CADASTRO DE PRODUTO
                        System.out.println("Nome do produto:");
                        String nomeProduto = sc.next();
                        System.out.println("Preço:");
                        double precoProduto = sc.nextDouble();
                        System.out.println("ID:");
                        String idProduto = sc.nextLine();
                        Produto novoProduto = new Produto(nomeProduto, precoProduto, idProduto);
                        System.out.println("Produto cadastrado com sucesso! ID do produto: " + novoProduto.getId());
                        novoProduto.mostrarProduto();

                    }else if (y == 4){
                        //CRIANDO VALORES FIXOS
                        Produto p1 = new Produto("Luva", 40.0, "1");
                        Produto p2 = new Produto("Barra de proteína", 10.0, "2");
                        Produto p3 = new Produto("Barra de proteína", 10.0, "3");

                        // UTILIZANDO MÉTODO DE ADICIONAR PRODUTOS
                        Produto.adicionarProduto(p1);
                        Produto.adicionarProduto(p2);
                        Produto.adicionarProduto(p3);

                        System.out.print("Digite o ID do produto que deseja buscar: ");
                        String idDigitado = sc.nextLine();

                        Produto produtoEncontrado = Produto.buscarProdutoPorId(idDigitado);
                        if (produtoEncontrado != null) {
                            System.out.println("Produto encontrado: " + produtoEncontrado);

                        } else {
                            System.out.println("Produto não encontrado.");
                        }

                    }else {
                        System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
                    }
                    break;
            }
            //SELEÇÃO DE OPÇÃO
            System.out.println("Para selecionar uma nova opção digite [0]:");
            r = sc.nextInt();
            sc.nextLine();
        } while (r == 0);
        System.out.println("Programa encerrado");
    }
}
