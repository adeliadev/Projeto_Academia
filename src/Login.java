import java.util.Scanner;

public class Login {
    private static final String USUARIO_GERENTE_VALIDO = "gerente123";
    private static final String SENHA_GERENTE_VALIDA = "senha123";
    private static final String USUARIO_FUNCIONARIO_VALIDO = "funcionario123";
    private static final String SENHA_FUNCIONARIO_VALIDA = "senha123";

    public static void main() {
        Funcionario f = new  Funcionario("", 0, "", 0, 0, "");
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Login =======");
        System.out.println("Selecione o tipo de usuário:");
        System.out.println("[1] Gerente");
        System.out.println("[2] Funcionário");
        System.out.print("Escolha uma opção: ");

        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();

        switch (tipoUsuario) {
            case 1:
                loginGerente(scanner);
                break;
            case 2:
                loginFuncionario(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void loginGerente(Scanner scanner) {
        System.out.println("Digite o nome de usuário do gerente:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha do gerente:");
        String senha = scanner.nextLine();

        if (usuario.equals(USUARIO_GERENTE_VALIDO) && senha.equals(SENHA_GERENTE_VALIDA)) {
            System.out.println("Login bem-sucedido como gerente!");
            System.out.println("===== Gerenciamento =====");
            System.out.println("[1] Para cadastrar novo funcionário");
            System.out.println("[2] Para calcular lucros");
            System.out.println("[12] Cadastrar produto");




        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
    }

    private static void loginFuncionario(Scanner scanner) {
        System.out.println("Digite o nome de usuário do funcionário:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha do funcionário:");
        String senha = scanner.nextLine();

        if (usuario.equals(USUARIO_FUNCIONARIO_VALIDO) && senha.equals(SENHA_FUNCIONARIO_VALIDA)) {
            System.out.println("Login bem-sucedido como funcionário!");
            System.out.println("===== Gerenciamento =====");
            System.out.println("[1] Para cadastrar novo funcionário");
            System.out.println("[2] Para calcular lucros");
            System.out.println("[12] Cadastrar produto");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
    }
}