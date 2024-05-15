import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //VARIÁVEIS FIXAS PARA VALIDAÇÃO DO LOGIN
        String usuarioValido = "gerente123";
        String senhaValida = "senha123";

        int r;
        do {
            //OBJETOS INSTANCIADOS
            Cliente c = new Cliente("", 0, "", "", "", "");
            Funcionario f = new Funcionario("", 0, "", 0, 0, "");
            Lucros l = new Lucros();

            //MENU DE CADASTRO

            System.out.println("======= Cadastro =======");
            System.out.println("[1] para cadastrar cliente");
            System.out.println("[2] para Login no sistema");
            System.out.println("Escolha uma opção:");

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Digite as informações do cliente abaixo:");
                    System.out.println("Nome:");
                    c.setNome(sc2.nextLine());
                    System.out.println("Idade:");
                    c.setIdade(sc.nextInt());
                    System.out.println("Data de Nascimento:");
                    c.setDataNascimento(sc.next());
                    System.out.println("Telefone:");
                    c.setTelefone(sc.next());
                    System.out.println("CPF:");
                    c.setCpf(sc.next());
                    System.out.println("Email:");
                    c.setEmail(sc.next());
                    System.out.println("Cliente cadastrado com sucesso!");
                    sc.nextLine();
                    c.exibir();
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println("Login");
                    System.out.println("Digite o nome do Usuario:");
                    String usuario  = sc.next();
                    System.out.println("Digite a Senha:");
                    String senha = sc.next();

                    if (usuario.equals(usuarioValido) && senha.equals(senhaValida)) {
                        System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + ".");

                        //MENU DE GERENCIAMENTO

                        System.out.println("\n");
                        System.out.println("======= Gerenciamento =======");
                        System.out.println("[1] para cadastrar funcionário");
                        System.out.println("[2] para calcular lucros");
                        System.out.println("Escolha uma opção:");

                        int y = sc.nextInt();
                        if (y == 1) {
                            //CADASTRO DE FUNCIONÁRIO
                            System.out.println("\n");
                            System.out.println("Você solicitou cadastro de funcionario, digite as informações abaixo:");
                            System.out.println("Nome:");
                            f.setNome(sc2.nextLine());
                            System.out.println("Idade:");
                            f.setIdade(sc.nextInt());
                            System.out.println("Telefone:");
                            f.setTelefone(sc.next());
                            System.out.println("ID:");
                            f.setId(sc.nextInt());
                            System.out.println("Função:");
                            f.setFuncao(sc.next());
                            System.out.println("Funcionario cadastrado com sucesso!");
                            sc.nextLine();
                            System.out.println("\n");
                            f.exibir();
                        } else if (y == 2) {
                            //CÁLCULO DOS LUCROS
                            System.out.println("\n");
                            System.out.println("Valor total: R$");
                            l.setValorTotal(sc.nextDouble());
                            System.out.println("Valor das despesas: R$");
                            l.setValorDespesas(sc.nextDouble());
                            double resultado = l.calcular();
                            System.out.println("O lucro é de: R$" + resultado);
                        }
                    } else {
                        System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
                    }
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
            System.out.println("\n");
            System.out.println("Para um novo cadastro digite [0]:");
            r = sc.nextInt();
        } while (r == 0);
        System.out.println("Programa encerrado!");
    }
}

