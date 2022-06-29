public class Usuario {
    private String nome_usuario;
    private String email_usuario;
    private final String data_nascimento;
    private final int cpf;
    public Usuario(String nome_usuario, String email_usuario, String data_nascimento, int cpf) {
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
    }
    public String getNome_usuario() {
        return nome_usuario;
    }
    public String getEmail_usuario() {
        return email_usuario;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public int getCpf() {
        return cpf;
    }
    @Override
    public String toString() {
        return "" + nome_usuario
                + "\nEmail : " + email_usuario
                + "\nData de nascimento : " + data_nascimento
                + "\nCPF : " + cpf;
    }

    public int gerarCPF() {
        return cpf;
    }
}