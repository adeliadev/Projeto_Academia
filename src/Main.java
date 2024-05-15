import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String usuarioValido = "gerente123";
        String senhaValida = "senha123";


        int r;
        do {
            Cliente c = new Cliente("", 0, "", "", "", "");
            Funcionario f = new Funcionario("", 0, "", 0, 0, "");

            System.out.println("======= Cadastro =======");
            System.out.println("[1] para cadastrar cliente");
            System.out.println("[2] para cadastrar funcionário");
            System.out.println("[3] para Login no sistema");
            System.out.println("Escolha uma opção:");

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Digite as informações do cliente abaixo:");
                    System.out.println("Nome:");
                    c.setNome(sc2.nextLine());
                    System.out.println("Idade:");
                    c.setIdade(sc.nextInt());
                    System.out.println("Telefone:");
                    c.setTelefone(sc.next());
                    System.out.println("Data de Nascimento:");
                    c.setDataNascimento(sc.next());
                    System.out.println("CPF:");
                    c.setCpf(sc.next());
                    System.out.println("Email:");
                    c.setEmail(sc.next());
                    System.out.println("Cliente cadastrado com sucesso!");
                    sc.nextLine();
                    c.exibirCliente();
                    break;

                case 2:
                    System.out.println("Você solicitou cadastro de funcionario, digite as informações abaixo:");
                    System.out.println("Nome:");
                    f.setNome(sc.next());
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
                    f.exibirFuncionario();
                    break;

                case 3:
                    System.out.println("Login");
                    System.out.println("Digite o nome do Usuario:");
                    String usuario  = sc.next();
                    System.out.println("Digite a Senha:");
                    String senha = sc.next();

                    if (usuario.equals(usuarioValido) && senha.equals(senhaValida)) {
                        System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + ".");
                    } else {
                        System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
                    }

                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
            System.out.println("Para um novo cadastro digite 0");
            r = sc.nextInt();
        } while (r == 0);
        System.out.println("Programa encerrado");
    }
}

