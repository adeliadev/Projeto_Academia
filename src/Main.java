import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            sc.nextLine(); // Consumes the newline character after nextInt()
            switch (x) {
                case 1:
                    System.out.println("Digite as informações do cliente abaixo:");
                    System.out.println("Nome:");
                    c.setNome(sc.nextLine());
                    System.out.println("Idade:");
                    c.setIdade(sc.nextInt());
                    sc.nextLine(); // Consume the newline
                    System.out.println("Telefone:");
                    c.setTelefone(sc.nextLine());
                    System.out.println("Data de Nascimento:");
                    c.setDataNascimento(sc.nextLine());
                    System.out.println("CPF:");
                    c.setCpf(sc.nextLine());
                    System.out.println("Email:");
                    c.setEmail(sc.nextLine());
                    System.out.println("Cliente cadastrado com sucesso!");
                    c.exibirCliente();
                    break;

                case 2:
                    System.out.println("Você solicitou cadastro de funcionario, digite as informações abaixo:");
                    System.out.println("Nome:");
                    f.setNome(sc.nextLine());
                    System.out.println("Idade:");
                    f.setIdade(sc.nextInt());
                    sc.nextLine(); // Consume the newline
                    System.out.println("Telefone:");
                    f.setTelefone(sc.nextLine());
                    System.out.println("ID:");
                    f.setId(sc.nextInt());
                    sc.nextLine(); // Consume the newline
                    System.out.println("Função:");
                    f.setFuncao(sc.nextLine());
                    System.out.println("Funcionario cadastrado com sucesso!");
                    f.exibirFuncionario();
                    break;

                case 3:
                    Logiin.main(); // Assuming Logiin.main() starts the login process
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
            System.out.println("Para um novo cadastro digite 0");
            r = sc.nextInt();
        } while (r == 0);
        System.out.println("Programa encerrado");
        sc.close();
    }
}
