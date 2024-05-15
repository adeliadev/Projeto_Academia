import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        do {
            Cliente c = new Cliente("",0,"","","","");
            Funcionario f = new Funcionario("",0,"",0,0,"");

            System.out.println("Digite 1 Para cadastroo de Cliente, 2 Para Cadastro de funcionario:");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Você solicitou cadastro de cliente, Digite as informações abaixo:");
                    System.out.println("Nome:");
                    c.setNome(sc.next());
                    System.out.println("Idade:");
                    c.setIdade(sc.nextInt());
                    System.out.println("Telefone:");
                    c.setTelefone(sc.next());
                    System.out.println("Data de Nascimento:");
                    c.setDataNascimento(sc.next());
                    System.out.println("CPF:");
                    c.setCpf(sc.next());
                    System.out.println("Email:");
                    c.setEmail(sc.nextLine());
                    System.out.println("Cliente cadastrado com sucesso!");
                    sc.nextLine();
                    c.exibirCliente();
                    break;

                case 2:
                    System.out.println("Você solicitou cadastro de funcionario, Digite as informações abaixo:");
                    System.out.println("Nome:");
                    f.setNome(sc.next());
                    System.out.println("Idade:");
                    f.setIdade(sc.nextInt());
                    System.out.println("Telefone:");
                    f.setTelefone(sc.next());
                    System.out.println("Função:");
                    f.setFuncao(sc.nextLine());
                    System.out.println("Funcionario cadastrado com sucesso!");
                    sc.nextLine();
                    f.exibirFuncionario();

                    break;
            }
            System.out.println("Para um novo cadastro digite 0");
            r = sc.nextInt();
        }while (r == 0);
    }

}
