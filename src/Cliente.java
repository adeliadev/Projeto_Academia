public class Cliente extends Pessoa {
    private String dataNascimento;
    private String cpf;
    private String email;

    public Cliente(String nome, int idade, int telefone, String dataNascimento, String cpf, String email) {
        super(nome, idade, telefone);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
